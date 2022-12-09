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
 * @author varsha.hindupur
 */
public class DatabaseConnection_CaseDetails 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_CaseDetails dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_CaseDetails()
    {
     
    }

   public void databaseConnectionCaseDetails() 
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
   
   public void closeConnectionCaseDetails()
   {
        try {
            if(stmt != null)
            {
                stmt.close();
            }
            con.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection_CaseDetails.class.getName()).log(Level.SEVERE, null, ex);
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
