/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Nutritionist;

import business.Business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.RestaurantWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chau_
 */
public class OrderFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderFoodJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;


    public OrderFoodJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
      initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.account = account;
        this.business = business;
        populatedJComBox();
    }

    public void populatedJComBox() {
        jComboBox_NetWorkArea.removeAll();
        for (Network network : business.getNetworkList()) {
            jComboBox_NetWorkArea.addItem(network);
        }
    }
    
        private void populateTable(Network network) {
        DefaultTableModel dtm = (DefaultTableModel) jTable_Restaurant.getModel();
        dtm.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Restaurant)) {
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getEnterpriseType();
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_hint = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextArea_Message = new javax.swing.JTextArea();
        jComboBox_NetWorkArea = new javax.swing.JComboBox();
        jScrollPane_hospital = new javax.swing.JScrollPane();
        jTable_Restaurant = new javax.swing.JTable();
        jButton_Back = new javax.swing.JButton();
        jButton_Send = new javax.swing.JButton();
        jLabel_Message = new javax.swing.JLabel();

        jLabel_hint.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_hint.setText("Choose  a Restaurant :");

        jTextArea_Message.setColumns(20);
        jTextArea_Message.setRows(5);
        jScrollPane.setViewportView(jTextArea_Message);

        jComboBox_NetWorkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NetWorkAreaActionPerformed(evt);
            }
        });

        jTable_Restaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Type"
            }
        ));
        jScrollPane_hospital.setViewportView(jTable_Restaurant);

        jButton_Back.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Back.setText("<<Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jButton_Send.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Send.setText("Send>>");
        jButton_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SendActionPerformed(evt);
            }
        });

        jLabel_Message.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Message.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_NetWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_hint)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton_Back)
                        .addGap(45, 45, 45)
                        .addComponent(jButton_Send))
                    .addComponent(jLabel_Message)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane_hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel_hint)
                .addGap(38, 38, 38)
                .addComponent(jComboBox_NetWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel_Message)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Send)
                    .addComponent(jButton_Back))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_NetWorkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NetWorkAreaActionPerformed
        // TODO add your handling code here:
        //JCombox一选，JTable直接出来所有hospital
        Network network = (Network)jComboBox_NetWorkArea.getSelectedItem();
        populateTable(network);
    }//GEN-LAST:event_jComboBox_NetWorkAreaActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NutritionistWorkArea NutritionistWorkAreaatalogJPanel = (NutritionistWorkArea) component;
        NutritionistWorkAreaatalogJPanel.populateChildrenTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SendActionPerformed

        String message = jTextArea_Message.getText();
        RestaurantWorkRequest request = new RestaurantWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");

        //添加到Nutritionist本身所属的DayCareCenter里面的Nutritionist origination里
        //查找相同network里面的，选中的hospitalEnterprise，放在他下面的workqueue里面
        //发送给相同network里面的hospital

        //        Organization org = null;
        int selectRow = jTable_Restaurant.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else
        {

            //        Enterprise enterprise = (Enterprise) jTable_DayCareTable.getValueAt(selectedRow, 0);
            //        RegisterUserAccount registerUserAccount = new RegisterUserAccount(userProcessContainer, enterprise);
            //

            RestaurantEnterprise restaurantEnterprise= (RestaurantEnterprise) jTable_Restaurant.getValueAt(selectRow, 0);
            //在所选定hospital和Nutritionist本身的useraccount里面都添加了这个request
            //在那边取得时候，在hospitalEnterprise里面找，
            restaurantEnterprise.getWorkQueue().getWorkRequestList().add(request);

            //返回的时候在这面找
            account.getWorkQueue().getWorkRequestList().add(request);

            JOptionPane.showMessageDialog(null, "Send Succeddful");
        }
        //        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            //            if (organization instanceof NutritionistOrganization){
                //                org = organization;
                //                break;
                //            }
            //        }
        //        if (org!=null){
            //            org.getWorkQueue().getWorkRequestList().add(request);
            //            account.getWorkQueue().getWorkRequestList().add(request);
            //        }

    }//GEN-LAST:event_jButton_SendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Send;
    private javax.swing.JComboBox jComboBox_NetWorkArea;
    private javax.swing.JLabel jLabel_Message;
    private javax.swing.JLabel jLabel_hint;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane_hospital;
    private javax.swing.JTable jTable_Restaurant;
    private javax.swing.JTextArea jTextArea_Message;
    // End of variables declaration//GEN-END:variables
}
