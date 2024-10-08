/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection_army 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_army dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_army()
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
   
   
   public void addArmyDataToDB(Army army)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into army (generalId, generalName, department, country) values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setInt(1, army.getGeneralId());
            stmt.setString(2, army.getGeneralName());
            stmt.setString(3, army.getDepartment());
            stmt.setString(4, army.getCountry());
            
            System.out.println("DB data created in army");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updateArmyDataToDB(Army army)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "army"+" "+"set "
                    + " generalName = "+"'"+ army.getGeneralName()+"'"+ ","
                    +" department = "+"'"+ army.getDepartment() +"'"+","
                    +" country = "+"'"+ army.getCountry() +"'"
                    +" where generalId = "+ army.getGeneralId()+";";
                    
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in army");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteArmyDataInDB(Army army)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "army" +" where generalId = "+ "'" + army.getGeneralId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from army: "+army.getGeneralId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryArmyDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"army";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from army");
            
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
