/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;


public class Prison {
    
    public int prisonId;
    public int officerId;
    public String officerName; 
    public String prisonName;
    public String city;
    public int jailCount;

    public int getPrisonId() {
        return prisonId;
    }
    
    @Override
    public String toString() {
            return String.valueOf(prisonId);
    }

    public void setPrisonId(int prisonId) {
        this.prisonId = prisonId;
    }

    public String getPrisonName() {
        return prisonName;
    }

    public void setPrisonName(String prisonName) {
        this.prisonName = prisonName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getJailCount() {
        return jailCount;
    }

    public void setJailCount(int jailCount) {
        this.jailCount = jailCount;
    }

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }
    
    
    
}
