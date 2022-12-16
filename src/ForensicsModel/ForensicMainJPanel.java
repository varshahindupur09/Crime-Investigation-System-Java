/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ForensicsModel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Sys;
import ui.HomeScreen;
import ui.LoginScreen;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class ForensicMainJPanel extends javax.swing.JPanel {
    Hospital hospital;
    Doctor doctor;
    ForensicLab forLab;
    hospitalDirectory hospHistory;
    DoctorDirectory docHistory;
    ForensicLabHistory forLabHistory;
    /**
     * Creates new form NewsMainJPanel
     */
    
    JPanel createForensicAdmin;
    Sys sys;
    HomeScreen homeScreen;
    
    public ForensicMainJPanel(JPanel createForensicAdmin,Sys sys,HomeScreen homeScreen) 
    {
        initComponents();
        
        this.createForensicAdmin = createForensicAdmin;
        this.sys = sys;
        this.homeScreen = homeScreen;
        //setSize(1040, 544);
    }
    
    public ForensicMainJPanel() {
//        initComponents();
        this.hospital = new Hospital();
        this.doctor = new Doctor();
        this.forLab = new ForensicLab();
        this.hospHistory = new hospitalDirectory();
        this.docHistory = new DoctorDirectory(); 
        this.forLabHistory = new ForensicLabHistory();
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
        hospBtn = new javax.swing.JButton();
        docBtn = new javax.swing.JButton();
        forBtn = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        controlPanel.setBackground(new java.awt.Color(153, 0, 0));

        hospBtn.setBackground(new java.awt.Color(102, 0, 0));
        hospBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        hospBtn.setForeground(new java.awt.Color(255, 255, 255));
        hospBtn.setText("HOSPITAL");
        hospBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospBtnActionPerformed(evt);
            }
        });

        docBtn.setBackground(new java.awt.Color(102, 0, 0));
        docBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        docBtn.setForeground(new java.awt.Color(255, 255, 255));
        docBtn.setText("DOCTOR");
        docBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docBtnActionPerformed(evt);
            }
        });

        forBtn.setBackground(new java.awt.Color(102, 0, 0));
        forBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        forBtn.setForeground(new java.awt.Color(255, 255, 255));
        forBtn.setText("FORENSIC LAB");
        forBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBtnActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnLogOut))
                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hospBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(docBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(hospBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(docBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        mainJSplitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(153, 0, 0));
        workArea.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/forensic.jpg"))); // NOI18N

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void docBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docBtnActionPerformed
        // TODO add your handling code here:
        DoctorViewJPanel docPanel = new DoctorViewJPanel(docHistory);
        mainJSplitPane.setRightComponent(docPanel);
    }//GEN-LAST:event_docBtnActionPerformed

    private void forBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBtnActionPerformed
        // TODO add your handling code here:
        ForLabViewJPanel forLabPanel = new ForLabViewJPanel(forLabHistory);
        mainJSplitPane.setRightComponent(forLabPanel);
    }//GEN-LAST:event_forBtnActionPerformed

    private void hospBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospBtnActionPerformed
        // TODO add your handling code here:
        HospitalViewJPanel hospitalPanel = new HospitalViewJPanel(hospHistory);
        mainJSplitPane.setRightComponent(hospitalPanel);
    }//GEN-LAST:event_hospBtnActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        JPanel selectedPanel = new LoginScreen(createForensicAdmin,sys, homeScreen);

        createForensicAdmin.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) createForensicAdmin.getLayout();
        layout.next(createForensicAdmin);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton docBtn;
    private javax.swing.JButton forBtn;
    private javax.swing.JButton hospBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane mainJSplitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
