/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.JTextFieldLimit;
import model.Sys;
import ui.HomeScreen;
//import utility

/**
 *
 * @author hindupurv
 */
public class NewCaseRegisterationPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewCaseRegisterationPanel
     */
    private JPanel newCaseRegisterPanel;
    private Sys sys;
    private HomeScreen homeScreen;
    DatabaseConnection_CaseDetails dbConnCaseDetails;
    PreparedStatement stmt;
    FIRDirectory fIRDirectory;
    List<Integer> firIds = new ArrayList<>();
    NewOfficerRegister newOfficerRegister = new NewOfficerRegister();
    OfficerDirectory officerDirectory = new OfficerDirectory();
    
    public NewCaseRegisterationPanel(JPanel newCaseRegisterPanel,Sys sys,HomeScreen homeScreen) {
        initComponents();
        
        
        this.newCaseRegisterPanel = newCaseRegisterPanel;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
        PhoneNumberTextField.setDocument(new JTextFieldLimit(250));
        clearFields();
        dbConnCaseDetails = new DatabaseConnection_CaseDetails();
        fIRDirectory = new FIRDirectory();
        
        //add officerName
        for(OfficerRecord officerRecord : OfficerDirectory.officerList)
        {
            SelectOfficerDropdown.addItem(officerRecord.getOfficerName());
        }
    }
    
    public void clearFields(){
        
        //add fields so they can be cleared
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        DateOfReportDateChooser = new com.toedter.calendar.JDateChooser();
        DateOfReportLabel = new javax.swing.JLabel();
        PhoneNumberTextField = new javax.swing.JTextField();
        SelectFIRNumberLabel = new javax.swing.JLabel();
        SelectOfficerDropdown = new javax.swing.JComboBox<>();
        SubmitDetailsButton = new java.awt.Button();
        EmailIdLabel = new javax.swing.JLabel();
        EmailIdTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 153));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Register your case below by adding all the details.........");

        DescriptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionLabel.setText("Phone Number:");

        DateOfReportDateChooser.setDateFormatString("YYYY-MM-dd");

        DateOfReportLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DateOfReportLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateOfReportLabel.setText("Date Of Report:");

        PhoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextFieldActionPerformed(evt);
            }
        });
        PhoneNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNumberTextFieldKeyPressed(evt);
            }
        });

        SelectFIRNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SelectFIRNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        SelectFIRNumberLabel.setText("Select Officer:");

        SubmitDetailsButton.setLabel("Submit Details");
        SubmitDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitDetailsButtonActionPerformed(evt);
            }
        });

        EmailIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailIdLabel.setText("Email Id:");

        EmailIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailIdTextFieldActionPerformed(evt);
            }
        });
        EmailIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailIdTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(EmailIdLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EmailIdTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DateOfReportLabel)
                                        .addComponent(DescriptionLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DateOfReportDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelectFIRNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectOfficerDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(SubmitDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateOfReportLabel)
                    .addComponent(DateOfReportDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionLabel)
                    .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailIdLabel)
                    .addComponent(EmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectFIRNumberLabel)
                    .addComponent(SelectOfficerDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(SubmitDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumberTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextFieldKeyPressed

    private void PhoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextFieldActionPerformed

    private void SubmitDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitDetailsButtonActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String emailId = EmailIdLabel.getText();
            int phoneNum = Integer.parseInt(PhoneNumberTextField.getText());
            
            String officerName = SelectOfficerDropdown.getSelectedItem().toString();
            
            dbConnCaseDetails.databaseConnectionCaseDetails();
//            java.util.Date date = new java.util.Date();
            String sqlQueryStoreData = "insert into casedetails(emailId, phoneNum, dateOfReport, officerName) values(?,?,?,?)";
            stmt = dbConnCaseDetails.con.prepareStatement(sqlQueryStoreData);
            
//          SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy"); 
            java.util.Date utilDate=(java.util.Date) DateOfReportDateChooser.getDate();
            java.sql.Date  sqlDate=new java.sql.Date(utilDate.getDate());

            stmt.setString(1, emailId);
            stmt.setString(2, String.valueOf(phoneNum));
            stmt.setDate(3, new java.sql.Date(sqlDate.getDate()));
            stmt.setString(4, officerName);
            
            stmt.executeUpdate();
            stmt.close();
            dbConnCaseDetails.closeConnectionCaseDetails();
            
            JOptionPane.showMessageDialog(this, "Case Registered under Officer "+officerName);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SubmitDetailsButtonActionPerformed

    private void EmailIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailIdTextFieldActionPerformed

    private void EmailIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailIdTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailIdTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateOfReportDateChooser;
    private javax.swing.JLabel DateOfReportLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel EmailIdLabel;
    private javax.swing.JTextField EmailIdTextField;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JLabel SelectFIRNumberLabel;
    private javax.swing.JComboBox<String> SelectOfficerDropdown;
    private java.awt.Button SubmitDetailsButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
