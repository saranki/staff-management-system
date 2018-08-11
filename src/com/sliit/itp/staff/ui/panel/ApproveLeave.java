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
        lblApproveTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateLeaveReqDate = new com.toedter.calendar.JDateChooser();
        dateLeaveFrom = new com.toedter.calendar.JDateChooser();
        dateLeaveTo = new com.toedter.calendar.JDateChooser();
        cmbLeaveMonth = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeaveApproval = new javax.swing.JTable();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbApprovalStatus = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlApprove.setBackground(new java.awt.Color(0, 51, 0));
        pnlApprove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApproveTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblApproveTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblApproveTitle.setText("LEAVE APPROVAL");
        pnlApprove.add(lblApproveTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(pnlApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("MONTH:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel3.setText("SEARCH");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("DATE:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("FROM:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("TO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        jPanel2.add(dateLeaveReqDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 160, -1));
        jPanel2.add(dateLeaveFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, -1));
        jPanel2.add(dateLeaveTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 160, -1));

        cmbLeaveMonth.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        cmbLeaveMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBAR", "NOVEMBER", "DECEMBER" }));
        jPanel2.add(cmbLeaveMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 110));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLeaveApproval.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EMPLOYEE ID", "LEAVE TYPE", "DURATION", "APPROVAL STATUS"
            }
        ));
        jScrollPane1.setViewportView(tblLeaveApproval);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 180));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 580, 190));

        jPanel4.setPreferredSize(new java.awt.Dimension(580, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel1.setText("EMPLOYEE ID:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel7.setText("NAME:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel8.setText("REQUSTED DATE:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel9.setText("LEAVE TYPE:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel10.setText("DURATION:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel11.setText("FROM:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel12.setText("TO:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel13.setText("APPROVAL STATUS:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel14.setText("REASON:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UPDATE");

        javax.swing.GroupLayout btnUpdateLayout = new javax.swing.GroupLayout(btnUpdate);
        btnUpdate.setLayout(btnUpdateLayout);
        btnUpdateLayout.setHorizontalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        btnUpdateLayout.setVerticalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 370, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        cmbApprovalStatus.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        cmbApprovalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "APPROVED", "DENIED" }));
        jPanel4.add(cmbApprovalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 160, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 580, 230));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApproveTitle;
    private javax.swing.JPanel pnlApprove;
    private javax.swing.JTable tblLeaveApproval;
    // End of variables declaration//GEN-END:variables
}
