/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import DataStorage.PaymentStorage;
import DataStorage.TreatmentStorage;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class PaymentForm extends javax.swing.JFrame {
    private final TreatmentStorage treatmentData = TreatmentStorage.getInstance(); 
    private final PaymentStorage paymentData = PaymentStorage.getInstance(); 
    
    public PaymentForm() {
        initComponents();
        this.loadPaymentTableData(); 
        this.loadTreatmentWithPatient();
        this.loadAppointmentDateTime();
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
        paymentBalance = new javax.swing.JTextField();
        lblPatintName1 = new javax.swing.JLabel();
        paymentTreatmentCharge = new javax.swing.JTextField();
        lblAdvancePay1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
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
        FormTitleLabel.setText("PAYMENT");
        getContentPane().add(FormTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Payments", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(950, 600));

        lblPatientTreatmentType.setText("Treatment");

        lblPatintName.setText("Patient Name");

        patientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameActionPerformed(evt);
            }
        });

        lblPatinetAdress.setText("Address");

        lblPatientPhoneNo.setText("Phone No.");

        lblAppointmentDate.setText("Date");

        deleteAppointment.setText("Remove Payment");
        deleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAppointmentActionPerformed(evt);
            }
        });

        updateAppointment.setText("Confirm Payment");
        updateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAppointmentActionPerformed(evt);
            }
        });

        lblAdvancePay.setText("Advance Pay");

        appointmentAdvancePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentAdvancePayActionPerformed(evt);
            }
        });

        apppoitmentDateType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apppoitmentDateTypeActionPerformed(evt);
            }
        });

        paymentBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBalanceActionPerformed(evt);
            }
        });

        lblPatintName1.setText("Bal. Payment");

        paymentTreatmentCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTreatmentChargeActionPerformed(evt);
            }
        });

        lblAdvancePay1.setText("Treatment Charge");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPatintName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patientName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPatinetAdress)
                                    .addComponent(lblPatientPhoneNo)
                                    .addComponent(lblAppointmentDate))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(patientPhoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apppoitmentDateType, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE)
                                    .addComponent(patientAddress))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientTreatmentType)
                            .addComponent(lblAdvancePay1)
                            .addComponent(lblAdvancePay)
                            .addComponent(lblPatintName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(appointmentAdvancePay)
                            .addComponent(paymentTreatmentCharge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientTreatmentType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(updateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(deleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatintName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPatinetAdress))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientTreatmentType)
                            .addComponent(patientTreatmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdvancePay1)
                            .addComponent(paymentTreatmentCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdvancePay)
                            .addComponent(appointmentAdvancePay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientPhoneNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPatintName1)
                                .addComponent(apppoitmentDateType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAppointmentDate)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 680, 250));

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Address", "Phone", "Treatment", "Date", "Advance Pay", "Status"
            }
        ));
        paymentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(paymentTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1060, 340));

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

    private void patientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameActionPerformed

    private void deleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAppointmentActionPerformed
        this.resetPayment();
    }//GEN-LAST:event_deleteAppointmentActionPerformed

    private void updateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAppointmentActionPerformed
          this.confirmPaymentAndPrint();
    }//GEN-LAST:event_updateAppointmentActionPerformed

    private void apppoitmentDateTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apppoitmentDateTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apppoitmentDateTypeActionPerformed

    private void paymentBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentBalanceActionPerformed

    private void appointmentAdvancePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentAdvancePayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentAdvancePayActionPerformed

    private void paymentTreatmentChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTreatmentChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentTreatmentChargeActionPerformed

    private void paymentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentTableMouseClicked
        this.paymentTableSelectedRowLoad();
    }//GEN-LAST:event_paymentTableMouseClicked
    private void paymentTableSelectedRowLoad(){
        DefaultTableModel tblModel = (DefaultTableModel)paymentTable.getModel();
        int selectedRow = paymentTable.getSelectedRow();
        //if appointment already complete show confirmation popup
        if(tblModel.getValueAt(selectedRow, 6).equals("Complete")){
        int dialogResult = JOptionPane.showConfirmDialog(null, "Payment Already Complete,Do you want to Print Invoice?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) { 
                    this.confirmPaymentAndPrint();
                    return;
                } else {
                    return; 
                }
        }
        
        var paymentStatus = tblModel.getValueAt(selectedRow, 0).toString();
        if(paymentStatus.equals("Complete")){
            return;
        }
        var treatments = treatmentData.getAvailableTreatments();
        Object[] selectedTreatment = null;
         for (String data : treatments) {
             String[] splitData = data.split(",");
             if(tblModel.getValueAt(selectedRow, 3).equals(splitData[1])){
                selectedTreatment = splitData;
                break;
             }
            }
         if (selectedTreatment != null) {
             System.out.println("selectedTreatment" + selectedTreatment[1].toString());
             paymentTreatmentCharge.setText(selectedTreatment[2].toString());
         }
        
        patientName.setText(tblModel.getValueAt(selectedRow, 0).toString());
        patientAddress.setText(tblModel.getValueAt(selectedRow, 1).toString());
        patientPhoneNo.setText(tblModel.getValueAt(selectedRow, 2).toString());
        patientTreatmentType.setSelectedItem(tblModel.getValueAt(selectedRow, 3).toString());
        apppoitmentDateType.setSelectedItem(tblModel.getValueAt(selectedRow, 4).toString());
        appointmentAdvancePay.setText(tblModel.getValueAt(selectedRow, 5).toString());
        
        double AdvancePay = Double.parseDouble(appointmentAdvancePay.getText());
        double TreatmentCharge = Double.parseDouble(paymentTreatmentCharge.getText());
        double result = TreatmentCharge - AdvancePay;
        paymentBalance.setText(String.valueOf(result));
        
    }
    private void loadPaymentTableData() {
        DefaultTableModel tableModel = (DefaultTableModel)paymentTable.getModel();
        ArrayList<String> inputData = paymentData.getAvailablePayment();
         for (String data : inputData) {
                String[] splitData = data.split(",");
                tableModel.addRow(splitData);
            }
    }
    private void rearangeTableData()
    {
        paymentData.resetPaymentData();
        DefaultTableModel tableModel = (DefaultTableModel)paymentTable.getModel();
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
            paymentData.addNewPayment(data);
        }
    }
    public void confirmPaymentAndPrint()
    {

        DefaultTableModel tblModel = (DefaultTableModel)paymentTable.getModel();
        if(paymentTable.getSelectedRowCount() == 1){
            tblModel.setValueAt("Complete", paymentTable.getSelectedRow(), 6);
        }
        int selectedRow = paymentTable.getSelectedRow();
        String name = tblModel.getValueAt(selectedRow, 0).toString();
        String address = tblModel.getValueAt(selectedRow, 1).toString();
        String phoneNo = tblModel.getValueAt(selectedRow, 2).toString();
        String dateType = tblModel.getValueAt(selectedRow, 4).toString();
        String treatmentType = tblModel.getValueAt(selectedRow, 3).toString();
        String advancePay = tblModel.getValueAt(selectedRow, 5).toString();
        
        //        
        var paymentStatus = tblModel.getValueAt(selectedRow, 0).toString();
        if(paymentStatus.equals("Complete")){
            return;
        }
        var paymentTreatmentCharge = "";
        var treatments = treatmentData.getAvailableTreatments();
        Object[] selectedTreatment = null;
         for (String data : treatments) {
             String[] splitData = data.split(",");
             if(tblModel.getValueAt(selectedRow, 3).equals(splitData[1])){
                selectedTreatment = splitData;
                break;
             }
            }
         if (selectedTreatment != null) {
             paymentTreatmentCharge = selectedTreatment[2].toString();
         }
        
        double AdvancePaid = Double.parseDouble(advancePay);
        double TreatmentCharge = Double.parseDouble(paymentTreatmentCharge);
        double payBalance = TreatmentCharge - AdvancePaid;
        
        String treatmentCharge = paymentTreatmentCharge;
        String balance = String.valueOf(payBalance);
        this.rearangeTableData();
        
        try {
            new print (name,address,phoneNo,dateType,treatmentType,treatmentCharge,advancePay,balance).setVisible(true);
        } catch (PrinterException ex) {
            Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.hide();
        
    }
    private void loadAppointmentDateTime(){
        apppoitmentDateType.addItem("Monday     06.00 pm - 09.00 pm");
        apppoitmentDateType.addItem("Wednesday  06.00 pm - 09.00 pm");
        apppoitmentDateType.addItem("Saturday   03.00 pm - 10.00 pm");
        apppoitmentDateType.addItem("Sunday     03.00 pm - 10.00 pm");
    }
    private void loadTreatmentWithPatient(){
        ArrayList<String> inputData = treatmentData.getAvailableTreatments();
        for (String data : inputData) {
                String[] splitData = data.split(",");
                patientTreatmentType.addItem(splitData[1]);
            }
    }
    public void resetPayment(){
        patientName.setText("");
        patientAddress.setText("");
        patientPhoneNo.setText("");
        paymentTreatmentCharge.setText("");
        appointmentAdvancePay.setText("");
        paymentBalance.setText("");
        patientTreatmentType.setSelectedIndex(-1);
        apppoitmentDateType.setSelectedIndex(-1);
    }
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FormTitleLabel;
    private javax.swing.JTextField appointmentAdvancePay;
    private javax.swing.JLabel appointmentLabelBackround;
    private javax.swing.JComboBox apppoitmentDateType;
    private javax.swing.JLabel backIconLabel;
    private javax.swing.JButton deleteAppointment;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdvancePay;
    private javax.swing.JLabel lblAdvancePay1;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblPatientPhoneNo;
    private javax.swing.JLabel lblPatientTreatmentType;
    private javax.swing.JLabel lblPatinetAdress;
    private javax.swing.JLabel lblPatintName;
    private javax.swing.JLabel lblPatintName1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JTextField patientAddress;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField patientPhoneNo;
    private javax.swing.JComboBox patientTreatmentType;
    private javax.swing.JTextField paymentBalance;
    private javax.swing.JTable paymentTable;
    private javax.swing.JTextField paymentTreatmentCharge;
    private javax.swing.JLabel quitIconLabel;
    private javax.swing.JButton updateAppointment;
    // End of variables declaration//GEN-END:variables
}
