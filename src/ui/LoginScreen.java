/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import ForensicsModel.ForensicMainJPanel;
import ForensicsModel.DoctorJViewJPanel;
import NewsModel.NewsMainJPanel;
import ResourceModel.ResourceMainJPanel;
import crime_branch_enterprise.model.CrimeBranchMainJPanel;
import crime_branch_enterprise.model.DatabaseConnection_adminUser;
import crime_branch_enterprise.model.OfficerJViewJPanel;
import crime_branch_enterprise.model.VictimViewJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Sys;
import model.User;
import model.UserDirectory;

/**
 *
 * @author 
 */
public class LoginScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    Sys sys;
    HomeScreen homescreen;
    
    
    //Flag for setting color on username & password
    boolean uFlag = true;
    boolean pFlag = true;
    
    DatabaseConnection_adminUser dbConnAdminUser;
    
    String roleCategory = "";
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = Color.RED;
        Color color2 = Color.BLACK;
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
    
    /**
     * Creates new form LoginScreen
     */
    public LoginScreen(JPanel mainWorkArea, Sys sys, HomeScreen homescreen) {
        initComponents();
        
        this.mainWorkArea = mainWorkArea;
        this.sys = sys;
        
        dbConnAdminUser = new DatabaseConnection_adminUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoginGrid = new javax.swing.JPanel();
        lblLoginText = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLoginText1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));

        lblLoginGrid.setBackground(new java.awt.Color(153, 0, 0));
        lblLoginGrid.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        lblLoginText.setBackground(new java.awt.Color(255, 255, 255));
        lblLoginText.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        lblLoginText.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginText.setText("Crime Investigation Reporting");

        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(102, 0, 0));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/username.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/pass.png"))); // NOI18N

        lblLoginText1.setBackground(new java.awt.Color(255, 255, 255));
        lblLoginText1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblLoginText1.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginText1.setText("Login to your account");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/BlissfulOrdinaryBluebottle-size_restricted.gif"))); // NOI18N

        javax.swing.GroupLayout lblLoginGridLayout = new javax.swing.GroupLayout(lblLoginGrid);
        lblLoginGrid.setLayout(lblLoginGridLayout);
        lblLoginGridLayout.setHorizontalGroup(
            lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblLoginGridLayout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addComponent(lblLoginText)
                .addContainerGap(440, Short.MAX_VALUE))
            .addGroup(lblLoginGridLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lblLoginText1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lblLoginGridLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(lblLoginGridLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(lblLoginGridLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGroup(lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lblLoginGridLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lblLoginGridLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPassword))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblLoginGridLayout.setVerticalGroup(
            lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblLoginGridLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoginText1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblLoginGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/hacker-arrested.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoginGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoginGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        
        if(uFlag){
        txtUsername.setText("");
        txtUsername.setForeground(Color.BLACK);
        uFlag = false;
        }
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void setHomepage() {
       HomePanel hp = new HomePanel(mainWorkArea, sys, homescreen);
       HomeScreen hs = new HomeScreen(hp.getWorkArea(),sys,hp);//, officerDir);
       hp.getWorkArea().add("HomeScreen",hs);
       CardLayout layout = (CardLayout) hp.getWorkArea().getLayout();
       layout.next(hp.getWorkArea());
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        //setHomepage();
        String userId = txtUsername.getText();
        String role = validateOtherLoginDB();
        System.out.println(role);
        if(userId.equals("admin") || role != "")
        {
           
            //userId = txtUsername.getText();
            if(userId.equals("admin")) {
                 JPanel selectedPanel = new HomePanel(mainWorkArea,sys,homescreen);
                 mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            }
            else if (role.equals("Crime-Admin")) 
            {
                JPanel selectedPanel = new CrimeBranchMainJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            }
            else if (role.equals("For-Admin")) {
                JPanel selectedPanel = new ForensicMainJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            }
            else if (role.equals("Res-Admin")) 
            {
                JPanel selectedPanel = new ResourceMainJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
                
            } else if (role.equals("Med-Admin")) {
                JPanel selectedPanel = new NewsMainJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            } else if (role.equals("Crime-Victim")) {
                JPanel selectedPanel = new VictimViewJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            } else if (role.equals("Off-Admin")) {
                JPanel selectedPanel = new OfficerJViewJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            } else if (role.equals("For-DocAdmin")) {
                JPanel selectedPanel = new DoctorJViewJPanel(mainWorkArea,sys,homescreen);
                mainWorkArea.add("WorkAreaJPanel",selectedPanel);
            }

        }else {
            JOptionPane.showMessageDialog(this, "Invalid credentials");
            return;
        }
        
        //JPanel selectedPanel = new HomePanel(mainWorkArea,sys);
        
        //mainWorkArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
        if(pFlag){
        txtPassword.setEchoChar('*');
        //txtUsername.setForeground(Color.BLACK);
        pFlag = false;
        }
        
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed
    
    public boolean validateLogin(){
        
        //Get on-screen values
        String userId = txtUsername.getText();
        String pass = txtPassword.getText();
        
        //Custom check
        try{
            String sysPass = sys.getUserDir().getUserByUsername(userId).getPassword();
            return sysPass.equals(pass);
        }catch(java.lang.NullPointerException e){
            return false;
        }
        
    }
    
    public boolean validateOtherLogin(){
        
        //Get on-screen values
        String userId = txtUsername.getText();
        String pass = txtPassword.getText();
        String username;
        String password;
        
        //Custom check
        try{
            for(User user : UserDirectory.userDir)
            {
                if(user.getUsername().equals(userId) 
                        && user.getPassword().equals(pass))
                {
                    return true;
                }    
            }
            return false;
        }catch(java.lang.NullPointerException e){
            return false;
        }
        
    }
    
    public String validateOtherLoginDB()
    {
        
        //Get on-screen values
        String userId = txtUsername.getText();
        String pass = txtPassword.getText();
        
        //Custom check
        try{
            dbConnAdminUser = new DatabaseConnection_adminUser();
            roleCategory = dbConnAdminUser.populateEveryAdminDataInLoginScreen(userId, pass);
            
        }catch(java.lang.NullPointerException e){
            e.printStackTrace();
        }
        
        return roleCategory;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel lblLoginGrid;
    private javax.swing.JLabel lblLoginText;
    private javax.swing.JLabel lblLoginText1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateRoleCombo() {
        
      

    }

    public void populateSupplierCombo() {
       
     
       
    }
    
    public void clearLoginFields(){
        
        txtPassword.setText("");
        txtUsername.setText("");
        
    }

    

}
