/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Restaurant;

import business.Enterprise.RestaurantEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Chau_
 */
public class UpdateBasicInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form updateBasicInformationJPanel
     */
    private RestaurantEnterprise restaurantEnterprise;
    private JPanel userProcessContainer;
    public UpdateBasicInformationJPanel(JPanel userProcessContainer,RestaurantEnterprise restaurantEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurantEnterprise = restaurantEnterprise;
        nameTextField.setText(restaurantEnterprise.getName());
        contactInformationTextField.setText(restaurantEnterprise.getContactInformation());
        addressTextField.setText(restaurantEnterprise.getAddress());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headLineJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactInformationJLabel = new javax.swing.JLabel();
        contactInformationTextField = new javax.swing.JTextField();
        addressJLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jButton_Update = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        headLineJLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headLineJLabel.setText("Basic Information");

        nameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJLabel.setText("Name:");

        nameTextField.setEditable(false);

        contactInformationJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactInformationJLabel.setText("Contact Information:");

        contactInformationTextField.setEditable(false);

        addressJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addressJLabel.setText("Address Information:");

        addressTextField.setEditable(false);

        jButton_Update.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Save.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Save.setText("Save");
        jButton_Save.setEnabled(false);
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Back.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Back.setText("<<Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contactInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addressTextField)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactInformationTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jButton_Back)
                            .addGap(128, 128, 128)
                            .addComponent(jButton_Update)
                            .addGap(139, 139, 139)
                            .addComponent(jButton_Save))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(headLineJLabel))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(headLineJLabel)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(contactInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(addressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contactInformationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Back)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Save))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RestaurantManagerWorkArea manageProductCatalogJPanel = (RestaurantManagerWorkArea) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        nameTextField.setEditable(true);
        contactInformationTextField.setEditable(true);
        addressTextField.setEditable(true);
        jButton_Save.setEnabled(true);
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
        restaurantEnterprise.setAddress(addressTextField.getText());
        restaurantEnterprise.setContactInformation(contactInformationTextField.getText());
        restaurantEnterprise.setName(nameTextField.getText());
        jButton_Save.setEnabled(false);
    }//GEN-LAST:event_jButton_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel contactInformationJLabel;
    private javax.swing.JTextField contactInformationTextField;
    private javax.swing.JLabel headLineJLabel;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
