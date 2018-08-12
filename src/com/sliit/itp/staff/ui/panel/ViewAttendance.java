/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.itp.staff.ui.panel;

/**
 *
 * @author user
 */
public class ViewAttendance extends javax.swing.JPanel {

    /**
     * Creates new form ViewAttendance
     */
    public ViewAttendance() {
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

        pnlAttendanceView = new javax.swing.JPanel();
        pnlViewAttendance = new javax.swing.JPanel();
        lblViewAttendanceTitle = new javax.swing.JLabel();
        pnlAttendanceSummary = new javax.swing.JPanel();
        lblEmpId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateAttendanceSingle = new com.toedter.calendar.JDateChooser();
        dateAttendanceFrom = new com.toedter.calendar.JDateChooser();
        dateAttendanceTo = new com.toedter.calendar.JDateChooser();
        cmbAttendanceStaff = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAttendanceSummary = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAttendanceView.setBackground(new java.awt.Color(255, 255, 255));
        pnlAttendanceView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlViewAttendance.setBackground(new java.awt.Color(0, 51, 0));
        pnlViewAttendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewAttendanceTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblViewAttendanceTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblViewAttendanceTitle.setText("ATTENDANCE SUMMARY");
        pnlViewAttendance.add(lblViewAttendanceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, 30));

        pnlAttendanceView.add(pnlViewAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        pnlAttendanceSummary.setBackground(new java.awt.Color(255, 255, 255));
        pnlAttendanceSummary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpId.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEmpId.setText("EMP ID:");
        pnlAttendanceSummary.add(lblEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 34, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("SEARCH");
        pnlAttendanceSummary.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("DATE:");
        pnlAttendanceSummary.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 34, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("FROM:");
        pnlAttendanceSummary.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("TO:");
        pnlAttendanceSummary.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 69, 30, 30));

        dateAttendanceSingle.setDateFormatString("dd-MM-yyyy");
        dateAttendanceSingle.setMaximumSize(new java.awt.Dimension(95, 24));
        dateAttendanceSingle.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlAttendanceSummary.add(dateAttendanceSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 34, 170, 30));

        dateAttendanceFrom.setDateFormatString("dd-MM-yyyy");
        dateAttendanceFrom.setMaximumSize(new java.awt.Dimension(95, 24));
        dateAttendanceFrom.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlAttendanceSummary.add(dateAttendanceFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, 30));

        dateAttendanceTo.setDateFormatString("dd-MM-yyyy");
        dateAttendanceTo.setMaximumSize(new java.awt.Dimension(95, 24));
        dateAttendanceTo.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlAttendanceSummary.add(dateAttendanceTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 170, 30));

        cmbAttendanceStaff.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbAttendanceStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "EMP0001" }));
        cmbAttendanceStaff.setMaximumSize(new java.awt.Dimension(95, 24));
        cmbAttendanceStaff.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlAttendanceSummary.add(cmbAttendanceStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 34, 170, 30));

        pnlAttendanceView.add(pnlAttendanceSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 110));

        tblAttendanceSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EMPLOYEE ID", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(tblAttendanceSummary);

        pnlAttendanceView.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, 560, 410));

        add(pnlAttendanceView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAttendanceStaff;
    private com.toedter.calendar.JDateChooser dateAttendanceFrom;
    private com.toedter.calendar.JDateChooser dateAttendanceSingle;
    private com.toedter.calendar.JDateChooser dateAttendanceTo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblViewAttendanceTitle;
    private javax.swing.JPanel pnlAttendanceSummary;
    private javax.swing.JPanel pnlAttendanceView;
    private javax.swing.JPanel pnlViewAttendance;
    private javax.swing.JTable tblAttendanceSummary;
    // End of variables declaration//GEN-END:variables
}
