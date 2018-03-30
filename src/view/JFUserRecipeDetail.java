/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import object.InDrug;
import object.InRecipe;

/**
 *
 * @author dhadotid
 */
public class JFUserRecipeDetail extends javax.swing.JFrame {

    InRecipe inRecipe;
    InDrug inDrug;
    DefaultTableModel tableModel;
    double qty1 = 0;
    double has = 0;
    double Harga = 0;
    String qty = "";
    String expdate = "";
    String datenow = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    /**
     * Creates new form JFUserRecipeDetail
     */
    public JFUserRecipeDetail() {
        super("Recipe");
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        try
        {
         Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1",1097);
         inRecipe = (InRecipe) myRegistry.lookup("objrecipe");
         inDrug = (InDrug) myRegistry.lookup("objdrug");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error 1 :"+ e);
        }
        
        tableModel = (DefaultTableModel)tbDrugRecipe.getModel();
        tableModel.setRowCount(0);
        autoidrecipedetail();
        tableload();
        tableRecipe();
        oncloseClicked();
        txtQty.requestFocus();
        txtIdRecipeDetail.setEnabled(false);
        txtIdDrug.setEnabled(false);
        txtIdRecipe.setEnabled(false);
        txtQty.setText("0");
        txtSub.setEnabled(false);
        btnSave.setEnabled(false);
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
        jLabel7 = new javax.swing.JLabel();
        txtIdRecipeDetail = new javax.swing.JTextField();
        txtIdRecipe = new javax.swing.JTextField();
        txtIdDrug = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtDose = new javax.swing.JTextField();
        txtSub = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDrug = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtSearchRecipe = new javax.swing.JTextField();
        btnSearchRecipe = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDrugRecipe = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbRecipe = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel1.setText("Recipe");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setText("Id Recipe Detail");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel3.setText("Id Recipe");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel4.setText("Id Drug");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel5.setText("Qty");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel6.setText("Dose");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel7.setText("Subtotal");

        txtIdRecipeDetail.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtIdRecipe.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtIdDrug.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtQty.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        txtDose.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtSub.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnInsert.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel8.setText("Search Drug");

        txtSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Drug", "Drug Name", "Drug Type", "Stock", "ExpDate", "Price"
            }
        ));
        tbDrug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDrugMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDrug);

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel9.setText("Search Recipe");

        txtSearchRecipe.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnSearchRecipe.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSearchRecipe.setText("Search");
        btnSearchRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRecipeActionPerformed(evt);
            }
        });

        tbDrugRecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Recipe", "Id Drug", "Qty", "Dose", "Subtotal"
            }
        ));
        tbDrugRecipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDrugRecipeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbDrugRecipe);

        tbRecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Recipe", "Patient Name", "Diagnose"
            }
        ));
        tbRecipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRecipeMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbRecipe);

        btnSave.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdRecipeDetail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdRecipe)
                            .addComponent(txtIdDrug)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQty)
                            .addComponent(txtDose)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtSub)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchRecipe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSearchRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchRecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdRecipeDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDrugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDrugMouseClicked
        //Mouse Click
        DefaultTableModel model = (DefaultTableModel)tbDrug.getModel();
        int selectedRowIndex = tbDrug.getSelectedRow();
        
        txtIdDrug.setText(model.getValueAt(selectedRowIndex, 0).toString());
        String hargastr;
        hargastr = (model.getValueAt(selectedRowIndex, 5).toString());
        Harga = Double.parseDouble(hargastr);
        qty = (model.getValueAt(selectedRowIndex, 3).toString());
        expdate = (model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_tbDrugMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //Search Drug
        tableModel = (DefaultTableModel)tbDrug.getModel();
        tableModel.setRowCount(0);
        try {
            //inSpecialist.setSpcFare(Double.parseDouble(txtSearch.getText()));
            
            ArrayList data = inDrug.getRecord(txtSearch.getText());
            for(int i = 0;i < data.size()-1;i+=6)
            {
                //fac_code, fac_name, fac_email, fac_phone
                String idDrug = (String)data.get(i);
                String drugName = (String)data.get(i+1);
                String drugType = (String)data.get(i+2);
                int stock = (int)data.get(i+3);
                String expDate = (String)data.get(i+4);
                double price = (Double)data.get(i+5);
                String[] data_field = {idDrug.trim(),drugName.trim(),drugType.trim(), stock+"", expDate.trim(), price+ ""};
                tableModel.addRow(data_field);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //Insert
        if(txtIdDrug.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select the drug from the table");
        }else if(txtQty.getText().matches("^\\d+$") == false || txtQty.getText().equals("") || txtQty.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Please enter a valid qty");
        }else if(txtDose.getText().matches("^[0-9]{1,1}[X,x][0-9]{1,1}$") == false || txtDose.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter dose drug");
        }else if(Integer.parseInt(txtQty.getText()) > Integer.parseInt(qty)){
            JOptionPane.showMessageDialog(null, "less stock");
        }else if(expdate.compareTo(datenow) < 0){
            JOptionPane.showMessageDialog(null, "Drug has been expyear");
        }else if(txtIdRecipe.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select Recipe");
        }
        else{
            if (txtIdRecipeDetail.equals("full")) {
                JOptionPane.showMessageDialog(null, "Data recipe detail has been full");
            }else{
                try {
                    String recipeID = txtIdRecipe.getText();
                    String drugID = txtIdDrug.getText();
                    String qty = txtQty.getText();
                    String dose = txtDose.getText();
                    String subTotal = txtSub.getText();
                    
                    Object[] row = {recipeID, drugID, qty, dose, subTotal};
                    tableModel = (DefaultTableModel)tbDrugRecipe.getModel();
                    tableModel.addRow(row);
                    int jmlhbaris = tbDrugRecipe.getRowCount();
                    
                    btnSave.setEnabled(true);
                    clear();
                    tableload();
                    tableRecipe();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost

        String qs = "";
        qs = txtQty.getText();
        qty1 = Double.parseDouble(qs);
        has = qty1 * Harga;
        String fixhasil = "";
        fixhasil = String.valueOf(has);
        txtSub.setText(fixhasil);
    }//GEN-LAST:event_txtQtyFocusLost

    private void txtQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusGained
        String qs = "";
        qs = txtQty.getText();
        qty1 = Double.parseDouble(qs);
        has = qty1 * Harga;
        String fixhasil = "";
        fixhasil = String.valueOf(has);
        txtSub.setText(fixhasil);
    }//GEN-LAST:event_txtQtyFocusGained

    private void btnSearchRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRecipeActionPerformed
        // TODO add your handling code here:
        tableModel = (DefaultTableModel)tbRecipe.getModel();
        tableModel.setRowCount(0);
        try {
            //inSpecialist.setSpcFare(Double.parseDouble(txtSearch.getText()));
            
            ArrayList data = inRecipe.getRecord(txtSearchRecipe.getText());
            for(int i = 0;i < data.size()-1;i+=3)
            {
                //fac_code, fac_name, fac_email, fac_phone
                String idRecipe = (String)data.get(i);
                String patientName = (String)data.get(i+1);
                String diagnose = (String)data.get(i+2);
                String[] data_field = {idRecipe.trim(),patientName.trim(),diagnose.trim()};
                tableModel.addRow(data_field);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnSearchRecipeActionPerformed

    private void tbRecipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRecipeMouseClicked

        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbRecipe.getModel();
        int selectedRowIndex = tbRecipe.getSelectedRow();
        
        txtIdRecipe.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tbRecipeMouseClicked

    private void oncloseClicked(){
        this.setDefaultCloseOperation(JFUserRecipeDetail.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                String objButton[] = {"Yes","No"};
                int jmlhrow = tbDrugRecipe.getRowCount();
                if(jmlhrow > 0){
                    int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure want to back?\nYou are not save this record yet!","Double R Clinic", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, objButton, objButton[1]);
                    if (PromptResult == JOptionPane.YES_OPTION) {
                        dispose();
                    }
                }else{
                    dispose();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {
                
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                
            }
        });
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            int jmlhbaris = tbDrugRecipe.getRowCount();
            String idRecipe = null;
            String idDrug = null;
            int qty = 0;
            int y = 0;
            String dose = null;
            for(int i = 0; i < jmlhbaris; i++){
                idRecipe = tbDrugRecipe.getValueAt(i, 0).toString();
                idDrug = tbDrugRecipe.getValueAt(i, 1).toString();
                qty = Integer.parseInt(tbDrugRecipe.getValueAt(i, 2).toString());
                dose = tbDrugRecipe.getValueAt(i, 3).toString();
                
                inRecipe.setRecipeID(idRecipe);
                inRecipe.setDrugID(idDrug);
                inRecipe.setQTY(qty);
                inRecipe.setDose(dose);
                y = inRecipe.doInsert();
            }
            if(y != 0){
                JOptionPane.showMessageDialog(null, "Data recipe detail successful inputted");

                clear();
                tableload();
                tableRecipe();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Data recipe detail failed inputted");
            }
        } catch (Exception ex) {
            Logger.getLogger(JFUserRecipeDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbDrugRecipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDrugRecipeMouseClicked
        DefaultTableModel n = (DefaultTableModel) tbDrugRecipe.getModel();
        try
        {
            int row = tbDrugRecipe.getSelectedRow();
            n.removeRow(row);
            int jmlbaris = tbDrugRecipe.getRowCount();
            
            if(jmlbaris == 0){
                btnSave.setEnabled(false);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Please choose item first before click delete options");
        }
    }//GEN-LAST:event_tbDrugRecipeMouseClicked

    public void clear(){
        txtDose.setText("");
        txtIdDrug.setText("");
        txtQty.setText("0");
        txtSub.setText("");
        txtSearch.setText("");
    }

    public void tableload(){
        tableModel = (DefaultTableModel)tbDrug.getModel();
        tableModel.setRowCount(0);
        try {
            ArrayList data = inRecipe.tableDrug();
            for(int i = 0;i < data.size()-1;i+=6)
            {
                String idDrug = (String)data.get(i);
                String DrugName = (String)data.get(i+1);
                String DrugType = (String)data.get(i+2);
                int Stock = (int)data.get(i+3);
                String ExpDate = (String)data.get(i+4);
                double price = (double)data.get(i+5);

                String[] data_field = {idDrug.trim(), DrugName.trim(), DrugType.trim(), Stock+"", ExpDate.trim(), price+""};
                tableModel.addRow(data_field);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public void tableRecipe(){
        tableModel = (DefaultTableModel)tbRecipe.getModel();
        tableModel.setRowCount(0);
        try {
            ArrayList data = inRecipe.tableRecipe();
            for(int i = 0;i < data.size()-1;i+=3)
            {
                String idRecipe = (String)data.get(i);
                String patientName = (String)data.get(i+1);
                String diagnose = (String)data.get(i+2);

                String[] data_field = {idRecipe.trim(), patientName.trim(), diagnose.trim()};
                tableModel.addRow(data_field);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    

    public void autoidrecipedetail(){
        try {
            txtIdRecipeDetail.setText(inRecipe.autoid());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchRecipe;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbDrug;
    private javax.swing.JTable tbDrugRecipe;
    private javax.swing.JTable tbRecipe;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtIdDrug;
    private javax.swing.JTextField txtIdRecipe;
    private javax.swing.JTextField txtIdRecipeDetail;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchRecipe;
    private javax.swing.JTextField txtSub;
    // End of variables declaration//GEN-END:variables
}
