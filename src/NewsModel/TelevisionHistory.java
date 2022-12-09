/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;

import java.util.ArrayList;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class TelevisionHistory {
    
    ArrayList<Television> televisionData;
    
    public TelevisionHistory() {
        
        this.televisionData = new ArrayList<Television>();
    }

    public ArrayList<Television> getTelevisionData() {
        return televisionData;
    }

    public void setTelevisionData(ArrayList<Television> televisionData) {
        this.televisionData = televisionData;
    }
    
    public Television addTelevision() {

        Television newAuthData = new Television();
        televisionData.add(newAuthData);
        return newAuthData;

    }
    
    public void deleteTelevision(Television tv) {
        televisionData.remove(tv);

    }
    
}
