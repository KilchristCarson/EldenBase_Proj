/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bo.Enemy;
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
public class EnemyHandler {
    private SQLUtil sqlUtil;
    
    
    public EnemyHandler() {
        sqlUtil = new SQLUtil();
             
    }
    public int addEnemy(int eID, String eName,int eHealth, int eDamage) {
        String cmdTemplate = "insert into Enemy(EnemyID, name, health, damage) values(%d, '%s', %d, %d)";
        String stmStr = String.format(cmdTemplate, eID, eName,eHealth, eDamage);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteEnemy(int eID){
        String stm = String.format("delete from Enemy where enemyID = %d", eID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateEnemy(int eID, int newID, String eName, int eHealth, int eDamage) {
    // Check if newID is the same as iID
        if (newID == eID) {
        // Use iID as newID
            newID = eID;
    }
        String cmdTemplate = "update Enemy set enemyID=%d,name = '%s',health = %d,damage = %d where enemyID = %d";
        String stmStr = String.format(cmdTemplate, newID, eName,eHealth, eDamage, eID);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public List<Enemy> getEnemy(String keyword){
        String stmStr = String.format("select * from Enemy where name like '%s'", "%"+keyword+"%");
        List<Enemy> Enemies = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int eID = rs.getInt("enemyID");
                String eName = rs.getString("name");
                int eHealth = rs.getInt("health");
                int eDamage = rs.getInt("damage");
                Enemy e = new Enemy(eID,eName,eHealth, eDamage);
                Enemies.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Enemies;
    }
}
