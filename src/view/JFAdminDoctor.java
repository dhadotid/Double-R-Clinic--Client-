/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import helper.LoginHelper;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import object.InDoctor;

/**
 *
 * @author dhadotid
 */
public class JFAdminDoctor extends javax.swing.JFrame {

    InDoctor iDoctor;
    DefaultTableModel tablemodel;
    Calendar now = Calendar.getInstance();
    int yearnow = now.get(Calendar.YEAR);
    int duapuluhthn = yearnow - 20;
    String yearnowstring = String.valueOf(duapuluhthn);
    ButtonGroup bg = new ButtonGroup();
    /**
     * Creates new form JFDoctor
     */
    public JFAdminDoctor() {
        super("Doctor");
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtDoctorName.requestFocus();
        txtIdDoctor.setEnabled(false);
        txtIdSpecialist.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        dcDOB.getDateEditor().setEnabled(false);
        
        try
        {
         Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1",1097);
         iDoctor = (InDoctor) myRegistry.lookup("objdoctor");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error 1 :"+ e);
        }
        
        if (LoginHelper.isAdmin.equals("0")) {
            btnUpdate.setVisible(false);
            btnDelete.setVisible(false);
        }else if(LoginHelper.isAdmin.equals("1")){
            btnUpdate.setVisible(true);
            btnDelete.setVisible(true);
        }
        
        autoid();
        tableload();
        tableloadspecialist();
        bg.add(rbFemale);
        bg.add(rbMale);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdDoctor = new javax.swing.JLabel();
        lblIdSpecialist = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtIdDoctor = new javax.swing.JTextField();
        txtIdSpecialist = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        dcDOB = new com.toedter.calendar.JDateChooser();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        cbSearchDoctor = new javax.swing.JComboBox();
        txtSearchDoctor = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();
        btnRefreshDoctor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbSearchSpec = new javax.swing.JComboBox();
        txtSearchSpec = new javax.swing.JTextField();
        btnSearchSpec = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSpecialist = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblIdDoctor.setText("Id Doctor");

        lblIdSpecialist.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblIdSpecialist.setText("Id Specialist");

        lblDoctorName.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblDoctorName.setText("Doctor Name");

        lblDob.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblDob.setText("Date of Birth");

        lblGender.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblGender.setText("Doctor Gender");

        lblPhoneNumber.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number");

        txtIdDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtIdSpecialist.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtDoctorName.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        rbMale.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        rbMale.setText("Male");

        rbFemale.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        rbFemale.setText("Female");

        dcDOB.setDateFormatString("yyyy-MM-dd");
        dcDOB.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        txtPhoneNumber.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel1.setText("Doctor");

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

        btnDelete.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Doctor", "Id Specialist", "Doctor Name", "Doctor Gender", "Date of Birth", "Phone Number"
            }
        ));
        tblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        lblSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblSearch.setText("Search");

        cbSearchDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        cbSearchDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DoctorName", "Id Doctor" }));

        txtSearchDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearchDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearchDoctor.setText("Search");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        btnRefreshDoctor.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnRefreshDoctor.setText("Refresh");
        btnRefreshDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshDoctorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setText("Search");

        cbSearchSpec.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        cbSearchSpec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Specialist", "Id Specialist" }));

        txtSearchSpec.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearchSpec.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearchSpec.setText("Search");
        btnSearchSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSpecActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblSpecialist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Specialist", "Specialist", "Fare"
            }
        ));
        tblSpecialist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSpecialistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSpecialist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctorName)
                            .addComponent(lblGender)
                            .addComponent(lblDob)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblIdDoctor)
                            .addComponent(lblIdSpecialist))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdDoctor)
                            .addComponent(txtIdSpecialist)
                            .addComponent(txtDoctorName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcDOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbFemale)))
                                .addGap(8, 8, 8))))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshDoctor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSearchSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchSpec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearch)
                            .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchDoctor)
                            .addComponent(btnRefreshDoctor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbSearchSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearchSpec)
                                    .addComponent(btnRefresh)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIdDoctor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIdSpecialist))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbMale)
                                        .addComponent(lblGender))
                                    .addComponent(rbFemale, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDoctorName)))
                                .addGap(46, 46, 46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDob))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNumber))
                        .addGap(18, 18, 18)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //button insert for save record to database
        String dob = new SimpleDateFormat("yyyy-MM-dd").format(dcDOB.getDate()); //to get date now
        String dobcompare = new SimpleDateFormat("yyyy").format(dcDOB.getDate()); //to get years now
        String gender = "";
        if(rbFemale.isSelected()){
            gender = "Female";
        }else if(rbMale.isSelected()){
            gender = "Male";
        }
        if(yearnowstring.compareTo(dobcompare) < 0){
            JOptionPane.showMessageDialog(null, "Please enter the date of birth with age above 20 years");
        }else if(dob.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the date of birth");
        }else if(txtIdSpecialist.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the id specialist from table specialist");
        }else if(txtDoctorName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the name doctor");
        }else if(txtPhoneNumber.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the phone number");
        }else if(txtPhoneNumber.getText().matches("^62[0-9]{9,11}$") == false){
            JOptionPane.showMessageDialog(null, "Invalid Phone Number format, please enter phone number like 62899002829");
        }else if(rbFemale.isSelected() == false && rbMale.isSelected() == false){
            JOptionPane.showConfirmDialog(null, "Please select gender");
        }else{
            if(txtIdDoctor.getText().equals("full")){
                JOptionPane.showMessageDialog(null, "Data Doctor has been full");
            }else{
                try {
                    iDoctor.setDoctorID(txtIdDoctor.getText());
                    iDoctor.setDoctorSPC(txtIdSpecialist.getText());
                    iDoctor.setDoctorName(txtDoctorName.getText());
                    iDoctor.setDoctorGender(gender);
                    iDoctor.setDoctorDOB(dob);
                    iDoctor.setDoctorPhone(txtPhoneNumber.getText());
                    int i = iDoctor.doInsert();
                    if(i != 0){
                        JOptionPane.showMessageDialog(null, "Data Doctor successful inputted");
                        
                        autoid();
                        clearall();
                        tableload();
                        tableloadspecialist();
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Doctor failed inputted");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblSpecialistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSpecialistMouseClicked
        //Mouse Click
        DefaultTableModel model = (DefaultTableModel)tblSpecialist.getModel();
        int selectedRowIndex = tblSpecialist.getSelectedRow();
        
        txtIdSpecialist.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tblSpecialistMouseClicked

    private void tblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorMouseClicked
        // Table Doctor Mouse Click
        DefaultTableModel model = (DefaultTableModel)tblDoctor.getModel();
        int selectedRowIndex = tblDoctor.getSelectedRow();
        
        txtIdDoctor.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtIdSpecialist.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtDoctorName.setText(model.getValueAt(selectedRowIndex, 2).toString());
        String gender = (model.getValueAt(selectedRowIndex, 3).toString());
        System.out.println(gender);
        String date1 = "";
        date1 = (model.getValueAt(selectedRowIndex, 4).toString());
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
            dcDOB.setDate(date);
        } catch (ParseException ex) {
            System.out.println("Error: " + ex);
        }
        
        txtPhoneNumber.setText(model.getValueAt(selectedRowIndex, 5).toString());
        
        if (gender.equals("Male")) {
            //rbMale.isSelected();
            rbMale.setSelected(true);
        }else{
            rbFemale.setSelected(true);
        }
        
        btnInsert.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblDoctorMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Update
        String gender = "";
        String dob = new SimpleDateFormat("yyyy-MM-dd").format(dcDOB.getDate());
        String dobcompare = new SimpleDateFormat("yyyy").format(dcDOB.getDate());
        if(rbFemale.isSelected()){
            gender = "Female";
        }else if(rbMale.isSelected()){
            gender = "Male";
        }
        try {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to Update?" + txtDoctorName.getText(), "Update", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(yearnowstring.compareTo(dobcompare) < 0){
                        JOptionPane.showMessageDialog(null, "Please enter the date of birth with age above 20 years");
                    }else if(dob.equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter the date of birth");
                    }else if(txtIdSpecialist.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter the id specialist from table specialist");
                    }else if(txtDoctorName.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter the name doctor");
                    }else if(txtPhoneNumber.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter the phone number");
                    }else if(txtPhoneNumber.getText().matches("^62[0-9]{9,11}$") == false){
                        JOptionPane.showMessageDialog(null, "Invalid Phone Number format, please enter phone number like 62899002829");
                    }else if(rbFemale.isSelected() == false && rbMale.isSelected() == false){
                        JOptionPane.showConfirmDialog(null, "Please select gender");
                    }else{
                        if(txtIdSpecialist.getText().equals("full")){
                            JOptionPane.showConfirmDialog(null, "Data specialist has been full");
                        }else{
                            iDoctor.setDoctorID(txtIdDoctor.getText());
                            iDoctor.setDoctorSPC(txtIdSpecialist.getText());
                            iDoctor.setDoctorName(txtDoctorName.getText());
                            iDoctor.setDoctorGender(gender);
                            iDoctor.setDoctorDOB(dob);
                            iDoctor.setDoctorPhone(txtPhoneNumber.getText());
                            
                            int i = iDoctor.doUpdate();
                            if(i != 0){
                                JOptionPane.showMessageDialog(null, "Data Doctor successful updated");
                                tableload();
                                clearall();
                                tableloadspecialist();
                                autoid();
                            }else{
                                JOptionPane.showMessageDialog(null, "Data Doctor failed updated");
                            }
                        }
                    }
                }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Delete
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to Delete?" + txtDoctorName.getText(), "Delete", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                iDoctor.setDoctorID(txtIdDoctor.getText());
                int res = iDoctor.doDelete();
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Success delete data " + txtDoctorName.getText());
                    tableload();
                    tableloadspecialist();
                    clearall();
                    autoid();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        //Search Doctor
        if(cbSearchDoctor.getSelectedItem().toString().equals("DoctorName")){
            try {
                //tblDoctor.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbSearchDoctor.getSelectedItem().toString().equals("Id Doctor")){
            try {
                //tblDoctor.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void btnSearchSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSpecActionPerformed
        // Search Specialist
        if(cbSearchDoctor.getSelectedItem().toString().equals("Specialist")){
            try {
//                tblSpecialist.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }else if(cbSearchDoctor.getSelectedItem().toString().equals("Id Specialist")){
            try {
//                tblSpecialist.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnSearchSpecActionPerformed

    private void btnRefreshDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshDoctorActionPerformed
        //Refresh
        clearall();
        autoid();
        tableload();
        tableloadspecialist();
        btnInsert.setVisible(true);
        btnDelete.setVisible(false);
        btnUpdate.setVisible(false);
    }//GEN-LAST:event_btnRefreshDoctorActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        clearall();
        autoid();
        tableload();
        tableloadspecialist();
        btnInsert.setVisible(true);
        btnDelete.setVisible(false);
        btnUpdate.setVisible(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void autoid(){
        try {
            txtIdDoctor.setText(iDoctor.autoid());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void tableload(){
        tablemodel = (DefaultTableModel)tblDoctor.getModel();
        tablemodel.setRowCount(0);
        try{
            ArrayList data = iDoctor.tableDoctor();
            for(int i = 0;i < data.size()-1;i+=6)
            {
                //fac_code, fac_name, fac_email, fac_phone
                String idDoctor = (String)data.get(i);
                String DoctorSPC = (String)data.get(i+1);
                String DoctorName = (String)data.get(i+2);
                String DoctorGender = (String)data.get(i+3);
                String DOB = (String)data.get(i+4);
                String DoctorPhone = (String)data.get(i+5);

                String[] data_field = {idDoctor.trim(), DoctorSPC.trim(),DoctorName.trim(), DoctorGender.trim(), DOB.trim(), DoctorPhone.trim()};
                tablemodel.addRow(data_field);
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan" + ex.getMessage());
        }
    }
    
    public void tableloadspecialist(){
        tablemodel = (DefaultTableModel)tblSpecialist.getModel();
        tablemodel.setRowCount(0);
        try {
            ArrayList data = iDoctor.tableSpecialist();
            for(int i = 0;i < data.size()-1;i+=3)
            {
                String idSpecialist = (String)data.get(i);
                String specialist = (String)data.get(i+1);
                double fare = (double)data.get(i+2);

                String[] data_field = {idSpecialist.trim(), specialist.trim(),fare +""};
                tablemodel.addRow(data_field);
            }
        } catch (Exception ex) {
            System.out.println("Error Disini: " + ex);
        }
        
    }
    
    public void clearall(){
        txtDoctorName.setText("");
        txtIdSpecialist.setText("");
        txtPhoneNumber.setText("");
        txtSearchDoctor.setText("");
        txtSearchSpec.setText("");
        dcDOB.setDate(null);
        bg.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefreshDoctor;
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnSearchSpec;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbSearchDoctor;
    private javax.swing.JComboBox cbSearchSpec;
    private com.toedter.calendar.JDateChooser dcDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIdDoctor;
    private javax.swing.JLabel lblIdSpecialist;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblSpecialist;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtIdDoctor;
    private javax.swing.JTextField txtIdSpecialist;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearchDoctor;
    private javax.swing.JTextField txtSearchSpec;
    // End of variables declaration//GEN-END:variables
}
