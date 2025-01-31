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
public class Class {
    private int classID;
    private String name;
    private String abilityType;

    public Class(int classID, String name, String abilityType) {
        this.classID = classID;
        this.name = name;
        this.abilityType = abilityType;
    }
    
        public Vector<Object> getRow(){
        Vector<Object> ret = new Vector();
        ret.add(this.classID);
        ret.add(this.name);
        ret.add(this.abilityType);
        return ret;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(String abilityType) {
        this.abilityType = abilityType;
    }
    
    
}
