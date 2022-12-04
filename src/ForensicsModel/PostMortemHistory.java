/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;

import java.util.ArrayList;

public class PostMortemHistory {
    
    private ArrayList<PostMortem> pmHistory;
    
    public PostMortemHistory(){
    this.pmHistory= new ArrayList<PostMortem>(); 
    }

    public ArrayList<PostMortem> getPMHistory() {
        return pmHistory;
    }

    public void setHistory(ArrayList<PostMortem> pmHistory) {
        this.pmHistory = pmHistory;
    }
    
    public PostMortem addNewPM(){
    
    PostMortem newPM= new PostMortem();
    pmHistory.add(newPM);
    return newPM;
    }
    
    public void deletePM(PostMortem pm){
        pmHistory.remove(pm);
    }
    
}
