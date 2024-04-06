/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import DataStorage.SettingStorage;
import DataStorage.TreatmentStorage;
import java.awt.Color;
import java.awt.Font;
 /**
 *
 * @AuthorShifan
 * @ESOFT_ID E21644
 * @KU_ID 2377544
 * @Development_ Coursework Programming (iii)
 * 
 */
public class DashboardForm extends javax.swing.JFrame {
    private final TreatmentStorage treatmentData = TreatmentStorage.getInstance(); 
    
    public DashboardForm() {
        initComponents();
        loadDefaultData();
    } 
    
    //  ----------------------------------  Custom Functions Development ---------------------------------- 
    //  INITIALIZE FUNCTIONS
    //  loadDefaultData()       => Check and set Default Data (one of requiremt in coursework!)
    
    //  NAVIGATION FUNCTIONS
    //  navigateAppointment()   => Set View As AppointmentForm JFrame
    //  navigateTratment()      => Set View As TratmentForm JFrame
    //  navigatePayment()       => Set View As PaymentForm JFrame
    //  navigateSettings()      => Set View As SettingsForm JFrame
    //  navigateBackOrHome()    => Set View As DashboardForm JFrame
    //  navigateLogin()         => Set View As LoginForm JFrame
     
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmin = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        backIconLabel = new javax.swing.JLabel();
        homeIconLabel = new javax.swing.JLabel();
        quitIconLabel = new javax.swing.JLabel();
        FormTitleLabel = new javax.swing.JLabel();
        appointmentIconLabel = new javax.swing.JLabel();
        appointmentLabel = new javax.swing.JLabel();
        medicineIconLabel = new javax.swing.JLabel();
        medicineLabel = new javax.swing.JLabel();
        settingIconLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        paymentIconLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
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
        FormTitleLabel.setText("DASHBOARD");
        getContentPane().add(FormTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 40));

        appointmentIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/appointment.png"))); // NOI18N
        appointmentIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appointmentIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appointmentIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(appointmentIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 130, 120));

        appointmentLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        appointmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentLabel.setText("APPOINTMENT");
        appointmentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appointmentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appointmentLabelMouseExited(evt);
            }
        });
        getContentPane().add(appointmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 150, 40));

        medicineIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicineIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/medicine.png"))); // NOI18N
        medicineIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medicineIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medicineIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(medicineIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 140, 120));

        medicineLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        medicineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicineLabel.setText("TREATMENT");
        medicineLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medicineLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medicineLabelMouseExited(evt);
            }
        });
        getContentPane().add(medicineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 130, 40));

        settingIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/setting.png"))); // NOI18N
        settingIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(settingIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 130, 110));

        settingLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        settingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingLabel.setText("SETTING");
        settingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingLabelMouseExited(evt);
            }
        });
        getContentPane().add(settingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 110, 40));

        paymentIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/payment.png"))); // NOI18N
        paymentIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentIconLabelMouseExited(evt);
            }
        });
        getContentPane().add(paymentIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 150, 140));

        paymentLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        paymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentLabel.setText("PAYMENT");
        paymentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentLabelMouseExited(evt);
            }
        });
        getContentPane().add(paymentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 110, 40));

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
        this.navigateLogin();
    }//GEN-LAST:event_quitIconLabelMouseClicked

    private void backIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconLabelMouseClicked
        this.navigateBackOrHome();
    }//GEN-LAST:event_backIconLabelMouseClicked

    private void homeIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLabelMouseClicked
        this.navigateBackOrHome();
    }//GEN-LAST:event_homeIconLabelMouseClicked

    private void appointmentIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentIconLabelMouseClicked
        this.navigateAppointment();
    }//GEN-LAST:event_appointmentIconLabelMouseClicked

    private void appointmentIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentIconLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        appointmentLabel.setFont(customFont);
        appointmentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/appointmentAnimated.png")));
    }//GEN-LAST:event_appointmentIconLabelMouseEntered

    private void appointmentIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentIconLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        appointmentLabel.setFont(customFont);
        appointmentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/appointment.png")));
    }//GEN-LAST:event_appointmentIconLabelMouseExited

    private void appointmentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentLabelMouseClicked
        this.navigateAppointment();
    }//GEN-LAST:event_appointmentLabelMouseClicked

    private void appointmentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        appointmentLabel.setFont(customFont);
        appointmentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/appointmentAnimated.png")));
    }//GEN-LAST:event_appointmentLabelMouseEntered

    private void appointmentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        appointmentLabel.setFont(customFont);
        appointmentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/appointment.png")));
    }//GEN-LAST:event_appointmentLabelMouseExited

    private void medicineIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineIconLabelMouseClicked
        this.navigateTratment();
    }//GEN-LAST:event_medicineIconLabelMouseClicked

    private void medicineIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineIconLabelMouseEntered
        // TODO add your handling code here:
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        medicineLabel.setFont(customFont);
        medicineIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/medicineAnimated.png")));
    }//GEN-LAST:event_medicineIconLabelMouseEntered

    private void medicineIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineIconLabelMouseExited
        // TODO add your handling code here:
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        medicineLabel.setFont(customFont);
        medicineIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/medicine.png")));
    }//GEN-LAST:event_medicineIconLabelMouseExited

    private void medicineLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineLabelMouseClicked
        this.navigateTratment();
    }//GEN-LAST:event_medicineLabelMouseClicked

    private void medicineLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        medicineLabel.setFont(customFont);
        medicineIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/medicineAnimated.png")));
    }//GEN-LAST:event_medicineLabelMouseEntered

    private void medicineLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        medicineLabel.setFont(customFont);
        medicineIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/medicine.png")));
    }//GEN-LAST:event_medicineLabelMouseExited

    private void settingIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingIconLabelMouseClicked
        this.navigateSettings();
    }//GEN-LAST:event_settingIconLabelMouseClicked

    private void settingIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingIconLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        settingLabel.setFont(customFont);
        settingIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/settingAnimated.png")));
    }//GEN-LAST:event_settingIconLabelMouseEntered

    private void settingIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingIconLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        settingLabel.setFont(customFont);
        settingIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/setting.png")));
    }//GEN-LAST:event_settingIconLabelMouseExited

    private void settingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLabelMouseClicked
        this.navigateSettings();
    }//GEN-LAST:event_settingLabelMouseClicked

    private void settingLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        settingLabel.setFont(customFont);
        settingIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/settingAnimated.png")));
    }//GEN-LAST:event_settingLabelMouseEntered

    private void settingLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        settingLabel.setFont(customFont);
        settingIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/setting.png")));
    }//GEN-LAST:event_settingLabelMouseExited

    private void paymentIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentIconLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        paymentLabel.setFont(customFont);
        paymentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/paymentAnimated.png")));
    }//GEN-LAST:event_paymentIconLabelMouseEntered

    private void paymentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseEntered
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 18);
        paymentLabel.setFont(customFont);
        paymentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/paymentAnimated.png")));
    }//GEN-LAST:event_paymentLabelMouseEntered

    private void paymentIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentIconLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        paymentLabel.setFont(customFont);
        paymentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/payment.png")));
    }//GEN-LAST:event_paymentIconLabelMouseExited

    private void paymentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseExited
        Font customFont = new Font("Helvetica Neue", Font.BOLD, 13);
        paymentLabel.setFont(customFont);
        paymentIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/payment.png")));
    }//GEN-LAST:event_paymentLabelMouseExited

    private void paymentIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentIconLabelMouseClicked
        this.navigatePayment();
    }//GEN-LAST:event_paymentIconLabelMouseClicked

    private void paymentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseClicked
        this.navigatePayment();
    }//GEN-LAST:event_paymentLabelMouseClicked
 
    private void loadDefaultData(){
        var defaultTreatments = treatmentData.getAvailableTreatments();
        String[][] StoreTreatment = {
                                        { "code-1", "Cleanings", "2500" },
                                        { "code-2", "Whitening", "3000" },
                                        { "code-3", "Filling", "4500" },
                                        { "code-4", "Nerve Filling", "5500" },
                                        { "code-5", "Root Canal Therapy", "8500" }
                                    };
        if(defaultTreatments.size() == 0){
            for (String[] treatment : StoreTreatment) {
                treatmentData.addNewTreatment(treatment);
            }    
        }
      
    }
    
    private void navigateAppointment(){
        AppointmentForm appointmentForm =new AppointmentForm();
        this.hide();
        appointmentForm.setVisible(true);
    }
    private void navigateTratment(){
        TreatmentForm medicineForm =new TreatmentForm();
        this.hide();
        medicineForm.setVisible(true);
    }
    private void navigatePayment(){
        PaymentForm paymentForm =new PaymentForm();
        this.hide();
        paymentForm.setVisible(true);
    }
    private void navigateSettings(){
        SettingForm settingForm =new SettingForm();
        this.hide();
        settingForm.setVisible(true);
    }
    private void navigateBackOrHome(){
        DashboardForm dashboard =new DashboardForm();
        this.hide();
        dashboard.setVisible(true);
    }
    private void navigateLogin(){
        LoginForm loginForm =new LoginForm();
        this.hide();
        loginForm.setVisible(true);
    }
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FormTitleLabel;
    private javax.swing.JLabel appointmentIconLabel;
    private javax.swing.JLabel appointmentLabel;
    private javax.swing.JLabel appointmentLabelBackround;
    private javax.swing.JLabel backIconLabel;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel medicineIconLabel;
    private javax.swing.JLabel medicineLabel;
    private javax.swing.JLabel paymentIconLabel;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel quitIconLabel;
    private javax.swing.JLabel settingIconLabel;
    private javax.swing.JLabel settingLabel;
    // End of variables declaration//GEN-END:variables
}
