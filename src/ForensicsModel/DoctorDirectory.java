/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;


public class DoctorDirectory {
    
    private ArrayList<Doctor> docHistory;
    
    public DoctorDirectory(){
    this.docHistory= new ArrayList<Doctor>(); 
    }

    public ArrayList<Doctor> getDocHistory() {
        return docHistory;
    }

    public void setHistory(ArrayList<Doctor> docHistory) {
        this.docHistory = docHistory;
    }
    
    public Doctor addNewDoc(){    
    Doctor newDoc= new Doctor();
    docHistory.add(newDoc);
    return newDoc;
    }
    
    public void deleteDoctor(Doctor d){
        docHistory.remove(d);
    }
    
}
