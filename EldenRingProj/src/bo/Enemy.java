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
public class Enemy {
    private int enemyID;
    private String eName;
    private int eHealth;
    private int eDamage;

    public Enemy(int enemyID, String eName, int eHealth, int eDamage) {
        this.enemyID = enemyID;
        this.eName = eName;
        this.eHealth = eHealth;
        this.eDamage = eDamage;
    }

    public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.enemyID);
        ret.add(this.eName);
        ret.add(this.eHealth);
        ret.add(this.eDamage);
        return ret;
    }
    public int getEnemyID() {
        return enemyID;
    }

    public void setEnemyID(int enemyID) {
        this.enemyID = enemyID;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteHealth() {
        return eHealth;
    }

    public void seteHealth(int eHealth) {
        this.eHealth = eHealth;
    }

    public int geteDamage() {
        return eDamage;
    }

    public void seteDamage(int eDamage) {
        this.eDamage = eDamage;
    }
    
    
}
