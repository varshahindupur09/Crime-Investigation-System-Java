/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;
import java.sql.*;

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
   
   public void addFIRDataToDB(FIR fir)
   {
       //add to database firDetails
        try
        {
            databaseConnection();

            String sqlQueryStoreData = "insert into firdetails(dateOfOffence, descr, policeStationLoc, accorvic, firstname, lastname, emailId, phoneNum, address) "
                    + "values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(sqlQueryStoreData);
            
            stmt.setDate(1, fir.getDateOfOffence());
            stmt.setString(2, String.valueOf(fir.getDescr()));
            stmt.setString(3, String.valueOf(fir.getPoliceStationLoc()));
            stmt.setString(4, String.valueOf(fir.getAccorvic()));
            stmt.setString(5, String.valueOf(fir.getFirstname()));
            stmt.setString(6, String.valueOf(fir.getLastname()));
            stmt.setString(7, fir.getEmailId());
            stmt.setInt(8, fir.getPhoneNum());
            stmt.setString(9, fir.getAddress());
            
            stmt.executeUpdate();
            stmt.close();
            closeConnection();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   //emailId is unique
   public void updateCaseDataToDB(FIR fir)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+" "+"firDetails" +" "+"set "
                    +" dateOfOffence = " + fir.getDateOfOffence()
                    +" descr ="+ "'"+ fir.getDescr()+"'"
                    +" policeStationLoc ="+ "'"+ fir.getPoliceStationLoc()+"'"
                    +" accorvic ="+ "'"+ fir.getAccorvic()+"'"
                    +" firstname ="+ "'"+ fir.getLastname()+"'"
                    +" lastname ="+ "'"+ fir.getLastname()+"'"
                    +" phoneNum = "+ "'"+ fir.getPhoneNum() +"'"
                    +" address = "+ "'"+ fir.getAddress()+"'"
                    +" where emailId = "+ "'"+ fir.getEmailId() +"'"+";";
            
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
//example update statement            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in FIR details");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteFIRDataInDB(FIR fir)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "firDetails" +" where emailId = "+ "'" + fir.getEmailId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from firDetails: "+ fir.getEmailId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryFIRDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"firDetails";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from firDetails");
            
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
}
