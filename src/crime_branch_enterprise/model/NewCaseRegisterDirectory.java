/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NewCaseRegisterDirectory 
{
    static ArrayList<NewCaseRegister> newCaseRegisterList = new ArrayList<>();
    
    public NewCaseRegisterDirectory()
    {
        
    }
    
    public NewCaseRegisterDirectory(ArrayList<NewCaseRegister> newCaseRegisterList) {
        this.newCaseRegisterList = newCaseRegisterList;
    }

    public ArrayList<NewCaseRegister> getNewCaseRegisterList() {
        return newCaseRegisterList;
    }

    public void setNewCaseRegisterList(ArrayList<NewCaseRegister> newCaseRegisterList) {
        this.newCaseRegisterList = newCaseRegisterList;
    }

    public void deleteNewCaseRegister(NewCaseRegister newCaseRegister){
        newCaseRegisterList.remove(newCaseRegister);
    }
    
    public void addNewCaseDataInList(NewCaseRegister newCaseRegister)
    {
        newCaseRegisterList.add(newCaseRegister);
    }
    
}
