/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;


public class ForensicLab {
    
    public int forLabId;
    public int hospId;
    public String hospName;

    public int getForLabId() {
        return forLabId;
    }
    
    @Override
    public String toString() {
            return String.valueOf(forLabId);
    }

    public void setForLabId(int forLabId) {
        this.forLabId = forLabId;
    }

    public int getHospId() {
        return hospId;
    }

    public void setHospId(int hospId) {
        this.hospId = hospId;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }
    
    
}
