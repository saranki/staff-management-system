/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.itp.staff.ui.panel;

import com.sliit.itp.service.Attendance;
import com.sliit.itp.service.Leave;

/**
 *
 * @author user
 */
public class MarkAttendance extends javax.swing.JPanel {

    /**
     * Creates new form MarkAttendance
     */
    Attendance attendance = new Attendance();
    public MarkAttendance() {
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

        pnlMarkAttendance = new javax.swing.JPanel();
        pnlAttendanceMarking = new javax.swing.JPanel();
        lblEmpIdGet = new javax.swing.JLabel();
        lblDateTimeGet = new javax.swing.JLabel();
        lblCurrentDateTime = new javax.swing.JLabel();
        lblEmpId1 = new javax.swing.JLabel();
        lblDateTime1 = new javax.swing.JLabel();
        lblInOut = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(580, 600));
        setMinimumSize(new java.awt.Dimension(580, 600));
        setPreferredSize(new java.awt.Dimension(580, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMarkAttendance.setBackground(new java.awt.Color(255, 255, 255));
        pnlMarkAttendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAttendanceMarking.setBackground(new java.awt.Color(255, 255, 255));
        pnlAttendanceMarking.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlAttendanceMarking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpIdGet.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEmpIdGet.setText("EMP0001");
        pnlAttendanceMarking.add(lblEmpIdGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 30));

        lblDateTimeGet.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDateTimeGet.setText("10-02-2018 06:21:52");
        pnlAttendanceMarking.add(lblDateTimeGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        lblCurrentDateTime.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCurrentDateTime.setText("Date:Time");
        pnlAttendanceMarking.add(lblCurrentDateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 374, 210, 30));

        lblEmpId1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEmpId1.setText("Staff Id");
        pnlAttendanceMarking.add(lblEmpId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 30));

        lblDateTime1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDateTime1.setText("Date/Time");
        pnlAttendanceMarking.add(lblDateTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 30));

        lblInOut.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblInOut.setText("Time In/Time out");
        pnlAttendanceMarking.add(lblInOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 225, 100, 30));

        pnlMarkAttendance.add(pnlAttendanceMarking, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 450, 420));

        jPanel1.setBackground(new java.awt.Color(64, 0, 33));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MARK ATTENDANCE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 50));

        pnlMarkAttendance.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        add(pnlMarkAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrentDateTime;
    private javax.swing.JLabel lblDateTime1;
    private javax.swing.JLabel lblDateTimeGet;
    private javax.swing.JLabel lblEmpId1;
    private javax.swing.JLabel lblEmpIdGet;
    private javax.swing.JLabel lblInOut;
    private javax.swing.JPanel pnlAttendanceMarking;
    private javax.swing.JPanel pnlMarkAttendance;
    // End of variables declaration//GEN-END:variables
}
