/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dhadotid
 */
public class JFAdminTreatment extends javax.swing.JFrame {
    /**
     * Creates new form JFAdminTreatment
     */
    public JFAdminTreatment() {
        super("Treatment");
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtIdDoctor.setEnabled(false);
        txtIdPatient.setEnabled(false);
        txtIdRecipe.setEnabled(false);
        txtIdTreatment.setEnabled(false);
        tableload();
        tabledoctor();
        tabletreatment();
        autoid();
        autoidrecipe();
        btnUpdate.setEnabled(false);
        txtDiagnose.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdTreatment = new javax.swing.JTextField();
        txtIdPatient = new javax.swing.JTextField();
        txtIdDoctor = new javax.swing.JTextField();
        txtIdRecipe = new javax.swing.JTextField();
        txtDiagnose = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSearchTreatment = new javax.swing.JTextField();
        cbSearchTreatment = new javax.swing.JComboBox();
        btnSearchTreatment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTreatment = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cbPatient = new javax.swing.JComboBox();
        txtSearchPatient = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPatient = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cbSearchDoctor = new javax.swing.JComboBox();
        txtSearchDoctor = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDoctor = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel1.setText("Treatment");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setText("Id Treatment");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel3.setText("Id Patient");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel4.setText("Id Doctor");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel5.setText("Id Recipe");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel6.setText("Diagnose");

        txtIdTreatment.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtIdPatient.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtIdDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtIdRecipe.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtDiagnose.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel7.setText("Search Treatment");

        txtSearchTreatment.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        cbSearchTreatment.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        cbSearchTreatment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Treatment", "ID Patient", "ID Doctor", "Diagnose" }));

        btnSearchTreatment.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearchTreatment.setText("Search");
        btnSearchTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTreatmentActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbTreatment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTreatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTreatmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTreatment);

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel8.setText("Search Patient");

        cbPatient.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        cbPatient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PatientName", "ID Patient" }));

        txtSearchPatient.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPatientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPatient);

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel9.setText("Search Doctor");

        cbSearchDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        cbSearchDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DoctorName", "Specialist" }));

        txtSearchDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearchDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearchDoctor.setText("Search");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        tbDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDoctorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDoctor);

        btnInsert.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdTreatment)
                            .addComponent(txtIdPatient)
                            .addComponent(txtIdDoctor)
                            .addComponent(txtIdRecipe)
                            .addComponent(txtDiagnose)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSearchTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchTreatment))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchDoctor))
                            .addComponent(jScrollPane3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSearchTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSearchTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchTreatment)
                    .addComponent(jLabel8)
                    .addComponent(cbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDiagnose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchDoctor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //Insert
        if(txtIdDoctor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select Id Doctor from the table doctor");
        }else if(txtIdPatient.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select Id Patient from the table doctor");
        }else if(txtDiagnose.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter diagnose");
        }else if(txtIdRecipe.getText().equals("full")){
            JOptionPane.showMessageDialog(null, "Data has been full");
        }else if(txtIdTreatment.getText().equals("full")){
            JOptionPane.showMessageDialog(null, "Data has been full");
        }else{
            //Insert
            try {
                int i = 0;//ps.executeUpdate();
                if(i != 0){
                    JOptionPane.showMessageDialog(null, "Data Treatment successful inputted");
                        
                    autoid();
                    autoidrecipe();
                    clear();
                    tableload();
                    tabledoctor();
                    tabletreatment();
                }else{
                    JOptionPane.showMessageDialog(null, "Data Treatment failed inputted");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tbPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPatientMouseClicked
        //Mouse Click
        DefaultTableModel model = (DefaultTableModel)tbPatient.getModel();
        int selectedRowIndex = tbPatient.getSelectedRow();
        
        txtIdPatient.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tbPatientMouseClicked

    private void tbDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDoctorMouseClicked
        //Mouse Click
        DefaultTableModel model = (DefaultTableModel)tbDoctor.getModel();
        int selectedRowIndex = tbDoctor.getSelectedRow();
        
        txtIdDoctor.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tbDoctorMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tbTreatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTreatmentMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbTreatment.getModel();
        int selectedRowIndex = tbTreatment.getSelectedRow();
        
        txtIdTreatment.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtIdPatient.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtIdDoctor.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtIdRecipe.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtDiagnose.setText(model.getValueAt(selectedRowIndex, 4).toString());
        
        btnUpdate.setEnabled(true);
        btnInsert.setEnabled(false);
    }//GEN-LAST:event_tbTreatmentMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Update
        try {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to Update?" + txtIdTreatment.getText(), "Update", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(txtIdDoctor.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please select Id Doctor from the table doctor");
                    }else if(txtIdPatient.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please select Id Patient from the table doctor");
                    }else if(txtDiagnose.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter diagnose");
                    }else if(txtIdRecipe.getText().equals("full")){
                        JOptionPane.showMessageDialog(null, "Data has been full");
                    }else if(txtIdTreatment.getText().equals("full")){
                        JOptionPane.showMessageDialog(null, "Data has been full");
                    }else{
                        if(txtIdTreatment.getText().equals("full")){
                            JOptionPane.showConfirmDialog(null, "Data treatment has been full");
                        }else{
                            int i = 0;//prs.executeUpdate();
                            if(i != 0){
                                JOptionPane.showMessageDialog(null, "Data treatment successful updated");
                                autoid();
                                tableload();
                                tabledoctor();
                                tabletreatment();
                                clear();
                            }else{
                                JOptionPane.showMessageDialog(null, "Data treatment failed updated");
                            }
                        }
                    }
                }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTreatmentActionPerformed
        //Search
        if(cbSearchTreatment.getSelectedItem().toString().equals("ID Treatment")){
            try {
                //tbTreatment.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbSearchTreatment.getSelectedItem().toString().equals("ID Patient")){
            try {
                //tbTreatment.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbSearchTreatment.getSelectedItem().toString().equals("ID Doctor")){
            try {
                //tbTreatment.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbSearchTreatment.getSelectedItem().toString().equals("Diagnose")){
            try {
                //tbTreatment.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnSearchTreatmentActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //search
        if(cbPatient.getSelectedItem().toString().equals("PatientName")){
            try {
                //tbPatient.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbPatient.getSelectedItem().toString().equals("ID Patient")){
            try {
                //tbPatient.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        //Doctor
        if(cbSearchDoctor.getSelectedItem().toString().equals("Specialist")){
            try {
                //tbDoctor.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbSearchDoctor.getSelectedItem().toString().equals("DoctorName")){
            try {
                //tbDoctor.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //Refresh
        clear();
        tabledoctor();
        tableload();
        tabletreatment();
        autoid();
        autoidrecipe();
        btnUpdate.setEnabled(false);
        btnInsert.setEnabled(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void clear(){
        txtDiagnose.setText("");
        txtIdDoctor.setText(null);
        txtIdPatient.setText(null);
        txtSearchDoctor.setText(null);
        txtSearchTreatment.setText("");
        txtSearchPatient.setText(null);
        autoid();
        autoidrecipe();
    }
    public void tabledoctor(){
        try {
            //tbDoctor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public void tabletreatment(){
        try {
            //tbTreatment.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public void autoid(){
        try {
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void autoidrecipe(){
        try {
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void tableload(){
        try {
            //tbPatient.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnSearchTreatment;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbPatient;
    private javax.swing.JComboBox cbSearchDoctor;
    private javax.swing.JComboBox cbSearchTreatment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbDoctor;
    private javax.swing.JTable tbPatient;
    private javax.swing.JTable tbTreatment;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtIdDoctor;
    private javax.swing.JTextField txtIdPatient;
    private javax.swing.JTextField txtIdRecipe;
    private javax.swing.JTextField txtIdTreatment;
    private javax.swing.JTextField txtSearchDoctor;
    private javax.swing.JTextField txtSearchPatient;
    private javax.swing.JTextField txtSearchTreatment;
    // End of variables declaration//GEN-END:variables
}
