/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;

import java.util.ArrayList;


public class GovDirectory {
    
    private ArrayList<Government> govHistory;
    
    public GovDirectory(){
    this.govHistory= new ArrayList<Government>(); 
    }

    public ArrayList<Government> getGovHistory() {
        return govHistory;
    }

    public void setHistory(ArrayList<Government> govHistory) {
        this.govHistory = govHistory;
    }
    
    public Government addNewGov(){    
    Government newGov = new Government();
    govHistory.add(newGov);
    return newGov;
    }
    
    public void deleteGov(Government g){
        govHistory.remove(g);
    }
    
}
