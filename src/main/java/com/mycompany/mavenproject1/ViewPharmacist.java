/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.models.PharmacistModel;
import com.mycompany.mavenproject1.models.UserModel;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arshvir
 */
public class ViewPharmacist extends javax.swing.JFrame {
    private SingletonClass singletonClass = SingletonClass.getInstance();
    UserModel userModel = new UserModel();
    String searchKey = "";
    ArrayList<PharmacistModel> pharmacistArray = new ArrayList<PharmacistModel>();
    PharmacistModel selectedPharmacist = new PharmacistModel();
    /**
     * Creates new form ViewPharmacist
     */
    public ViewPharmacist() {
        initComponents();
        getPharmaDetails();
    }
    
    public void getPharmaDetails(){
    
        try{
            String selectStatement = "SELECT * FROM addPharmacist";
            PreparedStatement preparedStatement = singletonClass.connection.prepareStatement(selectStatement);
            ResultSet rs = preparedStatement.executeQuery();
              //  table.setModel(DbUtils.resultSetToTableModel(rs));
            String[] headers = {"id", "Name", "DateOfBirth", "Email", "PhoneNumber", "Address", "Gender", "Username" , "Password"};
            DefaultTableModel model = new DefaultTableModel(null, headers);
            viewPharmacist.setModel(model);
            Object[] row = new Object[9];
            ArrayList<AddPharmacist> pharmacist = new ArrayList<>();

            while(rs.next()){
                row[0] = rs.getString("id");
                row[1] = rs.getString("name");
                row[2] = rs.getString("dob");
                row[3] = rs.getString("email");
                row[4] = rs.getString("phoneNumber");
                row[5] = rs.getString("address"); 
                row[6] = rs.getString("gender");
                row[7] = rs.getString("userName");
                row[8] = rs.getString("password");
                model.addRow(row);
              //  SellMedicine.add(new SellMedicine(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5) , rs.getString(6) , rs.getString(7)));
            }
            //SpinnerListModel spinner = new SpinnerListModel(userModel );

           // spinner.setModel(model);
        }catch(SQLException sqlException){
        System.out.println("in exception "+sqlException.getMessage());}
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPharmacist = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 218, 219));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("View Pharmacist");

        viewPharmacist.setBackground(new java.awt.Color(236, 249, 250));
        viewPharmacist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Date of birth", "email", "Phone No.", "Address", "gender", "username", "password"
            }
        ));
        viewPharmacist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPharmacistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewPharmacist);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(236, 249, 250));
        jTextField1.setText("Search");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(394, 394, 394)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        AdminPanel adminPanel = new AdminPanel();
        adminPanel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void viewPharmacistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPharmacistMouseClicked
        // TODO add your handling code here:
         int returnValue = JOptionPane.showConfirmDialog(rootPane, "Click Yes to UPDATE or No for DELETE");
         DefaultTableModel dfm = (DefaultTableModel)viewPharmacist.getModel();
        int selectedRow = viewPharmacist.getSelectedRow();
        String id = dfm.getValueAt(selectedRow, 0).toString();
        System.out.println("returnValue  "+returnValue );
       if( returnValue== 0){
        
        
        UpdatePharmacist updatePharmacist = new UpdatePharmacist(id);
        updatePharmacist.setVisible(true);
        this.dispose();
       
       }
       else if(returnValue == 1){
            String deleteStatement = "DELETE FROM addPharmacist where id = ?";
        try{
            PreparedStatement ps = singletonClass.connection.prepareStatement(deleteStatement);
            ps.setInt(1, Integer.parseInt(id));
            if(ps.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted Successful");
                   getPharmaDetails();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Sorry! cannot delete");

                }
            
        }catch(SQLException sqlException){
        }
       }
      
    }//GEN-LAST:event_viewPharmacistMouseClicked
 private String previousSearchKey = "";  // Declare as a class-level variable
       
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        // String keyType = evt.getKeyChar().toString();
                                    
    char c = evt.getKeyChar();
System.out.println("c " + c);

searchKey = searchKey + String.valueOf(c);
System.out.println("searchKey " + searchKey);

if (!searchKey.isEmpty()) {
    searchKey = searchKey.trim();
    try {
        System.out.println("in condition");
        String selectStatement = "SELECT * FROM addpharmacist WHERE name LIKE ?";
        PreparedStatement preparedStatement = singletonClass.connection.prepareStatement(selectStatement);
        preparedStatement.setString(1, "%" + searchKey + "%");
        ResultSet rs = preparedStatement.executeQuery();

        String[] rowNames = {"id", "name", "DateOfBirth", "Email", "PhoneNumber", "Address", "Gender", "Username", "Password"};
        DefaultTableModel model = new DefaultTableModel(null, rowNames);
        viewPharmacist.setModel(model);

        Object[] row = new Object[9];

        while (rs.next()) {
            row[0] = rs.getInt(1);
            row[1] = rs.getString("name");
            row[2] = rs.getString("dob");
            row[3] = rs.getString("email");
            row[4] = rs.getString("phoneNumber");
            row[5] = rs.getString("address");
            row[6] = rs.getString("gender");
            row[7] = rs.getString("userName");
            row[8] = rs.getString("password");
            model.addRow(row);
        }
    } catch (SQLException sqlException) {
        System.out.println("Error in search: " + sqlException.getMessage());
    }
}



    }//GEN-LAST:event_jTextField1KeyTyped
 
    
    
   /* private void searchPharmacistTableMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        // TODO add your handling code here:
        DefaultTableModel dfm = (DefaultTableModel)searchPharmacistTable.getModel();
        int seletedRow = searchPharmacistTable.getSelectedRow();
        String id = dfm.getValueAt(seletedRow, 0).toString();
        try {
                System.out.println("in condition");
                String selectStatement = "SELECT * FROM addpharmacist WHERE id = ?";
                PreparedStatement preparedStatement = singletonClass.connection.prepareStatement(selectStatement);
                preparedStatement.setString(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                

                while (rs.next()) {

                    selectedPharmacist.setName(rs.getString("name"));
                    selectedPharmacist.setDob(rs.getString("dob"));
                    selectedPharmacist.setEmail(rs.getString("email"));
                    selectedPharmacist.setPhoneNo(rs.getString("phoneNo"));
                    selectedPharmacist.setAddress(rs.getString("address"));
                    selectedPharmacist.setGender(rs.getString("gender"));
                    selectedPharmacist.setUsername(rs.getString("username"));
                    selectedPharmacist.setPassword(rs.getString("password"));
                    updatePharmacistInfo();
                }
               
            } catch (SQLException sqlException) {
                System.out.println("in exception 631" + sqlException.getMessage());
            }
    }
 */
    
    
    /**
    * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPharmacist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable viewPharmacist;
    // End of variables declaration//GEN-END:variables
}
