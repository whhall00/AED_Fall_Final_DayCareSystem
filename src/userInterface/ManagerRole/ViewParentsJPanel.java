/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManagerRole;

/**
 *
 * @author Chau_
 */
public class ViewParentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewParentsJPanel
     */
    public ViewParentsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        childNameJLabel = new javax.swing.JLabel();
        childNameTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ContactInformationJLabel = new javax.swing.JLabel();
        contactInformationTextField = new javax.swing.JTextField();
        addtessInformationJLabel = new javax.swing.JLabel();
        addtessInformationTextField = new javax.swing.JTextField();
        headlineJLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        childNameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        childNameJLabel.setText("Child Name:");

        nameJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJLabel.setText("Name:");

        ContactInformationJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ContactInformationJLabel.setText("Contact Information:");

        addtessInformationJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addtessInformationJLabel.setText("Address Information:");

        headlineJLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        headlineJLabel.setText("Parents Information");

        updateButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        updateButton.setText("update");

        saveButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        saveButton.setText("save");

        backButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        backButton.setText("<<back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(childNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(childNameTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ContactInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addtessInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(headlineJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextField)
                                    .addComponent(addtessInformationTextField)
                                    .addComponent(contactInformationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(backButton)
                        .addGap(56, 56, 56)
                        .addComponent(updateButton)
                        .addGap(75, 75, 75)
                        .addComponent(saveButton)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(headlineJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactInformationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addtessInformationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtessInformationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(childNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(childNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(updateButton)
                    .addComponent(saveButton))
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContactInformationJLabel;
    private javax.swing.JLabel addtessInformationJLabel;
    private javax.swing.JTextField addtessInformationTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel childNameJLabel;
    private javax.swing.JTextField childNameTextField;
    private javax.swing.JTextField contactInformationTextField;
    private javax.swing.JLabel headlineJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
