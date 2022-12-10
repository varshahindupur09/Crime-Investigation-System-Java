/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package NewsModel;
import NewsModel.Reporter;
import NewsModel.ReporterHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class CreateReporterJPanel extends javax.swing.JPanel {
    ReporterHistory newReporterData;

    /**
     * Creates new form CreateReporterJPanel
     */
    public CreateReporterJPanel(ReporterHistory reporter) {
        newReporterData = reporter;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHospName14 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtRpDoj = new javax.swing.JTextField();
        lbDocId = new javax.swing.JLabel();
        txtRpId = new javax.swing.JTextField();
        lbDocName = new javax.swing.JLabel();
        txtRpName = new javax.swing.JTextField();
        txtRpAge = new javax.swing.JTextField();
        lbDocPhone = new javax.swing.JLabel();
        lbHospName = new javax.swing.JLabel();
        lbHospId = new javax.swing.JLabel();
        txtRpYoe = new javax.swing.JTextField();
        txtRpGender = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        lbHospName15 = new javax.swing.JLabel();
        txtRpEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 51));

        lbHospName14.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName14.setText("Date of Joining");

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add Reporter");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtRpDoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpDojActionPerformed(evt);
            }
        });

        lbDocId.setForeground(new java.awt.Color(255, 255, 255));
        lbDocId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId.setText(" Id");

        lbDocName.setForeground(new java.awt.Color(255, 255, 255));
        lbDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocName.setText("Name");

        txtRpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpNameActionPerformed(evt);
            }
        });

        txtRpAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpAgeActionPerformed(evt);
            }
        });

        lbDocPhone.setForeground(new java.awt.Color(255, 255, 255));
        lbDocPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocPhone.setText(" Age");

        lbHospName.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName.setText("Gender");

        lbHospId.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId.setText("Years Of Experience");

        txtRpYoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpYoeActionPerformed(evt);
            }
        });

        txtRpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpGenderActionPerformed(evt);
            }
        });

        lbTitle.setBackground(new java.awt.Color(0, 204, 255));
        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Reporter Form");

        lbHospName15.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName15.setText("Email");

        txtRpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpEmailActionPerformed(evt);
            }
        });

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
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRpId)
                            .addComponent(txtRpName)
                            .addComponent(txtRpAge)
                            .addComponent(txtRpYoe, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtRpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRpDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtRpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpYoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpDoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnAdd)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //boolean isValid = Validation();
        //if (isValid) {
            String repId = txtRpId.getText();
            String rpDoj = txtRpDoj.getText();
            String rpName = txtRpName.getText();
            int rpAge = Integer.parseInt(txtRpAge.getText());
            int rpYoe = Integer.parseInt(txtRpYoe.getText());
            String rpGender = txtRpGender.getText();
            //String rpDoj = txtRpDoj.getText();
            String rpEmail = txtRpEmail.getText();

            Reporter rp = newReporterData.addReporter();
            
            rp.setReporterId(repId);
            rp.setReporterName(rpName);
            rp.setReporterAge(rpAge);
            rp.setReporterDateOfJoining(rpDoj);
            rp.setReporterEmail(rpEmail);
            rp.setReporterGender(rpGender);
            rp.setReporterYearsOfExperience(rpYoe);

            JOptionPane.showMessageDialog(this, "Reporter Information Saved");
            //}
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtRpDojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpDojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpDojActionPerformed

    private void txtRpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpNameActionPerformed

    private void txtRpAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpAgeActionPerformed

    private void txtRpYoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpYoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpYoeActionPerformed

    private void txtRpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpGenderActionPerformed

    private void txtRpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbDocId;
    private javax.swing.JLabel lbDocName;
    private javax.swing.JLabel lbDocPhone;
    private javax.swing.JLabel lbHospId;
    private javax.swing.JLabel lbHospName;
    private javax.swing.JLabel lbHospName14;
    private javax.swing.JLabel lbHospName15;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtRpAge;
    private javax.swing.JTextField txtRpDoj;
    private javax.swing.JTextField txtRpEmail;
    private javax.swing.JTextField txtRpGender;
    private javax.swing.JTextField txtRpId;
    private javax.swing.JTextField txtRpName;
    private javax.swing.JTextField txtRpYoe;
    // End of variables declaration//GEN-END:variables
}
