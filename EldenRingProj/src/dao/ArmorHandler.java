/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bo.Armor;
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
public class ArmorHandler {
    private SQLUtil sqlUtil;

    public ArmorHandler() {
        sqlUtil = new SQLUtil();
    }

    public int addArmor(int iID, int defenceStat) {
        String cmdTemplate = "insert into Armor(iID,defenceStat) values(%d, %d)";
        String stmStr = String.format(cmdTemplate, iID, defenceStat);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteArmor(int iID){
        String stm = String.format("delete from Armor where iID = %d", iID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateArmor(int iID, int newID, int defenceStat) {
    // Check if newID is the same as iID
    if (newID == iID) {
        // Use iID as newID
        newID = iID;
    }
    String cmdTemplate = "update Armor set iID=%d, defenceStat=%d where iID = %d";
    String stmStr = String.format(cmdTemplate, newID, defenceStat, iID);
    return sqlUtil.executeUpdate(stmStr);
}
    
    public List<Armor> getArmor(String keyword){
        String stmStr = String.format("select * from Armor where iID like '%s'", "%"+keyword+"%");
        List<Armor> Armor = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int iID = rs.getInt("iID");
                int defenceStat = rs.getInt("defenceStat");
                Armor s = new Armor(iID, defenceStat);
                Armor.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArmorHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Armor;
    }
    public List<Armor> loadArmor() {
        List<Armor> scs = new ArrayList<>();
        try {
            String stmStr = "select * from Armor";
            ResultSet rsArmor = sqlUtil.executeQuery(stmStr);
            while (rsArmor.next()) {
                int iID = rsArmor.getInt("chId");
                int defenceStat = rsArmor.getInt("defenceStat");
                int aID = rsArmor.getInt("aID");
                Armor sc = new Armor(iID, defenceStat);
                scs.add(sc);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return scs;
    }
    
}
