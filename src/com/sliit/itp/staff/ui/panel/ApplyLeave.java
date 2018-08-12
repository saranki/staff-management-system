/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.itp.staff.ui.panel;

import com.sliit.itp.service.Leave;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class ApplyLeave extends javax.swing.JPanel {

    Leave leave = new Leave();
    /**
     * Creates new form ApplyLeave
     */
    public ApplyLeave() {
        initComponents();
        lblReqDateGet.setText(leave.getCurrentDate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblReqDateGet = new javax.swing.JLabel();
        cmbLeaveType = new javax.swing.JComboBox<>();
        cmbLeaveDuration = new javax.swing.JComboBox<>();
        dateLeaveFrom = new com.toedter.calendar.JDateChooser();
        dateLeaveTo = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLeaveReason = new javax.swing.JTextArea();
        lblEmpIdGet = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(580, 600));
        setMinimumSize(new java.awt.Dimension(580, 600));
        setName("pnlApplyLeave"); // NOI18N
        setPreferredSize(new java.awt.Dimension(580, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LEAVE REQUEST");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Employee ID : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Request Date :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Duration :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("From : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("To :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 30, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Reason :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 60, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Leave Type :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 30));

        btnReset.setBackground(new java.awt.Color(12, 38, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RESET");
        jLabel10.setName("btnReset"); // NOI18N

        javax.swing.GroupLayout btnResetLayout = new javax.swing.GroupLayout(btnReset);
        btnReset.setLayout(btnResetLayout);
        btnResetLayout.setHorizontalGroup(
            btnResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(btnResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnResetLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnResetLayout.setVerticalGroup(
            btnResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnResetLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel10.getAccessibleContext().setAccessibleName("btnReset");

        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 120, 40));

        btnSubmit.setBackground(new java.awt.Color(12, 38, 0));
        btnSubmit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SUBMIT");
        btnSubmit.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 120, 40));

        lblReqDateGet.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblReqDateGet.setText("jLabel11");
        jPanel2.add(lblReqDateGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, 30));

        cmbLeaveType.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        cmbLeaveType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a leave type", "Casual Leave", "Sick Leave", "Paid Leave" }));
        jPanel2.add(cmbLeaveType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 210, 30));

        cmbLeaveDuration.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        cmbLeaveDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Duration", "Half Day", "Full Day" }));
        jPanel2.add(cmbLeaveDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, 30));
        jPanel2.add(dateLeaveFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 210, 30));
        jPanel2.add(dateLeaveTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 210, 30));

        txtAreaLeaveReason.setColumns(20);
        txtAreaLeaveReason.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtAreaLeaveReason.setRows(5);
        jScrollPane1.setViewportView(txtAreaLeaveReason);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 410, -1));

        lblEmpIdGet.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblEmpIdGet.setText("jLabel11");
        jPanel2.add(lblEmpIdGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 550));

        getAccessibleContext().setAccessibleName("pnlApplyLeave");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnReset;
    private javax.swing.JPanel btnSubmit;
    private javax.swing.JComboBox<String> cmbLeaveDuration;
    private javax.swing.JComboBox<String> cmbLeaveType;
    private com.toedter.calendar.JDateChooser dateLeaveFrom;
    private com.toedter.calendar.JDateChooser dateLeaveTo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpIdGet;
    private javax.swing.JLabel lblReqDateGet;
    private javax.swing.JTextArea txtAreaLeaveReason;
    // End of variables declaration//GEN-END:variables
}
