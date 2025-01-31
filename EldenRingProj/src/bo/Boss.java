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
public class Boss {
    private int eID;
    private String abilitySet;

    public Boss(int eID, String abilitySet) {
        this.eID = eID;
        this.abilitySet = abilitySet;
    }
    
    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.eID);
        ret.add(this.abilitySet);
        return ret;
    }

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String getAbilitySet() {
        return abilitySet;
    }

    public void setAbilitySet(String abilitySet) {
        this.abilitySet = abilitySet;
    }
    
    
}
