/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ResourceModel;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReadTrainedAnimal extends javax.swing.JPanel {

    TrainedAnimalDirectory animalHistory;
    DatabaseConnection_tAnimal dbConTAnimalDetails;
    public ReadTrainedAnimal(TrainedAnimalDirectory animalHistory) {
        initComponents();
        this.animalHistory = animalHistory;
        populateTable();
        dbConTAnimalDetails = new DatabaseConnection_tAnimal();
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
        lbAnimalName = new javax.swing.JLabel();
        txtAnimalName = new javax.swing.JTextField();
        lbTrainerId = new javax.swing.JLabel();
        txtTrainerId = new javax.swing.JTextField();
        lbTrainerName = new javax.swing.JLabel();
        txtTrainerName = new javax.swing.JTextField();
        lbAnimalId = new javax.swing.JLabel();
        txtAnimalId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 0, 0));
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
                "Trainer Id", "Trainer Name", "Animal Id", "Animal Name"
            }
        ));
        jScrollPane1.setViewportView(HTable);

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Animal");

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

        lbAnimalName.setForeground(new java.awt.Color(255, 255, 255));
        lbAnimalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAnimalName.setText("Animal Name");

        txtAnimalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalNameActionPerformed(evt);
            }
        });

        lbTrainerId.setForeground(new java.awt.Color(255, 255, 255));
        lbTrainerId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTrainerId.setText("Trainer Id");

        lbTrainerName.setForeground(new java.awt.Color(255, 255, 255));
        lbTrainerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTrainerName.setText("Trainer Name");

        txtTrainerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainerNameActionPerformed(evt);
            }
        });

        lbAnimalId.setForeground(new java.awt.Color(255, 255, 255));
        lbAnimalId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAnimalId.setText("Animal Id");

        txtAnimalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnUpdate))
                                .addComponent(btnView))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTrainerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTrainerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbAnimalId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTrainerId)
                                    .addComponent(txtTrainerName)
                                    .addComponent(txtAnimalId)
                                    .addComponent(txtAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTitle)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrainerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrainerName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
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
            TrainedAnimal selectedAnimal = (TrainedAnimal) model.getValueAt(selectedRowIndex, 0);

            int trainerId = Integer.parseInt(txtTrainerId.getText());
            String trainerName = txtTrainerName.getText();
            int animalId = Integer.parseInt(txtAnimalId.getText());
            String animalName = txtAnimalName.getText();

            JOptionPane.showMessageDialog(this, "Trained Animal Information Updated");
            //history.deleteEmployee(selectedEmployee);
            selectedAnimal.setTrainerId(trainerId);
            selectedAnimal.setTrainerName(trainerName);
            selectedAnimal.setAnimalId(animalId);
            selectedAnimal.setAnimalName(animalName);
            
            dbConTAnimalDetails.updateTAnimalDataToDB(selectedAnimal);
             
            txtTrainerId.setText("");
            txtTrainerName.setText("");
            txtAnimalId.setText("");
            txtAnimalName.setText("");
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
        TrainedAnimal selectedAnimal = (TrainedAnimal) model.getValueAt(selectedRowIndex, 0);

        txtTrainerId.setText(String.valueOf(selectedAnimal.getTrainerId()));
        txtTrainerName.setText(selectedAnimal.getTrainerName());
        txtAnimalName.setText(String.valueOf(selectedAnimal.getAnimalId()));
        txtAnimalId.setText(selectedAnimal.getAnimalname());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) HTable.getModel();
        TrainedAnimal selectedAnimal = (TrainedAnimal) model.getValueAt(selectedRowIndex, 0);

        animalHistory.deleteAnimal(selectedAnimal);
        dbConTAnimalDetails.deleteTAnimalDataInDB(selectedAnimal);
        
        JOptionPane.showMessageDialog(this, "Trained Animal deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAnimalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalNameActionPerformed

    private void txtTrainerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrainerNameActionPerformed

    private void txtAnimalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAnimalId;
    private javax.swing.JLabel lbAnimalName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTrainerId;
    private javax.swing.JLabel lbTrainerName;
    private javax.swing.JTextField txtAnimalId;
    private javax.swing.JTextField txtAnimalName;
    private javax.swing.JTextField txtTrainerId;
    private javax.swing.JTextField txtTrainerName;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
            DefaultTableModel model = (DefaultTableModel) HTable.getModel();
            model.setRowCount(0);

            for(TrainedAnimal e: animalHistory.getanimalHistory()){

                Object[] row = new Object[5];
                row[0] = e;
                row[1] = e.getTrainerName();
                row[2] = e.getAnimalId();
                row[3] = e.getAnimalname();
                
                model.addRow(row);
            }
        }
        private boolean Validation() {
    if (txtTrainerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Trainer ID");
            return false;
        } 
                
        try {
        Integer.parseInt(txtTrainerId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Trainer ID");
            
        }
        
        if (txtTrainerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Trainer Name");
            return false;
        } else {
            if (!(txtTrainerName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Trainer Name");
                return false;
            }
        }
        
        if (txtAnimalId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Animal ID");
            return false;
        } 
                
        try {
        Integer.parseInt(txtAnimalId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Animal ID");
            
        }
        
        if (txtAnimalName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Animal Name");
            return false;
        } else {
            if (!(txtAnimalName.getText().matches("[a-zA-Z]*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Animal Name");
                return false;
            }
        }
        
               
        return true;
        
    }
        
}
