/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;


public class hospitalDirectory {
    
    private ArrayList<Hospital> hospHistory1;
    
    public hospitalDirectory(){
    this.hospHistory1= new ArrayList<Hospital>(); 
    }

    public ArrayList<Hospital> getHospitalHistory() {
        return hospHistory1;
    }

    public void setHistory(ArrayList<Hospital> hospHistory) {
        this.hospHistory1 = hospHistory;
    }
    
    public Hospital addNewHosp(){
    
    Hospital newHosp = new Hospital();
    hospHistory1.add(newHosp);
    return newHosp;
    }
    
    public void deleteHospital(Hospital h){
        hospHistory1.remove(h);
    }
    
}
