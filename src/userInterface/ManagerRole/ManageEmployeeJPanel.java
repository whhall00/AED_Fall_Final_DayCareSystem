/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManagerRole;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import static business.Organization.Organization.DayCareOrganizationType.Teacher;
import business.Organization.OrganizationDirectory;
import business.Person.Employee.Nutritionist;
import business.Person.Employee.Teacher;
import business.Person.Person;
import business.Role.Role;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hao
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDirectory;
    private Enterprise enterprise;
    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        populateTable();
        populateOrganizationCombox();
    }
    private void populateOrganizationCombox(){
        organizationJComboBox.removeAllItems();    
        for(Organization.DayCareOrganizationType type : Organization.DayCareOrganizationType.values()){
            if(!type.getValue().equals(Organization.DayCareOrganizationType.Admin.getValue())){
                organizationJComboBox.addItem(type);
            }            
        }
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)organizationJTable.getModel();
        dtm.setRowCount(0);
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(Person p : organization.getPersonDirectory().getPersonList()){
                Object[] row = new Object[3];
            row[0] = p;
            row[1] = p.getId();
            row[2] = organization.getSupportedRole();
            dtm.addRow(row);
            
            }        
        }
    }
    private void populateOrganizationTable(Organization.DayCareOrganizationType type){
        DefaultTableModel dtm = (DefaultTableModel)organizationJTable.getModel();
        dtm.setRowCount(0);
        try {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if(organization.getDayCareOrganizationType().equals(type)){
                    for(Person p : organization.getPersonDirectory().getPersonList()){
                        Object[] row = new Object[2];
                        row[0] = p;
                        row[1] = p.getId();
                        dtm.addRow(row);
                    }                   
                }               
            }            
        } catch (Exception e) {
        }        
    }
    
    private void populatePersonTable(){
        DefaultTableModel dtm = (DefaultTableModel)organizationJTable.getModel();
        dtm.setRowCount(0);
        String s = organizationJComboBox.getSelectedItem().toString();
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(Person p : o.getPersonDirectory().getPersonList()){
                if(s.equals("Teacher")){
                    if(p instanceof Teacher){
                        Object[] row = new Object[2];
                        row[0] = p;
                        row[1] = p.getId();
                        dtm.addRow(row);
                    }
                }else if(s.equals("Nutritionist")){
                    if(p instanceof Nutritionist){
                        Object[] row = new Object[2];
                        row[0] = p;
                        row[1] = p.getId();
                        dtm.addRow(row);
                    }
                }
            }
        }
//        for(Person p : enterprise.getPersonDirectory().getPersonList()){
//            if(s.equals("Teacher")){
//                if(p instanceof Teacher){
//                    Object[] row = new Object[2];
//                        row[0] = p;
//                        row[1] = p.getId();
//                        dtm.addRow(row);
//                }
//            }else if(s.equals("Nutritionist")){
//                if(p instanceof Nutritionist){
//                    Object[] row = new Object[2];
//                        row[0] = p;
//                        row[1] = p.getId();
//                        dtm.addRow(row);
//                }
//            }
//        }
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
        organizationJTable = new javax.swing.JTable();
        JButton_AddEmployee = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton_ShowALl = new javax.swing.JButton();

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "ID", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        JButton_AddEmployee.setText("Add Employee");
        JButton_AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AddEmployeeActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_ShowALl.setText("Show All");
        jButton_ShowALl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowALlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jButton_ShowALl))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JButton_AddEmployee)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton_ShowALl))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_AddEmployee)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AddEmployeeActionPerformed
//        Organization.DayCareOrganizationType type = (Organization.DayCareOrganizationType) organizationJComboBox.getSelectedItem();
//        AddEmployeeJPanel addEmployeeJPanel = new AddEmployeeJPanel(userProcessContainer, enterprise);
//        userProcessContainer.add("AddEmployeeJPanel", addEmployeeJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
//        String name = nameJTextField.getText();
//
//        organization.getEmployeeDirectory().createEmployee(name);

    }//GEN-LAST:event_JButton_AddEmployeeActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization.DayCareOrganizationType type = (Organization.DayCareOrganizationType) organizationJComboBox.getSelectedItem();
        if (type != null){
//            populateOrganizationTable(type);
        populatePersonTable();
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton_ShowALlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowALlActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton_ShowALlActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Row First!");
            return;
        }else{
            int a = JOptionPane.showConfirmDialog(null, "Are You Sure Want To Delete This?", "Warning", JOptionPane.YES_NO_OPTION);
            if(a == JOptionPane.YES_OPTION){
                Person person = (Person)organizationJTable.getValueAt(selectedRow, 0);
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){                    
                    organization.getPersonDirectory().deletePrson(person);
                }
            }else{
                return;
            }
        } 
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_AddEmployee;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_ShowALl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
