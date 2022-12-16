/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

import ForensicsModel.PostMortem;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author hindupurv
 */
public class DatabaseConnection_person {

//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    DatabaseConnection_person dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    String table1 = "person";
    String table2 = "postmortem";
ReadCaseJPanel readCase;
    public DatabaseConnection_person() {
    }

    public void databaseConnection() {

        try {
            //step1 load the driver class  
            Class.forName("com.mysql.jdbc.Driver");

            //step2 create  the connection object  
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/crime_inv_sys", "root", "Vrsh@123!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

//        return con;
    }

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String matchFingerPrintDataToDB(int checkFP) {
        String selectSql="";
        String pName="";
        
        try {
            //add to database firDetails

            databaseConnection();
             selectSql = "select t1.pName from " + table1 + " t1 inner join " + table2
                    + " t2  on t1.pmId = t2.pmId where t1.fpId = " + checkFP + ";";

            System.out.println(checkFP);

            Statement stmt = con.createStatement();
//example update statement            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';
//            ResultSet res = 
            System.out.println("Finger print matched");

            rs=stmt.executeQuery(selectSql);
            
            while(rs.next()){
              pName=  rs.getString("t1.pName");
            }
            closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection_person.class.getName()).log(Level.SEVERE, null, ex);
        }
                return pName;

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
