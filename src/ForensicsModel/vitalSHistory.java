/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;

public class vitalSHistory {
    
    private ArrayList<vitalSigns> vsHistory;
    
    public vitalSHistory(){
    this.vsHistory= new ArrayList<vitalSigns>(); 
    }

    public ArrayList<vitalSigns> getVsHistory() {
        return vsHistory;
    }

    public void setHistory(ArrayList<vitalSigns> vsHistory) {
        this.vsHistory = vsHistory;
    }
    
    public vitalSigns addNewVs(){
    
    vitalSigns newVs = new vitalSigns();
    vsHistory.add(newVs);
    return newVs;
    }
    
    public void deleteVs(vitalSigns v){
        vsHistory.remove(v);
    }
}
