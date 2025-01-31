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
public class Owned {
    private int characterID;
    private int iID;
    private String isEquipped;

    public Owned(int characterID, int iID, String isEquipped) {
        this.characterID = characterID;
        this.iID = iID;
        this.isEquipped = isEquipped;
    }
    
        public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.characterID);
        ret.add(this.iID);
        ret.add(this.isEquipped);
        return ret;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getIsEquipped() {
        return isEquipped;
    }

    public void setIsEquipped(String isEquipped) {
        this.isEquipped = isEquipped;
    }
    
    
}
