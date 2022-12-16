/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsModel;
import java.sql.*;
/**
 *
 * @author varsha.hindupur
 */
public class DatabaseConnection_newspaper 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    DatabaseConnection_newspaper dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DatabaseConnection_newspaper()
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
   
   public void addNewspaperDataToDB(Newspaper newspaper)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String insertsql="Insert into newspaper (npId, npName, npPrice, npNoOfPages, npDate, npPublicationId) values(?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(insertsql);

            stmt.setString(1, newspaper.getNpId());
            stmt.setString(2, newspaper.getNpName());
            stmt.setInt(3, newspaper.getNpPrice());
            stmt.setInt(4, newspaper.getNpNoOfPages());
            stmt.setString(5, newspaper.getNpDate());
            stmt.setString(6, newspaper.getNpPublicationId());
            
            System.out.println("DB data created in newspaper");

            stmt.executeUpdate();
            stmt.close();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   
   public void updateNewspaperDataToDB(Newspaper newspaper)
   {
       //add to database firDetails
        try
        {
            
            databaseConnection();
            String updateSql = "update "+ "newspaper"+" "+"set "
                    + " npName = "+"'"+ newspaper.getNpName() +"'"+ ","
                    +" npPrice = "+ newspaper.getNpPrice() +","
                    +" npNoOfPages = "+ newspaper.getNpNoOfPages() +","
                    +" npDate ="+ "'" + newspaper.getNpDate()+ "'" +","
                    +"npPublicationId ="+ "'"+ newspaper.getNpPublicationId() + "'" +" "
                    +"where npId = "+"'"+ newspaper.getNpId()+ "'" +";";
            
            System.out.println(updateSql);
            
            PreparedStatement stmt=con.prepareStatement(updateSql);
            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in newspaper");

            stmt.executeUpdate();

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteNewspaperDataInDB(Newspaper newspaper)
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String deleteSql="delete from "+ "newspaper" +" where npId = "+ "'" + newspaper.getNpId()+ "'";
            System.out.println(deleteSql);
            PreparedStatement preparedStmt = con.prepareStatement(deleteSql);
            
            preparedStmt.executeUpdate();

            System.out.println("Data deleted from newspaper: "+newspaper.getNpId());

            closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public void deleteEveryNewspaperDataInDB()
   {
       //add to database firDetails
        try
        {
            databaseConnection();
            String truncateSql="truncate table "+"newspaper";
            Statement stmt=con.createStatement();
            stmt.executeQuery(truncateSql);

            System.out.println("DB data deleted from newspaper");
            
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
//       DatabaseConnection_author dc = dc = new DatabaseConnection_author();
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
