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
public class GameLevel {
    private int levelID;
    private int mobCount;
    private int mobID;
    private int bossID;
    private int weaponID;
    private int armorID;

    public GameLevel(int levelID, int mobCount, int mobID, int bossID, int weaponID, int armorID) {
        this.levelID = levelID;
        this.mobCount = mobCount;
        this.mobID = mobID;
        this.bossID = bossID;
        this.weaponID = weaponID;
        this.armorID = armorID;
    }
    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.levelID);
        ret.add(this.mobCount);
        ret.add(this.mobID);
        ret.add(this.bossID);
        ret.add(this.weaponID);
        ret.add(this.armorID);
        return ret;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public int getMobCount() {
        return mobCount;
    }

    public void setMobCount(int mobCount) {
        this.mobCount = mobCount;
    }

    public int getMobID() {
        return mobID;
    }

    public void setMobID(int mobID) {
        this.mobID = mobID;
    }

    public int getBossID() {
        return bossID;
    }

    public void setBossID(int bossID) {
        this.bossID = bossID;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
    }

    public int getArmorID() {
        return armorID;
    }

    public void setArmorID(int armorID) {
        this.armorID = armorID;
    }
    
    
}
