/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;
import java.sql.*;
/**
 *
 * @author varsha.hindupur
 */
public class DatabaseConnection_news 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_news dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_news()
    {
     
    }

   public void databaseConnection() 
   {

        try
        {  
            //step1 load the driver class  
            Class.forName("com.mysql.jdbc.Driver");  

            //step2 create  the connection object  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/crime_inv_sys","root","aastha2996!!");  

        }
        catch(Exception e)
        { 
            e.printStackTrace();
        } 
        
//        return con;
    } 
   
   public void closeConnection()
   {
        try {
            if(stmt != null)
            {
                stmt.close();
            }
            con.close(); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   }
   
   public void addNewsDataToDB(News news)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into news (newsId, newsCrime, newsCrimeDate, newsAuthor, newsReporter, newsPublication) values(?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setString(1, news.getNewsId());
            stmt.setString(2, news.getNewsCrime());
            stmt.setString(3, news.getNewsCrimeDate());
            stmt.setString(4, news.getNewsAuthor());
            stmt.setString(5, news.getNewsReporter());
            stmt.setString(6, news.getNewsPublication());
            
            System.out.println("DB data created in news");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updateNewsDataToDB(News news)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "news"+" "+"set "
                    + " newsCrime = "+"'"+ news.getNewsCrime() +"'"+ ","
                    +" newsCrimeDate = "+"'"+ news.getNewsCrimeDate() +"'"+","
                    +" newsAuthor = "+"'"+ news.getNewsAuthor() +"'"+","
                    +" newsReporter ="+ "'" + news.getNewsReporter()+ "'" +","
                    +"newsPublication ="+ "'"+ news.getNewsPublication() + "'" +" "
                    +"where newsId = "+"'"+ news.getNewsId()+ "'" +";";
            
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in news");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteNewsDataInDB(News news)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "news" +" where newsId = "+ "'" + news.getNewsId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from news: "+news.getNewsId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryNewsDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"news";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from news");
            
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
//   public static void main(String main[])
//   {
//       DatabaseConnection_author dc = dc = new DatabaseConnection_author();
//       dc.databaseConnection();
//       
//       Author author = new Author();
//       author.setAuthorId("fh1");
//       author.setAuthorName("fhewh");
//       author.setAuthorAge(20);
//       author.setAuthorYearsOfExperience(1);
//       author.setAuthorGender("F");
//       author.setAuthorDateOfJoining("545");
//            
//       dc.updateAuthorDataToDB(author);
//       
//       dc.closeConnection();
//       
//   }
   
}
