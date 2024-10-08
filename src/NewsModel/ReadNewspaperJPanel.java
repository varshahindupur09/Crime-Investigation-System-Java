/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package NewsModel;
import javax.swing.table.DefaultTableModel;
import NewsModel.Newspaper;
import NewsModel.NewspaperHistory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Sys;
import ui.HomeScreen;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class ReadNewspaperJPanel extends javax.swing.JPanel {
    NewspaperHistory newspaperHistory;

    /**
     * Creates new form ReadNewspaperJPanel
     */
    
    private JPanel readNewspaperJPanel;
    private Sys sys;
    private HomeScreen homeScreen;
    
    public ReadNewspaperJPanel(NewspaperHistory newspaperHistory) {
        initComponents();
        this.newspaperHistory  = newspaperHistory;
        populateTable();
    }

    
    public ReadNewspaperJPanel(JPanel readNewspaperJPanel,Sys sys,HomeScreen homeScreen) 
    {
        this.readNewspaperJPanel = readNewspaperJPanel;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
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
        NewNpIdTxt = new javax.swing.JTextField();
        NewNpNameTxt = new javax.swing.JTextField();
        NewNpPriceTxt = new javax.swing.JTextField();
        NewNpPublicationIdTxt = new javax.swing.JTextField();
        HeadingLabel = new javax.swing.JLabel();
        NewDocPhnLabel2 = new javax.swing.JLabel();
        NewNpDateTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        NpDirectoryTable = new javax.swing.JTable();
        NewDocNameLabel = new javax.swing.JLabel();
        NewDocIDLabel = new javax.swing.JLabel();
        NewNpNopTxt = new javax.swing.JTextField();
        NewDocHospNameLabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        NewDocHospIDLabel = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        NewDocPhnLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 0));
        setForeground(new java.awt.Color(153, 0, 0));

        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        NewNpNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNpNameTxtActionPerformed(evt);
            }
        });

        NewNpPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNpPriceTxtActionPerformed(evt);
            }
        });

        NewNpPublicationIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNpPublicationIdTxtActionPerformed(evt);
            }
        });

        HeadingLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        HeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeadingLabel.setText("NEWSPAPER DIRECTORY");

        NewDocPhnLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocPhnLabel2.setForeground(new java.awt.Color(255, 255, 255));
        NewDocPhnLabel2.setText("PUBLICATION ID");

        NewNpDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNpDateTxtActionPerformed(evt);
            }
        });

        NpDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PRICE", "NO OF PAGES", "DATE", "PUBLICATION ID"
            }
        ));
        jScrollPane1.setViewportView(NpDirectoryTable);

        NewDocNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocNameLabel.setText("NAME ");

        NewDocIDLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocIDLabel.setText(" ID");

        NewDocHospNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocHospNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocHospNameLabel.setText("NO OF PAGES");

        updateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        NewDocHospIDLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocHospIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocHospIDLabel.setText("PRICE");

        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        NewDocPhnLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        NewDocPhnLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewDocPhnLabel.setText("DATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NewDocNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(NewDocIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NewNpIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NewNpNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NewDocHospIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NewNpPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(NewDocHospNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NewNpNopTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NewDocPhnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NewNpDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NewDocPhnLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NewNpPublicationIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(287, 287, 287)
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewDocIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewNpIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewDocHospNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewNpNopTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NewDocNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewNpNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewDocHospIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewNpPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewDocPhnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewNpDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewDocPhnLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NewNpPublicationIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(343, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(722, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = NpDirectoryTable.getSelectedRow();
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please enter the row you want to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) NpDirectoryTable.getModel();
        Newspaper newspaper = (Newspaper) model.getValueAt(selectedRowIndex,0);

        NewNpIdTxt.setText(String.valueOf(newspaper.getNpId()));
        NewNpNameTxt.setText(String.valueOf(newspaper.getNpName()));
        NewNpPriceTxt.setText(String.valueOf(newspaper.getNpPrice()));
        NewNpNopTxt.setText(String.valueOf(newspaper.getNpNoOfPages()));
        NewNpDateTxt.setText(String.valueOf(newspaper.getNpDate()));
        NewNpPublicationIdTxt.setText(String.valueOf(newspaper.getNpPublicationId()));
    }//GEN-LAST:event_viewBtnActionPerformed

    private void NewNpNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNpNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewNpNameTxtActionPerformed

    private void NewNpPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNpPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewNpPriceTxtActionPerformed

    private void NewNpPublicationIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNpPublicationIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewNpPublicationIdTxtActionPerformed

    private void NewNpDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNpDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewNpDateTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        //        boolean isValid = Validation();
        //        if (isValid) {
            int selectedRowIndex = NpDirectoryTable.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) NpDirectoryTable.getModel();
            Newspaper selectedNewspaper = (Newspaper) model.getValueAt(selectedRowIndex, 0);
            String npId = NewNpIdTxt.getText();
            String npName = NewNpNameTxt.getText();
            int npPrice = Integer.parseInt(NewNpPriceTxt.getText());
            int npNop = Integer.parseInt(NewNpNopTxt.getText());
            String npDate = NewNpDateTxt.getText();
            String npPublication = NewNpPublicationIdTxt.getText();

            JOptionPane.showMessageDialog(this, "Newspaper Information Updated");
            //history.deleteEmployee(selectedEmployee);
            selectedNewspaper.setNpId(npId);
            selectedNewspaper.setNpName(npName);
            selectedNewspaper.setNpPrice(npPrice);
            selectedNewspaper.setNpNoOfPages(npNop);
            selectedNewspaper.setNpDate(npDate);
            selectedNewspaper.setNpPublicationId(npPublication);

            populateTable();

            NewNpIdTxt.setText("");
            NewNpNameTxt.setText("");
            NewNpPriceTxt.setText("");
            NewNpNopTxt.setText("");
            NewNpDateTxt.setText("");
            NewNpPublicationIdTxt.setText("");
            //}
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = NpDirectoryTable.getSelectedRow();

        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please enter the row you want to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) NpDirectoryTable.getModel();
        Newspaper newspaper = (Newspaper) model.getValueAt(selectedRowIndex,0);

        newspaperHistory.deleteNewspaper(newspaper);

        JOptionPane.showMessageDialog(this, "Requested Record is Deleted");
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) NpDirectoryTable.getModel();
        model.setRowCount(0);

        for (Newspaper np : newspaperHistory.getNewspaperData()) {

            Object[] row = new Object[7];
            row[0] = np;
            row[1] = np.getNpName();
            row[2] = np.getNpPrice();
            row[3] = np.getNpNoOfPages();
            row[4] = np.getNpDate();
            row[5] = np.getNpPublicationId();

            model.addRow(row);

        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JLabel NewDocHospIDLabel;
    private javax.swing.JLabel NewDocHospNameLabel;
    private javax.swing.JLabel NewDocIDLabel;
    private javax.swing.JLabel NewDocNameLabel;
    private javax.swing.JLabel NewDocPhnLabel;
    private javax.swing.JLabel NewDocPhnLabel2;
    private javax.swing.JTextField NewNpDateTxt;
    private javax.swing.JTextField NewNpIdTxt;
    private javax.swing.JTextField NewNpNameTxt;
    private javax.swing.JTextField NewNpNopTxt;
    private javax.swing.JTextField NewNpPriceTxt;
    private javax.swing.JTextField NewNpPublicationIdTxt;
    private javax.swing.JTable NpDirectoryTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
