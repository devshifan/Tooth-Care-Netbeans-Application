/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import DataStorage.TreatmentStorage;
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
public class TreatmentForm extends javax.swing.JFrame {
    private final TreatmentStorage treatmentData = TreatmentStorage.getInstance(); 
    
    public TreatmentForm() {
         initComponents();
        this.loadTreatmentTableData();
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
        updateTreatmentBtn = new javax.swing.JButton();
        chargeLabel = new javax.swing.JLabel();
        treatmentPriceCharge = new javax.swing.JTextField();
        deleteTreatmentBtn = new javax.swing.JButton();
        treatmentName = new javax.swing.JTextField();
        treatmentLabel = new javax.swing.JLabel();
        AddTreatmentBtn = new javax.swing.JButton();
        treatmentCodeLabel = new javax.swing.JLabel();
        treatmentCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        treatmentTable = new javax.swing.JTable();
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
        FormTitleLabel.setText("TREATMENT");
        getContentPane().add(FormTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treatment Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(950, 600));

        updateTreatmentBtn.setText("Update");
        updateTreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTreatmentBtnActionPerformed(evt);
            }
        });

        chargeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chargeLabel.setText("Price Charge");

        treatmentPriceCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentPriceChargeActionPerformed(evt);
            }
        });

        deleteTreatmentBtn.setText("Delete");
        deleteTreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTreatmentBtnActionPerformed(evt);
            }
        });

        treatmentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                treatmentNameKeyPressed(evt);
            }
        });

        treatmentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treatmentLabel.setText("Treatment Name");

        AddTreatmentBtn.setText("Add");
        AddTreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTreatmentBtnActionPerformed(evt);
            }
        });

        treatmentCodeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treatmentCodeLabel.setText("Treatment Code");

        treatmentCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentCodeActionPerformed(evt);
            }
        });
        treatmentCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                treatmentCodeKeyPressed(evt);
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
                        .addComponent(AddTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chargeLabel)
                                .addGap(27, 27, 27)
                                .addComponent(treatmentPriceCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(treatmentLabel)
                                    .addComponent(treatmentCodeLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(treatmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(treatmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treatmentCodeLabel)
                    .addComponent(treatmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treatmentLabel)
                    .addComponent(treatmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chargeLabel)
                    .addComponent(treatmentPriceCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(367, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 520, 270));

        treatmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Treatment Code", "Treatment Name", "Treatment Charge"
            }
        ));
        treatmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treatmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treatmentTable);
        if (treatmentTable.getColumnModel().getColumnCount() > 0) {
            treatmentTable.getColumnModel().getColumn(2).setResizable(false);
        }

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

    private void updateTreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTreatmentBtnActionPerformed
        this.updateTreatmentTableSelectedRow(); 
    }//GEN-LAST:event_updateTreatmentBtnActionPerformed

    private void deleteTreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTreatmentBtnActionPerformed
        this.deleteTreatmentFromTreatmentTable(); 
    }//GEN-LAST:event_deleteTreatmentBtnActionPerformed

    private void treatmentNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_treatmentNameKeyPressed

    }//GEN-LAST:event_treatmentNameKeyPressed

    private void treatmentPriceChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentPriceChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatmentPriceChargeActionPerformed

    private void AddTreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTreatmentBtnActionPerformed
        this.createTreatment(); 
    }//GEN-LAST:event_AddTreatmentBtnActionPerformed

    private void treatmentCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_treatmentCodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatmentCodeKeyPressed

    private void treatmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treatmentTableMouseClicked
        this.loadSelectedTreatmentToTreatmentFields(); 
    }//GEN-LAST:event_treatmentTableMouseClicked

    private void treatmentCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatmentCodeActionPerformed
 
    private void deleteTreatmentFromTreatmentTable(){
        DefaultTableModel tblModel = (DefaultTableModel)treatmentTable.getModel();
        //make sure selected row count 1
        if(treatmentTable.getSelectedRowCount() == 1){
            int selectedRow = treatmentTable.getSelectedRow();
            tblModel.removeRow(treatmentTable.getSelectedRow());
            treatmentCode.setText("");
            treatmentName.setText("");
            treatmentPriceCharge.setText("");
            treatmentData.getAvailableTreatments().remove(selectedRow);
            JOptionPane.showMessageDialog(this, "Treatment Deleted Successfully!");
        }else{
            if(treatmentTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "please select a single row!");
            }
        } 
    }
    
    private void loadTreatmentTableData()
    {
        DefaultTableModel tableModel = (DefaultTableModel)treatmentTable.getModel();
        ArrayList<String> inputData = treatmentData.getAvailableTreatments();
         for (String data : inputData) {
                String[] splitData = data.split(",");
                tableModel.addRow(splitData);
            }
    }
    
    
    private void updateTreatmentTableSelectedRow(){
        DefaultTableModel tblModel = (DefaultTableModel)treatmentTable.getModel();
        if(treatmentTable.getSelectedRowCount() == 1){
            String Code = treatmentCode.getText();
            String Name = treatmentName.getText();
            String PriceCharge = treatmentPriceCharge.getText();
            int selectedRow = treatmentTable.getSelectedRow();
            tblModel.setValueAt(Code, treatmentTable.getSelectedRow(), 0);
            tblModel.setValueAt(Name, treatmentTable.getSelectedRow(), 1);
            tblModel.setValueAt(PriceCharge, treatmentTable.getSelectedRow(), 2);
            JOptionPane.showMessageDialog(this, "Treatment Updated successfully!");
            treatmentCode.setText("");
            treatmentName.setText("");
            treatmentPriceCharge.setText("");
            // Update TreatmentStorage array data by separate function
            updateTreatmentStorage(selectedRow, Code, Name, PriceCharge);    
        }else{
            if(treatmentTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Select single row for update");
            }
        }
    }
    
    private void updateTreatmentStorage(int row, String code, String name, String priceCharge) {
        String concatenatedData = String.join(",", code, name, priceCharge);
        treatmentData.getAvailableTreatments().set(row, concatenatedData);
    }
    
    private void rearangeTableData() {
        treatmentData.resettTreatmentData();
        DefaultTableModel tableModel = (DefaultTableModel)treatmentTable.getModel();
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
            treatmentData.addNewTreatment(data);
        }
    }
    
    private void loadSelectedTreatmentToTreatmentFields(){
        DefaultTableModel tblModel = (DefaultTableModel)treatmentTable.getModel();
        int selectedRow = treatmentTable.getSelectedRow();
        treatmentCode.setText(tblModel.getValueAt(selectedRow, 0).toString());
        treatmentName.setText(tblModel.getValueAt(selectedRow, 1).toString());
        treatmentPriceCharge.setText(tblModel.getValueAt(selectedRow, 2).toString());
    }
    
    private void createTreatment(){
        DefaultTableModel model = (DefaultTableModel) treatmentTable.getModel();
        String Code = treatmentCode.getText();
        int rowCount = model.getRowCount();
        int columnToCheck = 0; // Assuming the ID is in the first column (index 0)

        for (int row = 0; row < rowCount; row++) {
            var idInTable = model.getValueAt(row, columnToCheck);
            if (idInTable.equals(Code) ) {
                JOptionPane.showMessageDialog(this, "Already Code Exist ");
                return; // ID or Code exists in the JTable
            }
        }
        if(
                treatmentCode.getText().equals("") || 
                treatmentName.getText().equals("") || 
                treatmentPriceCharge.getText().equals("")
          ){
            JOptionPane.showMessageDialog(this, "Please Complete All Fields");
            return;
        }else{
            String data[] = { treatmentCode.getText(),treatmentName.getText(),treatmentPriceCharge.getText() };
            
            DefaultTableModel tblModel = (DefaultTableModel)treatmentTable.getModel();
            treatmentData.addNewTreatment(data);
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Add Data Success");
            treatmentCode.setText("");
            treatmentName.setText("");
            treatmentPriceCharge.setText("");
        }
    }
    
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreatmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTreatmentBtn;
    private javax.swing.JLabel FormTitleLabel;
    private javax.swing.JLabel appointmentLabelBackround;
    private javax.swing.JLabel backIconLabel;
    private javax.swing.JLabel chargeLabel;
    private javax.swing.JButton deleteTreatmentBtn;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel quitIconLabel;
    private javax.swing.JTextField treatmentCode;
    private javax.swing.JLabel treatmentCodeLabel;
    private javax.swing.JLabel treatmentLabel;
    private javax.swing.JTextField treatmentName;
    private javax.swing.JTextField treatmentPriceCharge;
    private javax.swing.JTable treatmentTable;
    private javax.swing.JButton updateTreatmentBtn;
    // End of variables declaration//GEN-END:variables
}
