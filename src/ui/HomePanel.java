/*
 * HomePanel.java
 *
 */

package ui;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Sys;
import ui.LoginScreen;

/**
 *
 * @author  Rushabh
 */
public class HomePanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    Sys sys;
    
    /** Creates new form AdminWorkAreaJPanel */
    public HomePanel(JPanel mainWorkArea, Sys sys) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.sys = sys;
        
        setHomepage();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        backbuttonlabel = new javax.swing.JLabel();
        workArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(50);
        splitPane.setDividerSize(2);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuBar.setBackground(new java.awt.Color(0, 102, 153));
        menuBar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                menuBarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        backbuttonlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back.png"))); // NOI18N
        backbuttonlabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                backbuttonlabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        backbuttonlabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backbuttonlabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backbuttonlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 864, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backbuttonlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        splitPane.setTopComponent(menuBar);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void setHomepage() {
       HomeScreen hs = new HomeScreen(workArea,sys,this);
       workArea.add("HomeScreen",hs);
       CardLayout layout = (CardLayout) workArea.getLayout();
       layout.next(workArea);
    }
    
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        JPanel selectedPanel = new LoginScreen(mainWorkArea,sys);
        
        mainWorkArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
                
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void menuBarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menuBarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarAncestorAdded

    private void backbuttonlabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_backbuttonlabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonlabelAncestorAdded

    private void backbuttonlabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backbuttonlabelKeyPressed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(this, "Click on Logout,instead!");
    }//GEN-LAST:event_backbuttonlabelKeyPressed

    @Override
    public String toString(){
        return "Administrator";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbuttonlabel;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    public void clickAddUser(HomeScreen homeScreen) {

        JPanel selectedPanel = new AddUser(workArea,sys,homeScreen);
        
        workArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void clickAddEncounter(HomeScreen homeScreen) {

        JPanel selectedPanel = new AddEncounter(workArea,sys,homeScreen);
        
        workArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    public void clickDashboard(HomeScreen homeScreen) {

        JPanel selectedPanel = new Dashboard(workArea,sys,homeScreen);
        
        workArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void clickPatient(HomeScreen homeScreen) {

        JPanel selectedPanel = new AddPatient(workArea,sys,homeScreen);
        
        workArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void clickAddWorkforce(HomeScreen homeScreen) {

        JPanel selectedPanel = new AddWorkforce(workArea,sys,homeScreen);
        
        workArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
    
    public void clickTerritories(HomeScreen homeScreen) {

        JPanel selectedPanel = new Territories(workArea,sys,homeScreen);
        
        workArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    
}
