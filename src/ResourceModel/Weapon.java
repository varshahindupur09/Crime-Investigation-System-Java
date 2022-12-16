/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;


public class Weapon {
    
    public int weaponId;
    public String wType;
    public int wcount;

    public int getWeaponId() {
        return weaponId;
    }
     @Override
    public String toString() {
            return String.valueOf(weaponId);
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getwType() {
        return wType;
    }

    public void setwType(String wType) {
        this.wType = wType;
    }

    public int getWCount() {
        return wcount;
    }

    public void setWCount(int wcount) {
        this.wcount = wcount;
    }
  
       
}
