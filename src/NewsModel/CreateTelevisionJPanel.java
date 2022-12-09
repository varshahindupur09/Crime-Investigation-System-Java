/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package NewsModel;
import NewsModel.Television;
import NewsModel.TelevisionHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class CreateTelevisionJPanel extends javax.swing.JPanel {
    TelevisionHistory newTvData;

    /**
     * Creates new form CreateTelevisionJPanel
     */
    public CreateTelevisionJPanel(TelevisionHistory television) {
        initComponents();
        newTvData = television;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        lbDocId = new javax.swing.JLabel();
        txtTvId = new javax.swing.JTextField();
        lbDocName = new javax.swing.JLabel();
        txtTvName = new javax.swing.JTextField();
        txtTvNewsId = new javax.swing.JTextField();
        lbDocPhone = new javax.swing.JLabel();
        lbHospName = new javax.swing.JLabel();
        lbHospId = new javax.swing.JLabel();
        txtTvNewsRpTime = new javax.swing.JTextField();
        txtTvNewsReporter = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add Television");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbDocId.setForeground(new java.awt.Color(255, 255, 255));
        lbDocId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId.setText("Channel Id");

        lbDocName.setForeground(new java.awt.Color(255, 255, 255));
        lbDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocName.setText("Channel Name");

        txtTvName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTvNameActionPerformed(evt);
            }
        });

        txtTvNewsId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTvNewsIdActionPerformed(evt);
            }
        });

        lbDocPhone.setForeground(new java.awt.Color(255, 255, 255));
        lbDocPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocPhone.setText("News Id");

        lbHospName.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName.setText("News Reporter Name");

        lbHospId.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId.setText("News Reporting Time");

        txtTvNewsRpTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTvNewsRpTimeActionPerformed(evt);
            }
        });

        txtTvNewsReporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTvNewsReporterActionPerformed(evt);
            }
        });

        lbTitle.setBackground(new java.awt.Color(0, 204, 255));
        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Television Channel Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTvId)
                        .addComponent(txtTvName)
                        .addComponent(txtTvNewsId)
                        .addComponent(txtTvNewsRpTime, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addComponent(txtTvNewsReporter, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTvId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTvName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTvNewsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTvNewsRpTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTvNewsReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addComponent(btnAdd)
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //boolean isValid = Validation();
        //if (isValid) {
            String tvId = txtTvId.getText();
            String tvName = txtTvName.getText();
            String tvNewsId = txtTvNewsId.getText();
            String tvRpTime = txtTvNewsRpTime.getText();
            String tvReporter = txtTvNewsReporter.getText();

            Television tv = newTvData.addTelevision();
            
            tv.setChannelId(tvId);
            tv.setChannelName(tvName);
            tv.setNewsId(tvNewsId);
            tv.setNewsReportingTime(tvRpTime);
            tv.setNewsReporterName(tvReporter);


            JOptionPane.showMessageDialog(this, "Television Channel Information Saved");
            //}
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTvNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTvNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTvNameActionPerformed

    private void txtTvNewsIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTvNewsIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTvNewsIdActionPerformed

    private void txtTvNewsRpTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTvNewsRpTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTvNewsRpTimeActionPerformed

    private void txtTvNewsReporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTvNewsReporterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTvNewsReporterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbDocId;
    private javax.swing.JLabel lbDocName;
    private javax.swing.JLabel lbDocPhone;
    private javax.swing.JLabel lbHospId;
    private javax.swing.JLabel lbHospName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtTvId;
    private javax.swing.JTextField txtTvName;
    private javax.swing.JTextField txtTvNewsId;
    private javax.swing.JTextField txtTvNewsReporter;
    private javax.swing.JTextField txtTvNewsRpTime;
    // End of variables declaration//GEN-END:variables
}
