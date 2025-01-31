/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bo.Inventory;
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
public class InventoryHandler {
    
    private SQLUtil sqlUtil;
    
    
    public InventoryHandler() {
        sqlUtil = new SQLUtil();
             
    }
    public int addInventory(int iID, String iName) {
        String cmdTemplate = "insert into Inventory(iID, name) values(%d, '%s')";
        String stmStr = String.format(cmdTemplate, iID, iName);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteInventory(int iID){
        String stm = String.format("delete from Inventory where iId = %d", iID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateInventory(int iID, int newID, String iName) {
    // Check if newID is the same as iID
    if (newID == iID) {
        // Use iID as newID
        newID = iID;
    }
    String cmdTemplate = "update Inventory set iID=%d,name = '%s' where iID = %d";
    String stmStr = String.format(cmdTemplate, newID, iName, iID);
    return sqlUtil.executeUpdate(stmStr);
}
    
    public List<Inventory> getInventory(String keyword){
        String stmStr = String.format("select * from Inventory where name like '%s'", "%"+keyword+"%");
        List<Inventory> Inventories = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int iID = rs.getInt("iID");
                String iName = rs.getString("name");
                Inventory i = new Inventory(iID,iName);
                Inventories.add(i);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Inventories;
    }
    
}


