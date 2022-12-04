/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;


public class encounterHistory {
    
    private ArrayList<Encounter1> encHistory;
    
    public encounterHistory(){
    this.encHistory= new ArrayList<Encounter1>(); 
    }

    public ArrayList<Encounter1> getEncounterHistory() {
        return encHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter1> encHistory) {
        this.encHistory = encHistory;
    }
    
    public Encounter1 addNewEncounter(){
    
    Encounter1 newEnc = new Encounter1();
    encHistory.add(newEnc);
    return newEnc;
    }
    
    public void deleteEncounter(Encounter1 e){
        encHistory.remove(e);
    }
    
}
