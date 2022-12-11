/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;

import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import model.JTextFieldLimit;
import model.Sys;
import ui.HomeScreen;

/**
 *
 * @author ASUS
 */
public class NewFIRRegister extends javax.swing.JPanel {

    /**
     * Creates new form NewFIRRegister
     */
    
    private JPanel newFIRRegisterPanel;
    private Sys sys;
    private HomeScreen homeScreen;
    DatabaseConnection_FirDetails dbConnFIRDetails;
    PreparedStatement stmt;
   

    public NewFIRRegister(JPanel newFIRRegisterPanel,Sys sys,HomeScreen homeScreen) {
        initComponents();
        
        this.newFIRRegisterPanel = newFIRRegisterPanel;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
        
        dbConnFIRDetails = new DatabaseConnection_FirDetails();
        DescriptionTextField.setDocument(new JTextFieldLimit(250));
        FirstNameTextField.setDocument(new JTextFieldLimit(10));
        LastNameTextField.setDocument(new JTextFieldLimit(10));
        AddressTextField.setDocument(new JTextFieldLimit(10));
        PhoneNumberTextField.setDocument(new JTextFieldLimit(10));
        EmailIdTextField.setDocument(new JTextFieldLimit(50));
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
        PhoneNumberLabel = new javax.swing.JLabel();
        DateOfOffenceDateChooser = new com.toedter.calendar.JDateChooser();
        DateOfOffenceLabel = new javax.swing.JLabel();
        DescriptionTextField = new javax.swing.JTextField();
        SelectPoliceStationLabel = new javax.swing.JLabel();
        SelectPoliceStation = new javax.swing.JComboBox<>();
        DateOfOffenceLabel2 = new javax.swing.JLabel();
        SubmitDetailsButton = new java.awt.Button();
        SelectAccusedOrVictim = new javax.swing.JComboBox<>();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        EmailIdLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        EmailIdTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        DescriptionLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Register your FIR :");

        PhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberLabel.setText("Phone Number:");

        DateOfOffenceDateChooser.setDateFormatString("YYYY-MM-dd");

        DateOfOffenceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DateOfOffenceLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateOfOffenceLabel.setText("DateOfOffence:");

        DescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTextFieldActionPerformed(evt);
            }
        });
        DescriptionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DescriptionTextFieldKeyPressed(evt);
            }
        });

        SelectPoliceStationLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SelectPoliceStationLabel.setForeground(new java.awt.Color(255, 255, 255));
        SelectPoliceStationLabel.setText("Select Police Station:");

        SelectPoliceStation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambridge", "Jamican Plain", "Roxbury", "Downtown" }));
        SelectPoliceStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPoliceStationActionPerformed(evt);
            }
        });

        DateOfOffenceLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DateOfOffenceLabel2.setForeground(new java.awt.Color(255, 255, 255));
        DateOfOffenceLabel2.setText("Accused OR Victim:");

        SubmitDetailsButton.setLabel("Submit Details");
        SubmitDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitDetailsButtonActionPerformed(evt);
            }
        });

        SelectAccusedOrVictim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accused", "Victim" }));
        SelectAccusedOrVictim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAccusedOrVictimActionPerformed(evt);
            }
        });

        FirstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setText("FirstName:");

        LastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setText("LastName:");

        EmailIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailIdLabel.setText("EmailId:");

        DescriptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionLabel.setText("Description (in 250 words):");

        AddressLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Address: ");

        DescriptionLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DescriptionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionLabel1.setText("Description (in 250 words):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelectPoliceStationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectPoliceStation, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PhoneNumberLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(DateOfOffenceLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SelectAccusedOrVictim, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DateOfOffenceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DateOfOffenceDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FirstNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FirstNameTextField)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LastNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(DescriptionLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DescriptionTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(EmailIdLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(SubmitDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FirstNameLabel)
                        .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastNameLabel)
                        .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateOfOffenceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DescriptionLabel1))
                    .addComponent(DateOfOffenceDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddressLabel)
                        .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailIdLabel)
                        .addComponent(EmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectPoliceStationLabel)
                    .addComponent(SelectPoliceStation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberLabel)
                    .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOfOffenceLabel2)
                    .addComponent(SelectAccusedOrVictim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(SubmitDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextFieldActionPerformed

    private void DescriptionTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescriptionTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextFieldKeyPressed

    private void SubmitDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitDetailsButtonActionPerformed
        
        // TODO add your handling code here:
        java.util.Date utilDate=(java.util.Date) DateOfOffenceDateChooser.getDate();
        java.sql.Date  sqlDate=new java.sql.Date(utilDate.getDate());
        String descr = DescriptionTextField.getText();
        String firstName = FirstNameTextField.getText();
        String lastName = LastNameTextField.getText();
        String emailId = EmailIdTextField.getText();
        int phoneNumber = 0;
        try{
        phoneNumber = Integer.parseInt(PhoneNumberTextField.getText());
        }
        catch(NumberFormatException ex){ }
        String address = AddressTextField.getText();
        String valuePoliceStn = SelectPoliceStation.getSelectedItem().toString();
        String valueAccVic = SelectAccusedOrVictim.getSelectedItem().toString();
        
        FIRDirectory fIRDirectory = new FIRDirectory();
        fIRDirectory.firList.add(new FIR(sqlDate,descr,valuePoliceStn,valueAccVic,firstName,lastName,emailId,phoneNumber, address));
        
        //add to database firDetails
        try
        {
            dbConnFIRDetails.databaseConnection();
            String insertsql="Insert into firDetails (dateOfOffence,descr,policeStationLoc,accorvic,firstName,lastName,emailId,phoneNum,address) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt=dbConnFIRDetails.con.prepareStatement(insertsql);
            
            stmt.setDate(1, new java.sql.Date(sqlDate.getDate()));
            stmt.setString(2, DescriptionTextField.getText());
            stmt.setString(3, valuePoliceStn);
            stmt.setString(4, valueAccVic);
            stmt.setString(5, firstName);
            stmt.setString(6, lastName);
            stmt.setString(7, emailId);
            stmt.setInt(8, phoneNumber);
            stmt.setString(9, address);
            
            stmt.executeUpdate();
            stmt.close();
            
            dbConnFIRDetails.closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_SubmitDetailsButtonActionPerformed

    private void SelectPoliceStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectPoliceStationActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SelectPoliceStationActionPerformed

    private void SelectAccusedOrVictimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAccusedOrVictimActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SelectAccusedOrVictimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private com.toedter.calendar.JDateChooser DateOfOffenceDateChooser;
    private javax.swing.JLabel DateOfOffenceLabel;
    private javax.swing.JLabel DateOfOffenceLabel2;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel DescriptionLabel1;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JLabel EmailIdLabel;
    private javax.swing.JTextField EmailIdTextField;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JComboBox<String> SelectAccusedOrVictim;
    private javax.swing.JComboBox<String> SelectPoliceStation;
    private javax.swing.JLabel SelectPoliceStationLabel;
    private java.awt.Button SubmitDetailsButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
