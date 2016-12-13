/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Restaurant;

import business.Enterprise.Enterprise;
import business.Enterprise.RestaurantEnterprise;
import business.UserAccount.UserAccount;
import business.WorkQueue.RestaurantWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chau_
 */
public class RestaurantManagerWorkArea extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount account;
    RestaurantEnterprise enterprise;
    /**
     * Creates new form RestaurantManagerWorkArea
     */
    public RestaurantManagerWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise =(RestaurantEnterprise)enterprise;
        nameJLabel.setText(enterprise.getName());
        populateTable();
    }

//public void populateTable(){
//        DefaultTableModel model = (DefaultTableModel)jTable_Order.getModel();
//        
//        model.setRowCount(0);
//        
//        for(WorkRequest request : .getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
//            
//            model.addRow(row);
//        }
//    }
    
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable_Order.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof RestaurantWorkRequest){
                Object[] row = new Object[4];
                row[0] = wr;
                row[1] = ((RestaurantWorkRequest) wr).getMenu();
                row[2] = wr.getMessage();
                row[3] = wr.getStatus();                 
                dtm.addRow(row);
            }
//            Object[] row = new Object[3];
//            row[0] = wr;
//            row[1] = wr.getMessage();
//            row[2] = wr.getStatus();
//            dtm.addRow(row);
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

        headLineJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        restaurantNameJLabel = new javax.swing.JLabel();
        jButton_updateBasicInformation = new javax.swing.JButton();
        jScrollPane_Order = new javax.swing.JScrollPane();
        jTable_Order = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton_MenuInfo = new javax.swing.JButton();
        jButton_Cook = new javax.swing.JButton();

        headLineJLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headLineJLabel.setText("Restaurant Manager WorkArea");

        nameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJLabel.setText("<Restaurant Name>");

        restaurantNameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        restaurantNameJLabel.setText("Restaurant Name:");

        jButton_updateBasicInformation.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_updateBasicInformation.setText("Update Basic Information");
        jButton_updateBasicInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateBasicInformationActionPerformed(evt);
            }
        });

        jTable_Order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Custoner Name", "Menu", "Message", "Staus"
            }
        ));
        jScrollPane_Order.setViewportView(jTable_Order);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Order Table:");

        jButton_MenuInfo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton_MenuInfo.setText("Menu Information");
        jButton_MenuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuInfoActionPerformed(evt);
            }
        });

        jButton_Cook.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Cook.setText("Cook It");
        jButton_Cook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(headLineJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_updateBasicInformation)
                                .addGap(32, 32, 32)
                                .addComponent(jButton_Cook, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_MenuInfo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(restaurantNameJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameJLabel)
                .addGap(374, 374, 374))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLineJLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restaurantNameJLabel)
                    .addComponent(nameJLabel))
                .addGap(121, 121, 121)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_updateBasicInformation)
                    .addComponent(jButton_Cook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_MenuInfo)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_updateBasicInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateBasicInformationActionPerformed
        // TODO add your handling code here:
        UpdateBasicInformationJPanel updateBasicInformationJPanel= new UpdateBasicInformationJPanel(userProcessContainer, enterprise); 
        userProcessContainer.add("updateBasicInformationJPanel", updateBasicInformationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);     
    }//GEN-LAST:event_jButton_updateBasicInformationActionPerformed

    private void jButton_MenuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuInfoActionPerformed
        // TODO add your handling code here:
        MenuInfoJPanel menuInfoJPanel = new MenuInfoJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("MenuInfoJPanel", menuInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_jButton_MenuInfoActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_CookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CookActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Ready to cook");
    }//GEN-LAST:event_jButton_CookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headLineJLabel;
    private javax.swing.JButton jButton_Cook;
    private javax.swing.JButton jButton_MenuInfo;
    private javax.swing.JButton jButton_updateBasicInformation;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane_Order;
    private javax.swing.JTable jTable_Order;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel restaurantNameJLabel;
    // End of variables declaration//GEN-END:variables
}
