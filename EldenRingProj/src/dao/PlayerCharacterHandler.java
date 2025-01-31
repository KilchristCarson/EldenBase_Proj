/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;



import bo.PlayerCharacter;
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
public class PlayerCharacterHandler {
    
    private SQLUtil sqlUtil;
    
    public PlayerCharacterHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public int updatePC(int characterID,int newID, int hours, int xpLevel) {
    // Check if newID is the same as iID
    if (newID == characterID) {
        // Use iID as newID
        newID = characterID;
    }
    String cmdTemplate = "update PlayerCharacter set characterID=%d, hours=%d where characterID = %d";
    String stmStr = String.format(cmdTemplate, newID, hours, characterID);
    return sqlUtil.executeUpdate(stmStr);
}
    
    
    
    
        public List<PlayerCharacter> getPC(String keyword){
        String stmStr = String.format("select * from PlayerCharacter where characterID like '%s'", "%"+keyword+"%");
        List<PlayerCharacter> PC = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int characterID = rs.getInt("characterID");
                int hours = rs.getInt("hours");
                int xpLevel = rs.getInt("xpLevel");
                int classID = rs.getInt("classID");
                int newGameID = rs.getInt("newGameID");
                int levelID = rs.getInt("levelID");
                
                
                PlayerCharacter pc = new PlayerCharacter(characterID,hours, xpLevel,classID,newGameID, levelID);
                PC.add(pc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PC;
    }
}
