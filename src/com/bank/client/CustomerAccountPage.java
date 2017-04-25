package com.bank.client;

import com.bank.service.Account;
import com.bank.service.Customer;
import com.bank.service.CustomerService;
import com.bank.service.CustomerService_Service;
import com.bank.service.InvalidDataException_Exception;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CustomerAccountPage extends javax.swing.JFrame {

    private final CustomerService cusService = new CustomerService_Service().getCustomerServicePort();
    int custId;

    public CustomerAccountPage() {
        initComponents();
    }

    public CustomerAccountPage(String email, String account) {
        initComponents();
        List<Customer> list = cusService.getCustomerList();
        if (!list.isEmpty()) {
            for (int x = 0; x < list.size(); x++) {

                if (list.get(x).getEmail().equals(email) && list.get(x).getAccounts().get(0).getAccountNo().equals(account)) {
                    Customer cus = list.get(x);
                    custId = cus.getCustomerId();
                    txtCusName.setText(cus.getCustomerName());
                    txtCusDob.setText(cus.getDob());
                    txtCusAddrs.setText(cus.getAddress());
                    txtCusMob.setText(cus.getMobile());
                    txtCusMail.setText(cus.getEmail());

                    txtCusAcNo.setText(cus.getAccounts().get(0).getAccountNo());
                    txtCusAcType.setText(cus.getAccounts().get(0).getAccountType());
                    txtCusCode.setText(cus.getAccounts().get(0).getSortCode());
                    txtCusBal.setText(Double.toString(cus.getAccounts().get(0).getAccountBalance()));
                    txtCusCard.setText(cus.getAccounts().get(0).getCardNumber());

                    btnCreateAcc.setText("Update");
                }
            }
        }
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        txtCusDob = new javax.swing.JTextField();
        txtCusMob = new javax.swing.JTextField();
        txtCusAddrs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCusAcType = new javax.swing.JTextField();
        txtCusAcNo = new javax.swing.JTextField();
        txtCusCode = new javax.swing.JTextField();
        txtCusBal = new javax.swing.JTextField();
        txtCusMail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCusCard = new javax.swing.JTextField();
        btnAccBack = new javax.swing.JButton();
        btnCreateAcc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel1.setText("Customer Account Page");

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setText("DOB");

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel5.setText("Mobile");

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel6.setText("E-mail");

        txtCusName.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusDob.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusMob.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusAddrs.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel7.setText("AC Type");

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel8.setText("AC No.");

        jLabel9.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel9.setText("Sort Code");

        jLabel10.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel10.setText("Balance");

        txtCusAcType.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusAcNo.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusCode.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusBal.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtCusMail.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel12.setText("Card");

        txtCusCard.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCusMail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCusMob)
                            .addComponent(txtCusDob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtCusAddrs, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCusName))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCusCode, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtCusAcType, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCusAcNo)
                    .addComponent(txtCusCard)
                    .addComponent(txtCusBal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCusAcType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCusDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCusAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCusAddrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCusCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCusMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCusBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCusMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCusCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnAccBack.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnAccBack.setText("Back");
        btnAccBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccBackActionPerformed(evt);
            }
        });

        btnCreateAcc.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnCreateAcc.setText("Create");
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnAccBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateAcc)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccBack)
                    .addComponent(btnCreateAcc))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Go to Customer List Page
    private void btnAccBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccBackActionPerformed
        CustomerListPage clp = new CustomerListPage();
        clp.run();
        this.dispose();
    }//GEN-LAST:event_btnAccBackActionPerformed

    // Create Customer + Edit Customer
    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        String cusName = txtCusName.getText();
        String cusDob = txtCusDob.getText();
        String cusAddress = txtCusAddrs.getText();
        String cusMobile = txtCusMob.getText();
        String email = txtCusMail.getText();

        String cusAccType = txtCusAcType.getText();
        String cusAccNo = txtCusAcNo.getText();
        String cusCode = txtCusCode.getText();
        String cusBalance = txtCusBal.getText();
        String cusCard = txtCusCard.getText();
        
        System.out.println(cusName);

        if (!cusName.equals("") && !cusDob.equals("") && !cusAddress.equals("") && !cusMobile.equals("") && !email.equals("")
                && !cusAccType.equals("") && !cusAccNo.equals("") && !cusCode.equals("") && !cusBalance.equals("") && !cusCard.equals("")) {
            System.out.println("Checked");
            Customer customer = new Customer();
            customer.setCustomerId(custId);
            customer.setCustomerName(cusName);
            customer.setDob(cusDob);
            customer.setAddress(cusAddress);
            customer.setMobile(cusMobile);
            customer.setEmail(email);

            try {
                Account acc = new Account();
                acc.setAccountType(cusAccType);
                acc.setAccountNo(cusAccNo);
                acc.setSortCode(cusCode);
                acc.setAccountBalance(Double.parseDouble(cusBalance));

                acc.setCardNumber(cusCard);

                ArrayList<Account> account = new ArrayList<>();
                account.add(acc);
                try {
                    boolean isSuccess;

                    if (btnCreateAcc.getText().equals("Update")) {
                        isSuccess = cusService.editCustomer(customer, acc);
                    } else {
                        isSuccess = cusService.createCustomer(customer, acc);
                    }

                    if (isSuccess) {
                        JOptionPane.showMessageDialog(null, "Successfully added");
                    }
                } catch (InvalidDataException_Exception e) {
                    JOptionPane.showMessageDialog(null, "Failed to add");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Balance");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Empty Fields found. Please fill all");
        }
    }//GEN-LAST:event_btnCreateAccActionPerformed

    public void run() {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerAccountPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccBack;
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCusAcNo;
    private javax.swing.JTextField txtCusAcType;
    private javax.swing.JTextField txtCusAddrs;
    private javax.swing.JTextField txtCusBal;
    private javax.swing.JTextField txtCusCard;
    private javax.swing.JTextField txtCusCode;
    private javax.swing.JTextField txtCusDob;
    private javax.swing.JTextField txtCusMail;
    private javax.swing.JTextField txtCusMob;
    private javax.swing.JTextField txtCusName;
    // End of variables declaration//GEN-END:variables
}
