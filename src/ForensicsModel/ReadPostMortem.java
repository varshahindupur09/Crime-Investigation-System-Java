/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ForensicsModel;


import ForensicsModel.PostMortem;
import ForensicsModel.PostMortemHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ReadPostMortem extends javax.swing.JPanel {

    PostMortem pm;
    PostMortemHistory pmHistory;
    public ReadPostMortem(PostMortem pm, PostMortemHistory pmHistory) {
        initComponents();
        this.pm = pm;
        this.pmHistory = pmHistory;
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

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DTable = new javax.swing.JTable();
        txtPmId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lbDocId = new javax.swing.JLabel();
        lbDocName = new javax.swing.JLabel();
        lbDocPhone = new javax.swing.JLabel();
        lbHospName = new javax.swing.JLabel();
        lbHospId = new javax.swing.JLabel();
        txtCaseId = new javax.swing.JTextField();
        txtBodyName = new javax.swing.JTextField();
        txtDocId = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lbDocPhone1 = new javax.swing.JLabel();
        lbHospName1 = new javax.swing.JLabel();
        lbHospId1 = new javax.swing.JLabel();
        txtDeathTime = new javax.swing.JTextField();
        txtCauseofDeath = new javax.swing.JTextField();
        txtDeathDate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Encounter Report");

        DTable.setBackground(java.awt.SystemColor.controlHighlight);
        DTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Post Mortem Id", "Date", "Doctor Id", "Case Id", "Body Name", "Death Date", "Death Time", "Cause of Death"
            }
        ));
        jScrollPane1.setViewportView(DTable);

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbDocId.setForeground(new java.awt.Color(255, 255, 255));
        lbDocId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId.setText("Post Mortem Id");

        lbDocName.setForeground(new java.awt.Color(255, 255, 255));
        lbDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocName.setText("Date");

        lbDocPhone.setForeground(new java.awt.Color(255, 255, 255));
        lbDocPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocPhone.setText("Doctor Id");

        lbHospName.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName.setText("Body Name");

        lbHospId.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId.setText("Case Id");

        txtCaseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaseIdActionPerformed(evt);
            }
        });

        txtBodyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyNameActionPerformed(evt);
            }
        });

        txtDocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIdActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbDocPhone1.setForeground(new java.awt.Color(255, 255, 255));
        lbDocPhone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocPhone1.setText("Death Date");

        lbHospName1.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName1.setText("Cause of Death");

        lbHospId1.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId1.setText("Death Time");

        txtDeathTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeathTimeActionPerformed(evt);
            }
        });

        txtCauseofDeath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCauseofDeathActionPerformed(evt);
            }
        });

        txtDeathDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeathDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnView)
                        .addGap(30, 30, 30)
                        .addComponent(btnDelete)
                        .addGap(33, 33, 33)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbHospName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbDocPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbHospId1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(150, 150, 150)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDeathDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDeathTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCauseofDeath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbHospName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(150, 150, 150)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPmId)
                                    .addComponent(txtDate)
                                    .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCaseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBodyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnView)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPmId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBodyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeathDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospId1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeathTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCauseofDeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
            int selectedRowIndex = DTable.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) DTable.getModel();
            PostMortem selectedPostMortem = (PostMortem) model.getValueAt(selectedRowIndex, 0);

            int pmId = Integer.parseInt(txtPmId.getText());
            String date = txtDate.getText();
            int docId = Integer.parseInt(txtDocId.getText());
            int caseId = Integer.parseInt(txtCaseId.getText());
            String bodyName = txtBodyName.getText();
            String deathDate = txtDeathDate.getText();
            String deathTime = txtDeathTime.getText();
            String causeOfDeath = txtCauseofDeath.getText();

            JOptionPane.showMessageDialog(this, "Employee Information Updated");
            //history.deleteEmployee(selectedEmployee);
            selectedPostMortem.setPmId(pmId);
            selectedPostMortem.setDate(date);
            selectedPostMortem.setDocId(docId);
            selectedPostMortem.setCaseId(caseId);
            selectedPostMortem.setBodyName(bodyName);
            selectedPostMortem.setDeathDate(deathDate);
            selectedPostMortem.setDeathTime(deathTime);
            selectedPostMortem.setCauseOfDeath(causeOfDeath);

            populateTable();
            txtPmId.setText("");
            txtDate.setText("");
            txtDocId.setText("");
            txtCaseId.setText("");
            txtBodyName.setText("");
            txtDeathDate.setText("");
            txtDeathTime.setText("");
            txtCauseofDeath.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCaseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaseIdActionPerformed

    private void txtBodyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyNameActionPerformed

    private void txtDocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIdActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) DTable.getModel();
        PostMortem selectedPostMortem = (PostMortem) model.getValueAt(selectedRowIndex, 0);

        txtPmId.setText(String.valueOf(selectedPostMortem.getPmId()));
        txtDate.setText(String.valueOf(selectedPostMortem.getDate()));
        txtDocId.setText(String.valueOf(selectedPostMortem.getDocId()));
        txtCaseId.setText(String.valueOf(selectedPostMortem.getCaseId()));
        txtBodyName.setText(String.valueOf(selectedPostMortem.getBodyName()));
        txtDeathDate.setText(String.valueOf(selectedPostMortem.getDeathDate()));
        txtDeathTime.setText(String.valueOf(selectedPostMortem.getDeathTime()));
        txtCauseofDeath.setText(String.valueOf(selectedPostMortem.getCauseOfDeath()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) DTable.getModel();
        PostMortem selectedPostMortem = (PostMortem)model.getValueAt(selectedRowIndex, 0);

        pmHistory.deletePM(selectedPostMortem);
        JOptionPane.showMessageDialog(this, "Employee deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDeathTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeathTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathTimeActionPerformed

    private void txtCauseofDeathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCauseofDeathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCauseofDeathActionPerformed

    private void txtDeathDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeathDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDocId;
    private javax.swing.JLabel lbDocName;
    private javax.swing.JLabel lbDocPhone;
    private javax.swing.JLabel lbDocPhone1;
    private javax.swing.JLabel lbHospId;
    private javax.swing.JLabel lbHospId1;
    private javax.swing.JLabel lbHospName;
    private javax.swing.JLabel lbHospName1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtBodyName;
    private javax.swing.JTextField txtCaseId;
    private javax.swing.JTextField txtCauseofDeath;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDeathDate;
    private javax.swing.JTextField txtDeathTime;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtPmId;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) DTable.getModel();
            model.setRowCount(0);

            for(PostMortem p: pmHistory.getPMHistory()){

                Object[] row = new Object[8];
                row[0] = p;
                row[1] = p.getDate();
                row[2] = p.getDocId();
                row[3] = p.getCaseId();
                row[4] = p.getBodyName();
                row[5] = p.getDeathDate();
                row[6] = p.getDeathTime();
                row[7] = p.getCauseOfDeath();
            
            model.addRow(row);
            }
    }
}

   
