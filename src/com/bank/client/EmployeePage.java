package com.bank.client;

import com.bank.service.Employee;
import com.bank.service.EmployeeService;
import com.bank.service.EmployeeService_Service;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class EmployeePage extends javax.swing.JFrame {

    private final EmployeeService empService = new EmployeeService_Service().getEmployeeServicePort();
    private String selectedUsername;

    public EmployeePage() {
        initComponents();
        EmpTabbedPanel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                setEmployeeData();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empHead = new javax.swing.JLabel();
        EmpTabbedPanel = new javax.swing.JTabbedPane();
        createEmpPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        txtEmpPass = new javax.swing.JPasswordField();
        txtEmpPost = new javax.swing.JTextField();
        txtEmpUser = new javax.swing.JTextField();
        btnCreateEmp = new javax.swing.JButton();
        editEmpPanel = new javax.swing.JPanel();
        btnEditEmp = new javax.swing.JButton();
        btnDelEmp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editEmpTbl = new javax.swing.JTable();
        btnEmpBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        empHead.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        empHead.setText("Employee Page");
        empHead.setToolTipText("");

        EmpTabbedPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        EmpTabbedPanel.setName("Employee"); // NOI18N

        createEmpPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        createEmpPanel.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setText("Name ");

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel2.setText("Position ");

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setText("Username ");

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setText("Password ");

        txtEmpName.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtEmpPass.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtEmpPost.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        txtEmpUser.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N

        btnCreateEmp.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnCreateEmp.setText("Create Employee");
        btnCreateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createEmpPanelLayout = new javax.swing.GroupLayout(createEmpPanel);
        createEmpPanel.setLayout(createEmpPanelLayout);
        createEmpPanelLayout.setHorizontalGroup(
            createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createEmpPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmpName)
                    .addComponent(txtEmpPass)
                    .addComponent(txtEmpPost)
                    .addComponent(txtEmpUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(createEmpPanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnCreateEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createEmpPanelLayout.setVerticalGroup(
            createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createEmpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnCreateEmp))
        );

        EmpTabbedPanel.addTab("Create Employee", createEmpPanel);

        btnEditEmp.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnEditEmp.setText("Edit Employee");
        btnEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmpActionPerformed(evt);
            }
        });

        btnDelEmp.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnDelEmp.setText("Delete Employee");
        btnDelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelEmpActionPerformed(evt);
            }
        });

        editEmpTbl.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null}
            },
            new String [] {
                "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(editEmpTbl);

        javax.swing.GroupLayout editEmpPanelLayout = new javax.swing.GroupLayout(editEmpPanel);
        editEmpPanel.setLayout(editEmpPanelLayout);
        editEmpPanelLayout.setHorizontalGroup(
            editEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEmpPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnDelEmp)
                .addGap(34, 34, 34))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        editEmpPanelLayout.setVerticalGroup(
            editEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEmpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditEmp)
                    .addComponent(btnDelEmp)))
        );

        EmpTabbedPanel.addTab("Edit Employee", editEmpPanel);

        btnEmpBack.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        btnEmpBack.setText("Back");
        btnEmpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(empHead)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(EmpTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmpTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnEmpBack)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Go to Main Menu
    private void btnEmpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpBackActionPerformed
        MainPage mp = new MainPage();
        mp.run();
        this.dispose();
    }//GEN-LAST:event_btnEmpBackActionPerformed

    // Delete Employee
    private void btnDelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelEmpActionPerformed
        Employee emp = new Employee();
        emp.setUsername(selectedUsername);
        boolean isDel = empService.deleteEmployee(emp);
        if (isDel) {
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Delete fail");
        }
    }//GEN-LAST:event_btnDelEmpActionPerformed

    // Tabs - Auto genrated method not used
    private void EmpTabbedPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EmpTabbedPanelStateChanged
        if (EmpTabbedPanel.getSelectedIndex() == 1) {
            List<Employee> list = empService.getEmployeeList();
            if (list != null) {

            }
        }
    }//GEN-LAST:event_EmpTabbedPanelStateChanged

    // set employee data
    private void setEmployeeData() {
        List<Employee> list = empService.getEmployeeList();
        String[] heading = {"Username", "Password"};
        Object[][] rows = null;
        if (list != null) {
            rows = new Object[list.size()][2];
            for (int x = 0; x < list.size(); x++) {
                Employee emp = list.get(x);
                rows[x][0] = emp.getUsername();
                rows[x][1] = emp.getPassword();
            }
        }

        DefaultTableModel model = new DefaultTableModel(rows, heading);
        model.fireTableDataChanged();
        editEmpTbl.setModel(model);

        editEmpTbl.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    selectedUsername = editEmpTbl.getValueAt(editEmpTbl.getSelectedRow(), 0).toString();
                } catch (Exception e1) {

                }
            }
        });
    }

    // Create Employee
    private void btnCreateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmpActionPerformed

        String emp_name = txtEmpName.getText();
        String emp_post = txtEmpPost.getText();
        String emp_user = txtEmpUser.getText();
        String emp_pass = new String(txtEmpPass.getPassword());

        if (!emp_name.equals("") && !emp_post.equals("") && !emp_user.equals("") && !emp_pass.equals("")) {
            Employee emp = new Employee();
            emp.setEmployeeName(emp_name);
            emp.setPosition(emp_post);
            emp.setUsername(emp_user);
            emp.setPassword(emp_pass);
            boolean isValid = empService.createEmployee(emp);
            if (isValid) {
                JOptionPane.showMessageDialog(null, "Successfully Created!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed Creation!");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Empty Fields found. Fill all fields");
        }
    }//GEN-LAST:event_btnCreateEmpActionPerformed

    // Edit Employee
    private void btnEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEmpActionPerformed

        List<Employee> list = empService.getEmployeeList();
        String oldName = "", oldPosition = "", oldUsername = "", oldPassword = "";
        for (int x = 0; x < list.size(); x++) {
            if (list.get(x).getUsername().equals(selectedUsername)) {
                oldName = list.get(x).getEmployeeName();
                oldPosition = list.get(x).getPosition();
                oldUsername = list.get(x).getUsername();
                oldPassword = list.get(x).getPassword();
            }
        }

        JFrame jframe = new JFrame("Edit Employee");
        jframe.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lbl1 = new JLabel("Name");
        JTextField txtNewName = new JTextField(oldName);
        JLabel lbl2 = new JLabel("Position");
        JTextField txtNewPosition = new JTextField(oldPosition);
        JLabel lbl3 = new JLabel("Username");
        JTextField txtNewUsername = new JTextField(oldUsername);
        JLabel lbl4 = new JLabel("Password");
        JPasswordField txtNewPassword = new JPasswordField(oldPassword);
        JButton save = new JButton("Save");
        JButton cancel = new JButton("Cancel");

        jframe.add(lbl1);
        jframe.add(txtNewName);
        jframe.add(lbl2);
        jframe.add(txtNewPosition);
        jframe.add(lbl3);
        jframe.add(txtNewUsername);
        jframe.add(lbl4);
        jframe.add(txtNewPassword);
        jframe.add(save);
        jframe.add(cancel);
        jframe.pack();
        jframe.setVisible(true);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newName = txtNewName.getText();
                String newPosition = txtNewPosition.getText();
                String newUsername = txtNewUsername.getText();
                String newPassword = new String(txtNewPassword.getPassword());

                if (!newName.equals("") && !newPosition.equals("") && !newUsername.equals("") && !newPassword.equals("")) {
                    Employee emp = new Employee();
                    emp.setEmployeeName(newName);
                    emp.setPosition(newPosition);
                    emp.setUsername(newUsername);
                    emp.setPassword(newPassword);
                    boolean isUpdated = empService.editEmployee(emp, selectedUsername);
                    if (isUpdated) {
                        JOptionPane.showMessageDialog(null, "Update successful");
                    } else {
                        JOptionPane.showMessageDialog(null, "Update failed");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Empty fields found. Fill all fields");
                }
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe.dispose();
            }
        });
    }//GEN-LAST:event_btnEditEmpActionPerformed

    public void run() {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane EmpTabbedPanel;
    private javax.swing.JButton btnCreateEmp;
    private javax.swing.JButton btnDelEmp;
    private javax.swing.JButton btnEditEmp;
    private javax.swing.JButton btnEmpBack;
    private javax.swing.JPanel createEmpPanel;
    private javax.swing.JPanel editEmpPanel;
    private javax.swing.JTable editEmpTbl;
    private javax.swing.JLabel empHead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtEmpPass;
    private javax.swing.JTextField txtEmpPost;
    private javax.swing.JTextField txtEmpUser;
    // End of variables declaration//GEN-END:variables
}
