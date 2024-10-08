/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ResourceModel;

import ui.*;
import ResourceModel.GovDirectory;
import ResourceModel.Government;
import javax.swing.JOptionPane;

public class CreateGov extends javax.swing.JPanel {

    GovDirectory govHistory;
    DatabaseConnection_government dbConGovDetails;
    
    public CreateGov(GovDirectory govHistory) {
        initComponents();
        this.govHistory = govHistory;
        dbConGovDetails = new DatabaseConnection_government();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbPLId = new javax.swing.JLabel();
        txtPLId = new javax.swing.JTextField();
        lbPLName = new javax.swing.JLabel();
        txtPLName = new javax.swing.JTextField();
        lbParty = new javax.swing.JLabel();
        txtParty = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Government Form");

        lbPLId.setBackground(new java.awt.Color(255, 255, 255));
        lbPLId.setForeground(new java.awt.Color(255, 255, 255));
        lbPLId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPLId.setText("Party Leader Id");

        lbPLName.setBackground(new java.awt.Color(255, 255, 255));
        lbPLName.setForeground(new java.awt.Color(255, 255, 255));
        lbPLName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPLName.setText("Party Leader Name");

        txtPLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLNameActionPerformed(evt);
            }
        });

        lbParty.setBackground(new java.awt.Color(255, 255, 255));
        lbParty.setForeground(new java.awt.Color(255, 255, 255));
        lbParty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbParty.setText("Party");

        txtParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartyActionPerformed(evt);
            }
        });

        lbState.setBackground(new java.awt.Color(255, 255, 255));
        lbState.setForeground(new java.awt.Color(255, 255, 255));
        lbState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbState.setText("State");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add Government");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPLId, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lbPLName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lbParty, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lbState, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPLId, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(txtPLName)
                                .addComponent(txtParty)
                                .addComponent(txtState))
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPLId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPLId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPLName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbParty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
        int plId = Integer.parseInt(txtPLId.getText());
        String plName = txtPLName.getText();
        String party = txtParty.getText();
        String state = txtState.getText();
       

        Government g = govHistory.addNewGov();

        g.setPartyLeaderId(plId);
        g.setPartyLeaderName(plName);
        g.setParty(party);
        g.setState(state);
        
        dbConGovDetails.addGovernmentDataToDB(g);
        JOptionPane.showMessageDialog(this, "New Government is added.");

        txtPLId.setText("");
        txtPLName.setText("");
        txtParty.setText("");
        txtState.setText("");
        }     
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLNameActionPerformed

    private void txtPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartyActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbPLId;
    private javax.swing.JLabel lbPLName;
    private javax.swing.JLabel lbParty;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtPLId;
    private javax.swing.JTextField txtPLName;
    private javax.swing.JTextField txtParty;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
    private boolean Validation() {
    if (txtPLId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Party Leader ID");
            return false;
        } 
                
        try {
        Integer.parseInt(txtPLId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Party Leader ID");
            
        }
        
        if (txtPLName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Party Leader Name");
            return false;
        } else {
            if (!(txtPLName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Party Leader Name");
                return false;
            }
        }
        
        if (txtParty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Party");
            return false;
        }
            else{
            if(!(txtParty.getText().matches("[a-zA-Z]*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid Party");
                return false;
            }
        } 
        
        if (txtState.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter State");
            return false;
        }
            else{
            if(!(txtParty.getText().matches("[a-zA-Z]*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid State");
                return false;
            }
        } 
        return true;
        
    }
}
