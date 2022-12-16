/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Sys;
import ui.HomeScreen;
import ui.LoginScreen;

/**
 *
 * @author hindupurv
 */
public class CrimeBranchMainJPanel extends javax.swing.JPanel {
    
    OfficerDirectory officerDir;
    FIRDirectory firdir;
    NewCaseRegisterDirectory newCaseRegisterDir;
    
    /**
     * Creates new form NewsMainJPanel
     */
    
    JPanel crimeBranchMainJPanel;
    Sys sys;
    HomeScreen homeScreen;
    
    public CrimeBranchMainJPanel(JPanel crimeBranchMainJPanel,Sys sys,HomeScreen homeScreen) 
    {
        initComponents();
        
        this.crimeBranchMainJPanel = crimeBranchMainJPanel;
        this.sys = sys;
        this.homeScreen = homeScreen;
//        setSize(1040, 544);

        this.officerDir =  new OfficerDirectory();
        this.firdir = new FIRDirectory();
        this.newCaseRegisterDir = new NewCaseRegisterDirectory();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJSplitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        officerBtn = new javax.swing.JButton();
        firBtn = new javax.swing.JButton();
        caseRegBtn = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        controlPanel.setBackground(new java.awt.Color(153, 0, 0));

        officerBtn.setBackground(new java.awt.Color(102, 0, 0));
        officerBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        officerBtn.setForeground(new java.awt.Color(255, 255, 255));
        officerBtn.setText("OFFICER");
        officerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officerBtnActionPerformed(evt);
            }
        });

        firBtn.setBackground(new java.awt.Color(102, 0, 0));
        firBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        firBtn.setForeground(new java.awt.Color(255, 255, 255));
        firBtn.setText("FIR");
        firBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firBtnActionPerformed(evt);
            }
        });

        caseRegBtn.setBackground(new java.awt.Color(102, 0, 0));
        caseRegBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        caseRegBtn.setForeground(new java.awt.Color(255, 255, 255));
        caseRegBtn.setText("CASE REG");
        caseRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseRegBtnActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(102, 0, 0));
        btnLogOut.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(officerBtn)
                    .addComponent(firBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caseRegBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(officerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caseRegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnLogOut)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        mainJSplitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/crime.png"))); // NOI18N

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainJSplitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void officerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officerBtnActionPerformed
        // TODO add your handling code here:
        OfficerViewJPanel officerPanel = new OfficerViewJPanel(officerDir);
        mainJSplitPane.setRightComponent(officerPanel);
    }//GEN-LAST:event_officerBtnActionPerformed

    private void firBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firBtnActionPerformed
        // TODO add your handling code here:
        FIRViewJPanel newspaperPanel = new FIRViewJPanel(firdir);
        mainJSplitPane.setRightComponent(newspaperPanel);
    }//GEN-LAST:event_firBtnActionPerformed

    private void caseRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseRegBtnActionPerformed
        // TODO add your handling code here:
        CaseRegViewJPanel casePanel = new CaseRegViewJPanel(newCaseRegisterDir,officerDir);
        mainJSplitPane.setRightComponent(casePanel);
    }//GEN-LAST:event_caseRegBtnActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        JPanel selectedPanel = new LoginScreen(crimeBranchMainJPanel,sys, homeScreen);

        crimeBranchMainJPanel.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) crimeBranchMainJPanel.getLayout();
        layout.next(crimeBranchMainJPanel);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton caseRegBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton firBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane mainJSplitPane;
    private javax.swing.JButton officerBtn;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
