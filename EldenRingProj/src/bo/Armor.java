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
public class Armor {
   private int iID;
   private int defenceStat;

    public Armor(int iID, int defenceStat) {
        this.iID = iID;
        this.defenceStat = defenceStat;
    }
    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.iID);
        ret.add(this.defenceStat);
        return ret;
    }

    public String getiID() {
        String iIDstr = Integer.toString(iID);
        return iIDstr;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getDefenceStat() {
        String defenceStatstr = Integer.toString(defenceStat);
        return defenceStatstr;
    }

    public void setDefenceStat(int defenceStat) {
        this.defenceStat = defenceStat;
    }

}
