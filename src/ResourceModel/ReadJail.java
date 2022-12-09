/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ResourceModel;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReadJail extends javax.swing.JPanel {

    JailDirectory jailHistory;
    public ReadJail(JailDirectory jailHistory) {
        initComponents();
        this.jailHistory = jailHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HTable = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbJailerName = new javax.swing.JLabel();
        txtJailerName = new javax.swing.JTextField();
        lbCcount = new javax.swing.JLabel();
        txtCcount = new javax.swing.JTextField();
        lbJailId = new javax.swing.JLabel();
        txtJailId = new javax.swing.JTextField();
        lbJailerId = new javax.swing.JLabel();
        txtJailerId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 204, 255));

        HTable.setBackground(java.awt.SystemColor.controlHighlight);
        HTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Jail Id", "Jailer Id", "Jailer Name", "Criminal Count"
            }
        ));
        jScrollPane1.setViewportView(HTable);

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Jail");

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbJailerName.setForeground(new java.awt.Color(255, 255, 255));
        lbJailerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJailerName.setText("Jailer Name");

        txtJailerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJailerNameActionPerformed(evt);
            }
        });

        lbCcount.setForeground(new java.awt.Color(255, 255, 255));
        lbCcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCcount.setText("Criminal Count");

        txtCcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCcountActionPerformed(evt);
            }
        });

        lbJailId.setForeground(new java.awt.Color(255, 255, 255));
        lbJailId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJailId.setText("Jail Id");

        txtJailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJailIdActionPerformed(evt);
            }
        });

        lbJailerId.setForeground(new java.awt.Color(255, 255, 255));
        lbJailerId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJailerId.setText("Jailer Id");

        txtJailerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJailerIdActionPerformed(evt);
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
                        .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbJailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbJailerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbJailerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCcount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJailId)
                    .addComponent(txtJailerId)
                    .addComponent(txtJailerName)
                    .addComponent(txtCcount, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate))
                        .addComponent(btnView))
                    .addContainerGap(246, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbJailId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJailerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbJailerId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJailerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbJailerName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCcount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(164, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            boolean isValid = Validation();
            if (isValid) {
            int selectedRowIndex = HTable.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) HTable.getModel();
            Jail selectedJail = (Jail) model.getValueAt(selectedRowIndex, 0);

            int jailId = Integer.parseInt(txtJailId.getText());
            String jailerId = txtJailerId.getText();
            String jailerName = txtJailerName.getText();
            int crimCount = Integer.parseInt(txtCcount.getText());

            JOptionPane.showMessageDialog(this, "Jail Information Updated");
            //history.deleteEmployee(selectedEmployee);
            selectedJail.setJailId(jailId);
            selectedJail.setJailerId(jailId);
            selectedJail.setJailerName(jailerName);
            selectedJail.setCriminalCount(crimCount);
             
            txtJailId.setText("");
            txtJailerId.setText("");
            txtJailerName.setText("");
            txtCcount.setText("");
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) HTable.getModel();
        Jail selectedJail = (Jail)model.getValueAt(selectedRowIndex, 0);

        txtJailId.setText(String.valueOf(selectedJail.getJailId()));
        txtJailerId.setText(String.valueOf(selectedJail.getJailerId()));
        txtJailerName.setText(selectedJail.getJailerName());
        txtCcount.setText(String.valueOf(selectedJail.getCriminalCount()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) HTable.getModel();
        Jail selectedJail = (Jail)model.getValueAt(selectedRowIndex, 0);

        jailHistory.deleteJail(selectedJail);
        JOptionPane.showMessageDialog(this, "Jail deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtJailerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJailerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJailerNameActionPerformed

    private void txtCcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCcountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCcountActionPerformed

    private void txtJailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJailIdActionPerformed

    private void txtJailerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJailerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJailerIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCcount;
    private javax.swing.JLabel lbJailId;
    private javax.swing.JLabel lbJailerId;
    private javax.swing.JLabel lbJailerName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtCcount;
    private javax.swing.JTextField txtJailId;
    private javax.swing.JTextField txtJailerId;
    private javax.swing.JTextField txtJailerName;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
            DefaultTableModel model = (DefaultTableModel) HTable.getModel();
            model.setRowCount(0);

            for(Jail e: jailHistory.getJailHistory()){

                Object[] row = new Object[5];
                row[0] = e;
                row[1] = e.getJailerId();
                row[2] = e.getJailerName();
                row[3] = e.getCriminalCount();
                
                model.addRow(row);
            }
        }
        private boolean Validation() {
    if (txtJailId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Jail ID");
            return false;
        } 
                
        try {
        Integer.parseInt(txtJailId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Jail ID");
            
        }
        
        if (txtJailerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Jailer ID");
            return false;
        } 
                
        try {
        Integer.parseInt(txtJailerId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Jailer ID");
            
        }
        
        if (txtJailerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Jailer Name");
            return false;
        } else {
            if (!(txtJailerName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Jailer Name");
                return false;
            }
        }
        
        if (txtCcount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Criminal count");
            return false;
        } 
                
        try {
        Integer.parseInt(txtCcount.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Criminal count");
            
        }
       
        return true;
        
    }        
}
