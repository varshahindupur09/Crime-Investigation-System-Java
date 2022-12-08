/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

import java.util.ArrayList;


public class FIRDirectory {
    
    public ArrayList<FIR> firList;
    
    public FIRDirectory(){
    this.firList= new ArrayList<>(); 
    }

    public ArrayList<FIR> getHospitalHistory() {
        return firList;
    }

    public void setHistory(ArrayList<FIR> firList) {
        this.firList = firList;
    }
    
//    public FIR addNewFIR(){
//    
//    FIR firNew = new FIR();
//    firList.add(firNew);
//    return firNew;
//    }
    
    public void deleteFIR(FIR fir){
        firList.remove(fir);
    }
    
}
