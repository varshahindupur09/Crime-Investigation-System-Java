/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ResourceModel;

import ui.*;
import ResourceModel.Army;
import ResourceModel.ArmyDirectory;
import javax.swing.JOptionPane;

public class CreateArmy extends javax.swing.JPanel {

    ArmyDirectory armyHistory;
    DatabaseConnection_army dbConArmyDetails;
    
    public CreateArmy(ArmyDirectory armyHistory) {
        initComponents();
        this.armyHistory = armyHistory;
        dbConArmyDetails = new DatabaseConnection_army();
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
        lbGenId = new javax.swing.JLabel();
        txtGenId = new javax.swing.JTextField();
        lbGenName = new javax.swing.JLabel();
        txtGenName = new javax.swing.JTextField();
        lbDep = new javax.swing.JLabel();
        txtDep = new javax.swing.JTextField();
        lbCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Army Form");

        lbGenId.setForeground(new java.awt.Color(255, 255, 255));
        lbGenId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenId.setText("General Id");

        lbGenName.setForeground(new java.awt.Color(255, 255, 255));
        lbGenName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenName.setText("General Name");

        txtGenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenNameActionPerformed(evt);
            }
        });

        lbDep.setForeground(new java.awt.Color(255, 255, 255));
        lbDep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDep.setText("Department");

        txtDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepActionPerformed(evt);
            }
        });

        lbCountry.setForeground(new java.awt.Color(255, 255, 255));
        lbCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCountry.setText("Country");

        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add Army");
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
                            .addComponent(lbGenId, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lbGenName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lbDep, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lbCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGenId, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(txtGenName)
                                .addComponent(txtDep)
                                .addComponent(txtCountry))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(497, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGenId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGenName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDep, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
        int genId = Integer.parseInt(txtGenId.getText());
        String genName = txtGenName.getText();
        String department = txtDep.getText();
        String country = txtCountry.getText();
       

        Army a = armyHistory.addNewArmy();

        a.setGeneralId(genId);
        a.setGeneralName(genName);
        a.setDepartment(department);
        a.setCountry(country);
        
        dbConArmyDetails.addArmyDataToDB(a);
        JOptionPane.showMessageDialog(this, "New Army is added.");

        txtGenId.setText("");
        txtGenName.setText("");
        txtDep.setText("");
        txtCountry.setText("");
        }   
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtGenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenNameActionPerformed

    private void txtDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lbDep;
    private javax.swing.JLabel lbGenId;
    private javax.swing.JLabel lbGenName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtGenId;
    private javax.swing.JTextField txtGenName;
    // End of variables declaration//GEN-END:variables

    private boolean Validation() {
    if (txtGenId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter General ID");
            return false;
        } 
                
        try {
        Integer.parseInt(txtGenId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for General Id");
            
        }
        
        if (txtGenName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter General Name");
            return false;
        } else {
            if (!(txtGenName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid General Name");
                return false;
            }
        }
        
        if (txtDep.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Department");
            return false;
        }
            else{
            if(!(txtDep.getText().matches("[a-zA-Z]*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid Department");
                return false;
            }
        } 
        
        if (txtCountry.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Country");
            return false;
        }
            else{
            if(!(txtCountry.getText().matches("[a-zA-Z]*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid Country");
                return false;
            }
        } 
        return true;
        
    }   
}
