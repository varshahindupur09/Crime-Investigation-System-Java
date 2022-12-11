/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection_prison 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_prison dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_prison()
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
   
   
   public void addPrisonDataToDB(Prison prison)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into prison (prisonId, officerId, officerName, prisonName, city, jailCount) values(?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setInt(1, prison.getPrisonId());
            stmt.setString(2, prison.getPrisonName());
            stmt.setInt(3, prison.getOfficerId());
            stmt.setString(4, prison.getOfficerName());
            stmt.setInt(5, prison.getJailCount());
            stmt.setString(6, prison.getCity());
            
            System.out.println("DB data created in prison");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updatePrisonDataToDB(Prison prison)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "prison"+" "+"set "
                    + " prisonName = "+"'"+ prison.getPrisonName()+"'"+ ","
                    + " officerId = "+ prison.getOfficerId()+ ","
                    +" officerName = "+"'"+ prison.getOfficerName() +"'"+","
                    +" jailCount = "+ prison.getJailCount() +","
                    +" city = "+"'"+ prison.getCity() +"'"+","
                    +"where prisonId = "+ prison.getPrisonId()+";";
                    
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in where");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deletePrisonDataInDB(Prison prison)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "prison" +" where prisonId = "+ "'" + prison.getPrisonId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from prison: "+prison.getPrisonId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryPrisonDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"prison";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from prison");
            
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
//       DatabaseConnection_doctor dc = dc = new DatabaseConnection_doctor();
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
