/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import object.InSpecialist;

/**
 *
 * @author dhadotid
 */
public class JFAdminSpecialist extends javax.swing.JFrame {
    InSpecialist inSpecialist;
    DefaultTableModel tableModel;
    /**
     * Creates new form JFAdminSpecialist
     */
    public JFAdminSpecialist() {
        super("Specialist");
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        
        try
        {
         Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1",1097);
         inSpecialist = (InSpecialist) myRegistry.lookup("objspecialist");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error 1 :"+ e);
        }
        
        txtSpecialist.requestFocus();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtIdSpecialist.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        autoid();
        tableload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSpecialist = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdSpecialist = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSpecialist = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFare = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSpecialist = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSpecialist.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        lblSpecialist.setText("Specialist");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel1.setText("Id Specialist");

        txtIdSpecialist.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setText("Specialist");

        txtSpecialist.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel3.setText("Fare");

        txtFare.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbSpecialist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Specialist", "Specialist", "Fare"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSpecialist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSpecialistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSpecialist);

        lblSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblSearch.setText("Search by Specialist");

        txtSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                    .addComponent(lblSpecialist)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(btnDelete))
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdSpecialist)
                            .addComponent(txtSpecialist)
                            .addComponent(txtFare))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearch)
                            .addComponent(btnSearch)
                            .addComponent(btnRefresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblSpecialist)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
            //ps = con.prepareStatement("select count (*) 'hasil' from Doctor.Specialist where Specialist = ?");
            //ps.setString(1, txtSpecialist.getText());
            int cek = inSpecialist.specialistAvailable();
            if(cek > 0){
                //data udah ada
                JOptionPane.showMessageDialog(null, "Specialist already exists");
            }else{
                //data belum ada. insert data
                if(txtSpecialist.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please fill in text box Specialist");
                }else if(txtFare.getText().matches("^\\d+$") == false || txtFare.getText().equals("") || txtFare.getText().length() < 4){
                    JOptionPane.showMessageDialog(null, "Inccorect format fare");
                }else{
                    if(txtIdSpecialist.getText().equals("full")){
                        JOptionPane.showConfirmDialog(null, "Data specialist has been full");
                    }else{
                        inSpecialist.setSpcID(txtIdSpecialist.getText());
                        inSpecialist.setSpcName(txtSpecialist.getText());
                        inSpecialist.setSpcFare(Double.parseDouble(txtFare.getText()));
                        
                        int i = inSpecialist.doInsert();
                        if(i != 0){
                            JOptionPane.showMessageDialog(null, "Data specialist successful inputted");
                            autoid();
                            tableload();
                            txtFare.setText("");
                            txtSpecialist.setText("");
                        }else{
                            JOptionPane.showMessageDialog(null, "Data specialist failed inputted");
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    //Mouse Click
    private void tbSpecialistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSpecialistMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbSpecialist.getModel();
        int selectedRowIndex = tbSpecialist.getSelectedRow();
        
        txtIdSpecialist.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtSpecialist.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtFare.setText(model.getValueAt(selectedRowIndex, 2).toString());
        
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnInsert.setEnabled(false);
    }//GEN-LAST:event_tbSpecialistMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try {
            //PreparedStatement ps = con.prepareStatement("select * from Doctor.Specialist where Specialist like ? order by Specialist ASC");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        autoid();
        tableload();
        txtFare.setText("");
        txtSpecialist.setText("");
        btnInsert.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to Update?" + txtIdSpecialist.getText(), "Update", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    //data belum ada. insert data
                    if(txtSpecialist.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please fill in text box Specialist");
                    }else if(txtFare.getText().matches("^\\d+$") == false || txtFare.getText().equals("") || txtFare.getText().length() < 4){
                        JOptionPane.showMessageDialog(null, "Inccorect format fare");
                    }else{
                        if(txtIdSpecialist.getText().equals("full")){
                            JOptionPane.showConfirmDialog(null, "Data specialist has been full");
                        }else{
                            inSpecialist.setSpcID(txtIdSpecialist.getText());
                            inSpecialist.setSpcName(txtSpecialist.getText());
                            inSpecialist.setSpcFare(Double.parseDouble(txtFare.getText()));
                            
                            int i = inSpecialist.doUpdate();
                            if(i != 0){
                                JOptionPane.showMessageDialog(null, "Data specialist successful updated");
                                autoid();
                                tableload();
                                txtFare.setText("");
                                txtSpecialist.setText("");
                                txtSearch.setText("");
                            }else{
                                JOptionPane.showMessageDialog(null, "Data specialist failed updated");
                            }
                        }
                    }
                }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to Delete?" + txtIdSpecialist.getText(), "Delete", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                inSpecialist.setSpcID(txtIdSpecialist.getText());
                int res = inSpecialist.doDelete();
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Success delete data " + txtIdSpecialist.getText());
                    tableload();
                    txtIdSpecialist.setText("");
                    txtSpecialist.setText("");
                    txtSearch.setText("");
                    txtFare.setText("");
                    autoid();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void tableload(){
        tableModel = (DefaultTableModel)tbSpecialist.getModel();
        tableModel.setRowCount(0);
        try {
            ArrayList data = inSpecialist.tableSpecialist();
            for(int i = 0;i < data.size()-1;i+=3)
            {
                //fac_code, fac_name, fac_email, fac_phone
                String idSpecialist = (String)data.get(i);
                String specialist = (String)data.get(i+1);
                double fare = (double)data.get(i+2);
                
                String[] data_field = {idSpecialist.trim(), specialist.trim(),fare + ""};
                tableModel.addRow(data_field);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        
    }
    
    public void autoid(){
        try {
            txtIdSpecialist.setText(inSpecialist.autoid());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSpecialist;
    private javax.swing.JTable tbSpecialist;
    private javax.swing.JTextField txtFare;
    private javax.swing.JTextField txtIdSpecialist;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpecialist;
    // End of variables declaration//GEN-END:variables
}
