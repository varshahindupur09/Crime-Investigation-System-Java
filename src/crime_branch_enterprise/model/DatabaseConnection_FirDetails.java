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
public class DatabaseConnection_FirDetails 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_FirDetails dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_FirDetails()
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
   
   public void addCaseDataToDB(FIR fir)
   {
       //add to database firDetails
        try
        {
            databaseConnection();

            String sqlQueryStoreData = "insert into firdetails(emailId, phoneNum, dateOfReport, officerName) values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(sqlQueryStoreData);
            
//            stmt.setString(1, newCaseRegister.getEmailId());
//            stmt.setString(2, String.valueOf(newCaseRegister.getPhoneNum()));
////            stmt.setDate(3, new java.sql.Date(sqlDate.getDate()));
//            stmt.setDate(3, newCaseRegister.getDateOfReport());
//            stmt.setString(4, newCaseRegister.getOfficerName());
            
            stmt.executeUpdate();
            stmt.close();
            closeConnection();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updateCaseDataToDB(NewCaseRegister newCaseRegister)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+" "+"caseDetails" +" "+"set "
                    +" phoneNum = "+ "'"+ newCaseRegister.getPhoneNum() +"'"
                    +" dateOfReport = " + newCaseRegister.getDateOfReport()
                    +" OfficerName ="+ "'"+ newCaseRegister.getOfficerName() +"'"
                    +" where emailId = "+ "'"+ newCaseRegister.getEmailId() +"'"+";";
            
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
   
   public void deleteNewCaseDataInDB(NewCaseRegister newCaseRegister)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "caseDetails" +" where emailId = "+ "'" + newCaseRegister.getEmailId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from caseDetails: "+ newCaseRegister.getEmailId());

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
            String truncateSql="truncate table "+"caseDetails";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from caseDetails");
            
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
}
