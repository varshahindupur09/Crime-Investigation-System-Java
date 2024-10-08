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
public class DatabaseConnection_author 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_author dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_author()
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
   
   public void addAuthorDataToDB(Author author)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into author (authorId, authorName, authorAge, authorYOE, authorGender, authorDOJ) values(?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setString(1, author.getAuthorId());
            stmt.setString(2, author.getAuthorName());
            stmt.setInt(3, author.getAuthorAge());
            stmt.setInt(4, author.getAuthorYearsOfExperience());
            stmt.setString(5, author.getAuthorGender());
            stmt.setString(6, author.getAuthorDateOfJoining());
            
            System.out.println("DB data created in author");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updateAuthorDataToDB(Author author)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "author"+" "+"set "
                    + " authorName = "+"'"+ author.getAuthorName() +"'"+ ","
                    +" authorAge = "+ author.getAuthorAge() +","
                    +" authorYOE = "+ author.getAuthorYearsOfExperience() +","
                    +" authorGender ="+ "'" + author.getAuthorGender()+ "'" +","
                    +"authorDOJ ="+ "'"+ author.getAuthorDateOfJoining() + "'" +" "
                    +"where authorId = "+"'"+ author.getAuthorId()+ "'" +";";
            
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in author");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteAuthorDataInDB(Author author)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "author" +" where authorId = "+ "'" + author.getAuthorId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from author: "+author.getAuthorId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryAuthorDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"author";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from author");
            
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
