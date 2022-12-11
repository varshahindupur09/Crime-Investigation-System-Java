/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class Reporter {
   
    private String reporterId;
    private String reporterName;
    private String reporterEmail;
    private int reporterAge;
    private int reporterYearsOfExperience;
    private String reporterGender;
    private String reporterDateOfJoining;
    
    @Override
    public String toString() {
        return reporterEmail;
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        this.reporterEmail = reporterEmail;
    }

    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public int getReporterAge() {
        return reporterAge;
    }

    public void setReporterAge(int reporterAge) {
        this.reporterAge = reporterAge;
    }

    public int getReporterYearsOfExperience() {
        return reporterYearsOfExperience;
    }

    public void setReporterYearsOfExperience(int reporterYearsOfExperience) {
        this.reporterYearsOfExperience = reporterYearsOfExperience;
    }

    public String getReporterGender() {
        return reporterGender;
    }

    public void setReporterGender(String reporterGender) {
        this.reporterGender = reporterGender;
    }

    public String getReporterDateOfJoining() {
        return reporterDateOfJoining;
    }

    public void setReporterDateOfJoining(String reporterDateOfJoining) {
        this.reporterDateOfJoining = reporterDateOfJoining;
    }
    
    
    
}
