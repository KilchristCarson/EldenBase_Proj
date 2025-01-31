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
public class PlayerCharacter {
    private int characterID;
    private int hours;
    private int xpLevel;
    private int classID;
    private int newGameID;
    private int levelID;

    public PlayerCharacter(int characterID, int hours, int xpLevel, int classID, int newGameID, int levelID) {
        this.characterID = characterID;
        this.hours = hours;
        this.xpLevel = xpLevel;
        this.classID = classID;
        this.newGameID = newGameID;
        this.levelID = levelID;
    }
        public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.characterID);
        ret.add(this.hours);
        ret.add(this.xpLevel);
        ret.add(this.classID);
        ret.add(this.newGameID);
        ret.add(this.levelID);
        return ret;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getXpLevel() {
        return xpLevel;
    }

    public void setXpLevel(int xpLevel) {
        this.xpLevel = xpLevel;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getNewGameID() {
        return newGameID;
    }

    public void setNewGameID(int newGameID) {
        this.newGameID = newGameID;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }
    
    
}
