/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bo.NewGame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.SQLUtil;
/**
 *
 * @author kilch
 */
public class NewGameHandler {
    
    private SQLUtil sqlUtil;
    
    public NewGameHandler() {
        sqlUtil = new SQLUtil();
             
    }
    
    public int addNewGame(int newGameID, float goldMult,float enemyStrMult) {
        String cmdTemplate = "insert into NewGame(newGameID, goldMult, enemyStrMult) values(%d, %f, %f)";
        String stmStr = String.format(cmdTemplate, newGameID, goldMult,enemyStrMult);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteNewGame(int newGameID){
        String stm = String.format("delete from NewGame where newGameID = %d", newGameID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateNewGame(int GameID, int newGameID, float goldMult,float enemyStrMult) {
    // Check if newID is the same as iID
        if (newGameID == GameID) {
        // Use iID as newID
            newGameID = GameID;
    }
        String cmdTemplate = "update NewGame set newGameID=%d, goldMult = %f,enemyStrMult = %f where newGameID = %d";
        String stmStr = String.format(cmdTemplate, newGameID, goldMult,enemyStrMult, GameID);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public List<NewGame> getNewGame(String keyword){
        String stmStr = String.format("select * from NewGame where newGameID like '%s'", "%"+keyword+"%");
        List<NewGame> NewGames = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int newGameID = rs.getInt("newGameID");
                float goldMult = rs.getFloat("goldMult");
                float enemyStrMult = rs.getFloat("enemyStrMult");
                NewGame n = new NewGame(newGameID,goldMult,enemyStrMult);
                NewGames.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NewGames;
    }
}
