/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Restaurant;

import business.Enterprise.RestaurantEnterprise;
import business.Menu.Menu;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hao
 */
public class MenuInfoJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private RestaurantEnterprise enterprise;
    
    /**
     * Creates new form MenuInfoJPanel
     */
    public MenuInfoJPanel(JPanel userProcessContainer, RestaurantEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable_Menu.getModel();
        dtm.setRowCount(0);
        try {
            for(Menu menu : enterprise.getMenuDirectory().getMenus()){
            Object[] row = new Object[4];
            row[0] = menu;
            row[1] = menu.getStapleFood();
            row[2] = menu.getFruit();
            row[3] = menu.getTotalCalorie();
            dtm.addRow(row);
        }
        } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Menu = new javax.swing.JTable();
        jButton_AddMenu = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        jTable_Menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Menu);

        jButton_AddMenu.setText("Add Menu");
        jButton_AddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddMenuActionPerformed(evt);
            }
        });

        jButton_Update.setText("Detial And Update Menu");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Back.setText("Back");
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Back)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_AddMenu)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_Update)
                        .addGap(59, 59, 59)
                        .addComponent(jButton_Delete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddMenu)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jButton_Back)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_Menu.getSelectedRow();       
        if(selectedRow < 0 ){
            JOptionPane.showMessageDialog(null, "Please Select a Row First!");
            return;
        }else{
            Menu menu = (Menu) jTable_Menu.getValueAt(selectedRow, 0);
            UpdateMenuJPanel UpdateMenuJPanel= new UpdateMenuJPanel(userProcessContainer, menu);
            userProcessContainer.add("updateBasicInformationJPanel", UpdateMenuJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer); 
        }
        
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_Menu.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }else{
            int a = JOptionPane.showConfirmDialog(null, "Are You Sure Want To Delete This?", "Warning", JOptionPane.YES_NO_OPTION);
            if(a == JOptionPane.YES_OPTION){
                Menu menu = (Menu) jTable_Menu.getValueAt(selectedRow, 0);
                enterprise.getMenuDirectory().deleteMenu(menu);
                populateTable();
            }else{
                return;
            }
        } 
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_AddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddMenuActionPerformed
        // TODO add your handling code here:
        CreateMenuJPanel cmjp = new CreateMenuJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("updateBasicInformationJPanel", cmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton_AddMenuActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RestaurantManagerWorkArea sysAdminwjp = (RestaurantManagerWorkArea) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddMenu;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Menu;
    // End of variables declaration//GEN-END:variables
}
