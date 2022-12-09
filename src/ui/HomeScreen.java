package ui;

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
    
    public HomeScreen(JPanel userProcessContainer,Sys sys,HomePanel homePanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sys = sys;
        this.homePanel = homePanel;
        setSize(1040, 544);
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
        ResourceMgmtSystemEnterprise = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        SystemPanel.setBackground(new java.awt.Color(0, 102, 153));
        SystemPanel.setForeground(new java.awt.Color(17, 125, 161));
        SystemPanel.setToolTipText("");
        SystemPanel.setPreferredSize(new java.awt.Dimension(1600, 750));

        CrimeBranchEnterprise.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        CrimeBranchEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        CrimeBranchEnterprise.setText("CrimeBranchEnterprise");
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

        ForensicsEnterprise.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
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

        ResourceMgmtSystemEnterprise.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        ResourceMgmtSystemEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        ResourceMgmtSystemEnterprise.setText("Resource Management System");
        ResourceMgmtSystemEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/welcome.jpg"))); // NOI18N

        javax.swing.GroupLayout SystemPanelLayout = new javax.swing.GroupLayout(SystemPanel);
        SystemPanel.setLayout(SystemPanelLayout);
        SystemPanelLayout.setHorizontalGroup(
            SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ForensicsEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrimeBranchEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResourceMgmtSystemEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        SystemPanelLayout.setVerticalGroup(
            SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SystemPanelLayout.createSequentialGroup()
                        .addComponent(CrimeBranchEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(ForensicsEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(ResourceMgmtSystemEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SystemPanel, 1102, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        homePanel.clickCasePortal(this, homePanel);
    }//GEN-LAST:event_CrimeBranchEnterpriseMousePressed

    private void ResourceMgmtSystemEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResourceMgmtSystemEnterpriseMousePressed
        // TODO add your handling code here:
        //homePanel.clickAddEncounter(this);
    }//GEN-LAST:event_ResourceMgmtSystemEnterpriseMousePressed

    private void ForensicsEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForensicsEnterpriseMousePressed
        // TODO add your handling code here:
        
        //homePanel.clickDashboard(this);
    }//GEN-LAST:event_ForensicsEnterpriseMousePressed

    private void CrimeBranchEnterpriseAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeBranchEnterpriseAncestorAdded

    private void CrimeBranchEnterpriseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CrimeBranchEnterpriseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeBranchEnterpriseKeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrimeBranchEnterprise;
    private javax.swing.JLabel ForensicsEnterprise;
    private javax.swing.JLabel ResourceMgmtSystemEnterprise;
    private javax.swing.JPanel SystemPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
}
