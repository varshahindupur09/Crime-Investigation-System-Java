/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.sql.*;

/**
 *
 * @author varsha.hindupur
 */
public class DatabaseConnection 
{
    
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT * FROM employee";
   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("emp_id"));
            System.out.print(", Email: " + rs.getInt("email"));
            System.out.print(", FirstName: " + rs.getString("firstname"));
            System.out.println(", LastName: " + rs.getString("lastname"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
