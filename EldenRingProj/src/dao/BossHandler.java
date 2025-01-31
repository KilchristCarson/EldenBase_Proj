/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bo.Boss;
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
public class BossHandler {
    
    private SQLUtil sqlUtil;
    
    public BossHandler() {
        sqlUtil = new SQLUtil();
             
    }
    
    public int addBoss(int eID, String AbilitySet) {
        String cmdTemplate = "insert into Boss(enemyID, abilitySet) values(%d, '%s')";
        String stmStr = String.format(cmdTemplate, eID, AbilitySet);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteBoss(int eID){
        String stm = String.format("delete from Boss where enemyID = %d", eID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateBoss(int eID, int newID, String AbilitySet) {
    // Check if newID is the same as iID
        if (newID == eID) {
        // Use iID as newID
            newID = eID;
    }
        String cmdTemplate = "update Boss set enemyID=%d,abilitySet = '%s' where enemyID = %d";
        String stmStr = String.format(cmdTemplate, newID, AbilitySet, eID);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public List<Boss> getBoss(String keyword){
        String stmStr = String.format("select * from Boss where enemyID like '%s'", "%"+keyword+"%");
        List<Boss> Bosses = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int eID = rs.getInt("enemyID");
                String AbilitySet = rs.getString("abilitySet");
                Boss b = new Boss(eID,AbilitySet);
                Bosses.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Bosses;
    }
}
