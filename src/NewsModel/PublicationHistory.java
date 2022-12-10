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
public class PublicationHistory {
    
    ArrayList<Publication> publicationData;
    
    public PublicationHistory() {
        
        this.publicationData = new ArrayList<Publication>();
    }

    public ArrayList<Publication> getPublicationData() {
        return publicationData;
    }

    public void setPublicationData(ArrayList<Publication> publicationData) {
        this.publicationData = publicationData;
    }
    
    public Publication addPublication() {

        Publication newPublicationData = new Publication();
        publicationData.add(newPublicationData);
        return newPublicationData;

    }
    
    public void deletePublication(Publication pb) {
        publicationData.remove(pb);

    }
    
}
