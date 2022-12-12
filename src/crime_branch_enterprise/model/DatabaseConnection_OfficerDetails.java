/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;
import java.sql.*;

/**
 *
 * @author hindupurv
 */
public class DatabaseConnection_OfficerDetails 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_OfficerDetails dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_OfficerDetails()
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
            con.close(); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   }
   
   
   public void addOfficerDataToDatabase(String officerName, String officerAddress, String officerEmail, String officerPhoneNumber) 
   {
        //add to database firDetails
        try
        {
            databaseConnection();
            String insertsql="Insert into officerDetails (officerName, officerAddress, officerEmail, officerPhoneNumber) values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setString(1, officerName);
            stmt.setString(2, officerAddress);
            stmt.setString(3, officerEmail);
            stmt.setString(4, officerPhoneNumber);

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   
     
   public void updateOfficerDataToDB(Officer officer)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+" "+"officerDetails" +" "+"set "
                    +" officerName = " + "'"+ officer.getOfficerName() +"'"
                    +" officerAddress = "+ "'"+ officer.getOfficerAddress() +"'"
                    +" officerPhoneNumber ="+ "'"+ officer.getOfficerPhoneNumber() +"'"
                    +" where officerEmail ="+ "'"+ officer.getOfficerEmail() +"'" +";";
            
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
//example update statement            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in officer details");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteOfficerDataInDB(Officer officer)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "officerDetails" +" where emailId = "+ "'" + officer.getOfficerEmail() + "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from officerDetails: "+ officer.getOfficerEmail());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryOfficerDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"officerDetails";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from officerDetails");
            
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
