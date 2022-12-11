/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package crime_branch_enterprise.model;
import NewsModel.Author;
import crime_branch_enterprise.model.OfficerRecord;
import crime_branch_enterprise.model.OfficerDirectory;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class ReadOfficer extends javax.swing.JPanel {
    OfficerDirectory officerDir;

    /**
     * Creates new form ReadOfficer
     */
    public ReadOfficer(OfficerDirectory officerDir) {
        initComponents();
        this.officerDir  = officerDir;
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

        NewEmailTxt = new javax.swing.JTextField();
        HeadingLabel = new javax.swing.JLabel();
        NewAddressTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        OfficerDirectoryTable = new javax.swing.JTable();
        NewDocIDLabel = new javax.swing.JLabel();
        NewPhoneTxt = new javax.swing.JTextField();
        NewDocHospNameLabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        NewDocHospIDLabel = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        NewDocPhnLabel = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        NewFNameTxt = new javax.swing.JTextField();

        NewEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEmailTxtActionPerformed(evt);
            }
        });

        HeadingLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        HeadingLabel.setText("OFFICER DIRECTORY");

        NewAddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAddressTxtActionPerformed(evt);
            }
        });

        OfficerDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "EMAIL", "PHONE NUMBER", "ADDRESS"
            }
        ));
        jScrollPane1.setViewportView(OfficerDirectoryTable);

        NewDocIDLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocIDLabel.setText("NAME");

        NewDocHospNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocHospNameLabel.setText("PHONE NUMBER");

        updateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        NewDocHospIDLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocHospIDLabel.setText("EMAIL ID");

        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        NewDocPhnLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocPhnLabel.setText("ADDRESS");

        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NewDocPhnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(NewAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(NewDocHospIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NewDocHospNameLabel))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addComponent(NewDocIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(NewFNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(287, 287, 287)
                            .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDocHospIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDocHospNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDocPhnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NewFNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NewDocIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewEmailTxtActionPerformed

    private void NewAddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewAddressTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        //        boolean isValid = Validation();
        //        if (isValid) {
            int selectedRowIndex = OfficerDirectoryTable.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) OfficerDirectoryTable.getModel();
            OfficerRecord selectedOff = (OfficerRecord) model.getValueAt(selectedRowIndex, 0);
            String offName = NewFNameTxt.getText();
            String offEmail = NewEmailTxt.getText();
            int offPhone = Integer.parseInt(NewPhoneTxt.getText());
            String offAddress = NewAddressTxt.getText();

            JOptionPane.showMessageDialog(this, "Doctor Information Updated");
            //history.deleteEmployee(selectedEmployee);
            selectedOff.setOfficerName(offName);
            selectedOff.setOfficerEmail(offEmail);
            selectedOff.setOfficerPhoneNumber(offPhone);
            selectedOff.setOfficerAddress(offAddress);

            populateTable();

            NewFNameTxt.setText("");
            NewEmailTxt.setText("");
            NewPhoneTxt.setText("");
            NewAddressTxt.setText("");
            //}
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = OfficerDirectoryTable.getSelectedRow();

        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please enter the row you want to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) OfficerDirectoryTable.getModel();
        OfficerRecord off = (OfficerRecord) model.getValueAt(selectedRowIndex,0);
        
        officerDir.deleteOfficer(off);


        JOptionPane.showMessageDialog(this, "Requested Record is Deleted");
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = OfficerDirectoryTable.getSelectedRow();
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please enter the row you want to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) OfficerDirectoryTable.getModel();
        OfficerRecord off = (OfficerRecord) model.getValueAt(selectedRowIndex,0);

        NewFNameTxt.setText(String.valueOf(off.getOfficerName()));
        NewEmailTxt.setText(String.valueOf(off.getOfficerEmail()));
        NewPhoneTxt.setText(String.valueOf(off.getOfficerPhoneNumber()));
        NewAddressTxt.setText(String.valueOf(off.getOfficerAddress()));
    }//GEN-LAST:event_viewBtnActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) OfficerDirectoryTable.getModel();
        model.setRowCount(0);

        for (OfficerRecord off : officerDir.getOfficerList()) {

            Object[] row = new Object[7];
            row[0] = off;
            row[1] = off.getOfficerName();
            row[2] = off.getOfficerEmail();
            row[3] = off.getOfficerPhoneNumber();
            row[4] = off.getOfficerAddress();

            model.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JTextField NewAddressTxt;
    private javax.swing.JLabel NewDocHospIDLabel;
    private javax.swing.JLabel NewDocHospNameLabel;
    private javax.swing.JLabel NewDocIDLabel;
    private javax.swing.JLabel NewDocPhnLabel;
    private javax.swing.JTextField NewEmailTxt;
    private javax.swing.JTextField NewFNameTxt;
    private javax.swing.JTextField NewPhoneTxt;
    private javax.swing.JTable OfficerDirectoryTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
