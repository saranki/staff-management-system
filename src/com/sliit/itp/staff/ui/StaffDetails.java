/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.itp.staff.ui;

import com.sliit.itp.staff.ui.panel.AddEmployee;
import com.sliit.itp.staff.ui.panel.UserDetails;
import java.awt.BorderLayout;

/**
 *
 * @author immsf
 */
public class StaffDetails extends javax.swing.JFrame {

    AddEmployee addEmployee;
    UserDetails userDetails;

    /**
     * Creates new form StaffDetails
     */
    public StaffDetails() {
        initComponents();
        addEmployee = new AddEmployee();
        userDetails = new UserDetails();
        pnlDynamic.add(addEmployee, BorderLayout.PAGE_START);
        addEmployee.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlAddEmployee = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlUserDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlExit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlDynamic = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff Details");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(99, 0, 50));
        jPanel2.setMaximumSize(new java.awt.Dimension(220, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(220, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STAFF DETAILS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 40));

        pnlAddEmployee.setBackground(new java.awt.Color(64, 0, 33));
        pnlAddEmployee.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAddEmployee.setPreferredSize(new java.awt.Dimension(190, 41));
        pnlAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddEmployeeMouseClicked(evt);
            }
        });
        pnlAddEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 97, 17));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-add-user-male-20.png"))); // NOI18N
        jLabel4.setText("Add Employee");
        pnlAddEmployee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 41));

        jPanel2.add(pnlAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, -1));

        pnlUserDetails.setBackground(new java.awt.Color(64, 0, 33));
        pnlUserDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlUserDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlUserDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlUserDetailsMouseClicked(evt);
            }
        });
        pnlUserDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-details-20.png"))); // NOI18N
        jLabel2.setText("User Details");
        pnlUserDetails.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 162, 41));

        jPanel2.add(pnlUserDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, -1));

        pnlExit.setBackground(new java.awt.Color(64, 0, 33));
        pnlExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlExit.setPreferredSize(new java.awt.Dimension(220, 41));
        pnlExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExitMouseClicked(evt);
            }
        });
        pnlExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-exit-20.png"))); // NOI18N
        jLabel5.setText("Exit Module");
        jLabel5.setFocusable(false);
        pnlExit.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 162, 41));

        jPanel2.add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 220, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlDynamic.setBackground(new java.awt.Color(255, 255, 255));
        pnlDynamic.setMaximumSize(new java.awt.Dimension(580, 600));
        pnlDynamic.setMinimumSize(new java.awt.Dimension(580, 600));
        pnlDynamic.setLayout(new java.awt.BorderLayout());
        jPanel1.add(pnlDynamic, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddEmployeeMouseClicked
        // TODO add your handling code here:
        addEmployee.setVisible(true);
    }//GEN-LAST:event_pnlAddEmployeeMouseClicked

    private void pnlUserDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUserDetailsMouseClicked
        pnlDynamic.add(userDetails, BorderLayout.PAGE_START);
        addEmployee.setVisible(false);
        userDetails.setVisible(true);
    }//GEN-LAST:event_pnlUserDetailsMouseClicked

    private void pnlExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseClicked
        // TODO add your handling code here:
        StaffManagementHome staffHome = new StaffManagementHome();
        staffHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlAddEmployee;
    private javax.swing.JPanel pnlDynamic;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlUserDetails;
    // End of variables declaration//GEN-END:variables
}
