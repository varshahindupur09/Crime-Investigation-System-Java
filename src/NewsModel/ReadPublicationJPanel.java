/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package NewsModel;
import javax.swing.table.DefaultTableModel;
import NewsModel.Publication;
import NewsModel.PublicationHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class ReadPublicationJPanel extends javax.swing.JPanel {
    PublicationHistory publicationHistory;
    /**
     * Creates new form ReadPublicationJPanel
     */
    public ReadPublicationJPanel(PublicationHistory publicationHistory) {
        initComponents();
        this.publicationHistory  = publicationHistory;
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

        viewBtn = new javax.swing.JButton();
        NewPbIdTxt = new javax.swing.JTextField();
        NewPbNameTxt = new javax.swing.JTextField();
        HeadingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PublicationDirectoryTable = new javax.swing.JTable();
        NewDocNameLabel = new javax.swing.JLabel();
        NewDocIDLabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));

        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        NewPbNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPbNameTxtActionPerformed(evt);
            }
        });

        HeadingLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        HeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeadingLabel.setText("PUBLICATION DIRECTORY");

        PublicationDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NAME"
            }
        ));
        jScrollPane1.setViewportView(PublicationDirectoryTable);

        NewDocNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocNameLabel.setText("NAME ");

        NewDocIDLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocIDLabel.setText(" ID");

        updateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewDocIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewDocNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewPbNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPbIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(336, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPbIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewDocIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NewDocNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewPbNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(723, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = PublicationDirectoryTable.getSelectedRow();
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please enter the row you want to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) PublicationDirectoryTable.getModel();
        Publication publication = (Publication) model.getValueAt(selectedRowIndex,0);

        NewPbIdTxt.setText(String.valueOf(publication.getPbId()));
        NewPbNameTxt.setText(String.valueOf(publication.getPbName()));
       
    }//GEN-LAST:event_viewBtnActionPerformed

    private void NewPbNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPbNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPbNameTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        //        boolean isValid = Validation();
        //        if (isValid) {
            int selectedRowIndex = PublicationDirectoryTable.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) PublicationDirectoryTable.getModel();
            Publication selectedPublication = (Publication) model.getValueAt(selectedRowIndex, 0);
            String pbId = NewPbIdTxt.getText();
            String pbName = NewPbNameTxt.getText();
            
            JOptionPane.showMessageDialog(this, "Doctor Information Updated");
            //history.deleteEmployee(selectedEmployee);
            selectedPublication.setPbId(pbId);
            selectedPublication.setPbName(pbName);
            

            populateTable();

            NewPbIdTxt.setText("");
            NewPbNameTxt.setText("");
            
            //}
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PublicationDirectoryTable.getSelectedRow();

        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please enter the row you want to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) PublicationDirectoryTable.getModel();
        Publication pub = (Publication) model.getValueAt(selectedRowIndex,0);

        publicationHistory.deletePublication(pub);

        JOptionPane.showMessageDialog(this, "Requested Record is Deleted");
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) PublicationDirectoryTable.getModel();
        model.setRowCount(0);

        for (Publication pb : publicationHistory.getPublicationData()) {

            Object[] row = new Object[3];
            row[0] = pb;
            row[1] = pb.getPbId();
            row[2] = pb.getPbName();

            model.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JLabel NewDocIDLabel;
    private javax.swing.JLabel NewDocNameLabel;
    private javax.swing.JTextField NewPbIdTxt;
    private javax.swing.JTextField NewPbNameTxt;
    private javax.swing.JTable PublicationDirectoryTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
