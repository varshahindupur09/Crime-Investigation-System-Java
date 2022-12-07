/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;

import java.util.ArrayList;

public class JailDirectory {
    
    private ArrayList<Jail> jailHistory;
    
    public JailDirectory(){
    this.jailHistory= new ArrayList<Jail>(); 
    }

    public ArrayList<Jail> getJailHistory() {
        return jailHistory;
    }

    public void setHistory(ArrayList<Jail> jailHistory) {
        this.jailHistory = jailHistory;
    }
    
    public Jail addNewJail(){    
    Jail newJail = new Jail();
    jailHistory.add(newJail);
    return newJail;
    }
    
    public void deleteJail(Jail j){
        jailHistory.remove(j);
    }
    
}
