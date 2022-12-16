/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForensicsModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection_postMortem 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_postMortem dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_postMortem()
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
   
   
   public void addPostMortemDataToDB(PostMortem pm)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into postmortem (pmId, date, docId, bodyName, caseId, deathDate, causeOfDeath, fingerPrint) values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setInt(1, pm.getPmId());
            stmt.setString(2, pm.getDate());
            stmt.setInt(3, pm.getDocId());
            stmt.setString(4, pm.getBodyName());
            stmt.setInt(5, pm.getCaseId());
            stmt.setString(6, pm.getDeathDate());
            stmt.setString(7, pm.getCauseOfDeath());
            stmt.setInt(8, pm.getFingerPrint());
            
            System.out.println("DB data created in postmortem");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updatePostMortemDataToDB(PostMortem pm)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "postmortem"+" "+"set "
                    + " date = "+"'"+ pm.getDate() +"'"+ ","
                    +" docId = "+ pm.getDocId() +","
                    +" bodyName = "+"'"+ pm.getBodyName() +"'"+","
                    +" caseId ="+ pm.getCaseId() + ","
                    +" deathDate = "+"'"+ pm.getDeathDate() +"'"+","
                    +" causeOfDeath ="+ "'" + pm.getCauseOfDeath()+ "'"+","
                    +" fingerPrint = "+ pm.getFingerPrint()
                    +" where pmId = "+ pm.getPmId() +";";
                    
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in postmortem");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deletePostMortemDataInDB(PostMortem pm)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "postmortem" +" where pmId = "+ "'" + pm.getPmId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from postmortem: "+ pm.getPmId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryPostMortemDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"postmortem";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from postmortem");
            
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
//       dc,
//            
//       dc.updateAuthorDataToDB(author);
//       
//       dc.closeConnection();
//       
//   }
   
}
