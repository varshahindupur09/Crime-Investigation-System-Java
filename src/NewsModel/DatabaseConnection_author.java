/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            "jdbc:mysql://localhost:3306/crime_inv_sys","root","Vrsh@123");  

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
            String updateSql = "update author set "
                    + " authorName = "+author.getAuthorName()
                    +" authorAge = "+ author.getAuthorAge()
                    +" authorYOE = "+ author.getAuthorYearsOfExperience()
                    +" authorGender ="+author.getAuthorGender()
                    +",authorDOJ ="+ author.getAuthorDateOfJoining()
                    +"where authorId = "+author.getAuthorId()+";";
            
            PreparedStatement stmt=con.prepareStatement(updateSql);

//            stmt.setString(1, author.getAuthorId());
            stmt.setString(2, author.getAuthorName());
            stmt.setInt(3, author.getAuthorAge());
            stmt.setInt(4, author.getAuthorYearsOfExperience());
            stmt.setString(5, author.getAuthorGender());
            stmt.setString(6, author.getAuthorDateOfJoining());
            
            System.out.println("DB data updated in author");

            stmt.executeUpdate();
            stmt.close();

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
            String deleteSql="delete from "+ author +" where authorId = ?";
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            preparedStmt.setString(1, author.getAuthorId());
            
            stmt.executeQuery(deleteSql);

            System.out.println("Data deleted from author: "+author.getAuthorId());
            
            stmt.close();

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
//       DatabaseConnection_CaseDetails dc = dc = new DatabaseConnection_CaseDetails();
//       dc.databaseConnectionCaseDetails();
//       int crime_id = dc.getCrimeId(123);
//       dc.closeConnectionCaseDetails();
//       System.out.println(crime_id);
//   }
   
}
