/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

/**
 *
 * @author ASUS
 */
public class NewCaseRegister 
{
    private String emailId;
    private String phoneNum; 
    private java.sql.Date dateOfReport;
    private String officerName;

    /**
     * @return the emailId
     */
    public NewCaseRegister()
    {
        
    }
    
    public NewCaseRegister(String emailId, String phoneNum, java.sql.Date dateOfReport, String officerName)
    {
        this.emailId = emailId;
        this.phoneNum = phoneNum;
        this.dateOfReport = dateOfReport;
        this.officerName = officerName;
    }
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the dateOfReport
     */
    public java.sql.Date getDateOfReport() {
        return dateOfReport;
    }

    /**
     * @param dateOfReport the dateOfReport to set
     */
    public void setDateOfReport(java.sql.Date dateOfReport) {
        this.dateOfReport = dateOfReport;
    }

    /**
     * @return the officerName
     */
    public String getOfficerName() {
        return officerName;
    }

    /**
     * @param officerName the officerName to set
     */
    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }
}
