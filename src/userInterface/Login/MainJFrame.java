/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Login;

import business.Business.EcoSystem;
import business.DB4OUtil.DB4OUtil;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import userInterface.Register.RegisterUserAccount;
import userInterface.Register.RegisterWorkAreaJPanel;


/**
 *
 * @author Chau_
 */
public class MainJFrame extends javax.swing.JFrame {
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form MainJFrame
     */
    
    public MainJFrame() {
        initComponents();
        setSize(1500,900);
        system = dB4OUtil.retrieveSystem();
        this.setTitle("      Day Care Eco-system");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSplitPane = new javax.swing.JSplitPane();
        loginJPanel = new javax.swing.JPanel();
        userJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        regesterJButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainSplitPane.setDividerLocation(200);

        userJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userJLabel.setText("User Name");

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        loginJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        regesterJButton.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        regesterJButton.setText("Register");
        regesterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regesterJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(userJLabel))
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(passwordLabel)))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameJTextField)
                            .addComponent(passwordField))))
                .addContainerGap())
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regesterJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(userJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(regesterJButton)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        mainSplitPane.setLeftComponent(loginJPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        mainSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(mainSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                        if (userAccount == null) {
                            //Step3: Check against each organization inside that enterprise

                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                                userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganization = organization;
                                    break;
                                }
                            }
                        } else {
                            inEnterprise = enterprise;
                            break;
                        }
                        if (inOrganization != null) {
                            break;
                        }
                        
                        if (inEnterprise != null) {
                            break;
                        }
                    }
                } else {
                    break;
                }                
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("workArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }
        
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        regesterJButton.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        regesterJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void regesterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regesterJButtonActionPerformed
        // TODO add your handling code here:
        RegisterWorkAreaJPanel registerUserAccount = new RegisterWorkAreaJPanel(userProcessContainer, system); 
        userProcessContainer.add("RegisterWorkAreaJPanel", registerUserAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        regesterJButton.setEnabled(false);
    }//GEN-LAST:event_regesterJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    try
    {
        UIManager.put("RootPane.setupButtonVisible", false);
        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
    }catch(Exception e){}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginJButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton regesterJButton;
    private javax.swing.JLabel userJLabel;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
