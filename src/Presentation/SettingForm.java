/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import DataStorage.SettingStorage;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 /**
 *
 * @AuthorShifan
 * @ESOFT_ID E21644
 * @KU_ID 2377544
 * @Development_ Coursework Programming (iii)
 * 
 */
public class SettingForm extends javax.swing.JFrame {
    private final SettingStorage settingData = SettingStorage.getInstance(); 

    public SettingForm() {
        initComponents();
        this.loadTableData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmin = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        backIconLabel = new javax.swing.JLabel();
        homeIconLabel = new javax.swing.JLabel();
        quitIconLabel = new javax.swing.JLabel();
        FormTitleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        updateUserBtn = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        deleteUserBtn = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        AddUserBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        appointmentLabelBackround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmin.setBackground(new java.awt.Color(204, 204, 204));
        lblmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmin.setForeground(new java.awt.Color(51, 51, 51));
        lblmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmin.setText("-");
        lblmin.setOpaque(true);
        lblmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblminMouseExited(evt);
            }
        });
        getContentPane().add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 50, 20));

        lblclose.setBackground(new java.awt.Color(205, 51, 51));
        lblclose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblclose.setForeground(new java.awt.Color(255, 255, 255));
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("x");
        lblclose.setOpaque(true);
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcloseMouseExited(evt);
            }
        });
        getContentPane().add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 60, 20));

        backIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/back.png"))); // NOI18N
        backIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(backIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 680, 40, 40));

        homeIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/home.png"))); // NOI18N
        homeIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(homeIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 680, 50, 40));

        quitIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quitIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/quit.png"))); // NOI18N
        quitIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quitIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(quitIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 680, 50, 40));

        FormTitleLabel.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        FormTitleLabel.setForeground(new java.awt.Color(51, 0, 51));
        FormTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FormTitleLabel.setText("SETTING");
        getContentPane().add(FormTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(950, 600));

        updateUserBtn.setText("Update");
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordLabel.setText("Password");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        deleteUserBtn.setText("Delete");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameLabel.setText("Username");

        AddUserBtn.setText("Add");
        AddUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(AddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addGap(27, 27, 27)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usernameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(406, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 520, 220));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 790, 250));

        appointmentLabelBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Dashboard.png"))); // NOI18N
        getContentPane().add(appointmentLabelBackround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblminMouseClicked

    private void lblminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseEntered
        // TODO add your handling code here:
        lblmin.setBackground(new Color(0,128,255));
        lblmin.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblminMouseEntered

    private void lblminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseExited
        // TODO add your handling code here:
        lblmin.setBackground(new Color(204,204,204));
        lblmin.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_lblminMouseExited

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
        // TODO add your handling code here:
        lblclose.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_lblcloseMouseEntered

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
        // TODO add your handling code here:

        lblclose.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_lblcloseMouseExited

    private void backIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconLabelMouseEntered
        backIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/backAnimated.png")));
    }//GEN-LAST:event_backIconLabelMouseEntered

    private void backIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconLabelMouseExited
        backIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/back.png")));
    }//GEN-LAST:event_backIconLabelMouseExited

    private void homeIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLabelMouseEntered
        homeIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/homeAnimated.png")));
    }//GEN-LAST:event_homeIconLabelMouseEntered

    private void homeIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLabelMouseExited
        homeIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/home.png")));
    }//GEN-LAST:event_homeIconLabelMouseExited

    private void quitIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitIconLabelMouseEntered
        quitIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/quitAnimated.png")));
    }//GEN-LAST:event_quitIconLabelMouseEntered

    private void quitIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitIconLabelMouseExited
        quitIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/quit.png")));
    }//GEN-LAST:event_quitIconLabelMouseExited

    private void quitIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitIconLabelMouseClicked
        LoginForm loginForm =new LoginForm();
        this.hide();
        loginForm.setVisible(true);
    }//GEN-LAST:event_quitIconLabelMouseClicked

    private void backIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconLabelMouseClicked
        DashboardForm dashboard =new DashboardForm();
        this.hide();
        dashboard.setVisible(true);
    }//GEN-LAST:event_backIconLabelMouseClicked

    private void homeIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLabelMouseClicked
        DashboardForm dashboard =new DashboardForm();
        this.hide();
        dashboard.setVisible(true);
    }//GEN-LAST:event_homeIconLabelMouseClicked

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        this.updateUser(); 
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        this.deleteUser();  
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameKeyPressed

    private void AddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserBtnActionPerformed
        this.createNewUser(); 
    }//GEN-LAST:event_AddUserBtnActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        this.settingTableSelectedRowLoad(); 
    }//GEN-LAST:event_userTableMouseClicked
 
    private void rearangeTableData()
    {
        settingData.resetUserData();
        DefaultTableModel tableModel = (DefaultTableModel)userTable.getModel();
        int rows = tableModel.getRowCount();
        int cols = tableModel.getColumnCount();
        Object[][] rowsData = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowsData[i][j] = tableModel.getValueAt(i, j);
            }
        }
        for (int i = 0; i < rows; i++) {
        StringBuilder rowData = new StringBuilder();

        for (int j = 0; j < cols; j++) {
            rowData.append(rowsData[i][j]);

            if (j < cols - 1) {
                rowData.append(", ");
            }
        }
    
            String[] data = rowData.toString().split(", ");
            settingData.addNewUser(data);
        }
    }
    
    private void loadTableData()
    {
        DefaultTableModel tableModel = (DefaultTableModel)userTable.getModel();
        ArrayList<String> inputData = settingData.getAvailableUsers();
         for (String data : inputData) {
                String[] splitData = data.split(",");
                tableModel.addRow(splitData);
            }
    }
    private void updateUser(){
        DefaultTableModel tblModel = (DefaultTableModel)userTable.getModel();
        String Name = username.getText();
        String Password = password.getText();
        int selectedRow = userTable.getSelectedRow();
        int rowCount = tblModel.getRowCount();
        int columnToCheck = 0; // Assuming the ID is in the first column (index 0)
        for (int row = 0; row < rowCount; row++) {
            var idInTable = tblModel.getValueAt(row, columnToCheck);
            if (idInTable.equals(Name) && !idInTable.equals(tblModel.getValueAt(selectedRow, 0).toString()) ) {
                JOptionPane.showMessageDialog(this, "Username Exist!");
                return; // ID or Code exists in the JTable
            }
        }
        
        if(userTable.getSelectedRowCount() == 1){
            
            tblModel.setValueAt(Name, userTable.getSelectedRow(), 0);
            tblModel.setValueAt(Password, userTable.getSelectedRow(), 1);
            JOptionPane.showMessageDialog(this, "Updated successfully!");
            username.setText("");
            password.setText("");
//            this.rearangeTableData();
        }else{
            if(userTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Select single row for update");
            }
        }
    }
    private void deleteUser(){
        DefaultTableModel tblModel = (DefaultTableModel)userTable.getModel();
        int rows = tblModel.getRowCount();
        if (rows == 1){
            JOptionPane.showMessageDialog(this, "Can not delete all available users!");
            return;
        }
        if(userTable.getSelectedRowCount() == 1){
            tblModel.removeRow(userTable.getSelectedRow());
            username.setText("");
            password.setText("");
            this.rearangeTableData();
            JOptionPane.showMessageDialog(this, "Deleted Successfully!");
        }else{
            if(userTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a single row!");
            }
        }
    }
    private void createNewUser(){
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        String user = username.getText();
        String pass = password.getText();
        int rowCount = model.getRowCount();
        int columnToCheck = 0; // Assuming the ID is in the first column (index 0)

        for (int row = 0; row < rowCount; row++) {
            var idInTable = model.getValueAt(row, columnToCheck);
            if (idInTable.equals(user) ) {
                JOptionPane.showMessageDialog(this, "Username Exist!");
                return; // ID or Code exists in the JTable
            }
        }
        if(user.equals("") || pass.equals("") ){
            JOptionPane.showMessageDialog(this, "Please Complete All Fields");
            return;
        }else{
            String data[] = { user,pass };
            DefaultTableModel tblModel = (DefaultTableModel)userTable.getModel();
            settingData.addNewUser(data);
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Success");
            username.setText("");
            password.setText("");
        }
    }
    
    private void settingTableSelectedRowLoad(){
        DefaultTableModel tblModel = (DefaultTableModel)userTable.getModel();
        int selectedRow = userTable.getSelectedRow();
        username.setText(tblModel.getValueAt(selectedRow, 0).toString());
        password.setText(tblModel.getValueAt(selectedRow, 1).toString());   
    }
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserBtn;
    private javax.swing.JLabel FormTitleLabel;
    private javax.swing.JLabel appointmentLabelBackround;
    private javax.swing.JLabel backIconLabel;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JTextField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel quitIconLabel;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
