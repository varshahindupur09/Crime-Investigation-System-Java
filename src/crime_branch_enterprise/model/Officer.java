/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class Officer {
    
//    private String officerID;
    private String officerName;
//    private String officerCNIC;
    private String officerAddress;
    private String officerPhoneNumber;
    private String officerEmail;
//    private String officerDateOfBirth;
//    private String officerDateOfJoining;
//    private String officerQualification;
    //Get PoliceStationName from PoliceStation.java

//    public String getOfficerID() {
//        return officerID;
//    }
//
//    public void setOfficerID(String officerID) {
//        this.officerID = officerID;
//    }
    
    public Officer()
    {
        
    }
    
    public Officer(String officerName, String officerAddress, String officerPhoneNumber, String officerEmail)
    {
        this.officerName = officerName;
        this.officerAddress = officerAddress;
        this.officerPhoneNumber = officerPhoneNumber;
        this.officerEmail = officerEmail;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }
    
    public String getOfficerAddress() {
        return officerAddress;
    }

    public void setOfficerAddress(String officerAddress) {
        this.officerAddress = officerAddress;
    }

    public String getOfficerPhoneNumber() {
        return officerPhoneNumber;
    }

    public void setOfficerPhoneNumber(String officerPhoneNumber) {
        this.officerPhoneNumber = officerPhoneNumber;
    }

    public String getOfficerEmail() {
        return officerEmail;
    }

    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }
    
}
