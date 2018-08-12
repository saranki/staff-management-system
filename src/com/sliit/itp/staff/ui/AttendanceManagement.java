/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.itp.staff.ui;

import com.sliit.itp.staff.ui.panel.MarkAttendance;
import com.sliit.itp.staff.ui.panel.ViewAttendance;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author user
 */
public class AttendanceManagement extends javax.swing.JFrame {
    GridBagLayout gridBaglayout = new GridBagLayout();
    MarkAttendance markAttendance;
    ViewAttendance viewAttendance;
    /**
     * Creates new form AttendanceManagement
     */
    public AttendanceManagement() {
        initComponents();
        markAttendance = new MarkAttendance();
        viewAttendance = new ViewAttendance();
        pnlDynamic.setLayout(gridBaglayout);
        
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        pnlDynamic.add(markAttendance, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        pnlDynamic.add(viewAttendance, constraints);
        
        markAttendance.setVisible(true);
        viewAttendance.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAttendanceBase = new javax.swing.JPanel();
        pnlAttendanceNav = new javax.swing.JPanel();
        lblAttendanceTitle = new javax.swing.JLabel();
        btnViewAttendance = new javax.swing.JPanel();
        lblMarkAttendance = new javax.swing.JLabel();
        btnMarkAttendance1 = new javax.swing.JPanel();
        lblMarkAttendance1 = new javax.swing.JLabel();
        pnlDynamic = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAttendanceBase.setBackground(new java.awt.Color(255, 255, 255));
        pnlAttendanceBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAttendanceNav.setBackground(new java.awt.Color(0, 102, 0));
        pnlAttendanceNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAttendanceTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblAttendanceTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblAttendanceTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAttendanceTitle.setText("ATTENDANCE ");
        pnlAttendanceNav.add(lblAttendanceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 30));

        btnViewAttendance.setBackground(new java.awt.Color(51, 51, 51));
        btnViewAttendance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnViewAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewAttendanceMouseClicked(evt);
            }
        });
        btnViewAttendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMarkAttendance.setBackground(new java.awt.Color(0, 97, 17));
        lblMarkAttendance.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblMarkAttendance.setForeground(new java.awt.Color(255, 255, 255));
        lblMarkAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-data-sheet-20.png"))); // NOI18N
        lblMarkAttendance.setText("Attendance Summary");
        btnViewAttendance.add(lblMarkAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        pnlAttendanceNav.add(btnViewAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 50));

        btnMarkAttendance1.setBackground(new java.awt.Color(51, 51, 51));
        btnMarkAttendance1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMarkAttendance1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMarkAttendance1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMarkAttendance1MouseClicked(evt);
            }
        });
        btnMarkAttendance1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMarkAttendance1.setBackground(new java.awt.Color(0, 97, 17));
        lblMarkAttendance1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblMarkAttendance1.setForeground(new java.awt.Color(255, 255, 255));
        lblMarkAttendance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-attendance-20.png"))); // NOI18N
        lblMarkAttendance1.setText("Mark Attendance");
        btnMarkAttendance1.add(lblMarkAttendance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        pnlAttendanceNav.add(btnMarkAttendance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        pnlAttendanceBase.add(pnlAttendanceNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        pnlDynamic.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlDynamicLayout = new javax.swing.GroupLayout(pnlDynamic);
        pnlDynamic.setLayout(pnlDynamicLayout);
        pnlDynamicLayout.setHorizontalGroup(
            pnlDynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        pnlDynamicLayout.setVerticalGroup(
            pnlDynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pnlAttendanceBase.add(pnlDynamic, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 600));

        getContentPane().add(pnlAttendanceBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarkAttendance1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarkAttendance1MouseClicked
        markAttendance.setVisible(true);
        viewAttendance.setVisible(false);
    }//GEN-LAST:event_btnMarkAttendance1MouseClicked

    private void btnViewAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAttendanceMouseClicked
        markAttendance.setVisible(false);
        viewAttendance.setVisible(true);
    }//GEN-LAST:event_btnViewAttendanceMouseClicked

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
            java.util.logging.Logger.getLogger(AttendanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnMarkAttendance1;
    private javax.swing.JPanel btnViewAttendance;
    private javax.swing.JLabel lblAttendanceTitle;
    private javax.swing.JLabel lblMarkAttendance;
    private javax.swing.JLabel lblMarkAttendance1;
    private javax.swing.JPanel pnlAttendanceBase;
    private javax.swing.JPanel pnlAttendanceNav;
    private javax.swing.JPanel pnlDynamic;
    // End of variables declaration//GEN-END:variables
}