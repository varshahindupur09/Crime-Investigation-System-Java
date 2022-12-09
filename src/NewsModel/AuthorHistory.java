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
public class AuthorHistory {
    
    ArrayList<Author> authorData;
    
    public AuthorHistory() {
        
        this.authorData = new ArrayList<Author>();
    }

    public ArrayList<Author> getAuthData() {
        return authorData;
    }

    public void setAuthData(ArrayList<Author> authorData) {
        this.authorData = authorData;
    }
    
    public Author addAuthor() {

        Author newAuthData = new Author();
        authorData.add(newAuthData);
        return newAuthData;

    }
    
    public void deleteAuthor(Author auth) {
        authorData.remove(auth);

    }
}
