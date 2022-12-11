/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ForensicsModel;


import ForensicsModel.*;
import javax.swing.JPanel;
import model.Sys;
import ui.HomeScreen;


/**
 *
 * @author aastha
 *
 */
public class ForensicsAdmin extends javax.swing.JPanel {
    
    Hospital hospital;
    Doctor doctor;
    ForensicLab forLab;
    hospitalDirectory hospHistory;
    DoctorDirectory docHistory;
    ForensicLabHistory forLabHistory;
    
    JPanel createForensicAdmin;
    Sys sys;
    HomeScreen homeScreen;
    
    
    public ForensicsAdmin(JPanel createForensicAdmin, Sys sys, HomeScreen homeScreen)
    {   
        initComponents();
        this.createForensicAdmin = createForensicAdmin;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
    }
        
    public ForensicsAdmin(Doctor doctor, ForensicLab forLab, hospitalDirectory hospHistory, DoctorDirectory docHistory,
                            ForensicLabHistory forLabHistory) {
        initComponents();
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

        ForensicTab = new javax.swing.JTabbedPane();
        HospitalPanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        btnAddHospital = new javax.swing.JButton();
        btnManageHospital = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        DoctorPanel = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel8 = new javax.swing.JPanel();
        btnAddDoctor = new javax.swing.JButton();
        btnManageDoctor = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        ForensicLabPanel = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel10 = new javax.swing.JPanel();
        btnAddForLab = new javax.swing.JButton();
        btnManageForLab = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        btnAddHospital.setBackground(new java.awt.Color(204, 204, 204));
        btnAddHospital.setText("Add");
        btnAddHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalActionPerformed(evt);
            }
        });

        btnManageHospital.setBackground(new java.awt.Color(204, 204, 204));
        btnManageHospital.setText("Manage");
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddHospital)
                    .addComponent(btnManageHospital))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddHospital)
                .addGap(44, 44, 44)
                .addComponent(btnManageHospital)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(858, 600));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel7);

        javax.swing.GroupLayout HospitalPanelLayout = new javax.swing.GroupLayout(HospitalPanel);
        HospitalPanel.setLayout(HospitalPanelLayout);
        HospitalPanelLayout.setHorizontalGroup(
            HospitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        HospitalPanelLayout.setVerticalGroup(
            HospitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        ForensicTab.addTab("Hospital Admin", HospitalPanel);

        jPanel8.setBackground(new java.awt.Color(0, 204, 255));

        btnAddDoctor.setBackground(new java.awt.Color(204, 204, 204));
        btnAddDoctor.setText("Add");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        btnManageDoctor.setBackground(new java.awt.Color(204, 204, 204));
        btnManageDoctor.setText("Manage");
        btnManageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddDoctor)
                    .addComponent(btnManageDoctor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddDoctor)
                .addGap(44, 44, 44)
                .addComponent(btnManageDoctor)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jSplitPane3.setLeftComponent(jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jSplitPane3.setRightComponent(jPanel9);

        javax.swing.GroupLayout DoctorPanelLayout = new javax.swing.GroupLayout(DoctorPanel);
        DoctorPanel.setLayout(DoctorPanelLayout);
        DoctorPanelLayout.setHorizontalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        DoctorPanelLayout.setVerticalGroup(
            DoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        ForensicTab.addTab("Doctor Admin", DoctorPanel);

        jPanel10.setBackground(new java.awt.Color(0, 204, 255));

        btnAddForLab.setBackground(new java.awt.Color(204, 204, 204));
        btnAddForLab.setText("Add");
        btnAddForLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddForLabActionPerformed(evt);
            }
        });

        btnManageForLab.setBackground(new java.awt.Color(204, 204, 204));
        btnManageForLab.setText("Manage");
        btnManageForLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageForLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddForLab)
                    .addComponent(btnManageForLab))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddForLab)
                .addGap(44, 44, 44)
                .addComponent(btnManageForLab)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jSplitPane4.setRightComponent(jPanel11);

        javax.swing.GroupLayout ForensicLabPanelLayout = new javax.swing.GroupLayout(ForensicLabPanel);
        ForensicLabPanel.setLayout(ForensicLabPanelLayout);
        ForensicLabPanelLayout.setHorizontalGroup(
            ForensicLabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
        ForensicLabPanelLayout.setVerticalGroup(
            ForensicLabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForensicLabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane4))
        );

        ForensicTab.addTab("Forensic Lab Admin", ForensicLabPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ForensicTab))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForensicTab)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalActionPerformed
        // TODO add your handling code here:
        CreateHospitalJPanel createHospital = new CreateHospitalJPanel(hospHistory);
        jSplitPane2.setRightComponent(createHospital);
    }//GEN-LAST:event_btnAddHospitalActionPerformed

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        // TODO add your handling code here:
        ReadHospitalJPanel readHospitalJPanel = new ReadHospitalJPanel(hospHistory, hospital);
        jSplitPane2.setRightComponent(readHospitalJPanel);

    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctor createDoctor = new CreateDoctor(docHistory);
        jSplitPane3.setRightComponent(createDoctor);
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnManageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorActionPerformed
        // TODO add your handling code here:
        ReadDoctorJPanel readDoctor = new ReadDoctorJPanel(docHistory, doctor);
        jSplitPane3.setRightComponent(readDoctor);
    }//GEN-LAST:event_btnManageDoctorActionPerformed

    private void btnAddForLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddForLabActionPerformed
        // TODO add your handling code here:
        CreateForensicLab createForensic = new CreateForensicLab(forLabHistory);
        jSplitPane4.setRightComponent(createForensic);
    }//GEN-LAST:event_btnAddForLabActionPerformed

    private void btnManageForLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageForLabActionPerformed
        // TODO add your handling code here:
        ReadForensicLab readForensic = new ReadForensicLab(forLabHistory);
        jSplitPane4.setRightComponent(readForensic);
    }//GEN-LAST:event_btnManageForLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoctorPanel;
    private javax.swing.JPanel ForensicLabPanel;
    private javax.swing.JTabbedPane ForensicTab;
    private javax.swing.JPanel HospitalPanel;
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnAddForLab;
    private javax.swing.JButton btnAddHospital;
    private javax.swing.JButton btnManageDoctor;
    private javax.swing.JButton btnManageForLab;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    // End of variables declaration//GEN-END:variables
}
