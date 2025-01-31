/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bo.Mob;
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
public class MobHandler {
    
    private SQLUtil sqlUtil;
    
    
    public MobHandler() {
        sqlUtil = new SQLUtil();
             
    }
    
    public int addMob(int eID) {
        String cmdTemplate = "insert into Mob(enemyID) values(%d)";
        String stmStr = String.format(cmdTemplate, eID);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteMob(int eID){
        String stm = String.format("delete from Mob where enemyID = %d", eID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateMob(int eID, int newID) {
    // Check if newID is the same as iID
        if (newID == eID) {
        // Use iID as newID
            newID = eID;
    }
        String cmdTemplate = "update Mob set enemyID=%d,abilityType = '%s' where enemyID = %d";
        String stmStr = String.format(cmdTemplate, newID, eID);
        return sqlUtil.executeUpdate(stmStr);
    }
        public int updateMobID(int eID, int newID) {
        String cmdTemplate = "update Enemy set enemyID=%d where enemyID = %d";
        String stmStr = String.format(cmdTemplate, newID, eID);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public List<Mob> getMob(String keyword){
        String stmStr = String.format("select * from Mob where enemyID like '%s'", "%"+keyword+"%");
        List<Mob> Mobs = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int eID = rs.getInt("enemyID");
                Mob m = new Mob(eID);
                Mobs.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Mobs;
    }
}
