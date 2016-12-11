/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManagerRole;

import business.Business.EcoSystem;
import business.Customer.Child;
import business.Enterprise.Enterprise;
import business.Enterprise.RestaurantEnterprise;
import business.Menu.Menu;
import business.Network.Network;
import business.Organization.Organization;
import business.Person.Employee.Nutritionist;
import business.Person.Employee.Teacher;
import business.Person.Person;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chau_
 */
public class ManagerWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form managerWorkArea
     */
    public ManagerWorkArea(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        nameJLabel.setText(userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName());
        centerJLabel.setText(enterprise.getName());
        populateOrganizationCombox();
        populateTable();
        populateRestaurantComboBox();
        populateHospitalTable();
        populateChildrenTable();
    }
    
    //Manage Employee
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
    }

    //Children
    private void populateChildrenTable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable_Children.getModel();
        dtm.setRowCount(0);
        for(Person p : enterprise.getPersonDirectory().getPersonList()){
            if(p instanceof Child){
                Object[] row = new Object[4];
                row[0] = p.getId();
                row[1] = p;
                row[2] = ((Child) p).getParents().getFather().getFirstName();
                row[3] = ((Child) p).getParents().getMother().getFirstName();
                dtm.addRow(row);
            }
        }
    
    }
    
    //Restaurant 
    // Bug here
    private void populateRestaurantComboBox(){
        jComboBox_Restaurant.removeAllItems();
        for(Network network : system.getNetworkList()){
            if(network == enterprise.getNetwork()){
                for(Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(en.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Restaurant.getValue())){
                        jComboBox_Restaurant.addItem(en);
                        populateMenuTable((RestaurantEnterprise) en);
                    }
                }
            }
        }                     
    }
    private void populateMenuTable(RestaurantEnterprise enterprise){
        DefaultTableModel dtm = (DefaultTableModel) jTable_Menu.getModel();
        dtm.setRowCount(0);
        for(Menu m : enterprise.getMenuDirectory().getMenus()){
            Object[] row = new Object[4];
                row[0] = m;
                row[1] = m.getTotalCalorie();
                row[2] = m.getFruit();
                row[3] = m.getStapleFood();
                dtm.addRow(row);
        }
        
        
//        for(Network network : system.getNetworkList()){
//            for(Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()){
//                if(en.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Restaurant.getValue())){
//                    
//                }
//            }
//        }
        
    }
    
    //Hospital
    private void populateHospitalTable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable_Hospital.getModel();
        dtm.setRowCount(0);
        for(Network network : system.getNetworkList()){
            if(network == enterprise.getNetwork()){
                for(Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(en.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())){
                        Object[] row = new Object[2];
                        row[0] = en;
                        row[1] = en.getId();
                        dtm.addRow(row);
                    }
                }
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

        headlineJLabel = new javax.swing.JLabel();
        managerNameLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        centerJLabel = new javax.swing.JLabel();
        jTabbedPane_ManagerWork = new javax.swing.JTabbedPane();
        jPanel_Child = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Children = new javax.swing.JTable();
        jButton_AddChild = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel_Course = new javax.swing.JPanel();
        jPanel_Restaurant = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Menu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_Restaurant = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Checkout = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addtoCartButton6 = new javax.swing.JButton();
        jPanel_Hospital = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Hospital = new javax.swing.JTable();
        jPanel_Employee = new javax.swing.JPanel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton_ShowALl = new javax.swing.JButton();
        JButton_AddEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel_Network = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headlineJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headlineJLabel.setText("Manager Work Area");
        add(headlineJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 270, 40));

        managerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerNameLabel.setText("Manager Name :");
        add(managerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 166, 40));

        nameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJLabel.setText("name");
        add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, 40));

        centerJLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        centerJLabel.setText("center");
        add(centerJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 30));

        jTable_Children.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Father", "Mother"
            }
        ));
        jScrollPane2.setViewportView(jTable_Children);

        jButton_AddChild.setText("Add Child");

        jButton3.setText("Delete Child");

        jButton1.setText("View Detials");

        javax.swing.GroupLayout jPanel_ChildLayout = new javax.swing.GroupLayout(jPanel_Child);
        jPanel_Child.setLayout(jPanel_ChildLayout);
        jPanel_ChildLayout.setHorizontalGroup(
            jPanel_ChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChildLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel_ChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ChildLayout.createSequentialGroup()
                        .addComponent(jButton_AddChild)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ChildLayout.setVerticalGroup(
            jPanel_ChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChildLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel_ChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddChild)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane_ManagerWork.addTab("Child", jPanel_Child);
        jTabbedPane_ManagerWork.addTab("Course", jPanel_Course);

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
        jScrollPane3.setViewportView(jTable_Menu);

        jLabel2.setText("Restaurant Name:");

        jComboBox_Restaurant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable_Checkout.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable_Checkout);

        jLabel3.setText("My Order");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_RestaurantLayout = new javax.swing.GroupLayout(jPanel_Restaurant);
        jPanel_Restaurant.setLayout(jPanel_RestaurantLayout);
        jPanel_RestaurantLayout.setHorizontalGroup(
            jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RestaurantLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RestaurantLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addtoCartButton6))
                    .addGroup(jPanel_RestaurantLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Restaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel_RestaurantLayout.setVerticalGroup(
            jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RestaurantLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_Restaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel_RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addtoCartButton6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane_ManagerWork.addTab("Restaurant", jPanel_Restaurant);

        jTable_Hospital.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable_Hospital);

        javax.swing.GroupLayout jPanel_HospitalLayout = new javax.swing.GroupLayout(jPanel_Hospital);
        jPanel_Hospital.setLayout(jPanel_HospitalLayout);
        jPanel_HospitalLayout.setHorizontalGroup(
            jPanel_HospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HospitalLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel_HospitalLayout.setVerticalGroup(
            jPanel_HospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HospitalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jTabbedPane_ManagerWork.addTab("Hospital", jPanel_Hospital);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization");

        jButton2.setText("Delete Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_ShowALl.setText("Show All");
        jButton_ShowALl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowALlActionPerformed(evt);
            }
        });

        JButton_AddEmployee.setText("Add Employee");
        JButton_AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AddEmployeeActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel_EmployeeLayout = new javax.swing.GroupLayout(jPanel_Employee);
        jPanel_Employee.setLayout(jPanel_EmployeeLayout);
        jPanel_EmployeeLayout.setHorizontalGroup(
            jPanel_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EmployeeLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButton_AddEmployee)
                    .addGroup(jPanel_EmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ShowALl))
                    .addComponent(jButton2))
                .addGap(368, 368, 368))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel_EmployeeLayout.setVerticalGroup(
            jPanel_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EmployeeLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton_ShowALl))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(JButton_AddEmployee)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_ManagerWork.addTab("Manage Employee", jPanel_Employee);

        add(jTabbedPane_ManagerWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 620, 360));

        jLabel_Network.setText("network");
        add(jLabel_Network, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AddEmployeeActionPerformed
        Organization.DayCareOrganizationType type = (Organization.DayCareOrganizationType) organizationJComboBox.getSelectedItem();
        AddEmployeeJPanel addEmployeeJPanel = new AddEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AddEmployeeJPanel", addEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        //        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        //        String name = nameJTextField.getText();
        //
        //        organization.getEmployeeDirectory().createEmployee(name);
    }//GEN-LAST:event_JButton_AddEmployeeActionPerformed

    private void jButton_ShowALlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowALlActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton_ShowALlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization.DayCareOrganizationType type = (Organization.DayCareOrganizationType) organizationJComboBox.getSelectedItem();
        if (type != null){
            //            populateOrganizationTable(type);
            populatePersonTable();
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
//        int selectedRow = jTable_Menu.getSelectedRow();
//        if(selectedRow<0){
//            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        Menu selectedProduct = (Menu)jTable_Menu.getValueAt(selectedRow, 0);
//        int fetchQty = (Integer)quantitySpinner.getValue();
//        if(fetchQty <= 0){
//            JOptionPane.showMessageDialog(null, "Quatity cannot be less than equal to 0!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        try {
//            double salePrice = Double.parseDouble(txtSalesPrice.getText());
//            if(salePrice <= selectedProduct.getPrice()){
//                JOptionPane.showMessageDialog(null, "Sale Price cannot be LESS THAN Actual Price!!", "Warning", JOptionPane.WARNING_MESSAGE);
//                return;
//            }
//            if(fetchQty <= selectedProduct.getAvailNumber()){
//                boolean alreadyPresent = false;
//                for(OrderItem oi : order.getOrderItemList()){
//                    if(oi.getProduct() == selectedProduct){
//                        int oldAvail = selectedProduct.getAvailNumber();
//                        int newAvail = oldAvail - fetchQty;
//                        selectedProduct.setAvailNumber(newAvail);
//                        oi.setQuatity(fetchQty + oi.getQuatity());
//                        alreadyPresent = true;
//                        populateTable();
//                        refreshOrderTable();
//                        break;
//                    }
//                }
//                if(!alreadyPresent){
//                    int oldAvail = selectedProduct.getAvailNumber();
//                    int newAvail = oldAvail - fetchQty;
//                    selectedProduct.setAvailNumber(newAvail);
//                    order.addOrderItem(selectedProduct, fetchQty, salePrice);
//                    populateTable();
//                    refreshOrderTable();
//                }
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "Quatity cannot bigger than availiable number!", "Warning", JOptionPane.WARNING_MESSAGE);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Invalid SalePrice!!", "Warning", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_addtoCartButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_AddEmployee;
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JLabel centerJLabel;
    private javax.swing.JLabel headlineJLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_AddChild;
    private javax.swing.JButton jButton_ShowALl;
    private javax.swing.JComboBox jComboBox_Restaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Network;
    private javax.swing.JPanel jPanel_Child;
    private javax.swing.JPanel jPanel_Course;
    private javax.swing.JPanel jPanel_Employee;
    private javax.swing.JPanel jPanel_Hospital;
    private javax.swing.JPanel jPanel_Restaurant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane_ManagerWork;
    private javax.swing.JTable jTable_Checkout;
    private javax.swing.JTable jTable_Children;
    private javax.swing.JTable jTable_Hospital;
    private javax.swing.JTable jTable_Menu;
    private javax.swing.JLabel managerNameLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JSpinner quantitySpinner;
    // End of variables declaration//GEN-END:variables
}
