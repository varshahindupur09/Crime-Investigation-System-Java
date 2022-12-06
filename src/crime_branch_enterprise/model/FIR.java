/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

import java.sql.Date;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class FIR {
    // get victimID from Victim.java
    // get crimeID from CrimeRegister.java
    
    int firId;
    Date dateOfOffence;
    String descr;
    String policeStationLoc;
    String accorvic;
    String firstname;
    String lastname;
    String emailId;
    int phoneNum;

    public int getFirId() {
        return firId;
    }

    public void setFirId(int firId) {
        this.firId = firId;
    }

    public Date getDateOfOffence() {
        return dateOfOffence;
    }

    public void setDateOfOffence(Date dateOfOffence) {
        this.dateOfOffence = dateOfOffence;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getPoliceStationLoc() {
        return policeStationLoc;
    }

    public void setPoliceStationLoc(String policeStationLoc) {
        this.policeStationLoc = policeStationLoc;
    }

    public String getAccorvic() {
        return accorvic;
    }

    public void setAccorvic(String accorvic) {
        this.accorvic = accorvic;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    String address;
    
    
}
