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
public class NewspaperHistory {
    ArrayList<Newspaper> newspaperData;
    
    public NewspaperHistory() {
        
        this.newspaperData = new ArrayList<Newspaper>();
    }

    public ArrayList<Newspaper> getNewspaperData() {
        return newspaperData;
    }

    public void setNewspaperData(ArrayList<Newspaper> newspaperData) {
        this.newspaperData = newspaperData;
    }
    
    public Newspaper addNewspaper() {

        Newspaper newNewspaperData = new Newspaper();
        newspaperData.add(newNewspaperData);
        return newNewspaperData;

    }
    
    public void deleteNewspaper(Newspaper np) {
        newspaperData.remove(np);

    }
}
