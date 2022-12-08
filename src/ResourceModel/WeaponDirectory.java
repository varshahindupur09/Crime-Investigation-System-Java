/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;

import java.util.ArrayList;


public class WeaponDirectory {
    
    private ArrayList<Weapon> weaponHistory;
    
    public WeaponDirectory(){
    this.weaponHistory = new ArrayList<Weapon>(); 
    }

    public ArrayList<Weapon> getWeaponHistory() {
        return weaponHistory;
    }

    public void setHistory(ArrayList<Weapon> weaponHistory) {
        this.weaponHistory = weaponHistory;
    }
    
    public Weapon addNewWeapon(){    
    Weapon newWeapon = new Weapon();
    weaponHistory.add(newWeapon);
    return newWeapon;
    }
    
    public void deleteWeapon(Weapon w){
        weaponHistory.remove(w);
    }
    
    
}
