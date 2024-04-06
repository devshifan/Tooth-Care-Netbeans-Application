/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import DataStorage.AppointmentStorage;
import DataStorage.PaymentStorage;
import DataStorage.TreatmentStorage;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.Set;
 /**
 *
 * @AuthorShifan
 * @ESOFT_ID E21644
 * @KU_ID 2377544
 * @Development_ Coursework Programming (iii)
 * 
 */
public class AppointmentForm extends javax.swing.JFrame {
    private final AppointmentStorage appointmentData = AppointmentStorage.getInstance(); 
    private final TreatmentStorage treatmentData = TreatmentStorage.getInstance(); 
    private final PaymentStorage paymentData = PaymentStorage.getInstance(); 
    private final Set<Integer> usedAppointmentIDs = new HashSet<>();

    public AppointmentForm() {
        initComponents();
        this.loadAppointmentTableData();
        this.loadAvailableTreatmentTypes();
        this.loadAvailableAppointmentSchedules();     
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
        addAppointment = new javax.swing.JButton();
        patientTreatmentType = new javax.swing.JComboBox();
        lblPatientTreatmentType = new javax.swing.JLabel();
        lblPatintName = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        patientAddress = new javax.swing.JTextField();
        lblPatinetAdress = new javax.swing.JLabel();
        patientPhoneNo = new javax.swing.JTextField();
        lblPatientPhoneNo = new javax.swing.JLabel();
        lblAppointmentDate = new javax.swing.JLabel();
        deleteAppointment = new javax.swing.JButton();
        updateAppointment = new javax.swing.JButton();
        lblAdvancePay = new javax.swing.JLabel();
        appointmentAdvancePay = new javax.swing.JTextField();
        apppoitmentDateType = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        patientNameFilter = new javax.swing.JTextField();
        lblPatintName1 = new javax.swing.JLabel();
        lblPatintName2 = new javax.swing.JLabel();
        appointmentIDFilter = new javax.swing.JTextField();
        lblPatintName3 = new javax.swing.JLabel();
        appointmentDateFilter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
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
        FormTitleLabel.setText("APPOINTMENT");
        getContentPane().add(FormTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Appointment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(950, 600));

        addAppointment.setText("Add");
        addAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentActionPerformed(evt);
            }
        });

        lblPatientTreatmentType.setText("Treatment");

        lblPatintName.setText("Patient Name");

        patientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameActionPerformed(evt);
            }
        });

        lblPatinetAdress.setText("Address");

        lblPatientPhoneNo.setText("Phone No.");

        lblAppointmentDate.setText("Date Time");

        deleteAppointment.setText("Delete");
        deleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAppointmentActionPerformed(evt);
            }
        });

        updateAppointment.setText("Update");
        updateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAppointmentActionPerformed(evt);
            }
        });

        lblAdvancePay.setText("Advance Pay");

        apppoitmentDateType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apppoitmentDateTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPatintName)
                                .addGap(32, 32, 32)
                                .addComponent(patientName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPatientTreatmentType)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPatinetAdress)
                                        .addComponent(lblPatientPhoneNo)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientTreatmentType, 0, 376, Short.MAX_VALUE)
                                    .addComponent(patientPhoneNo)
                                    .addComponent(patientAddress)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblAppointmentDate))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblAdvancePay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(appointmentAdvancePay)
                                    .addComponent(apppoitmentDateType, 0, 375, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(addAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGap(1, 1, 1)))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatintName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatinetAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientPhoneNo)
                    .addComponent(patientPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientTreatmentType)
                    .addComponent(patientTreatmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentDate)
                    .addComponent(apppoitmentDateType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentAdvancePay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvancePay))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(279, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 540, 340));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter Appointments"));

        patientNameFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameFilterActionPerformed(evt);
            }
        });
        patientNameFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patientNameFilterKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patientNameFilterKeyTyped(evt);
            }
        });

        lblPatintName1.setText("AppointmentID Filter");

        lblPatintName2.setText("Date Filter");

        appointmentIDFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentIDFilterMouseClicked(evt);
            }
        });
        appointmentIDFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentIDFilterActionPerformed(evt);
            }
        });
        appointmentIDFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appointmentIDFilterKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                appointmentIDFilterKeyTyped(evt);
            }
        });

        lblPatintName3.setText("Patient Name Filter");

        appointmentDateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentDateFilterActionPerformed(evt);
            }
        });
        appointmentDateFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appointmentDateFilterKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                appointmentDateFilterKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPatintName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(patientNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPatintName1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPatintName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appointmentDateFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(appointmentIDFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblPatintName1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatintName3)
                    .addComponent(patientNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatintName2)
                    .addComponent(appointmentDateFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(appointmentIDFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 390, 190));
        jPanel1.getAccessibleContext().setAccessibleName("Filter Appoointments");

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AppointmentID", "Patient Name", "Address", "Phone", "Treatment", "Date", "Advance Pay"
            }
        ));
        appointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appointmentTable);
        if (appointmentTable.getColumnModel().getColumnCount() > 0) {
            appointmentTable.getColumnModel().getColumn(3).setMinWidth(200);
            appointmentTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            appointmentTable.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 1060, 310));

        appointmentLabelBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Dashboard.png"))); // NOI18N
        getContentPane().add(appointmentLabelBackround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
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

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
        lblclose.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_lblcloseMouseEntered

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
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

    private void addAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAppointmentActionPerformed
        this.AddAppointment();
    }//GEN-LAST:event_addAppointmentActionPerformed

    private void deleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAppointmentActionPerformed
        this.DeleteAppointment();
    }//GEN-LAST:event_deleteAppointmentActionPerformed

    private void updateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAppointmentActionPerformed
        this.UpdateAppointment();
    }//GEN-LAST:event_updateAppointmentActionPerformed

    private void patientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameActionPerformed

    private void appointmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentTableMouseClicked
        this.appointmentTableSelectedRowLoad();
    }//GEN-LAST:event_appointmentTableMouseClicked

    private void apppoitmentDateTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apppoitmentDateTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apppoitmentDateTypeActionPerformed

    private void patientNameFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameFilterActionPerformed

    private void appointmentIDFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentIDFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentIDFilterActionPerformed

    private void patientNameFilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientNameFilterKeyTyped
        
    }//GEN-LAST:event_patientNameFilterKeyTyped

    private void appointmentDateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentDateFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentDateFilterActionPerformed

    private void appointmentDateFilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentDateFilterKeyTyped
        
    }//GEN-LAST:event_appointmentDateFilterKeyTyped

    private void appointmentIDFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentIDFilterMouseClicked
        
    }//GEN-LAST:event_appointmentIDFilterMouseClicked

    private void appointmentIDFilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentIDFilterKeyTyped
        
    }//GEN-LAST:event_appointmentIDFilterKeyTyped

    private void appointmentIDFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentIDFilterKeyReleased
        this.filterByAppointmentId();
        
    }//GEN-LAST:event_appointmentIDFilterKeyReleased

    private void patientNameFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientNameFilterKeyReleased
        this.filterByPatientName();
        
    }//GEN-LAST:event_patientNameFilterKeyReleased

    private void appointmentDateFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentDateFilterKeyReleased
        this.filterByDate();
        
    }//GEN-LAST:event_appointmentDateFilterKeyReleased
    private void appointmentTableSelectedRowLoad(){
        DefaultTableModel tblModel = (DefaultTableModel)appointmentTable.getModel();
        int selectedRow = appointmentTable.getSelectedRow();
        patientName.setText(tblModel.getValueAt(selectedRow, 1).toString());
        patientAddress.setText(tblModel.getValueAt(selectedRow, 2).toString());
        patientPhoneNo.setText(tblModel.getValueAt(selectedRow, 3).toString());
        patientTreatmentType.setSelectedItem(tblModel.getValueAt(selectedRow, 4).toString());
        apppoitmentDateType.setSelectedItem(tblModel.getValueAt(selectedRow, 5).toString());
        appointmentAdvancePay.setText(tblModel.getValueAt(selectedRow, 6).toString());
    }
    
    private void AddAppointment() {
        DefaultTableModel model = (DefaultTableModel) appointmentTable.getModel();
        String date = apppoitmentDateType.getSelectedItem().toString();

        // Find the next unique AppointmentID
        int nextAppointmentID = getNextUniqueAppointmentID();

        int rowCount = model.getRowCount();
        int columnToCheck = 5; // Assuming the date column is at index 5 (column index is 0-based)
 

        if (patientName.getText().equals("") ||
                patientAddress.getText().equals("") ||
                appointmentAdvancePay.getText().equals("") ||
                apppoitmentDateType.getSelectedItem().toString().equals("") ||
                patientTreatmentType.getSelectedItem().toString().equals("") ||
                patientPhoneNo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Complete All Fields");
            return;
        } else {
            String dataAppointment[] = {
                    Integer.toString(nextAppointmentID),
                    patientName.getText(),
                    patientAddress.getText(),
                    patientPhoneNo.getText(),
                    patientTreatmentType.getSelectedItem().toString(),
                    apppoitmentDateType.getSelectedItem().toString(),
                    appointmentAdvancePay.getText()
            };
            String dataPayment[] = {
                    patientName.getText(),
                    patientAddress.getText(),
                    patientPhoneNo.getText(),
                    patientTreatmentType.getSelectedItem().toString(),
                    apppoitmentDateType.getSelectedItem().toString(),
                    appointmentAdvancePay.getText(),
                    "Pending"
            };

            DefaultTableModel tblModel = (DefaultTableModel) appointmentTable.getModel();
            appointmentData.addNewAppointment(dataAppointment);
            paymentData.addNewPayment(dataPayment);

            tblModel.addRow(dataAppointment);
            JOptionPane.showMessageDialog(this, "Add Data Success");
            patientName.setText("");
            patientAddress.setText("");
            patientPhoneNo.setText("");
            patientTreatmentType.setSelectedIndex(-1);
            apppoitmentDateType.setSelectedIndex(-1);
            appointmentAdvancePay.setText("");
            usedAppointmentIDs.add(nextAppointmentID); // Add the used ID to the set
        }
    }

    private int getNextUniqueAppointmentID() {
        int nextAppointmentID = 1;

        // Keep generating IDs until a unique one is found
        while (usedAppointmentIDs.contains(nextAppointmentID)) {
            nextAppointmentID++;
        }

        return nextAppointmentID;
    }
    
    private void UpdateAppointment(){
        DefaultTableModel tblModel = (DefaultTableModel)appointmentTable.getModel();
        if(appointmentTable.getSelectedRowCount() == 1){
            String _patientName = patientName.getText();
            String _patientAddress = patientAddress.getText();
            String _patientPhoneNo = patientPhoneNo.getText();
            String _patientTreatmentType = patientTreatmentType.getSelectedItem().toString();
            String _appointmentDate = apppoitmentDateType.getSelectedItem().toString();
            String _appointmentAdvancePay = appointmentAdvancePay.getText();
            
            tblModel.setValueAt(_patientName, appointmentTable.getSelectedRow(), 1);
            tblModel.setValueAt(_patientAddress, appointmentTable.getSelectedRow(), 2);
            tblModel.setValueAt(_patientPhoneNo, appointmentTable.getSelectedRow(), 3);
            tblModel.setValueAt(_patientTreatmentType, appointmentTable.getSelectedRow(), 4);
            tblModel.setValueAt(_appointmentDate, appointmentTable.getSelectedRow(), 5);
            tblModel.setValueAt(_appointmentAdvancePay, appointmentTable.getSelectedRow(), 6);
            
            JOptionPane.showMessageDialog(this, "Treatment Updated successfully!");
            patientName.setText("");
            patientAddress.setText("");
            patientPhoneNo.setText("");
            patientTreatmentType.setSelectedIndex(-1);
            apppoitmentDateType.setSelectedIndex(-1);
            appointmentAdvancePay.setText("");
            
            this.rearangeTableData();
        
        }else{
            if(appointmentTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Select single row for update");
            }
        }
    }
    private void DeleteAppointment(){
        DefaultTableModel tblModel = (DefaultTableModel)appointmentTable.getModel();
        if(appointmentTable.getSelectedRowCount() == 1){
            tblModel.removeRow(appointmentTable.getSelectedRow());
            patientName.setText("");
            patientAddress.setText("");
            patientPhoneNo.setText("");
            patientTreatmentType.setSelectedIndex(-1);
            apppoitmentDateType.setSelectedIndex(-1);
            appointmentAdvancePay.setText("");
            this.rearangeTableData();
            JOptionPane.showMessageDialog(this, "Treatment Deleted Successfully!");
        }else{
            if(appointmentTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "please select a single row!");
            }
        } 
    }
    private void loadAppointmentTableData()
    {
        DefaultTableModel tableModel = (DefaultTableModel)appointmentTable.getModel();
        ArrayList<String> inputData = appointmentData.getAvailableAppointment();
         for (String data : inputData) {
                String[] splitData = data.split(",");
                tableModel.addRow(splitData);
            }
    }
    private void rearangeTableData()
    {
        appointmentData.resetAppointmentData();
        DefaultTableModel tableModel = (DefaultTableModel)appointmentTable.getModel();
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
            appointmentData.addNewAppointment(data);
        }
    }
    private void loadAvailableTreatmentTypes(){
     ArrayList<String> inputData = treatmentData.getAvailableTreatments();
        for (String data : inputData) {
                String[] splitData = data.split(",");
                patientTreatmentType.addItem(splitData[1]);
            }
    }
    private void loadAvailableAppointmentSchedules(){
        apppoitmentDateType.addItem("Monday     06.00 pm - 09.00 pm");
        apppoitmentDateType.addItem("Wednesday  06.00 pm - 09.00 pm");
        apppoitmentDateType.addItem("Saturday   03.00 pm - 10.00 pm");
        apppoitmentDateType.addItem("Sunday     03.00 pm - 10.00 pm");
         
    }
    private void filterTable(Integer ColumnIndex,String ColumnValue) {
        DefaultTableModel tableModel = (DefaultTableModel)appointmentTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        appointmentTable.setRowSorter(sorter);
        
        RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + ColumnValue, ColumnIndex);
        sorter.setRowFilter(rowFilter);
    }
    
    private void filterByAppointmentId(){
        String appointmentDate = appointmentIDFilter.getText();
        this.filterTable(0,appointmentDate);
    }
    private void filterByPatientName(){
        String PatientName = patientNameFilter.getText();
        this.filterTable(1,PatientName);    
    }
    private void filterByDate(){
        String appointmentDate = appointmentDateFilter.getText();
        this.filterTable(5,appointmentDate);    
    }
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FormTitleLabel;
    private javax.swing.JButton addAppointment;
    private javax.swing.JTextField appointmentAdvancePay;
    private javax.swing.JTextField appointmentDateFilter;
    private javax.swing.JTextField appointmentIDFilter;
    private javax.swing.JLabel appointmentLabelBackround;
    private javax.swing.JTable appointmentTable;
    private javax.swing.JComboBox apppoitmentDateType;
    private javax.swing.JLabel backIconLabel;
    private javax.swing.JButton deleteAppointment;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdvancePay;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblPatientPhoneNo;
    private javax.swing.JLabel lblPatientTreatmentType;
    private javax.swing.JLabel lblPatinetAdress;
    private javax.swing.JLabel lblPatintName;
    private javax.swing.JLabel lblPatintName1;
    private javax.swing.JLabel lblPatintName2;
    private javax.swing.JLabel lblPatintName3;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JTextField patientAddress;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField patientNameFilter;
    private javax.swing.JTextField patientPhoneNo;
    private javax.swing.JComboBox patientTreatmentType;
    private javax.swing.JLabel quitIconLabel;
    private javax.swing.JButton updateAppointment;
    // End of variables declaration//GEN-END:variables
}
