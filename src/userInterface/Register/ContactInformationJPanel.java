/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Register;

import business.Customer.Parents;
import business.Enterprise.Enterprise;
import business.Person.Address;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lemon_Tyd
 */
public class ContactInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContactInformationJPanel
     */
    private JPanel userProcessContainer;
//    private EcoSystem system;
//    private UserAccount ua;
    private Parents parents;
    private Enterprise enterprise;

    ContactInformationJPanel(JPanel userProcessContainer, Enterprise enterprise, Parents parents) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
//        this.system = system;
//        this.ua = ua;
        this.parents = parents;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        AddressStreetLine1TxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AddressStreetLine2TxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CityTxtField = new javax.swing.JTextField();
        StateTxtField = new javax.swing.JTextField();
        ZipCodeTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Address Street Line 1:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));
        add(AddressStreetLine1TxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 140, -1));

        jLabel7.setText("Address Street Line 2 (Optional):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));
        add(AddressStreetLine2TxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 140, -1));

        jLabel8.setText("City:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel9.setText("State:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jLabel10.setText("Zip Code:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));
        add(CityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 140, -1));
        add(StateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 140, -1));
        add(ZipCodeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Contact Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        jButtonNext.setText("Next: Children Information");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, -1, -1));

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        Address address = new Address();
        address.setStreetLine1(AddressStreetLine1TxtField.getText());
        address.setStreetLine2(AddressStreetLine2TxtField.getText());
        address.setCity(CityTxtField.getText());
        address.setState(StateTxtField.getText());
        address.setZipCode(Integer.parseInt(ZipCodeTxtField.getText()));
        parents.setAddress(address);
        
        JOptionPane.showMessageDialog(null, "Contact Information Successfully Saved!");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        ChildrenRegistrationJPanel childrenRegistrationJPanel = new ChildrenRegistrationJPanel(userProcessContainer, enterprise, parents); 
        userProcessContainer.add("ChildrenRegistrationJPanel", childrenRegistrationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressStreetLine1TxtField;
    private javax.swing.JTextField AddressStreetLine2TxtField;
    private javax.swing.JTextField CityTxtField;
    private javax.swing.JTextField StateTxtField;
    private javax.swing.JTextField ZipCodeTxtField;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
