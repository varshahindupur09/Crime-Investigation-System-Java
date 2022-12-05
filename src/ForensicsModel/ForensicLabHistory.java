/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;


public class ForensicLabHistory {
    
    private ArrayList<ForensicLab> forLabHistory;
    
    public ForensicLabHistory(){
    this.forLabHistory= new ArrayList<ForensicLab>(); 
    }

    public ArrayList<ForensicLab> getForLabHistory() {
        return forLabHistory;
    }

    public void setHistory(ArrayList<ForensicLab> forLabHistory) {
        this.forLabHistory = forLabHistory;
    }
    
    public ForensicLab addNewForLab(){
    
    ForensicLab newForLab = new ForensicLab();
    forLabHistory.add(newForLab);
    return newForLab;
    }
    
    public void deleteForLab(ForensicLab fl){
        forLabHistory.remove(fl);
    }
    
}
