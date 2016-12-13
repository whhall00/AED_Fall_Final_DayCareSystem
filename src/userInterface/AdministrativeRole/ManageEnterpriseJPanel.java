/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.Business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Person.Employee.Manager;
import business.Person.Hospital.Doctor;
import business.Person.Restaurant.RestaurantManager;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hao
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateComboBox();
        jLabel_TotalEnterprise.setText(String.valueOf(system.caculateTotalEnterprise()));
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();      
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getNetworkName();
                row[2] = enterprise.getEnterpriseType().getValue();               
                model.addRow(row); 
            }
        }
    }

    public void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
        }

    }
    
    private void repopulateTable(Network network) {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        model.setRowCount(0);
        try {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getNetworkName();
                row[2] = enterprise.getEnterpriseType().getValue();
                
                model.addRow(row);
            }
        } catch (Exception e) {
        }
        
    }
    private void repopulateTable2(Network network, Enterprise.EnterpriseType type) {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        model.setRowCount(0);
        try {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getEnterpriseType().equals(type)){
                    Object[] row = new Object[3];
                    row[0] = enterprise;
                    row[1] = network.getNetworkName();
                    row[2] = enterprise.getEnterpriseType().getValue();
                    
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
        }        
    }
    
    //populate Managers
    public void populateManagerTable() {        
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
//        while(selectedRow >= 0){
        Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);

        
        DefaultTableModel model = (DefaultTableModel) managerJTable.getModel();
        model.setRowCount(0);
        
        switch (enterprise.getEnterpriseType()) {
            case DayCareInstitution:
                enterprise.getPersonDirectory().getPersonList().stream().filter((person) -> (person instanceof Manager)).map((person) -> {
                    Object[] row = new Object[3];
                    row[0] = person;
                    row[1] = person.getId();
                    row[2] = person.getGender();
                    return row;
                }).forEach((row) -> {
                    model.addRow(row);
                });
                break;
            case Hospital:
                enterprise.getPersonDirectory().getPersonList().stream().filter((person) -> (person instanceof Doctor)).map((person) -> {
                    Object[] row = new Object[3];
                    row[0] = person;
                    row[1] = person.getId();
                    row[2] = person.getGender();
                    return row;
                }).forEach((row) -> {
                    model.addRow(row);
                });
                break;
            case Restaurant:
                enterprise.getPersonDirectory().getPersonList().stream().filter((person) -> (person instanceof RestaurantManager)).map((person) -> {
                    Object[] row = new Object[3];
                    row[0] = person;
                    row[1] = person.getId();
                    row[2] = person.getGender();
                    return row;
                }).forEach((row) -> {
                    model.addRow(row);
                });
                break;
            default:
                break;
//            }
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

        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        jButton_AddEnterpirse = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_deleteEnterprise = new javax.swing.JButton();
        jButton_ShowAll = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox<>();
        jButton_UpdateManager = new javax.swing.JButton();
        JButton_AddManager = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        managerJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel_TotalEnterprise = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Enter Enterprise Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 136, -1));

        jLabel3.setText("Choose Enterprise Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, -1));

        jButton_AddEnterpirse.setText("Add Enterprise");
        jButton_AddEnterpirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEnterpirseActionPerformed(evt);
            }
        });
        add(jButton_AddEnterpirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 151, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 593, 182));

        jLabel1.setText("Choose Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jButton_deleteEnterprise.setText("Delete Enterprise");
        jButton_deleteEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteEnterpriseActionPerformed(evt);
            }
        });
        add(jButton_deleteEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        jButton_ShowAll.setText("Show All");
        jButton_ShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowAllActionPerformed(evt);
            }
        });
        add(jButton_ShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, -1));

        jButton_UpdateManager.setText("Update Manager");
        jButton_UpdateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateManagerActionPerformed(evt);
            }
        });
        add(jButton_UpdateManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 320, -1));

        JButton_AddManager.setText("Add Manager");
        JButton_AddManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AddManagerActionPerformed(evt);
            }
        });
        add(JButton_AddManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, 320, -1));

        managerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manager Name", "User ID", "Date Of Birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(managerJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 630, 200));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Managers in Selected Enterprise:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel_TotalEnterprise.setText("jLabel5");
        add(jLabel_TotalEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 16, -1, 20));

        jLabel5.setText("Total Enterprise Number is:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddEnterpirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddEnterpirseActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = nameJTextField.getText();
        if(network.checkIfEnterpriseisUnique(name)){
            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            enterprise.setNetwork(network); //mbw
            JOptionPane.showMessageDialog(null, "Enterprise Created Successfully");
            nameJTextField.setText("");
            jLabel_TotalEnterprise.setText(String.valueOf(system.caculateTotalEnterprise()));
        }else{
            JOptionPane.showMessageDialog(null, "Enterprise Name Already Exist, Please Enter Another Name");
        }
        repopulateTable(network);
    }//GEN-LAST:event_jButton_AddEnterpirseActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel sysAdminwjp = (AdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network)networkJComboBox.getSelectedItem();
        repopulateTable(network);
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void jButton_deleteEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteEnterpriseActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Row First!");
            return;
        }else{
            int a = JOptionPane.showConfirmDialog(null, "Are You Sure Want To Delete This?", "Warning", JOptionPane.YES_NO_OPTION);
            if(a == JOptionPane.YES_OPTION){
                Enterprise enterprise = (Enterprise)enterpriseJTable.getValueAt(selectedRow, 0);
                for(Network network : system.getNetworkList()){                    
                    network.getEnterpriseDirectory().deleteEnterprise(enterprise);   
                    jLabel_TotalEnterprise.setText(String.valueOf(system.caculateTotalEnterprise()));
                }
            }else{
                return;
            }
        } 
        populateTable();
    }//GEN-LAST:event_jButton_deleteEnterpriseActionPerformed

    private void jButton_ShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowAllActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton_ShowAllActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network)networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();        
        repopulateTable2(network, type);
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void jButton_UpdateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateManagerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_UpdateManagerActionPerformed

    private void JButton_AddManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AddManagerActionPerformed
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
        //
        AddManagerJPanel addManagerJPanel = new AddManagerJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AddManagerJPanel", addManagerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_JButton_AddManagerActionPerformed

    private void enterpriseJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseJTableMouseClicked
        // TODO add your handling code here:
        populateManagerTable();
    }//GEN-LAST:event_enterpriseJTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_AddManager;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JButton jButton_AddEnterpirse;
    private javax.swing.JButton jButton_ShowAll;
    private javax.swing.JButton jButton_UpdateManager;
    private javax.swing.JButton jButton_deleteEnterprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_TotalEnterprise;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable managerJTable;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox<Network> networkJComboBox;
    // End of variables declaration//GEN-END:variables
}
