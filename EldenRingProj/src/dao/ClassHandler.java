/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bo.Class;
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
public class ClassHandler {
    
    private SQLUtil sqlUtil;
    
    
    public ClassHandler() {
        sqlUtil = new SQLUtil();
             
    }
    public int addClass(int classID, String className, String abilityType) {
        String cmdTemplate = "insert into Class(classID,name,abilityType) values(%d, '%s','%s')";
        String stmStr = String.format(cmdTemplate, classID,className, abilityType);
        return sqlUtil.executeUpdate(stmStr);
    }
    
    public int deleteClass(int classID){
        String stm = String.format("delete from Class where classID = %d", classID);
        return sqlUtil.executeUpdate(stm);
    }
    
    public int updateClass(int classID, int newID, String className, String abilityType) {
        String cmdTemplate = "update Class set classID=%d,name = '%s',abilityType ='%s' where classID = %d";
        String stmStr = String.format(cmdTemplate, newID, className,abilityType, classID);
        return sqlUtil.executeUpdate(stmStr);
    }
    public List<Class> getClass(String keyword){
        String stmStr = String.format("select * from Class where name like '%s'", "%"+keyword+"%");
        List<Class> Classes = new ArrayList<>();
        ResultSet rs  = sqlUtil.executeQuery(stmStr);
        try {
            while(rs.next()){
                int classID = rs.getInt("classID");
                String className = rs.getString("name");
                String abilityType = rs.getString("abilityType");
                Class c = new Class(classID,className,abilityType);
                Classes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Classes;
    }
}
