/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ResourceModel;

import ForensicsModel.*;


/**
 *
 * @author parth
 */
public class ResourceAdmin extends javax.swing.JPanel {
    
    Army army;
    Weapon weapon;
    TrainedAnimal tAnimal;
    Government gov;
    Prison prison;
    Jail jail;
    ArmyDirectory armyHistory;
    WeaponDirectory weaponHistory;
    TrainedAnimalDirectory animalHistory;
    GovDirectory govHistory;
    PrisonDirectory prisonHistory;
    JailDirectory jailHistory;
        
    public ResourceAdmin(Army army, Weapon weapon, TrainedAnimal tAnimal, Government gov, Prison prison, Jail jail,
                        ArmyDirectory armyHistory, WeaponDirectory weaponHistory, TrainedAnimalDirectory animalHistory,
                        GovDirectory govHistory, PrisonDirectory prisonHistory, JailDirectory jailHistory) {
        initComponents();
        this.army = army;
        this.weapon = weapon;
        this.tAnimal = tAnimal;
        this.gov = gov;
        this.prison = prison; 
        this.jail = jail;
        this.armyHistory = armyHistory;
        this.weaponHistory = weaponHistory;
        this.animalHistory = animalHistory;
        this.govHistory = govHistory;
        this.prisonHistory = prisonHistory; 
        this.jailHistory = jailHistory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResourceTab = new javax.swing.JTabbedPane();
        ArmyPanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        btnAddArmy = new javax.swing.JButton();
        btnManageArmy = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        TrainedAnimalPanel = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel8 = new javax.swing.JPanel();
        btnAddTAnimal = new javax.swing.JButton();
        btnManageTAnimal = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        WeaponPanel = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel10 = new javax.swing.JPanel();
        btnAddWeapon = new javax.swing.JButton();
        btnManageWeapon = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        GovernmentPanel = new javax.swing.JPanel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jPanel12 = new javax.swing.JPanel();
        btnAddGov = new javax.swing.JButton();
        btnManageGov = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        PrisonPanel = new javax.swing.JPanel();
        jSplitPane6 = new javax.swing.JSplitPane();
        jPanel14 = new javax.swing.JPanel();
        btnAddPrison = new javax.swing.JButton();
        btnManagePrison = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        JailPanel = new javax.swing.JPanel();
        jSplitPane7 = new javax.swing.JSplitPane();
        jPanel16 = new javax.swing.JPanel();
        btnAddJail = new javax.swing.JButton();
        btnManageJail = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        btnAddArmy.setBackground(new java.awt.Color(204, 204, 204));
        btnAddArmy.setText("Add");
        btnAddArmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArmyActionPerformed(evt);
            }
        });

        btnManageArmy.setBackground(new java.awt.Color(204, 204, 204));
        btnManageArmy.setText("Manage");
        btnManageArmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageArmyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddArmy)
                    .addComponent(btnManageArmy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddArmy)
                .addGap(44, 44, 44)
                .addComponent(btnManageArmy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(858, 600));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel7);

        javax.swing.GroupLayout ArmyPanelLayout = new javax.swing.GroupLayout(ArmyPanel);
        ArmyPanel.setLayout(ArmyPanelLayout);
        ArmyPanelLayout.setHorizontalGroup(
            ArmyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ArmyPanelLayout.setVerticalGroup(
            ArmyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        ResourceTab.addTab("Army Admin", ArmyPanel);

        jPanel8.setBackground(new java.awt.Color(0, 204, 255));

        btnAddTAnimal.setBackground(new java.awt.Color(204, 204, 204));
        btnAddTAnimal.setText("Add");
        btnAddTAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTAnimalActionPerformed(evt);
            }
        });

        btnManageTAnimal.setBackground(new java.awt.Color(204, 204, 204));
        btnManageTAnimal.setText("Manage");
        btnManageTAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddTAnimal)
                    .addComponent(btnManageTAnimal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddTAnimal)
                .addGap(44, 44, 44)
                .addComponent(btnManageTAnimal)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jSplitPane3.setLeftComponent(jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jSplitPane3.setRightComponent(jPanel9);

        javax.swing.GroupLayout TrainedAnimalPanelLayout = new javax.swing.GroupLayout(TrainedAnimalPanel);
        TrainedAnimalPanel.setLayout(TrainedAnimalPanelLayout);
        TrainedAnimalPanelLayout.setHorizontalGroup(
            TrainedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        TrainedAnimalPanelLayout.setVerticalGroup(
            TrainedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        ResourceTab.addTab("Trained Animal Admin", TrainedAnimalPanel);

        jPanel10.setBackground(new java.awt.Color(0, 204, 255));

        btnAddWeapon.setBackground(new java.awt.Color(204, 204, 204));
        btnAddWeapon.setText("Add");
        btnAddWeapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWeaponActionPerformed(evt);
            }
        });

        btnManageWeapon.setBackground(new java.awt.Color(204, 204, 204));
        btnManageWeapon.setText("Manage");
        btnManageWeapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWeaponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddWeapon)
                    .addComponent(btnManageWeapon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddWeapon)
                .addGap(44, 44, 44)
                .addComponent(btnManageWeapon)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jSplitPane4.setRightComponent(jPanel11);

        javax.swing.GroupLayout WeaponPanelLayout = new javax.swing.GroupLayout(WeaponPanel);
        WeaponPanel.setLayout(WeaponPanelLayout);
        WeaponPanelLayout.setHorizontalGroup(
            WeaponPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
        WeaponPanelLayout.setVerticalGroup(
            WeaponPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WeaponPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane4))
        );

        ResourceTab.addTab("Weapon Admin", WeaponPanel);

        jPanel12.setBackground(new java.awt.Color(0, 204, 255));

        btnAddGov.setBackground(new java.awt.Color(204, 204, 204));
        btnAddGov.setText("Add");
        btnAddGov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGovActionPerformed(evt);
            }
        });

        btnManageGov.setBackground(new java.awt.Color(204, 204, 204));
        btnManageGov.setText("Manage");
        btnManageGov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageGovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddGov)
                    .addComponent(btnManageGov))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddGov)
                .addGap(44, 44, 44)
                .addComponent(btnManageGov)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jSplitPane5.setLeftComponent(jPanel12);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jSplitPane5.setRightComponent(jPanel13);

        javax.swing.GroupLayout GovernmentPanelLayout = new javax.swing.GroupLayout(GovernmentPanel);
        GovernmentPanel.setLayout(GovernmentPanelLayout);
        GovernmentPanelLayout.setHorizontalGroup(
            GovernmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5)
        );
        GovernmentPanelLayout.setVerticalGroup(
            GovernmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GovernmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane5))
        );

        ResourceTab.addTab("Government Admin", GovernmentPanel);

        jPanel14.setBackground(new java.awt.Color(0, 204, 255));

        btnAddPrison.setBackground(new java.awt.Color(204, 204, 204));
        btnAddPrison.setText("Add");
        btnAddPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPrisonActionPerformed(evt);
            }
        });

        btnManagePrison.setBackground(new java.awt.Color(204, 204, 204));
        btnManagePrison.setText("Manage");
        btnManagePrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePrisonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPrison)
                    .addComponent(btnManagePrison))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddPrison)
                .addGap(44, 44, 44)
                .addComponent(btnManagePrison)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jSplitPane6.setLeftComponent(jPanel14);

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jSplitPane6.setRightComponent(jPanel15);

        javax.swing.GroupLayout PrisonPanelLayout = new javax.swing.GroupLayout(PrisonPanel);
        PrisonPanel.setLayout(PrisonPanelLayout);
        PrisonPanelLayout.setHorizontalGroup(
            PrisonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane6)
        );
        PrisonPanelLayout.setVerticalGroup(
            PrisonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrisonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane6))
        );

        ResourceTab.addTab("Prison Admin", PrisonPanel);

        jPanel16.setBackground(new java.awt.Color(0, 204, 255));

        btnAddJail.setBackground(new java.awt.Color(204, 204, 204));
        btnAddJail.setText("Add");
        btnAddJail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJailActionPerformed(evt);
            }
        });

        btnManageJail.setBackground(new java.awt.Color(204, 204, 204));
        btnManageJail.setText("Manage");
        btnManageJail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageJailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddJail)
                    .addComponent(btnManageJail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnAddJail)
                .addGap(44, 44, 44)
                .addComponent(btnManageJail)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jSplitPane7.setLeftComponent(jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jSplitPane7.setRightComponent(jPanel17);

        javax.swing.GroupLayout JailPanelLayout = new javax.swing.GroupLayout(JailPanel);
        JailPanel.setLayout(JailPanelLayout);
        JailPanelLayout.setHorizontalGroup(
            JailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane7)
        );
        JailPanelLayout.setVerticalGroup(
            JailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane7))
        );

        ResourceTab.addTab("Jail Admin", JailPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResourceTab))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ResourceTab)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddArmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArmyActionPerformed
        // TODO add your handling code here:
        CreateArmy createArmy = new CreateArmy(armyHistory);
        jSplitPane2.setRightComponent(createArmy);
    }//GEN-LAST:event_btnAddArmyActionPerformed

    private void btnManageArmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageArmyActionPerformed
        // TODO add your handling code here:
        ReadArmy readArmy = new ReadArmy(armyHistory);
        jSplitPane4.setRightComponent(readArmy);
    }//GEN-LAST:event_btnManageArmyActionPerformed

    private void btnAddTAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTAnimalActionPerformed
        // TODO add your handling code here:
        CreateTrainedAnimal createAnimal = new CreateTrainedAnimal(animalHistory);
        jSplitPane3.setRightComponent(createAnimal);
    }//GEN-LAST:event_btnAddTAnimalActionPerformed

    private void btnManageTAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTAnimalActionPerformed
        // TODO add your handling code here:
        ReadTrainedAnimal readAnimal = new ReadTrainedAnimal(animalHistory);
        jSplitPane3.setRightComponent(readAnimal);
    }//GEN-LAST:event_btnManageTAnimalActionPerformed

    private void btnAddWeaponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWeaponActionPerformed
        // TODO add your handling code here:
        CreateWeapon createWeapon = new CreateWeapon(weaponHistory);
        jSplitPane4.setRightComponent(createWeapon);
    }//GEN-LAST:event_btnAddWeaponActionPerformed

    private void btnManageWeaponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWeaponActionPerformed
        // TODO add your handling code here:
        ReadWeapon readWeapon = new ReadWeapon(weaponHistory);
        jSplitPane4.setRightComponent(readWeapon);
    }//GEN-LAST:event_btnManageWeaponActionPerformed

    private void btnAddGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGovActionPerformed
        // TODO add your handling code here:
        CreateGov createGov = new CreateGov(govHistory);
        jSplitPane5.setRightComponent(createGov);
    }//GEN-LAST:event_btnAddGovActionPerformed

    private void btnManageGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageGovActionPerformed
        // TODO add your handling code here:
        ReadGov readGov = new ReadGov(govHistory);
        jSplitPane5.setRightComponent(readGov);
    }//GEN-LAST:event_btnManageGovActionPerformed

    private void btnAddPrisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPrisonActionPerformed
        // TODO add your handling code here:
        CreatePrison createPrison = new CreatePrison(prisonHistory);
        jSplitPane6.setRightComponent(createPrison);
    }//GEN-LAST:event_btnAddPrisonActionPerformed

    private void btnManagePrisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePrisonActionPerformed
        // TODO add your handling code here:
        ReadPrison readPrison = new ReadPrison(prisonHistory);
        jSplitPane6.setRightComponent(readPrison);
    }//GEN-LAST:event_btnManagePrisonActionPerformed

    private void btnAddJailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJailActionPerformed
        // TODO add your handling code here:
        CreateJail createJail = new CreateJail(jailHistory);
        jSplitPane7.setRightComponent(createJail);
    }//GEN-LAST:event_btnAddJailActionPerformed

    private void btnManageJailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageJailActionPerformed
        // TODO add your handling code here:
        ReadJail readJail = new ReadJail(jailHistory);
        jSplitPane7.setRightComponent(readJail);
    }//GEN-LAST:event_btnManageJailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArmyPanel;
    private javax.swing.JPanel GovernmentPanel;
    private javax.swing.JPanel JailPanel;
    private javax.swing.JPanel PrisonPanel;
    private javax.swing.JTabbedPane ResourceTab;
    private javax.swing.JPanel TrainedAnimalPanel;
    private javax.swing.JPanel WeaponPanel;
    private javax.swing.JButton btnAddArmy;
    private javax.swing.JButton btnAddGov;
    private javax.swing.JButton btnAddJail;
    private javax.swing.JButton btnAddPrison;
    private javax.swing.JButton btnAddTAnimal;
    private javax.swing.JButton btnAddWeapon;
    private javax.swing.JButton btnManageArmy;
    private javax.swing.JButton btnManageGov;
    private javax.swing.JButton btnManageJail;
    private javax.swing.JButton btnManagePrison;
    private javax.swing.JButton btnManageTAnimal;
    private javax.swing.JButton btnManageWeapon;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    // End of variables declaration//GEN-END:variables
}
