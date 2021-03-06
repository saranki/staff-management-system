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
public class ApproveLeave extends javax.swing.JPanel {

    /**
     * Creates new form ApproveLeave
     */
    public ApproveLeave() {
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

        jPanel1 = new javax.swing.JPanel();
        pnlApprove = new javax.swing.JPanel();
        lblLeaveApprovalTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblStaffIdGet = new javax.swing.JLabel();
        lblReqDate = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLeaveType = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        cmbApprovalStatus = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnReset = new javax.swing.JPanel();
        lblReset = new javax.swing.JLabel();
        pnlLeaveSummary = new javax.swing.JPanel();
        lblMonth = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateLeaveReqDate = new com.toedter.calendar.JDateChooser();
        dateLeaveFrom = new com.toedter.calendar.JDateChooser();
        dateLeaveTo = new com.toedter.calendar.JDateChooser();
        cmbLeaveMonth = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeaveApproval = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlApprove.setBackground(new java.awt.Color(64, 0, 33));
        pnlApprove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLeaveApprovalTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblLeaveApprovalTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblLeaveApprovalTitle.setText("LEAVE APPROVAL");
        pnlApprove.add(lblLeaveApprovalTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 50));

        jPanel1.add(pnlApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(580, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Staff Id");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Requested Date");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Leave Type");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Duration");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("From");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("To");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Approval Status");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("Reason");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        btnUpdate.setBackground(new java.awt.Color(128, 3, 67));
        btnUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UPDATE");
        btnUpdate.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 12, -1, -1));

        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 100, 40));

        lblStaffIdGet.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblStaffIdGet.setText("EMP0001");
        jPanel4.add(lblStaffIdGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 30));

        lblReqDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblReqDate.setText("12-01-2018");
        jPanel4.add(lblReqDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 30));

        lblFrom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblFrom.setText("13-01-2018");
        jPanel4.add(lblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 30));

        lblDuration.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDuration.setText("Full Day");
        jPanel4.add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 30));

        lblReason.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblReason.setText("Going to a conference");
        jPanel4.add(lblReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, 30));

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblName.setText("Mr.John Abraham");
        jPanel4.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 30));

        lblLeaveType.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblLeaveType.setText("Casual");
        jPanel4.add(lblLeaveType, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 30));

        lblTo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTo.setText("14-01-2018");
        jPanel4.add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, 30));

        cmbApprovalStatus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbApprovalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Denied" }));
        jPanel4.add(cmbApprovalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 160, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 560, 10));

        btnReset.setBackground(new java.awt.Color(128, 3, 67));
        btnReset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReset.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblReset.setForeground(new java.awt.Color(255, 255, 255));
        lblReset.setText("RESET");
        btnReset.add(lblReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 12, -1, -1));

        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 100, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 580, 260));

        pnlLeaveSummary.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeaveSummary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMonth.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblMonth.setText("Month");
        pnlLeaveSummary.add(lblMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("SEARCH");
        pnlLeaveSummary.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Date");
        pnlLeaveSummary.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 34, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("From");
        pnlLeaveSummary.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("To");
        pnlLeaveSummary.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 69, 30, 30));

        dateLeaveReqDate.setDateFormatString("dd-MM-yyyy");
        dateLeaveReqDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dateLeaveReqDate.setMaximumSize(new java.awt.Dimension(95, 24));
        dateLeaveReqDate.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlLeaveSummary.add(dateLeaveReqDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 34, 190, 30));

        dateLeaveFrom.setDateFormatString("dd-MM-yyyy");
        dateLeaveFrom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dateLeaveFrom.setMaximumSize(new java.awt.Dimension(95, 24));
        dateLeaveFrom.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlLeaveSummary.add(dateLeaveFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, 30));

        dateLeaveTo.setDateFormatString("dd-MM-yyyy");
        dateLeaveTo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dateLeaveTo.setMaximumSize(new java.awt.Dimension(95, 24));
        dateLeaveTo.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlLeaveSummary.add(dateLeaveTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 190, 30));

        cmbLeaveMonth.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbLeaveMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octobar", "November", "December" }));
        cmbLeaveMonth.setMaximumSize(new java.awt.Dimension(95, 24));
        cmbLeaveMonth.setMinimumSize(new java.awt.Dimension(95, 24));
        pnlLeaveSummary.add(cmbLeaveMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 34, 190, 30));

        tblLeaveApproval.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblLeaveApproval.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EMPLOYEE ID", "LEAVE TYPE", "DURATION", "APPROVAL STATUS"
            }
        ));
        tblLeaveApproval.setPreferredSize(new java.awt.Dimension(300, 80));
        jScrollPane1.setViewportView(tblLeaveApproval);

        pnlLeaveSummary.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 540, 130));

        jPanel1.add(pnlLeaveSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 580, 250));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnReset;
    private javax.swing.JPanel btnUpdate;
    private javax.swing.JComboBox<String> cmbApprovalStatus;
    private javax.swing.JComboBox<String> cmbLeaveMonth;
    private com.toedter.calendar.JDateChooser dateLeaveFrom;
    private com.toedter.calendar.JDateChooser dateLeaveReqDate;
    private com.toedter.calendar.JDateChooser dateLeaveTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblLeaveApprovalTitle;
    private javax.swing.JLabel lblLeaveType;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblReqDate;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblStaffIdGet;
    private javax.swing.JLabel lblTo;
    private javax.swing.JPanel pnlApprove;
    private javax.swing.JPanel pnlLeaveSummary;
    private javax.swing.JTable tblLeaveApproval;
    // End of variables declaration//GEN-END:variables
}
