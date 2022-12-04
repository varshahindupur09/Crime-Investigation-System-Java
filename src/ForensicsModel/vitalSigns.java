/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;


public class vitalSigns {
       
    public String bloodGroup;
    public int pulseRate;
    public String strangleMarks;
    public String missingOrgans;
    public int stabs;
    public int hits;
    public int incisions;
 
    
    public String getBloodGroup() {
        return bloodGroup;
    }
    
    @Override
    public String toString() {
            return String.valueOf(bloodGroup);
    }        

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public String getStrangleMarks() {
        return strangleMarks;
    }

    public void setStrangleMarks(String strangleMarks) {
        this.strangleMarks = strangleMarks;
    }

    public String getMissingOrgans() {
        return missingOrgans;
    }

    public void setMissingOrgans(String missingOrgans) {
        this.missingOrgans = missingOrgans;
    }

    public int getStabs() {
        return stabs;
    }

    public void setStabs(int stabs) {
        this.stabs = stabs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getIncisions() {
        return incisions;
    }

    public void setIncisions(int incisions) {
        this.incisions = incisions;
    }

    
}
