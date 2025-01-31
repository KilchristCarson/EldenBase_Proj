/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;
import java.util.Vector;
/**
 *
 * @author kilch
 */
public class Inventory {
    private int iID;
    private String iName;
    
    public Inventory(int iID, String iName) 
    {
        this.iID = iID;
        this.iName = iName;
    }
    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.iID);
        ret.add(this.iName);
        return ret;
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }
    
    @Override
    public String toString() {
        return iName;
    }

}
