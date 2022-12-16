/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

/**
 *
 * @author hindupurv
 */
public class NewCaseRegister 
{
    private String emailId;
    private String phoneNum; 
    private String dateOfReport;
    private String officerName;

    public NewCaseRegister()
    {
        
    }
    
    @Override
    public String toString() {
        return emailId;
    }
    
    public NewCaseRegister(String emailId, String phoneNum, String dateOfReport, String officerName)
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
    public String getDateOfReport() {
        return dateOfReport;
    }

    /**
     * @param dateOfReport the dateOfReport to set
     */
    public void setDateOfReport(String dateOfReport) {
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
