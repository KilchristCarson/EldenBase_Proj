/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bo.Owned;
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
public class OwnedHandler {
    
    private SQLUtil sqlUtil;
    
    public OwnedHandler() {
        sqlUtil = new SQLUtil();
             
    }
    
    public int addOwned(int characterID, int iID, String isEquipped) {
        String cmdTemplate = "insert into Owned(characterID,iID,isEquipped) values(%d,%d, '%s')";
        String stmStr = String.format(cmdTemplate, characterID, iID, isEquipped);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    
    public int deleteOwned(int iID){
        String stm = String.format("delete from Owned where iId = %d", iID);
        return sqlUtil.executeUpdate(stm);
    }
    
    /**
     *
     * @param characterID
     * @param newID
     * @param iID
     * @param newiID
     * @param isEquipped
     * @return
     */
    public int updateOwned(int characterID, int iID, String isEquipped) {
        String cmdTemplate = "update Owned set isEquipped='%s' where characterID=%d and iID=%d";
        String stmStr = String.format(cmdTemplate,isEquipped,characterID,iID);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    
    
    public List<Owned> getOwned(String keyword,String keyword2){
        String stmStr = String.format("select * from Owned where characterID like '%s' and iID like '%s'", "%"+keyword+"%","%"+keyword2+"%");
        List<Owned> Owns = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int characterID = rs.getInt("characterID");
                int iID = rs.getInt("iID");
                String isEquipped = rs.getString("isEquipped");
                Owned o = new Owned(characterID,iID, isEquipped);
                Owns.add(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Owns;
    }
    
}
