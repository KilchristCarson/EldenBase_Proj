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
public class Weapon {
    private int iID;
    private int weaponDMG;
    private String weaponType;

    public Weapon(int iID, int weaponDMG, String weaponType) {
        this.iID = iID;
        this.weaponDMG = weaponDMG;
        this.weaponType = weaponType;
    }    
    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.iID);
        ret.add(this.weaponDMG);
        ret.add(this.weaponType);
        return ret;
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public int getWeaponDMG() {
        return weaponDMG;
    }

    public void setWeaponDMG(int weaponDMG) {
        this.weaponDMG = weaponDMG;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
    
    
}
