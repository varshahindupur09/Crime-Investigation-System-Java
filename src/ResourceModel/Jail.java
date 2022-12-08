/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;


public class Jail {
    
    public int jailId;
    public int jailerId;
    public String jailerName;
    public int criminalCount;

    public int getJailId() {
        return jailId;
    }
    
    @Override
    public String toString() {
            return String.valueOf(jailId);
    }

    public void setJailId(int jailId) {
        this.jailId = jailId;
    }

    public int getJailerId() {
        return jailerId;
    }

    public void setJailerId(int jailerId) {
        this.jailerId = jailerId;
    }

    public String getJailerName() {
        return jailerName;
    }

    public void setJailerName(String jailerName) {
        this.jailerName = jailerName;
    }

    public int getCriminalCount() {
        return criminalCount;
    }

    public void setCriminalCount(int criminalCount) {
        this.criminalCount = criminalCount;
    }
    
    
}
