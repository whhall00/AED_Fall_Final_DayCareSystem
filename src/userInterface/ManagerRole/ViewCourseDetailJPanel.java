/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManagerRole;

import business.CourseOffering.CourseOffering;
import javax.swing.JPanel;

/**
 *
 * @author TYD
 */
public class ViewCourseDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCourseDetailJPanel
     */
    private JPanel userProcessContainer;
    private CourseOffering co;

    public ViewCourseDetailJPanel(JPanel userProcessContainer, CourseOffering courseOffering) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.co = courseOffering;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
