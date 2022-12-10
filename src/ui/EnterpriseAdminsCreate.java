/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JPanel;
import model.Sys;



/**
 *
 * @author ASUS
 */
public class EnterpriseAdminsCreate extends javax.swing.JPanel {

    /**
     * Creates new form CrimeBranchOrgAdminsCreate
     */
    JPanel enterpriseAdminsCreate;
    Sys sys;
    HomeScreen homeScreen;
    
    public EnterpriseAdminsCreate(JPanel enterpriseAdminsCreate,Sys sys,HomeScreen homeScreen) {
        initComponents();
        
        this.enterpriseAdminsCreate = enterpriseAdminsCreate;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftAdminPanel = new javax.swing.JPanel();
        EmpOrgAdmins = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RightPagePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 102, 153));

        jSplitPane1.setBackground(new java.awt.Color(0, 102, 153));

        LeftAdminPanel.setBackground(new java.awt.Color(0, 102, 153));

        EmpOrgAdmins.setText("Create New User");
        EmpOrgAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpOrgAdminsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Admins Here:");

        javax.swing.GroupLayout LeftAdminPanelLayout = new javax.swing.GroupLayout(LeftAdminPanel);
        LeftAdminPanel.setLayout(LeftAdminPanelLayout);
        LeftAdminPanelLayout.setHorizontalGroup(
            LeftAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftAdminPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftAdminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmpOrgAdmins)
                .addGap(54, 54, 54))
        );
        LeftAdminPanelLayout.setVerticalGroup(
            LeftAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftAdminPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(EmpOrgAdmins)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftAdminPanel);

        RightPagePanel.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout RightPagePanelLayout = new javax.swing.GroupLayout(RightPagePanel);
        RightPagePanel.setLayout(RightPagePanelLayout);
        RightPagePanelLayout.setHorizontalGroup(
            RightPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        RightPagePanelLayout.setVerticalGroup(
            RightPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(RightPagePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmpOrgAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpOrgAdminsActionPerformed
        // TODO add your handling code here:
        NewAdminUserCreated newAdminUserCreated = new NewAdminUserCreated(enterpriseAdminsCreate, sys, homeScreen);
        jSplitPane1.setRightComponent(newAdminUserCreated);
    }//GEN-LAST:event_EmpOrgAdminsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpOrgAdmins;
    private javax.swing.JPanel LeftAdminPanel;
    private javax.swing.JPanel RightPagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
