/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;


public class hospitalDirectory {
    
    private ArrayList<Hospital> hospHistory;
    
    public hospitalDirectory(){
    this.hospHistory= new ArrayList<Hospital>(); 
    }

    public ArrayList<Hospital> getHospitalHistory() {
        return hospHistory;
    }

    public void setHistory(ArrayList<Hospital> hospHistory) {
        this.hospHistory = hospHistory;
    }
    
    public Hospital addNewHosp(){
    
    Hospital newHosp = new Hospital();
    hospHistory.add(newHosp);
    return newHosp;
    }
    
    public void deleteHospital(Hospital h){
        hospHistory.remove(h);
    }
    
}
