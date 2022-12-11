/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.JTextFieldLimit;
import model.Sys;
import ui.HomeScreen;
import utility.Validation;

/**
 *
 * @author ASUS
 */
public class NewOfficerRegister extends javax.swing.JPanel {

    /**
     * Creates new form NewOfficerRegister
     */
    private JPanel newOfficerRegisterPanel;
    private Sys sys;
    private HomeScreen homeScreen;
    DatabaseConnection_OfficerDetails dbConnOfficerDetails;
    PreparedStatement stmt;
    
    OfficerDirectory officerDir;
    Validation validation;

    public NewOfficerRegister(OfficerDirectory officerDir)
    {
        this.officerDir = officerDir;
    }
   
    public NewOfficerRegister(JPanel newOfficerRegisterPanel, Sys sys, HomeScreen homeScreen) 
    {
        initComponents();
        this.newOfficerRegisterPanel = newOfficerRegisterPanel;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
        
//        officerDirectory = new OfficerDirectory(officerList);
        
        dbConnOfficerDetails = new DatabaseConnection_OfficerDetails();
        FirstNameTextField.setDocument(new JTextFieldLimit(10));
        LastNameTextField.setDocument(new JTextFieldLimit(10));
        AddressTextField.setDocument(new JTextFieldLimit(10));
        PhoneNumberTextField.setDocument(new JTextFieldLimit(10));
        EmailIdTextField.setDocument(new JTextFieldLimit(50));
        
        validation = new Validation();
        
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
        SubmitDetailsButton = new java.awt.Button();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        EmailIdLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        EmailIdTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 153));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Create Officer");

        PhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberLabel.setText("Phone Number:");

        SubmitDetailsButton.setLabel("Submit Details");
        SubmitDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitDetailsButtonActionPerformed(evt);
            }
        });

        FirstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setText("First Name:");

        LastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setText("LastName:");

        EmailIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailIdLabel.setText("EmailId:");

        AddressLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Address: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FirstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmailIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(LastNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(PhoneNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(SubmitDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(254, Short.MAX_VALUE))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastNameLabel)
                        .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailIdLabel)
                    .addComponent(EmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberLabel)
                    .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel)
                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(SubmitDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(501, 501, 501))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitDetailsButtonActionPerformed

        // TODO add your handling code here:
        boolean flagValidate = true;
        String firstName = FirstNameTextField.getText();
        String lastName = LastNameTextField.getText();
        String officerName = firstName + lastName;
        String officerEmail = EmailIdTextField.getText();
        String officerAddress = AddressTextField.getText();
        
        if(validation.StringTextFieldValidationIsNotNull(firstName))
        {
            JOptionPane.showMessageDialog(this, "Enter valid first name");
            flagValidate = false;
        }
        
        if(validation.StringTextFieldValidationIsNotNull(lastName))
        {
            JOptionPane.showMessageDialog(this, "Enter valid last name");
            flagValidate = false;
        }
        
        if(!validation.emailTextFieldValidation(officerEmail))
        {
                JOptionPane.showMessageDialog(this, "valid Officer Email Example a@b.com ");
                flagValidate = false;
        }
        
        if(officerAddress.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Officer Address");
            flagValidate = false;
        }
        
        int officerPhoneNumber = 0;
        try{
            officerPhoneNumber = Integer.parseInt(PhoneNumberTextField.getText());
            if(!validation.PhoneNumberTextFieldValidationIsNotNull(String.valueOf(officerPhoneNumber)))
            {
                JOptionPane.showMessageDialog(this, "Enter valid Phone Number");
                flagValidate = false;
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Enter valid Phone Number");
            flagValidate = false;
        }
        
        if(flagValidate)
        {
            //add data to officerlist
            OfficerDirectory.officerList.add(new Officer(officerName, officerAddress, officerPhoneNumber, officerEmail));

            // add data from directory to database
            for (Officer officer : OfficerDirectory.officerList)
            {
                dbConnOfficerDetails.addOfficerDataToDatabase(officer.getOfficerName(), officer.getOfficerAddress(), officer.getOfficerPhoneNumber(), officer.getOfficerEmail());
            }
        }
       
    }//GEN-LAST:event_SubmitDetailsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JLabel EmailIdLabel;
    private javax.swing.JTextField EmailIdTextField;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTextField;
    private java.awt.Button SubmitDetailsButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
