package com.bank.client;

import com.bank.service.EmployeeService;
import com.bank.service.EmployeeService_Service;
import com.bank.service.UsernamePasswordException_Exception;
import javax.swing.JOptionPane;

public class MainPage extends javax.swing.JFrame {

    private final EmployeeService empService = new EmployeeService_Service().getEmployeeServicePort();
    public static String logUserName="";

    public MainPage() {
        initComponents();
        if (!logUserName.equals("")) {
            txtLoggedAs.setText("Logged in as " + logUserName);
        } else {
            txtLoggedAs.setText("Not User Logged");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogHead = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogUser = new javax.swing.JTextField();
        txtLogPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtLoggedAs = new javax.swing.JLabel();
        btnEmp = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogHead.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        LogHead.setText("Bank System");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setText("Username ");

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel2.setText("Password ");

        txtLogUser.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtLogPass.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtLoggedAs.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        txtLoggedAs.setText("Logged As :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoggedAs)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogUser)
                            .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(txtLoggedAs))
        );

        btnEmp.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnEmp.setText("Employee Page");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(LogHead)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogHead)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmp)
                    .addComponent(btnLogout))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Login Button
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // username and password send to the server and wait for response 
        String username = txtLogUser.getText();
        String password = new String(txtLogPass.getPassword());

        try {
            boolean isValid = empService.getLogin(username, password);
            if (isValid) {
                logUserName = username;
                txtLoggedAs.setText("Logged in as " + logUserName);
                CustomerListPage clp = new CustomerListPage();
                clp.run();
                JOptionPane.showMessageDialog(null, "Login Successful!");
                this.dispose();
            }

        } catch (UsernamePasswordException_Exception e) {
            // show error
            JOptionPane.showMessageDialog(null, "Login Failed!");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    // Go to Employee Page
    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        EmployeePage ep = new EmployeePage();
        ep.run();
        this.dispose();
    }//GEN-LAST:event_btnEmpActionPerformed

    // Logout Button
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        if (!logUserName.equals("")) {
            boolean isValid = empService.getLogOut(logUserName);
            if (isValid) {
                txtLoggedAs.setText("Not User Logged");
                JOptionPane.showMessageDialog(null, "Logging out. System will now exit");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "You have not logged in.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You have not logged in.");
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
        MainPage start = new MainPage();
        start.run();
    }

    public void run() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogHead;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtLogPass;
    private javax.swing.JTextField txtLogUser;
    private javax.swing.JLabel txtLoggedAs;
    // End of variables declaration//GEN-END:variables
}
