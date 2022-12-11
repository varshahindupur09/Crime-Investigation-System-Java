/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

import java.util.ArrayList;

/**
 *
 * @author hindupurv
 */
public class OfficerDirectory {
        
    /**
     *
     */
    static ArrayList<Officer> officerList = new ArrayList<>();
    
    public OfficerDirectory()
    {
        
    }
    
    public OfficerDirectory(ArrayList<Officer> officerList) {
        this.officerList = officerList;
    }

    public ArrayList<Officer> getOfficerList() {
        return officerList;
    }

    public void setOfficerList(ArrayList<Officer> officerList) {
        this.officerList = officerList;
    }

    public void deleteOfficer(Officer officerRecord){
        officerList.remove(officerRecord);
    }
    
//    public void addOfficerDataInList(Officer officerRecord)
//    {
//        officerList.add(officerRecord);
//    }
    
}
