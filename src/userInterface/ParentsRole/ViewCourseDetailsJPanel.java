/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ParentsRole;

import business.CourseOffering.CourseOffering;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Person.Employee.Teacher;
import business.Person.Person;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author TYD
 */
public class ViewCourseDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCourseDetailJPanel
     */
    private JPanel userProcessContainer;
    private CourseOffering courseOffering;
    private Enterprise enterprise;

    public ViewCourseDetailsJPanel(JPanel userProcessContainer, CourseOffering courseOffering, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.courseOffering = courseOffering;
        this.enterprise = enterprise;
        populateText();
    }
    private void populateText(){
        jTextField_CourseName.setText(courseOffering.getCourseName());
        jTextField_CourseDescription.setText(courseOffering.getCourseDescription());
        jTextField_CourseCredit.setText(String.valueOf(courseOffering.getCredit()));
        jTextField_ClassRoom.setText(courseOffering.getClassRoom());
        jTextField_StartTime.setText(courseOffering.getStartTime());
        jTextField_EndTime.setText(courseOffering.getEndTime());
        jComboBox_selectTeacher.setSelectedItem(courseOffering.getTeacher());
        
        jTextField_CourseName.setEnabled(false);
        jTextField_CourseDescription.setEnabled(false);
        jTextField_CourseCredit.setEnabled(false);
        jTextField_ClassRoom.setEnabled(false);
        jTextField_StartTime.setEnabled(false);
        jTextField_EndTime.setEnabled(false);
        jComboBox_selectTeacher.setEnabled(false);
        jButton_Save.setEnabled(false);
    }
    private void populateTeacherComboBox(){
        jComboBox_selectTeacher.removeAllItems();
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(Person p : o.getPersonDirectory().getPersonList()){
                if(p instanceof Teacher){
                    jComboBox_selectTeacher.addItem(p);
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

        jLabel5 = new javax.swing.JLabel();
        jTextField_StartTime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_EndTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_CourseName = new javax.swing.JTextField();
        jTextField_CourseDescription = new javax.swing.JTextField();
        jTextField_CourseCredit = new javax.swing.JTextField();
        jButton_Save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_selectTeacher = new javax.swing.JComboBox();
        jTextField_ClassRoom = new javax.swing.JTextField();
        jButton_Back = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();

        jLabel5.setText("Start Time:");

        jLabel1.setText("Course Name:");

        jLabel6.setText("End Time:");

        jLabel2.setText("Course Description:");

        jLabel3.setText("Course Credit:");

        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jLabel7.setText("Teacher:");

        jLabel4.setText("Class Room:");

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addComponent(jTextField_ClassRoom))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_CourseName)
                                    .addComponent(jTextField_CourseDescription)
                                    .addComponent(jTextField_CourseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_EndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_StartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Save))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton_Back)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_CourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_CourseCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_ClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_StartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_EndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Save)
                    .addComponent(jButton_Update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton_Back)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
        Teacher t = (Teacher)jComboBox_selectTeacher.getSelectedItem();
        String courseName = jTextField_CourseName.getText();
        String cDescription = jTextField_CourseDescription.getText();
        String cRoom = jTextField_ClassRoom.getText();
        String startTime = jTextField_StartTime.getText();
        String endTime = jTextField_EndTime.getText();
        int credit = Integer.parseInt(jTextField_CourseCredit.getText());

        courseOffering.setTeacher(t);
        courseOffering.setCourseName(courseName);
        courseOffering.setClassRoom(cRoom);
        courseOffering.setCourseDescription(cDescription);
        courseOffering.setStartTime(startTime);
        courseOffering.setEndTime(endTime);
        courseOffering.setCredit(credit);
        
        JOptionPane.showMessageDialog(null, "Save Successfully");
        
        jTextField_CourseName.setEnabled(false);
        jTextField_CourseDescription.setEnabled(false);
        jTextField_CourseCredit.setEnabled(false);
        jTextField_ClassRoom.setEnabled(false);
        jTextField_StartTime.setEnabled(false);
        jTextField_EndTime.setEnabled(false);
        jComboBox_selectTeacher.setEnabled(false);
        jButton_Save.setEnabled(false);
        jButton_Update.setEnabled(true);
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        jTextField_CourseName.setEnabled(true);
        jTextField_CourseDescription.setEnabled(true);
        jTextField_CourseCredit.setEnabled(true);
        jTextField_ClassRoom.setEnabled(true);
        jTextField_StartTime.setEnabled(true);
        jTextField_EndTime.setEnabled(true);
        jComboBox_selectTeacher.setEnabled(true);
        jButton_Save.setEnabled(true);
        jButton_Update.setEnabled(false);
        populateTeacherComboBox();
    }//GEN-LAST:event_jButton_UpdateActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox jComboBox_selectTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField_ClassRoom;
    private javax.swing.JTextField jTextField_CourseCredit;
    private javax.swing.JTextField jTextField_CourseDescription;
    private javax.swing.JTextField jTextField_CourseName;
    private javax.swing.JTextField jTextField_EndTime;
    private javax.swing.JTextField jTextField_StartTime;
    // End of variables declaration//GEN-END:variables
}
