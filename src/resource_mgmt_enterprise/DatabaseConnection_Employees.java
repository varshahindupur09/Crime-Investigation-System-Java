/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource_mgmt_enterprise;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author varsha.hindupur
 */
public class DatabaseConnection_Employees 
{
    
//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    
    ArrayList<Integer> emp_id; 
    ArrayList<String> firstname; 
    ArrayList<String> lastname; 
    ArrayList<String> email; 
    ArrayList<Integer> salary; 
    ArrayList<String> emp_role; 
    
    public DatabaseConnection_Employees()
    {
        emp_id = new ArrayList<>();
        firstname = new ArrayList<>();
        lastname = new ArrayList<>();
        email = new ArrayList<>();
        salary = new ArrayList<>();
        emp_role = new ArrayList<>();
    }

   public void databaseConnectionEmployees() 
   {
      
        try
        {  
            DatabaseConnection_Employees dc = new DatabaseConnection_Employees();
            //step1 load the driver class  
            Class.forName("com.mysql.cj.jdbc.Driver");  

            //step2 create  the connection object  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/crime_inv_sys","root","Vrsh@123");  

            //step3 create the statement object  
            Statement stmt=con.createStatement();  
            

            //step4 execute query  
            ResultSet rs=stmt.executeQuery("select * from employees");  
            while(rs.next())
            {
                dc.emp_id.add(rs.getInt("emp_id"));
                dc.firstname.add(rs.getString("firstname"));
                dc.lastname.add(rs.getString("lastname"));
                dc.email.add(rs.getString("email"));
                dc.salary.add(rs.getInt("salary"));
                dc.emp_role.add(rs.getString("emp_role"));
                System.out.println(rs.getInt("emp_id")+"  "+rs.getString("firstname")+"  "
                        +rs.getString("lastname")+rs.getString("email")+
                        rs.getInt("salary")+rs.getString("emp_role"));  
            }

            //step5 close the connection object  
            rs.close();
            stmt.close();
            con.close();  

        }
        catch(Exception e)
        { 
            e.printStackTrace();
        }  
    } 
}
