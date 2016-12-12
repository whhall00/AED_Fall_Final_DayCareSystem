/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TeacherRole;

import business.CourseOffering.CourseOffering;
import business.Customer.Child;
import business.Person.Employee.Teacher;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chau_
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewDetailsJPanel
     */
    
    private JPanel userProcessContainer;
    private CourseOffering co;
    
    public ViewDetailsJPanel(JPanel userProcessContainer, CourseOffering co) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.co = co;
        populateTable();
    }

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTableChildren.getModel();
        model.setRowCount(0);
        for (Child child : co.getChildInClass())
        {
            Object[] row = new Object[3];
            row[0] = child;
            row[1] = child.getGender();
            row[2] = child.getAge();

            model.addRow(row);
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
        jTableChildren = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonViewDetails = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        jTableChildren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child Name", "Gender", "Age"
            }
        ));
        jScrollPane1.setViewportView(jTableChildren);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel1.setText("View Course Details");

        jButtonViewDetails.setText("View Details");
        jButtonViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewDetailsActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonViewDetails)
                        .addGap(148, 148, 148))))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButtonBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TeacherWorkAreaJPanel viewscheduleJPanel = (TeacherWorkAreaJPanel) component;
        viewscheduleJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableChildren.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        else
        {
            Child c = (Child) jTableChildren.getValueAt(selectedRow, 0);
            ViewChildrenDetailsJPanel viewChildrenDetailsJPanel = new ViewChildrenDetailsJPanel(userProcessContainer, c);
            userProcessContainer.add("ViewChildrenDetailsJPanel", viewChildrenDetailsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButtonViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableChildren;
    // End of variables declaration//GEN-END:variables
}
