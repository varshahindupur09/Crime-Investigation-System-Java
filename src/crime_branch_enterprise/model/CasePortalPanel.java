/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import model.Sys;
import ui.HomePanel;
import ui.HomeScreen;

/**
 *
 * @author ASUS
 */
public class CasePortalPanel extends javax.swing.JPanel {

    /**
     * Creates new form CasePortalPanel
     */
    private JPanel casePortalPanel;
    private Sys sys;
    private HomeScreen homeScreen;
    private HomePanel homePanel;
    CardLayout cardLayout;
    
    public CasePortalPanel(JPanel casePortalPanel,Sys sys,HomeScreen homeScreen, HomePanel homePanel) {
        
        initComponents();
        this.casePortalPanel = casePortalPanel;
        this.sys = sys;
        this.homeScreen = homeScreen;
        this.homePanel = homePanel;
        setSize(1040, 544);
        clearFields();
        
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
        jPanel1 = new javax.swing.JPanel();
        NewCaseRegisterationLabel = new javax.swing.JLabel();
        SearchYourCaseLabel = new javax.swing.JLabel();
        TitleCasePortalLabel = new javax.swing.JLabel();
        FIRRegisterationLabel = new javax.swing.JLabel();
        CreateNewOfficerLabel = new javax.swing.JLabel();
        CreateNewOfficerLabel1 = new javax.swing.JLabel();
        FIRRegisterationLabel1 = new javax.swing.JLabel();
        SwitchPanel = new javax.swing.JPanel();
        NewCaseRegisterationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SearchYourCasePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 102, 153));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1600, 750));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        NewCaseRegisterationLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NewCaseRegisterationLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewCaseRegisterationLabel.setText("New Case Registeration");
        NewCaseRegisterationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewCaseRegisterationLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewCaseRegisterationLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewCaseRegisterationLabelMouseExited(evt);
            }
        });

        SearchYourCaseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchYourCaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        SearchYourCaseLabel.setText("Search Your Case ");
        SearchYourCaseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchYourCaseLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchYourCaseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchYourCaseLabelMouseExited(evt);
            }
        });

        TitleCasePortalLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitleCasePortalLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleCasePortalLabel.setText("Case Portal:");

        FIRRegisterationLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FIRRegisterationLabel.setForeground(new java.awt.Color(255, 255, 255));
        FIRRegisterationLabel.setText("New FIR Register");
        FIRRegisterationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FIRRegisterationLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FIRRegisterationLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FIRRegisterationLabelMouseExited(evt);
            }
        });

        CreateNewOfficerLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CreateNewOfficerLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateNewOfficerLabel.setText("Create New Officer");
        CreateNewOfficerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateNewOfficerLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateNewOfficerLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateNewOfficerLabelMouseExited(evt);
            }
        });

        CreateNewOfficerLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CreateNewOfficerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        CreateNewOfficerLabel1.setText("Read Officer Data");
        CreateNewOfficerLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateNewOfficerLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateNewOfficerLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateNewOfficerLabel1MouseExited(evt);
            }
        });

        FIRRegisterationLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FIRRegisterationLabel1.setForeground(new java.awt.Color(255, 255, 255));
        FIRRegisterationLabel1.setText("Read FIR Register");
        FIRRegisterationLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FIRRegisterationLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FIRRegisterationLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FIRRegisterationLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleCasePortalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NewCaseRegisterationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FIRRegisterationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearchYourCaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateNewOfficerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateNewOfficerLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FIRRegisterationLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TitleCasePortalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateNewOfficerLabel)
                .addGap(18, 18, 18)
                .addComponent(CreateNewOfficerLabel1)
                .addGap(18, 18, 18)
                .addComponent(FIRRegisterationLabel)
                .addGap(29, 29, 29)
                .addComponent(FIRRegisterationLabel1)
                .addGap(26, 26, 26)
                .addComponent(NewCaseRegisterationLabel)
                .addGap(27, 27, 27)
                .addComponent(SearchYourCaseLabel)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        SwitchPanel.setBackground(new java.awt.Color(255, 204, 204));
        SwitchPanel.setForeground(new java.awt.Color(255, 255, 255));
        SwitchPanel.setLayout(new java.awt.CardLayout());

        NewCaseRegisterationPanel.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/officer-logo.jpg"))); // NOI18N

        javax.swing.GroupLayout NewCaseRegisterationPanelLayout = new javax.swing.GroupLayout(NewCaseRegisterationPanel);
        NewCaseRegisterationPanel.setLayout(NewCaseRegisterationPanelLayout);
        NewCaseRegisterationPanelLayout.setHorizontalGroup(
            NewCaseRegisterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewCaseRegisterationPanelLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(898, Short.MAX_VALUE))
        );
        NewCaseRegisterationPanelLayout.setVerticalGroup(
            NewCaseRegisterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewCaseRegisterationPanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        SwitchPanel.add(NewCaseRegisterationPanel, "card2");

        SearchYourCasePanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout SearchYourCasePanelLayout = new javax.swing.GroupLayout(SearchYourCasePanel);
        SearchYourCasePanel.setLayout(SearchYourCasePanelLayout);
        SearchYourCasePanelLayout.setHorizontalGroup(
            SearchYourCasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        SearchYourCasePanelLayout.setVerticalGroup(
            SearchYourCasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        SwitchPanel.add(SearchYourCasePanel, "card3");

        jSplitPane1.setRightComponent(SwitchPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewCaseRegisterationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCaseRegisterationLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("NewCaseRegisterationPanelMouseClicked");
        homePanel.clickNewCaseRegisterationPortal(homeScreen);
    }//GEN-LAST:event_NewCaseRegisterationLabelMouseClicked

    private void SearchYourCaseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchYourCaseLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("SearchYourCaseLabelMouseClicked");
        homePanel.clickNewCaseRegisterationPortal(homeScreen);
    }//GEN-LAST:event_SearchYourCaseLabelMouseClicked

    private void FIRRegisterationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIRRegisterationLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("FIRRegisterationLabelMouseClicked");
        homePanel.clickNewFIRRegisterationPortal(homeScreen);
    }//GEN-LAST:event_FIRRegisterationLabelMouseClicked

    private void CreateNewOfficerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateNewOfficerLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("CreateNewOfficerLabelMouseClicked");
        homePanel.clickNewOfficerRegisterationPortal(homeScreen);
    }//GEN-LAST:event_CreateNewOfficerLabelMouseClicked

    private void CreateNewOfficerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateNewOfficerLabelMouseEntered
        // TODO add your handling code here:
        CreateNewOfficerLabel.setForeground(Color.black);
    }//GEN-LAST:event_CreateNewOfficerLabelMouseEntered

    private void FIRRegisterationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIRRegisterationLabelMouseEntered
        // TODO add your handling code here:
        FIRRegisterationLabel.setForeground(Color.black);
    }//GEN-LAST:event_FIRRegisterationLabelMouseEntered

    private void NewCaseRegisterationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCaseRegisterationLabelMouseEntered
        // TODO add your handling code here:
        NewCaseRegisterationLabel.setForeground(Color.black);
    }//GEN-LAST:event_NewCaseRegisterationLabelMouseEntered

    private void SearchYourCaseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchYourCaseLabelMouseEntered
        // TODO add your handling code here:
        SearchYourCaseLabel.setForeground(Color.black);
    }//GEN-LAST:event_SearchYourCaseLabelMouseEntered

    private void SearchYourCaseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchYourCaseLabelMouseExited
        // TODO add your handling code here:
        SearchYourCaseLabel.setForeground(Color.white);
    }//GEN-LAST:event_SearchYourCaseLabelMouseExited

    private void NewCaseRegisterationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCaseRegisterationLabelMouseExited
        // TODO add your handling code here:
        NewCaseRegisterationLabel.setForeground(Color.white);
    }//GEN-LAST:event_NewCaseRegisterationLabelMouseExited

    private void FIRRegisterationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIRRegisterationLabelMouseExited
        // TODO add your handling code here:
        FIRRegisterationLabel.setForeground(Color.white);
    }//GEN-LAST:event_FIRRegisterationLabelMouseExited

    private void CreateNewOfficerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateNewOfficerLabelMouseExited
        // TODO add your handling code here:
        CreateNewOfficerLabel.setForeground(Color.white);
    }//GEN-LAST:event_CreateNewOfficerLabelMouseExited

    private void CreateNewOfficerLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateNewOfficerLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewOfficerLabel1MouseClicked

    private void CreateNewOfficerLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateNewOfficerLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewOfficerLabel1MouseEntered

    private void CreateNewOfficerLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateNewOfficerLabel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewOfficerLabel1MouseExited

    private void FIRRegisterationLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIRRegisterationLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FIRRegisterationLabel1MouseClicked

    private void FIRRegisterationLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIRRegisterationLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FIRRegisterationLabel1MouseEntered

    private void FIRRegisterationLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIRRegisterationLabel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_FIRRegisterationLabel1MouseExited

    public void clearFields(){
        
        //add fields so they can be cleared
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateNewOfficerLabel;
    private javax.swing.JLabel CreateNewOfficerLabel1;
    private javax.swing.JLabel FIRRegisterationLabel;
    private javax.swing.JLabel FIRRegisterationLabel1;
    private javax.swing.JLabel NewCaseRegisterationLabel;
    private javax.swing.JPanel NewCaseRegisterationPanel;
    private javax.swing.JLabel SearchYourCaseLabel;
    private javax.swing.JPanel SearchYourCasePanel;
    private javax.swing.JPanel SwitchPanel;
    private javax.swing.JLabel TitleCasePortalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
