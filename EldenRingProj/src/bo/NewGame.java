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
public class NewGame {
    private int newGameID;
    private float goldMult;
    private float enemyStrMult;

    public NewGame(int newGameID, float goldMult, float enemyStrMult) {
        this.newGameID = newGameID;
        this.goldMult = goldMult;
        this.enemyStrMult = enemyStrMult;
    }
        public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.newGameID);
        ret.add(this.goldMult);
        ret.add(this.enemyStrMult);
        return ret;
    }

    public int getNewGameID() {
        return newGameID;
    }

    public void setNewGameID(int newGameID) {
        this.newGameID = newGameID;
    }

    public float getGoldMult() {
        return goldMult;
    }

    public void setGoldMult(float goldMult) {
        this.goldMult = goldMult;
    }

    public float getEnemyStrMult() {
        return enemyStrMult;
    }

    public void setEnemyStrMult(float enemyStrMult) {
        this.enemyStrMult = enemyStrMult;
    }
    
    
}
