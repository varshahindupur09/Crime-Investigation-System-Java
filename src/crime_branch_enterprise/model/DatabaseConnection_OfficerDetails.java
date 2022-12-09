/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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

   public void databaseConnectionOfficerDetails() 
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
   
   public void closeConnectionFIRDetails()
   {
        try {
            con.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection_OfficerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
   public void addOfficerDataToDatabase(String officerName, String officerAddress, int officerPhoneNumber, String officerEmail) 
   {
        //add to database firDetails
        try
        {
            databaseConnectionOfficerDetails();
            String insertsql="Insert into officerDetails (officerName, officerAddress, officerPhoneNumber, officerEmail) values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setString(1, officerName);
            stmt.setString(2, officerAddress);
            stmt.setInt(3, officerPhoneNumber);
            stmt.setString(4, officerEmail);

            stmt.executeUpdate();
            stmt.close();

            closeConnectionFIRDetails();
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
