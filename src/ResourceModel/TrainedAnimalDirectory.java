/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;

import ForensicsModel.Doctor;
import java.util.ArrayList;

public class TrainedAnimalDirectory {
    
    private ArrayList<TrainedAnimal> animalHistory;
    
    public TrainedAnimalDirectory(){
    this.animalHistory= new ArrayList<TrainedAnimal>(); 
    }

    public ArrayList<TrainedAnimal> getanimalHistory() {
        return animalHistory;
    }

    public void setHistory(ArrayList<TrainedAnimal> animalHistory) {
        this.animalHistory = animalHistory;
    }
    
    public TrainedAnimal addNewAnimal(){    
    TrainedAnimal newani = new TrainedAnimal();
    animalHistory.add(newani);
    return newani;
    }
    
    public void deleteAnimal(TrainedAnimal a){
        animalHistory.remove(a);
    }
    
}
