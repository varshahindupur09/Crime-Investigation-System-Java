/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;

import javax.swing.JPanel;
import model.Sys;
import ui.HomeScreen;

/**
 *
 * @author ASUS
 */
public class FindCriminalJPanel extends javax.swing.JPanel {
    //DatabaseConnection_CaseDetails dbConCaseDetails = new DatabaseConnection_CaseDetails();

    /**
     * Creates new form FindCriminalJPanel
     */
    private JPanel readCase;
    private Sys sys;
    private HomeScreen homeScreen;
    
    NewCaseRegisterDirectory registerDir;
    DatabaseConnection_CaseDetails dbConCaseDetails = new DatabaseConnection_CaseDetails();
    OfficerDirectory officerDir;
    
    DatabaseConnection_person dbConPersonDetails;
    public FindCriminalJPanel(NewCaseRegisterDirectory registerDir, OfficerDirectory officerDir, DatabaseConnection_person dbConPersonDetails) {
        initComponents();
        this.registerDir = registerDir;
        this.officerDir = officerDir;
        
        this.dbConPersonDetails = dbConPersonDetails;
    }

    public FindCriminalJPanel ( JPanel readCase, Sys sys, HomeScreen homeScreen) 
    {    
        initComponents();
        this.readCase = readCase;
        this.sys = sys;
        this.homeScreen = homeScreen;

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HeadingLabel = new javax.swing.JLabel();
        btnCrime = new javax.swing.JButton();
        txtgetFP = new javax.swing.JTextField();
        txtCriminal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        HeadingLabel.setBackground(new java.awt.Color(153, 0, 0));
        HeadingLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        HeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeadingLabel.setText("FIND CRIMINAL");

        btnCrime.setBackground(new java.awt.Color(102, 0, 0));
        btnCrime.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnCrime.setForeground(new java.awt.Color(255, 255, 255));
        btnCrime.setText("Find Criminal");
        btnCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrimeActionPerformed(evt);
            }
        });

        txtgetFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgetFPActionPerformed(evt);
            }
        });

        txtCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriminalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINGERPRINTS MATCHED WITH:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/BlissfulOrdinaryBluebottle-size_restricted.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtgetFP, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(txtCriminal)))))
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(336, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtgetFP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(732, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrimeActionPerformed
        // TODO add your handling code here:

        int fp = Integer.parseInt(txtgetFP.getText());
        //dbConPersonDetails = new DatabaseConnection_person();
        String getCriminalName = dbConPersonDetails.matchFingerPrintDataToDB(fp);
        txtCriminal.setText(getCriminalName);
    }//GEN-LAST:event_btnCrimeActionPerformed

    private void txtgetFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgetFPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgetFPActionPerformed

    private void txtCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriminalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCriminalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JButton btnCrime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCriminal;
    private javax.swing.JTextField txtgetFP;
    // End of variables declaration//GEN-END:variables
}
