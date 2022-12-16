/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ForensicsModel;

import ForensicsModel.Encounter1;
import ForensicsModel.encounterHistory;
import ForensicsModel.vitalSHistory;
import ForensicsModel.vitalSigns;
import javax.swing.JOptionPane;


public class CreateEncounterJPanel extends javax.swing.JPanel {

    encounterHistory encHistory;
    vitalSHistory vsHistory;
    public CreateEncounterJPanel(encounterHistory encHistory, vitalSHistory vsHistory ) {
        initComponents();
        
        this.encHistory = encHistory;
        this.vsHistory = vsHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRepId = new javax.swing.JLabel();
        txtRepId = new javax.swing.JTextField();
        lbDocId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lbDocId1 = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        txtHospId = new javax.swing.JTextField();
        PatName = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        txtPatName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lbHospId1 = new javax.swing.JLabel();
        lbBloodGroup = new javax.swing.JLabel();
        txtHospName = new javax.swing.JTextField();
        txtDocId = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        PatId = new javax.swing.JLabel();
        lbPulserate = new javax.swing.JLabel();
        txtPatId = new javax.swing.JTextField();
        txtPulserate = new javax.swing.JTextField();
        lbHospId = new javax.swing.JLabel();
        lbStrangleMarks = new javax.swing.JLabel();
        txtIncisions = new javax.swing.JTextField();
        txtStrangleMarks = new javax.swing.JTextField();
        lbTitle1 = new javax.swing.JLabel();
        lbIncisions = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbMissingOrgans = new javax.swing.JLabel();
        txtMissingOrgans = new javax.swing.JTextField();
        lbStabs = new javax.swing.JLabel();
        txtStabs = new javax.swing.JTextField();
        lbHits = new javax.swing.JLabel();
        txtHits = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 0, 0));

        lbRepId.setForeground(new java.awt.Color(255, 255, 255));
        lbRepId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRepId.setText("Report Id");

        lbDocId.setForeground(new java.awt.Color(255, 255, 255));
        lbDocId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId.setText("Doctor Id");

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setText("Save ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbDocId1.setForeground(new java.awt.Color(255, 255, 255));
        lbDocId1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId1.setText("Doctor Name");

        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        txtHospId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospIdActionPerformed(evt);
            }
        });

        PatName.setForeground(new java.awt.Color(255, 255, 255));
        PatName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PatName.setText("Patient Name");

        lbDate.setForeground(new java.awt.Color(255, 255, 255));
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDate.setText("Date");

        txtPatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatNameActionPerformed(evt);
            }
        });

        lbHospId1.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId1.setText("Hospital Name");

        lbBloodGroup.setForeground(new java.awt.Color(255, 255, 255));
        lbBloodGroup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBloodGroup.setText("Blood Group");

        txtHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospNameActionPerformed(evt);
            }
        });

        txtDocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIdActionPerformed(evt);
            }
        });

        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });

        PatId.setForeground(new java.awt.Color(255, 255, 255));
        PatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PatId.setText("Patient Id");

        lbPulserate.setForeground(new java.awt.Color(255, 255, 255));
        lbPulserate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPulserate.setText("Pulse Rate");

        txtPatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatIdActionPerformed(evt);
            }
        });

        txtPulserate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulserateActionPerformed(evt);
            }
        });

        lbHospId.setForeground(new java.awt.Color(255, 255, 255));
        lbHospId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId.setText("Hospital Id");

        lbStrangleMarks.setForeground(new java.awt.Color(255, 255, 255));
        lbStrangleMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStrangleMarks.setText("Strangle Marks");

        txtIncisions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncisionsActionPerformed(evt);
            }
        });

        txtStrangleMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStrangleMarksActionPerformed(evt);
            }
        });

        lbTitle1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle1.setText("Vital Signs Form");

        lbIncisions.setForeground(new java.awt.Color(255, 255, 255));
        lbIncisions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIncisions.setText("Incisions");

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Encounter Form");

        lbMissingOrgans.setForeground(new java.awt.Color(255, 255, 255));
        lbMissingOrgans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMissingOrgans.setText("MIssing Organs");

        txtMissingOrgans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMissingOrgansActionPerformed(evt);
            }
        });

        lbStabs.setForeground(new java.awt.Color(255, 255, 255));
        lbStabs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStabs.setText("Stabs");

        txtStabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStabsActionPerformed(evt);
            }
        });

        lbHits.setForeground(new java.awt.Color(255, 255, 255));
        lbHits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHits.setText("Hits");

        txtHits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHitsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHospId1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospName)
                                    .addComponent(txtDate)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbRepId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDocId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PatId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDocId1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRepId)
                                        .addComponent(txtDocId)
                                        .addComponent(txtPatId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PatName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbMissingOrgans, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(lbStabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStabs, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMissingOrgans, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbIncisions, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbHits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(6, 6, 6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIncisions, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHits, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbStrangleMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPulserate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPulserate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStrangleMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(167, 167, 167))))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRepId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocId1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospId1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPulserate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulserate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStrangleMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStrangleMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMissingOrgans, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMissingOrgans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStabs, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHits, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIncisions, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIncisions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
            
        int reportId = Integer.parseInt(txtRepId.getText());
        int docId = Integer.parseInt(txtDocId.getText());
        String docName = txtDocName.getText();
        int patId = Integer.parseInt(txtPatId.getText());
        String patName = txtPatName.getText();
        int hospId = Integer.parseInt(txtHospId.getText());
        String hospName = txtHospName.getText();
        String date = txtDate.getText();
        String bloodGroup = txtBloodGroup.getText();
        int pulseRate = Integer.parseInt(txtPulserate.getText());
        String strangleMarks = txtStrangleMarks.getText();
        String missingOrgans = txtMissingOrgans.getText();
        int stabs = Integer.parseInt(txtStabs.getText());
        int hits = Integer.parseInt(txtHits.getText());
        int incisions = Integer.parseInt(txtIncisions.getText());

        vitalSigns v = vsHistory.addNewVs();
        Encounter1 e = encHistory.addNewEncounter();

        e.setRepId(reportId);
        e.setDocId(docId);
        e.setDocName(docName);
        e.setPatId(patId);
        e.setPatName(patName);
        e.setHospId(hospId);
        e.setHospName(hospName);
        e.setDate(date);

        v.setBloodGroup(bloodGroup);
        v.setPulseRate(pulseRate);
        v.setStrangleMarks(strangleMarks);
        v.setMissingOrgans(missingOrgans);
        v.setStabs(stabs);
        v.setHits(hits);
        v.setIncisions(incisions);

        JOptionPane.showMessageDialog(this, "New Vital Signs are added.");

        txtRepId.setText("");
        txtDocId.setText("");
        txtDocName.setText("");
        txtPatId.setText("");
        txtPatName.setText("");
        txtHospId.setText("");
        txtHospName.setText("");
        txtDate.setText("");
        txtBloodGroup.setText("");
        txtPulserate.setText("");
        txtStrangleMarks.setText("");
        txtIncisions.setText("");
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void txtHospIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospIdActionPerformed

    private void txtPatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatNameActionPerformed

    private void txtHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospNameActionPerformed

    private void txtDocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIdActionPerformed

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtPatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatIdActionPerformed

    private void txtPulserateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulserateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulserateActionPerformed

    private void txtIncisionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncisionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncisionsActionPerformed

    private void txtStrangleMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStrangleMarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStrangleMarksActionPerformed

    private void txtMissingOrgansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMissingOrgansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMissingOrgansActionPerformed

    private void txtStabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStabsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStabsActionPerformed

    private void txtHitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHitsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatId;
    private javax.swing.JLabel PatName;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbBloodGroup;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDocId;
    private javax.swing.JLabel lbDocId1;
    private javax.swing.JLabel lbHits;
    private javax.swing.JLabel lbHospId;
    private javax.swing.JLabel lbHospId1;
    private javax.swing.JLabel lbIncisions;
    private javax.swing.JLabel lbMissingOrgans;
    private javax.swing.JLabel lbPulserate;
    private javax.swing.JLabel lbRepId;
    private javax.swing.JLabel lbStabs;
    private javax.swing.JLabel lbStrangleMarks;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtHits;
    private javax.swing.JTextField txtHospId;
    private javax.swing.JTextField txtHospName;
    private javax.swing.JTextField txtIncisions;
    private javax.swing.JTextField txtMissingOrgans;
    private javax.swing.JTextField txtPatId;
    private javax.swing.JTextField txtPatName;
    private javax.swing.JTextField txtPulserate;
    private javax.swing.JTextField txtRepId;
    private javax.swing.JTextField txtStabs;
    private javax.swing.JTextField txtStrangleMarks;
    // End of variables declaration//GEN-END:variables

    private boolean Validation() {
        
        if (txtRepId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Report ID");
            return false;
        } else {
            if (txtRepId.getText().length() != 5) {
                JOptionPane.showMessageDialog(this, "Report ID should be only 5 digits");
                return false;
            }
        }
        try {
        Integer.parseInt(txtRepId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Id");
            
        }
        
        try {
        Integer.parseInt(txtDocId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Doctor Id");
            
        }
        

        if (txtDocId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Doctor ID");
            return false;
        } else {
            if (txtDocId.getText().length() != 3) {
                JOptionPane.showMessageDialog(this, "Doctor ID should be only 3 digits");
                return false;
            }
        }
        
        if (txtDocName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Doctor Name");
            return false;
        } else {
            if (!(txtDocName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Doctor Name");
                return false;
            }
        }
        
        if (txtPatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient ID");
            return false;
        } else {
            if (txtPatId.getText().length() != 4) {
                JOptionPane.showMessageDialog(this, "Patient ID should be only 4 digits");
                return false;
            }
        }
        
        try {
        Integer.parseInt(txtPatId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Patient Id");
            
        }
        
        
        if (txtPatName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Name");
            return false;
        } else {
            if (!(txtPatName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Patient Name");
                return false;
            }
        }
        
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
        
        if (txtDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Date");
            return false;
        } else {
            if (!(txtDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))) {
                JOptionPane.showMessageDialog(this, "Please enter Date Format mm/dd/yyyy");
                return false;
            }
        }
        
        if (txtBloodGroup.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Blood Group");
            return false;
        } else {
            if (!(txtBloodGroup.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Blood Group");
                return false;
            }
        }
                 
        try {
        Integer.parseInt(txtPulserate.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Pulse rate");
            
        }
        
        if (txtPulserate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Pulse rate");
            return false;
        }   
        
        if (txtStrangleMarks.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Strangle Marks");
            return false;
        } else {
            if (!(txtStrangleMarks.getText().matches("[a-zA-Z]*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Strangle Marks");
                return false;
            }
        }
        
        if (txtMissingOrgans.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Missing Organs");
            return false;
        } else {
            if (!(txtMissingOrgans.getText().matches("[a-zA-Z]*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Missing Organs");
                return false;
            }
        }
        
        try {
        Integer.parseInt(txtStabs.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Stabs");
            
        }
        
        if (txtStabs.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Stabs");
            return false;
        }
        
        try {
        Integer.parseInt(txtHits.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Hits");
            
        }
        
        if (txtHits.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Hits");
            return false;
        } 
        
        try {
        Integer.parseInt(txtIncisions.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Incisions");
            
        }
        
        if (txtIncisions.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Incisions");
            return false;
        } 
              
        return true;
    } 
}
