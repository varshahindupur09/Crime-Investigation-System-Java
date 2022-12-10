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
    static ArrayList<OfficerRecord> officerList = new ArrayList<>();
    
    public OfficerDirectory()
    {
        
    }
    
    public OfficerDirectory(ArrayList<OfficerRecord> officerList) {
        this.officerList = officerList;
    }

    public ArrayList<OfficerRecord> getOfficerList() {
        return officerList;
    }

    public void setOfficerList(ArrayList<OfficerRecord> officerList) {
        this.officerList = officerList;
    }

    public void deleteOfficer(OfficerRecord officerRecord){
        officerList.remove(officerRecord);
    }
    
//    public void addOfficerDataInList(OfficerRecord officerRecord)
//    {
//        officerList.add(officerRecord);
//    }
    
}
