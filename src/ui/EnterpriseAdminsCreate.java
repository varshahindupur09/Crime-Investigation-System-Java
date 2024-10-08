/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = Color.RED;
        Color color2 = Color.BLACK;
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
    
    public EnterpriseAdminsCreate(JPanel enterpriseAdminsCreate,Sys sys,HomeScreen homeScreen) {
        initComponents();
        
        this.enterpriseAdminsCreate = enterpriseAdminsCreate;
        this.sys = sys;
        this.homeScreen = homeScreen;
//        setSize(1040, 544);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));

        jSplitPane1.setBackground(new java.awt.Color(0, 102, 153));

        LeftAdminPanel.setBackground(new java.awt.Color(153, 0, 0));

        EmpOrgAdmins.setBackground(new java.awt.Color(102, 0, 0));
        EmpOrgAdmins.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EmpOrgAdmins.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGroup(LeftAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftAdminPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(EmpOrgAdmins))
                    .addGroup(LeftAdminPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftAdminPanelLayout.setVerticalGroup(
            LeftAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftAdminPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(EmpOrgAdmins)
                .addContainerGap(518, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftAdminPanel);

        RightPagePanel.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/admingif.gif"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMINS");

        javax.swing.GroupLayout RightPagePanelLayout = new javax.swing.GroupLayout(RightPagePanel);
        RightPagePanel.setLayout(RightPagePanelLayout);
        RightPagePanelLayout.setHorizontalGroup(
            RightPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPagePanelLayout.createSequentialGroup()
                .addGroup(RightPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPagePanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(RightPagePanelLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        RightPagePanelLayout.setVerticalGroup(
            RightPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPagePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(84, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
