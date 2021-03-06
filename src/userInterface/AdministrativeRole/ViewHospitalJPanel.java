/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.Enterprise.HospitalEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Chau_
 */
public class ViewHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalJPanel
     */
    private JPanel userProcessContainer;
    private HospitalEnterprise hospitalEnterprise;
    public ViewHospitalJPanel( JPanel userProcessContainer,HospitalEnterprise hospitalEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalEnterprise = hospitalEnterprise;
        
        hospitalNameJLabel.setText(hospitalEnterprise.getName());
//        doctorNameJLabel.setText(hospitalEnterprise.getDoctor().getFirstName()+hospitalEnterprise.getDoctor().getLastName());
        contactJLable.setText(hospitalEnterprise.getContactInformation());
        addressJLabel.setText(hospitalEnterprise.getAddress());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        headLineJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        hospitalNameJLabel = new javax.swing.JLabel();
        doctorJLabel = new javax.swing.JLabel();
        doctorNameJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        contactJLable = new javax.swing.JLabel();
        contactInformationJLabel = new javax.swing.JLabel();
        addressInformationJLabel = new javax.swing.JLabel();

        backButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        backButton.setText("<<back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        headLineJLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headLineJLabel.setText("Hospital Information");

        nameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJLabel.setText("Hospital Name：");

        hospitalNameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hospitalNameJLabel.setText("<name>");

        doctorJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        doctorJLabel.setText("Doctor Name:");

        doctorNameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        doctorNameJLabel.setText("<Doctor name>");

        addressJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addressJLabel.setText("Address:");

        contactJLable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactJLable.setText("Contact Information:");

        contactInformationJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactInformationJLabel.setText("<contact Information>");

        addressInformationJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addressInformationJLabel.setText("<Address>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(headLineJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(addressJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contactJLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contactInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(nameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hospitalNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(doctorJLabel)
                                .addGap(77, 77, 77)
                                .addComponent(doctorNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(headLineJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(hospitalNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactJLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageHospitalJPanel ManageHospitalJPanel = (ManageHospitalJPanel)component;  
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressInformationJLabel;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel contactInformationJLabel;
    private javax.swing.JLabel contactJLable;
    private javax.swing.JLabel doctorJLabel;
    private javax.swing.JLabel doctorNameJLabel;
    private javax.swing.JLabel headLineJLabel;
    private javax.swing.JLabel hospitalNameJLabel;
    private javax.swing.JLabel nameJLabel;
    // End of variables declaration//GEN-END:variables
}
