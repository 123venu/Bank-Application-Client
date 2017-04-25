package com.bank.client;

import com.bank.service.Customer;
import com.bank.service.CustomerService;
import com.bank.service.CustomerService_Service;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CustomerListPage extends javax.swing.JFrame {

    String selectedEmail;
    String selectedAccount;

    private final CustomerService cusService = new CustomerService_Service().getCustomerServicePort();

    public CustomerListPage() {
        initComponents();
        setCustomerData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listHead = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custList = new javax.swing.JTable();
        btnCusBack = new javax.swing.JButton();
        btnViewCus = new javax.swing.JButton();
        btnCreateCus = new javax.swing.JButton();
        btnDelCus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listHead.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        listHead.setText("Customers' List Page");

        jScrollPane1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        custList.setFont(new java.awt.Font("Avenir", 0, 12)); // NOI18N
        custList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Customer Name", "Account Number"
            }
        ));
        jScrollPane1.setViewportView(custList);

        btnCusBack.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnCusBack.setText("Back");
        btnCusBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusBackActionPerformed(evt);
            }
        });

        btnViewCus.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnViewCus.setText("View Account");
        btnViewCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCusActionPerformed(evt);
            }
        });

        btnCreateCus.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnCreateCus.setText("Create");
        btnCreateCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCusActionPerformed(evt);
            }
        });

        btnDelCus.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnDelCus.setText("Delete");
        btnDelCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCusBack)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateCus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelCus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnViewCus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(listHead)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listHead)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCusBack)
                    .addComponent(btnViewCus)
                    .addComponent(btnCreateCus)
                    .addComponent(btnDelCus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Back to Main Menu
    private void btnCusBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusBackActionPerformed
        MainPage mp = new MainPage();
        mp.run();
        this.dispose();
    }//GEN-LAST:event_btnCusBackActionPerformed

    // Create Customer
    private void btnCreateCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCusActionPerformed
        CustomerAccountPage cap = new CustomerAccountPage();
        cap.run();
        this.dispose();
    }//GEN-LAST:event_btnCreateCusActionPerformed

    // View Customer Account
    private void btnViewCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCusActionPerformed
        CustomerAccountPage cap = new CustomerAccountPage(selectedEmail, selectedAccount);
        this.dispose();
    }//GEN-LAST:event_btnViewCusActionPerformed

    // Delete Customer
    private void btnDelCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCusActionPerformed
        boolean isDeleted = cusService.deleteCustomer(selectedEmail, selectedAccount);
        System.out.println(selectedEmail + " " + selectedAccount + " " + isDeleted);
        if (isDeleted) {
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete");
        }
    }//GEN-LAST:event_btnDelCusActionPerformed

    // Set customer data
    private void setCustomerData() {
        List<Customer> list = cusService.getCustomerList();
        String[] heading = {"Customer Name", "Customer Email", "Account No"};
        Object[][] rows = null;
        if (!list.isEmpty()) {
            rows = new Object[list.size()][3];
            for (int x = 0; x < list.size(); x++) {

                if (list.get(x) != null) {
                    Customer cus = list.get(x);
                    rows[x][0] = cus.getCustomerName();
                    rows[x][1] = cus.getEmail();
                    rows[x][2] = cus.getAccounts().get(0).getAccountNo();
                }
            }
        }

        DefaultTableModel model = new DefaultTableModel(rows, heading);
        model.fireTableDataChanged();
        custList.setModel(model);
        custList.setRowSelectionAllowed(true);
        custList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    selectedEmail = custList.getValueAt(custList.getSelectedRow(), 1).toString();
                    selectedAccount = custList.getValueAt(custList.getSelectedRow(), 2).toString();
                } catch (Exception e1) {

                }
            }
        });
    }

    public void run() {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerListPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCus;
    private javax.swing.JButton btnCusBack;
    private javax.swing.JButton btnDelCus;
    private javax.swing.JButton btnViewCus;
    private javax.swing.JTable custList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listHead;
    // End of variables declaration//GEN-END:variables
}
