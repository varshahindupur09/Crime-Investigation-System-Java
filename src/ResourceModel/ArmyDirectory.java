/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;

import ForensicsModel.Doctor;
import java.util.ArrayList;


public class ArmyDirectory {
    
    private ArrayList<Army> armyHistory;
    
    public ArmyDirectory(){
    this.armyHistory= new ArrayList<Army>(); 
    }

    public ArrayList<Army> getArmyHistory() {
        return armyHistory;
    }

    public void setHistory(ArrayList<Army> armyHistory) {
        this.armyHistory = armyHistory;
    }
    
    public Army addNewArmy(){    
    Army newArmy = new Army();
    armyHistory.add(newArmy);
    return newArmy;
    }
    
    public void deleteArmy(Army a){
        armyHistory.remove(a);
    }
    
}
