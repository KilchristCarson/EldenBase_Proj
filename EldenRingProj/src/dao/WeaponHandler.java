/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bo.Weapon;
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
public class WeaponHandler {
    
    private SQLUtil sqlUtil;
    
    public WeaponHandler() {
        sqlUtil = new SQLUtil();
             
    }
    public int addWeapon(int iID, int weaponDMG, String weaponType) {
        String cmdTemplate = "insert into Weapon(iID,weaponDMG,weaponType) values(%d,%d, '%s')";
        String stmStr = String.format(cmdTemplate, iID, weaponDMG, weaponType);
        return sqlUtil.executeUpdate(stmStr);
    } 
    
    public int deleteWeapon(int iID){
        String stm = String.format("delete from Weapon where iId = %d", iID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateWeapon(int iID, int newID, int weaponDMG, String weaponType) {
    // Check if newID is the same as iID
        if (newID == iID) {
        // Use iID as newID
        newID = iID;
    }
        String cmdTemplate = "update Weapon set iID=%d,weaponDMG= %d, weaponType = '%s' where iID = %d";
        String stmStr = String.format(cmdTemplate, newID,weaponDMG,weaponType, iID);
        return sqlUtil.executeUpdate(stmStr);
}
    
    public List<Weapon> getWeapon(String keyword){
        String stmStr = String.format("select * from Weapon where iID like '%s'", "%"+keyword+"%");
        List<Weapon> Weapons = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int iID = rs.getInt("iID");
                int weaponDMG = rs.getInt("weaponDMG");
                String weaponType = rs.getString("weaponType");
                Weapon w = new Weapon(iID,weaponDMG, weaponType);
                Weapons.add(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Weapons;
    }
    
}
