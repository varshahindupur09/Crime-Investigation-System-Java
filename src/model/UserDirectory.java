/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class UserDirectory {
    
    public static ArrayList<User> userDir;
    
    public UserDirectory(){
        userDir = new ArrayList<User>();
        addLogins();
        addLoginsHospitalAdmin();
        addLoginsDoctorAdmin();
        addLoginsForensicLabAdmin();        
    }
    
    public User getUserByUsername(String userName){
        
        for(User us:this.getUserDir()){
            if(us.getUsername().equals(userName)){
                return us;
            }
        }
        return null;
    }
    
    public User addUser(){
        User usr = new User();
        userDir.add(usr);
        return usr;
    }
    
    public void addUser(User usr)
    {
        userDir.add(usr);
    }
   
    
    public void addLogins(){
        
        User user = addUser();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRole("Admin");
        
    }
    
    public void addLoginsHospitalAdmin(){
        
        User user = addUser();
        user.setUsername("hosp");
        user.setPassword("hosp");
        user.setRole("Hosp-Admin");
        
    }
    
    public void addLoginsDoctorAdmin(){
        
        User user = addUser();
        user.setUsername("doc");
        user.setPassword("doc");
        user.setRole("Doc-Admin");
        
    }
    
    public void addLoginsForensicLabAdmin(){
        
        User user = addUser();
        user.setUsername("for");
        user.setPassword("for");
        user.setRole("For-Admin");
        
    }
    

    public ArrayList<User> getUserDir() {
        return userDir;
    }
    
}
