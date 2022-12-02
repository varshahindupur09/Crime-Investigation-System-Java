/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class Accused {
    
    private String accusedID;
    private String accusedName;
    private String accusedFatherName;
    private String accusedAddress;
    private int accusedAge;
    private String accusedGender;
    private String accusedCNIC; // Computerized National Identity Card
    // Get crimeID from CrimeRegister.java
    private String accusedRemark;

    public String getAccusedID() {
        return accusedID;
    }

    public void setAccusedID(String accusedID) {
        this.accusedID = accusedID;
    }

    public String getAccusedName() {
        return accusedName;
    }

    public void setAccusedName(String accusedName) {
        this.accusedName = accusedName;
    }

    public String getAccusedFatherName() {
        return accusedFatherName;
    }

    public void setAccusedFatherName(String accusedFatherName) {
        this.accusedFatherName = accusedFatherName;
    }

    public String getAccusedAddress() {
        return accusedAddress;
    }

    public void setAccusedAddress(String accusedAddress) {
        this.accusedAddress = accusedAddress;
    }

    public int getAccusedAge() {
        return accusedAge;
    }

    public void setAccusedAge(int accusedAge) {
        this.accusedAge = accusedAge;
    }

    public String getAccusedGender() {
        return accusedGender;
    }

    public void setAccusedGender(String accusedGender) {
        this.accusedGender = accusedGender;
    }

    public String getAccusedCNIC() {
        return accusedCNIC;
    }

    public void setAccusedCNIC(String accusedCNIC) {
        this.accusedCNIC = accusedCNIC;
    }

    public String getAccusedRemark() {
        return accusedRemark;
    }

    public void setAccusedRemark(String accusedRemark) {
        this.accusedRemark = accusedRemark;
    }
    
}
