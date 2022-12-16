/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;
import java.sql.*;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author hindupurv
 */
public class DatabaseConnection_adminUser 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_adminUser dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    String table = "adminUser"; 
    
    public DatabaseConnection_adminUser()
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
   
   
   public void addUserDataToDatabase(User user) 
   {
        //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="insert into adminUser (username, pass, roleCategory) values(?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getRole());

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   
   
     
   public void updateAdminUserDataToDB(User user)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+" "+ table+" "+"set "
                    +" pass = " + "'"+ user.getPassword() +"'"
                    +" roleCategory = " + "'"+ user.getRole()+"'"
                    +" where username = " + "'"+ user.getUsername() +"'"+";";
            
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
//example update statement            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in Admin User details");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteAdminUserDataInDB(User user)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ table +" where emailId = "+ "'" + user.getUsername()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from "+table+": "+ user.getUsername());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryAdminUserDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+table;
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from "+table);
            
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public String populateEveryAdminDataInLoginScreen(String username, String password) {
        //add to database firDetails
        String roleAdmin = "";
        
        try {
            databaseConnection();

            String truncateSql = "select roleCategory from " + "adminUser"+
                    " where username = '"+username+ "'"+";";
            
            System.out.println(truncateSql);
            
            stmt = con.createStatement();
            rs = stmt.executeQuery(truncateSql);
            
            while(rs.next())
            {
                roleAdmin = rs.getString("roleCategory");
            }
            
            System.out.println("populate admin user "+ roleAdmin);

            closeConnection();
        }
        catch(NullPointerException e1)
        {
            System.out.println("populate Every Role Category");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return roleAdmin;
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
