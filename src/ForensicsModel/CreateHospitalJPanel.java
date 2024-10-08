/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ForensicsModel;

import ForensicsModel.Hospital;
import ForensicsModel.hospitalDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Sys;
import ui.HomeScreen;

public class CreateHospitalJPanel extends javax.swing.JPanel {

    hospitalDirectory hospHistory;
    DatabaseConnection_hospital dbConHospitalDetails;

    public CreateHospitalJPanel(hospitalDirectory hospHistory) {
        initComponents();
        this.hospHistory = hospHistory;
        dbConHospitalDetails = new DatabaseConnection_hospital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCity = new javax.swing.JLabel();
        lbComm = new javax.swing.JLabel();
        txtHospName = new javax.swing.JTextField();
        lbHospName = new javax.swing.JLabel();
        txtHospId = new javax.swing.JTextField();
        lbHosptId = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lbCity1 = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 0, 0));

        lbCity.setForeground(new java.awt.Color(255, 255, 255));
        lbCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCity.setText("City");

        lbComm.setForeground(new java.awt.Color(255, 255, 255));
        lbComm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComm.setText("Community");

        txtHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospNameActionPerformed(evt);
            }
        });

        lbHospName.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName.setText("Hospital Name");

        lbHosptId.setForeground(new java.awt.Color(255, 255, 255));
        lbHosptId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHosptId.setText(" Id");

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Hospital Form");

        txtComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add Hospital");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbCity1.setForeground(new java.awt.Color(255, 255, 255));
        lbCity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCity1.setText("Doctor name");

        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHospName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbComm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbHosptId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(555, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHosptId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbComm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAdd)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
            int hospId = Integer.parseInt(txtHospId.getText());
            String hospName = txtHospName.getText();
            String community = txtComm.getText();
            String city = txtCity.getText();
            String doc = txtDocName.getText();

            Hospital h = hospHistory.addNewHosp();

            h.setHospId(hospId);
            h.setHospName(hospName);
            h.setCommunity(community);
            h.setCity(city);
            h.setDocName(doc);

            dbConHospitalDetails.addHospitalDataToDB(h);
            JOptionPane.showMessageDialog(this, "New Hospital is added.");

            txtHospId.setText("");
            txtHospName.setText("");
            txtComm.setText("");
            txtCity.setText("");
            txtDocName.setText("");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospNameActionPerformed

    private void txtCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCity1;
    private javax.swing.JLabel lbComm;
    private javax.swing.JLabel lbHospName;
    private javax.swing.JLabel lbHosptId;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtHospId;
    private javax.swing.JTextField txtHospName;
    // End of variables declaration//GEN-END:variables
private boolean Validation() {
        if (txtHospId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Hospital ID");
            return false;
        } else {
            if (txtHospId.getText().length() != 1) {
                JOptionPane.showMessageDialog(this, "Hospital ID should be only 1 digit");
                return false;
            }
        }

        try {
            Integer.parseInt(txtHospId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Hospital Id");

        }

        if (txtHospName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Hospital Name");
            return false;
        } else {
            if (!(txtHospName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Hospital Name");
                return false;
            }
        }

        if (txtComm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Community");
            return false;
        } else {
            if (!(txtComm.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid Community");
                return false;
            }
        }

        if (txtCity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient City");
            return false;
        } else {
            if (!(txtCity.getText().matches("[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid City");
                return false;
            }
        }
        return true;

    }
}
