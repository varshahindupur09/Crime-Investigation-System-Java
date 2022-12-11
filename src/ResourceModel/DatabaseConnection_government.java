/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection_government 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_government dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_government()
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
   
   
   public void addGovernmentDataToDB(Government gov)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into government (partyLeaderId, partyLeaderName, party, state) values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setInt(1, gov.getPartyLeaderId());
            stmt.setString(2, gov.getPartyLeaderName());
            stmt.setString(3, gov.getParty());
            stmt.setString(4, gov.getState());
            
            System.out.println("DB data created in government");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updateGovernmentDataToDB(Government gov)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "government"+" "+"set "
                    +" partyLeaderName = "+"'"+ gov.getPartyLeaderName()+"'"+ ","
                    +" party = "+"'"+ gov.getParty() +"'"+","
                    +" state = "+"'"+ gov.getState() +"'"+","
                    +"where partyLeaderId = "+ gov.getPartyLeaderId()+";";
                    
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
   
   public void deleteGovernmentDataInDB(Government gov)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "government" +" where partyLeaderId = "+ "'" + gov.getPartyLeaderId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from government: "+gov.getPartyLeaderId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryGovernmentDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"government";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from government");
            
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
