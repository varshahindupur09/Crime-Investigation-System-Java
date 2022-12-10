/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package NewsModel;
import NewsModel.Author;
import NewsModel.AuthorHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Sal <your.name at your.org>
 */
public class CreateAuthorJPanel extends javax.swing.JPanel {

    AuthorHistory newAuthorData;
    /**
     * Creates new form CreateAuthorJPanel
     */
    public CreateAuthorJPanel(AuthorHistory auth) {
        initComponents();
        newAuthorData = auth;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAuthAge = new javax.swing.JTextField();
        lbHospName = new javax.swing.JLabel();
        txtAuthGender = new javax.swing.JTextField();
        lbHospId = new javax.swing.JLabel();
        txtAuthYoe = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lbDocId = new javax.swing.JLabel();
        txtAuthId = new javax.swing.JTextField();
        lbDocName = new javax.swing.JLabel();
        txtAuthName = new javax.swing.JTextField();
        lbDocPhone = new javax.swing.JLabel();
        lbHospName1 = new javax.swing.JLabel();
        txtAuthDoj = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 51));

        txtAuthAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthAgeActionPerformed(evt);
            }
        });

        lbHospName.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName.setText("Gender");

        txtAuthGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthGenderActionPerformed(evt);
            }
        });

        lbHospId.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId.setText("Years Of Experience");

        txtAuthYoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthYoeActionPerformed(evt);
            }
        });

        lbTitle.setBackground(new java.awt.Color(0, 204, 255));
        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("AUTHOR Form");

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add Author");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbDocId.setForeground(new java.awt.Color(255, 255, 255));
        lbDocId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId.setText(" Id");

        lbDocName.setForeground(new java.awt.Color(255, 255, 255));
        lbDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocName.setText("Name");

        txtAuthName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthNameActionPerformed(evt);
            }
        });

        lbDocPhone.setForeground(new java.awt.Color(255, 255, 255));
        lbDocPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocPhone.setText("Age");

        lbHospName1.setForeground(new java.awt.Color(255, 255, 255));
        lbHospName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName1.setText("Date of Joining");

        txtAuthDoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthDojActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAuthId)
                            .addComponent(txtAuthName)
                            .addComponent(txtAuthAge)
                            .addComponent(txtAuthYoe, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtAuthGender, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtAuthDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthYoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthDoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnAdd)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAuthAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthAgeActionPerformed

    private void txtAuthGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthGenderActionPerformed

    private void txtAuthYoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthYoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthYoeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //boolean isValid = Validation();
        //if (isValid) {
            String authId = txtAuthId.getText();
            String authName = txtAuthName.getText();
            int authAge = Integer.parseInt(txtAuthAge.getText());
            int authYoe = Integer.parseInt(txtAuthYoe.getText());
            String authGender = txtAuthGender.getText();
            String authDoj = txtAuthDoj.getText();
            

            Author d = newAuthorData.addAuthor();

            d.setAuthorId(authId);
            d.setAuthorName(authName);
            d.setAuthorAge(authAge);
            d.setAuthorYearsOfExperience(authYoe);
            d.setAuthorGender(authGender);
            d.setAuthorDateOfJoining(authDoj);

            JOptionPane.showMessageDialog(this, "Author Information Saved");
        //}
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAuthNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthNameActionPerformed

    private void txtAuthDojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthDojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthDojActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbDocId;
    private javax.swing.JLabel lbDocName;
    private javax.swing.JLabel lbDocPhone;
    private javax.swing.JLabel lbHospId;
    private javax.swing.JLabel lbHospName;
    private javax.swing.JLabel lbHospName1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtAuthAge;
    private javax.swing.JTextField txtAuthDoj;
    private javax.swing.JTextField txtAuthGender;
    private javax.swing.JTextField txtAuthId;
    private javax.swing.JTextField txtAuthName;
    private javax.swing.JTextField txtAuthYoe;
    // End of variables declaration//GEN-END:variables
}
