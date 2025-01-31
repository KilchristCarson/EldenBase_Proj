/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bo.GameLevel;
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
public class GameLevelHandler {
    
    private SQLUtil sqlUtil;
    
    public GameLevelHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public int addGameLevel(int levelID, int mobCount, int mobID, int bossID, int weaponID, int armorID) {
        String cmdTemplate = "insert into Armor(levelID, mobCount, mobID, bossID,weaponID, armorID) values(%d, %d,%d, %d, %d, %d)";
        String stmStr = String.format(cmdTemplate, levelID, mobCount, mobID,bossID,  weaponID, armorID);
        return sqlUtil.executeUpdate(stmStr);
    
    }
    
        public int deleteGameLevel(int levelID){
        String stm = String.format("delete from Armor where levelID = %d", levelID);
        return sqlUtil.executeUpdate(stm);
    }
        
    public int updateGameLevel(int levelID, int newID, int mobCount) {
    String cmdTemplate = "update GameLevel set levelID=%d, mobCount=%d where levelID = %d";
    String stmStr = String.format(cmdTemplate, newID, mobCount, levelID);
    return sqlUtil.executeUpdate(stmStr);
    }
    
    public List<GameLevel> getGameLevel(String keyword){
        String stmStr = String.format("select * from GameLevel where levelID like '%s'", "%"+keyword+"%");
        List<GameLevel> Levels = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int levelID = rs.getInt("levelID");
                int mobCount = rs.getInt("mobCount");
                int mobID = rs.getInt("mobID");
                int bossID = rs.getInt("bossID");
                int weaponID = rs.getInt("weaponID");
                int armorID = rs.getInt("armorID");
                GameLevel g = new GameLevel(levelID, mobCount, mobID, bossID, weaponID, armorID);
                Levels.add(g);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArmorHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Levels;
    }
        

    }
