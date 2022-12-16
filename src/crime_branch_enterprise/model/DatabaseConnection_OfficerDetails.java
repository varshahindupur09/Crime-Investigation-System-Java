/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author hindupurv
 */
public class DatabaseConnection_OfficerDetails {

//   static final String USER = "root";
//   static final String PASS = "Vrsh@123";
//   static final String QUERY = "SELECT * FROM employee";
//   static final String DB_URL = "jdbc:oracle:thin:"+USER+"/"+PASS+"@localhost:3306:crime_inv_sys";
    DatabaseConnection_OfficerDetails dc;
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement preparedStmt;

    public DatabaseConnection_OfficerDetails() {
    }

    public void databaseConnection() {

        try {
            //step1 load the driver class  
            Class.forName("com.mysql.jdbc.Driver");

            //step2 create  the connection object  
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/crime_inv_sys", "root", "Vrsh@123");

        } catch (Exception e) {
            e.printStackTrace();
        }

//        return con;
    }

    public void closeConnection() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (preparedStmt != null) {
                preparedStmt.close();
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void addOfficerDataToDatabase(String officerName, String officerAddress, String officerEmail, String officerPhoneNumber) {
        //add to database firDetails
        try {
            databaseConnection();
            String insertsql = "Insert into officerDetails (officerName, officerAddress, officerEmail, officerPhoneNumber) values(?,?,?,?)";
            preparedStmt = con.prepareStatement(insertsql);

            preparedStmt.setString(1, officerName);
            preparedStmt.setString(2, officerAddress);
            preparedStmt.setString(3, officerEmail);
            preparedStmt.setString(4, officerPhoneNumber);

            preparedStmt.executeUpdate();

            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateOfficerDataToDB(Officer officer) {
        //add to database firDetails
        try {
            System.out.println("previous data");
            System.out.println(officer.getOfficerName() + " " + officer.getOfficerEmail() + " " + officer.getOfficerPhoneNumber() + " " + officer.getOfficerAddress());
            databaseConnection();
            String updateSql = "update " + " " + "officerDetails" + " " + "set"
                    + " officerName = " + "'" + officer.getOfficerName() + "'" + ","
                    + " officerAddress = " + "'" + officer.getOfficerAddress() + "'" + ","
                    + " officerPhoneNumber =" + "'" + officer.getOfficerPhoneNumber() + "'"
                    + " where officerEmail =" + "'" + officer.getOfficerEmail() + "'" + ";";

            System.out.println(updateSql);

            preparedStmt = con.prepareStatement(updateSql);
//example update statement            
//            update author set  authorName = 'fhewh', authorAge = 20, authorYOE = 1, authorGender ='F',authorDOJ ='545' where authorId = 'fh1';

            System.out.println("DB data updated in officer details");

            preparedStmt.executeUpdate();

            closeConnection();
        } catch (NullPointerException e1) {
            System.out.println("Nothing in Officer details was updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteOfficerDataInDB(Officer officer) {
        //add to database firDetails
        try {
            databaseConnection();
            String deleteSql = "delete from " + "officerDetails" + " where officerEmail = " + "'" + officer.getOfficerEmail() + "'"+";";
            System.out.println(deleteSql);
            preparedStmt = con.prepareStatement(deleteSql);

            preparedStmt.executeUpdate();

            System.out.println("Data deleted from officerDetails: " + officer.getOfficerEmail());

            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEveryOfficerDataInDB() {
        //add to database firDetails
        try {
            databaseConnection();
            String truncateSql = "truncate table " + "officerDetails";
            System.out.println(truncateSql);
            preparedStmt = con.prepareStatement(truncateSql);
            preparedStmt.executeUpdate(truncateSql);

            System.out.println("DB data deleted from officerDetails");

            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> populateEveryOfficerDataInCaseRegDropdown() {
        //add to database firDetails
        ArrayList<String> officerDropdown = null;
        try {
            databaseConnection();
            officerDropdown = new ArrayList<>();
            String truncateSql = "select officerName from " + "officerDetails";
            System.out.println(truncateSql);
//            preparedStmt = con.prepareStatement(truncateSql);
//            preparedStmt.executeUpdate(truncateSql);
            stmt = con.createStatement();
            rs = stmt.executeQuery(truncateSql);
            System.out.println("DB data deleted from officerDetails");
            
            while (rs.next()) 
            {
                officerDropdown.add(rs.getString("officerName"));
            }

            closeConnection();
        }
        catch(NullPointerException e1)
        {
            System.out.println("populate Every Officer Data In Case Reg Dropdown");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return officerDropdown;
    }

//   public static void main(String main[])
//   {
//       DatabaseConnection_OfficerDetails dc = dc = new DatabaseConnection_OfficerDetails();
//       dc.databaseConnection();
//       String offName = "sfhsj";
//       String offEmail = "ffhgh@fhhj.com";
//       String offPhone = "7577575757";
//       String offAddress = "eweherurur";
//       Officer off = new Officer(offName,offAddress,offPhone,offEmail);
//       dc.updateOfficerDataToDB(off);
//       dc.closeConnection();
//       System.out.println("updated");
//   }
//   
}
