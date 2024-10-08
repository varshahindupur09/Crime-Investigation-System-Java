package ui;

import crime_branch_enterprise.model.OfficerDirectory;
import java.awt.Color;
import javax.swing.JPanel;
import model.Sys;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class HomeScreen extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private Sys sys;
    HomePanel homePanel;
    
//    OfficerDirectory officerDir;
    
    public HomeScreen(JPanel userProcessContainer,Sys sys,HomePanel homePanel)
    {
        //, OfficerDirectory officerDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sys = sys;
        this.homePanel = homePanel;
//        setSize(1040, 544);
//        this.officerDir = officerDir;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SystemPanel = new javax.swing.JPanel();
        CrimeBranchEnterprise = new javax.swing.JLabel();
        ForensicsEnterprise = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SignUpAdmins = new javax.swing.JLabel();
        ResourceMgmtSystemEnterprise = new javax.swing.JLabel();
        MediaEnterprise = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        SystemPanel.setBackground(new java.awt.Color(153, 0, 0));
        SystemPanel.setForeground(new java.awt.Color(17, 125, 161));
        SystemPanel.setToolTipText("");
        SystemPanel.setPreferredSize(new java.awt.Dimension(1600, 750));

        CrimeBranchEnterprise.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        CrimeBranchEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        CrimeBranchEnterprise.setText("Crime Branch Enterprise");
        CrimeBranchEnterprise.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CrimeBranchEnterpriseAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CrimeBranchEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrimeBranchEnterpriseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrimeBranchEnterpriseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CrimeBranchEnterpriseMousePressed(evt);
            }
        });
        CrimeBranchEnterprise.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CrimeBranchEnterpriseKeyPressed(evt);
            }
        });

        ForensicsEnterprise.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ForensicsEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        ForensicsEnterprise.setText("Forensics Enterprise");
        ForensicsEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForensicsEnterpriseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForensicsEnterpriseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ForensicsEnterpriseMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/hacker.png"))); // NOI18N

        SignUpAdmins.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SignUpAdmins.setForeground(new java.awt.Color(255, 255, 255));
        SignUpAdmins.setText("Sign Up Admins");
        SignUpAdmins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpAdminsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpAdminsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpAdminsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUpAdminsMousePressed(evt);
            }
        });

        ResourceMgmtSystemEnterprise.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ResourceMgmtSystemEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        ResourceMgmtSystemEnterprise.setText("Resource Management Enterprise");
        ResourceMgmtSystemEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResourceMgmtSystemEnterpriseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResourceMgmtSystemEnterpriseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResourceMgmtSystemEnterpriseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResourceMgmtSystemEnterpriseMousePressed(evt);
            }
        });

        MediaEnterprise.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        MediaEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        MediaEnterprise.setText("Media Enterprise");
        MediaEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MediaEnterpriseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MediaEnterpriseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MediaEnterpriseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MediaEnterpriseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SystemPanelLayout = new javax.swing.GroupLayout(SystemPanel);
        SystemPanel.setLayout(SystemPanelLayout);
        SystemPanelLayout.setHorizontalGroup(
            SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemPanelLayout.createSequentialGroup()
                .addGroup(SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SystemPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ForensicsEnterprise)
                            .addComponent(CrimeBranchEnterprise)))
                    .addGroup(SystemPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ResourceMgmtSystemEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SystemPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SignUpAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MediaEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );
        SystemPanelLayout.setVerticalGroup(
            SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(CrimeBranchEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ForensicsEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResourceMgmtSystemEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MediaEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SignUpAdmins)
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(SystemPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SystemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SystemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrimeBranchEnterpriseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseMouseEntered
        // TODO add your handling code here:
        CrimeBranchEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_CrimeBranchEnterpriseMouseEntered

    private void CrimeBranchEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseMouseExited
        // TODO add your handling code here:
        CrimeBranchEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_CrimeBranchEnterpriseMouseExited

    private void ForensicsEnterpriseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForensicsEnterpriseMouseEntered
        // TODO add your handling code here:
        ForensicsEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_ForensicsEnterpriseMouseEntered

    private void ForensicsEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForensicsEnterpriseMouseExited
        // TODO add your handling code here:
        ForensicsEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_ForensicsEnterpriseMouseExited

    private void ResourceMgmtSystemEnterpriseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResourceMgmtSystemEnterpriseMouseEntered
        // TODO add your handling code here:
        ResourceMgmtSystemEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_ResourceMgmtSystemEnterpriseMouseEntered

    private void ResourceMgmtSystemEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResourceMgmtSystemEnterpriseMouseExited
        // TODO add your handling code here:
        ResourceMgmtSystemEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_ResourceMgmtSystemEnterpriseMouseExited

    private void CrimeBranchEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseMousePressed
        // TODO add your handling code here:
        homePanel.clickCrimeBranchPortal(this);//, officerDir);
    }//GEN-LAST:event_CrimeBranchEnterpriseMousePressed

    private void ResourceMgmtSystemEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResourceMgmtSystemEnterpriseMousePressed
        // TODO add your handling code here:
        //homePanel.clickAddEncounter(this);
    }//GEN-LAST:event_ResourceMgmtSystemEnterpriseMousePressed

    private void ForensicsEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForensicsEnterpriseMousePressed
        // TODO add your handling code here:
        homePanel.clickCreateForensicsPortal(this);
    }//GEN-LAST:event_ForensicsEnterpriseMousePressed

    private void CrimeBranchEnterpriseAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeBranchEnterpriseAncestorAdded

    private void CrimeBranchEnterpriseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeBranchEnterpriseKeyPressed

    private void MediaEnterpriseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediaEnterpriseMouseEntered
        // TODO add your handling code here:
        MediaEnterprise.setForeground(Color.black);
    }//GEN-LAST:event_MediaEnterpriseMouseEntered

    private void MediaEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediaEnterpriseMouseExited
        // TODO add your handling code here:
        MediaEnterprise.setForeground(Color.white);
    }//GEN-LAST:event_MediaEnterpriseMouseExited

    private void MediaEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediaEnterpriseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediaEnterpriseMousePressed

    private void SignUpAdminsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpAdminsMouseEntered
        // TODO add your handling code here:
        SignUpAdmins.setForeground(Color.black);
    }//GEN-LAST:event_SignUpAdminsMouseEntered

    private void SignUpAdminsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpAdminsMouseExited
        // TODO add your handling code here:
        SignUpAdmins.setForeground(Color.white);
    }//GEN-LAST:event_SignUpAdminsMouseExited

    private void SignUpAdminsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpAdminsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpAdminsMousePressed

    private void SignUpAdminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpAdminsMouseClicked
        // TODO add your handling code here:
        homePanel.clickEnterpriseAdminsCreatePortal(this);
    }//GEN-LAST:event_SignUpAdminsMouseClicked

    private void MediaEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediaEnterpriseMouseClicked
        // TODO add your handling code here:
        homePanel.clickNewsMainCreatePortal(this);
    }//GEN-LAST:event_MediaEnterpriseMouseClicked

    private void ResourceMgmtSystemEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResourceMgmtSystemEnterpriseMouseClicked
        // TODO add your handling code here:
        homePanel.clickResourceAdminCreatePortal(this);
    }//GEN-LAST:event_ResourceMgmtSystemEnterpriseMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrimeBranchEnterprise;
    private javax.swing.JLabel ForensicsEnterprise;
    private javax.swing.JLabel MediaEnterprise;
    private javax.swing.JLabel ResourceMgmtSystemEnterprise;
    private javax.swing.JLabel SignUpAdmins;
    private javax.swing.JPanel SystemPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
}
