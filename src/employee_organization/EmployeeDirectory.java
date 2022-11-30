/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_organization;

import model.*;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EmployeeDirectory {
    
    ArrayList<User> employeeDir;
    
    public EmployeeDirectory(){
        employeeDir = new ArrayList<User>();
        addLogins();
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
        employeeDir.add(usr);
        return usr;
    }
    
    public void addLogins(){
        
        User user = addUser();
        user.setUsername("cbi_officer");
        user.setPassword("cbi_officer");
        user.setRole("CBIOfficer");
        
    }

    public ArrayList<User> getUserDir() {
        return employeeDir;
    }
    
    
}
