/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import utility.UtilityFunctions;

/**
 *
 * @author user
 */
public class Sys {
    
    private String name;
    //private PatientDirectory patDir;
    private PersonDirectory perDir;
    private UserDirectory userDir;
    private ArrayList<City> cityList;
    
    public Sys(){
    
        //patDir = new PatientDirectory(this);
        perDir = new PersonDirectory(this);
        userDir = new UserDirectory();
        cityList = new ArrayList<City>();
        
        //createData(this);
        
    }

    public City addCity(String cityName) {
        
        City newCity = new City(this,cityName);
        this.cityList.add(newCity);
        return newCity;
    }
    
    public UserDirectory getUserDir() {
        return userDir;
    }
   
    
    public boolean checkIfCityExists(String cityName){
        
        for(City city:this.getCityList()){
            
            if(city.getCitName().equals(cityName)){
                return true; // City exists
            }
            
        }
        
        return false;
    }
    
    public House findHouseInCity(Person person){
    
        for(City city:this.getCityList()){
            
            if(!city.findHouseInCommunity(person).equals(null)){
                return city.findHouseInCommunity(person);
            }
        
        }
        
        return null;
    }
            
    

    public City getCity(String cityName) {
        for(City city:this.cityList){
            
            if(city.getCitName().equals(cityName))
                    return city;
        }
        
        return null;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }
    
    
    
}
