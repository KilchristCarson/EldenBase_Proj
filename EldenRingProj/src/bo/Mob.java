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
public class Mob {
    private int eID;

    public Mob(int eID) {
        this.eID = eID;
    }
    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.eID);
        return ret;
    }

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }
    
    
}
