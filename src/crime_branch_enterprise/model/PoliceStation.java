/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class PoliceStation {
    
    private String policeStationID;
    private String policeStationName;
    private String policeStationLocation;
    private String policeStationCity;
    private String policeStationPhoneNumber;
    // Get officerID from OfficerRecord.java
    private String policeStationRemarks;

    public String getPoliceStationID() {
        return policeStationID;
    }

    public void setPoliceStationID(String policeStationID) {
        this.policeStationID = policeStationID;
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }

    public String getPoliceStationLocation() {
        return policeStationLocation;
    }

    public void setPoliceStationLocation(String policeStationLocation) {
        this.policeStationLocation = policeStationLocation;
    }

    public String getPoliceStationCity() {
        return policeStationCity;
    }

    public void setPoliceStationCity(String policeStationCity) {
        this.policeStationCity = policeStationCity;
    }

    public String getPoliceStationPhoneNumber() {
        return policeStationPhoneNumber;
    }

    public void setPoliceStationPhoneNumber(String policeStationPhoneNumber) {
        this.policeStationPhoneNumber = policeStationPhoneNumber;
    }

    public String getPoliceStationRemarks() {
        return policeStationRemarks;
    }

    public void setPoliceStationRemarks(String policeStationRemarks) {
        this.policeStationRemarks = policeStationRemarks;
    }
    
    
}
