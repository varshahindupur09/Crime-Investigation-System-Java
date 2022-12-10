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
public class NewsHistory {
    ArrayList<News> newsData;
    
    public NewsHistory() {
        
        this.newsData = new ArrayList<News>();
    }

    public ArrayList<News> getAuthData() {
        return newsData;
    }

    public void setNewsData(ArrayList<News> newsData) {
        this.newsData = newsData;
    }
    
    public News addNews() {

        News newNewsData = new News();
        newsData.add(newNewsData);
        return newNewsData;

    }
    
    public void deleteNews(News news) {
        newsData.remove(news);

    }
    
}
