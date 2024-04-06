/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import DataStorage.AppointmentStorage;
import DataStorage.PaymentStorage;
import DataStorage.SettingStorage;
import DataStorage.TreatmentStorage;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @AuthorShifan
 * @ESOFT_ID E21644
 * @KU_ID 2377544
 * @Development_ Coursework Programming (iii)
 * 
 */
public class LoginForm extends javax.swing.JFrame {
    private final SettingStorage settingData = SettingStorage.getInstance(); 
    private final TreatmentStorage treatmentData = TreatmentStorage.getInstance(); 
    private final AppointmentStorage appointmentData = AppointmentStorage.getInstance(); 
    private final PaymentStorage paymentData = PaymentStorage.getInstance(); 
    
    public LoginForm() {
        initComponents();
        userTextField.setBackground(new Color(0,0,0,0));
        passwordTextField.setBackground(new Color(0,0,0,0));
        this.setDefaultCredentials();
    }
    
    
    
    
    
    
    
    
    
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        userIcon = new javax.swing.JLabel();
        passIcon = new javax.swing.JLabel();
        loginbtn = new javax.swing.JLabel();
        usernameSeparator = new javax.swing.JSeparator();
        passwordSeparator = new javax.swing.JSeparator();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        resetLabel = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 750));
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setPreferredSize(new java.awt.Dimension(1075, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setBackground(new java.awt.Color(255, 255, 255));
        userLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("USERNAME");
        getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 130, 20));

        userTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userTextField.setForeground(new java.awt.Color(255, 255, 255));
        userTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTextField.setBorder(null);
        userTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userTextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userTextFieldMouseExited(evt);
            }
        });
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        userTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextFieldKeyPressed(evt);
            }
        });
        getContentPane().add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 160, 30));

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("PASSWORD");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 130, 20));

        passwordTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextField.setBorder(null);
        passwordTextField.setMinimumSize(new java.awt.Dimension(75, 15));
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordTextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordTextFieldMouseExited(evt);
            }
        });
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        passwordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 160, 30));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/username.png"))); // NOI18N
        userIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userIconMouseExited(evt);
            }
        });
        getContentPane().add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        passIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/passwrd.png"))); // NOI18N
        passIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passIconMouseExited(evt);
            }
        });
        getContentPane().add(passIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/login.png"))); // NOI18N
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtnMouseExited(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 180, 90));
        getContentPane().add(usernameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 160, 10));
        getContentPane().add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 160, 10));

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

        resetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/reset.png"))); // NOI18N
        resetLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetLabelMouseExited(evt);
            }
        });
        getContentPane().add(resetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 90, 60));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/DentalLogin.png"))); // NOI18N
        getContentPane().add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            passwordTextField.requestFocus();
        }
    }//GEN-LAST:event_userTextFieldKeyPressed

    private void passwordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginbtn.requestFocus();
        }
    }//GEN-LAST:event_passwordTextFieldKeyPressed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        this.DefaultLogin();
        
    }//GEN-LAST:event_loginbtnMouseClicked

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
        lblclose.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_lblcloseMouseEntered

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
        lblclose.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_lblcloseMouseExited

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblminMouseClicked

    private void lblminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseEntered
        lblmin.setBackground(new Color(0,128,255));
        lblmin.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblminMouseEntered

    private void lblminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseExited
        lblmin.setBackground(new Color(204,204,204));
        lblmin.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_lblminMouseExited

    private void loginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseEntered
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/loginAnimated.png")));
    }//GEN-LAST:event_loginbtnMouseEntered

    private void loginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseExited
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/login.png")));
    }//GEN-LAST:event_loginbtnMouseExited

    private void passwordTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMouseEntered

    }//GEN-LAST:event_passwordTextFieldMouseEntered

    private void passwordTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMouseExited
 
    }//GEN-LAST:event_passwordTextFieldMouseExited

    private void passIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passIconMouseEntered
 
    }//GEN-LAST:event_passIconMouseEntered

    private void passIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passIconMouseExited
 
    }//GEN-LAST:event_passIconMouseExited

    private void userTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextFieldMouseEntered
 
    }//GEN-LAST:event_userTextFieldMouseEntered

    private void userTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextFieldMouseExited
 
    }//GEN-LAST:event_userTextFieldMouseExited

    private void userIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userIconMouseEntered
 
    }//GEN-LAST:event_userIconMouseEntered

    private void userIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userIconMouseExited
 
    }//GEN-LAST:event_userIconMouseExited

    private void resetLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetLabelMouseEntered
        resetLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/resetAnimated.png")));
    }//GEN-LAST:event_resetLabelMouseEntered

    private void resetLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetLabelMouseExited
        resetLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/reset.png")));
    }//GEN-LAST:event_resetLabelMouseExited

    private void resetLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetLabelMouseClicked
        this.resetAapplication();
    }//GEN-LAST:event_resetLabelMouseClicked

    private void resetAapplication(){
        String input = JOptionPane.showInputDialog(null, "Type 'CONFIRM' to reset :", "Reset Confirmation", JOptionPane.QUESTION_MESSAGE);
        if(input.equals("CONFIRM")){
            settingData.resetUserData();
            treatmentData.resettTreatmentData();
            appointmentData.resetAppointmentData();
            paymentData.resetPaymentData();
        }
    }
    private void setDefaultCredentials(){
        ArrayList<String> userData = settingData.getAvailableUsers();
        if(userData.isEmpty()){
            String data[] = { "Admin","123" };
            settingData.addNewUser(data);
            userTextField.setText("Admin");
            passwordTextField.setText("123");
        }else if(userData.size() == 1){
            String lastValue = userData.get(0);
            String[] splitData = lastValue.split(",");
            userTextField.setText(splitData[0]);
            passwordTextField.setText(splitData[1]);
        }
    }
    
    private void DefaultLogin(){
        DashboardForm dashboard = new DashboardForm();        
        this.hide();
        dashboard.setVisible(true);
    }
    private void validateLogin(){
        ArrayList<String> userData = settingData.getAvailableUsers();
        String _username = userTextField.getText();
        String _password = passwordTextField.getText();
        DashboardForm dashboard = new DashboardForm();        
        for (String data : userData) {
            String[] splitData = data.split(",");
            if(splitData[0].equals(_username) && splitData[1].equals(_password) ){
                this.hide();
                dashboard.setVisible(true);
            }
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JLabel passIcon;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel resetLabel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    private javax.swing.JSeparator usernameSeparator;
    // End of variables declaration//GEN-END:variables
}
