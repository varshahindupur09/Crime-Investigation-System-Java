/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;

import java.util.ArrayList;


public class PrisonDirectory {
    
    private ArrayList<Prison> prisonHistory;
    
    public PrisonDirectory(){
    this.prisonHistory= new ArrayList<Prison>(); 
    }

    public ArrayList<Prison> getPrisonHistory() {
        return prisonHistory;
    }

    public void setHistory(ArrayList<Prison> prisonHistory) {
        this.prisonHistory = prisonHistory;
    }
    
    public Prison addNewPrison(){    
    Prison newPri = new Prison();
    prisonHistory.add(newPri);
    return newPri;
    }
    
    public void deletePri(Prison p){
        prisonHistory.remove(p);
    }
    
}
