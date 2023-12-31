/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.models.UserModel;
import com.mycompany.mavenproject1.pharmacist.PharmacistDashboard;
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
public class ViewMedicine extends javax.swing.JFrame {
    private SingletonClass singletonClass = SingletonClass.getInstance();
    static UserModel userModel = new UserModel();
    int empId = -1;
    /**
     * Creates new form ViewMedicine
     */
    public ViewMedicine(UserModel userModel) {
        this.userModel = userModel;

        empId = userModel.getId();
        System.out.println("empId "+empId);
        initComponents();
        getMedicine();
    }
    
    public ViewMedicine() {
        initComponents();
        getMedicine();
    }
    
    
    public ViewMedicine(int empId) {
        this.empId = empId;
        initComponents();
        getMedicine();
    }
    
    public void getMedicine() {
        try {
            String selectStatement = "Select * FROM addMedicine";
            if(empId > -1){
                selectStatement = "Select * FROM addMedicine where empId = "+empId;
            }
            PreparedStatement ps = singletonClass.connection.prepareCall(selectStatement);
            ResultSet rs = ps.executeQuery();
            String[] headers = {"id" , "medicineId", "medicineName", "genre", "company", "mfgDate", "expiryDate", "quantity","pricePerUnit"};
            DefaultTableModel dtm = new DefaultTableModel(null, headers);
            table.setModel(dtm);

            Object[] row = new Object[9];
            while (rs.next()) {
                row[0] = rs.getString("id");
                row[1] = rs.getString("medicineId");
                row[2] = rs.getString("medicineName");
                row[3] = rs.getString("genre");
                row[4] = rs.getString("company");
                row[5] = rs.getString("mfgDate");
                row[6] = rs.getString("expiryDate");
                row[7] = rs.getString("quantity");
                row[8] = rs.getString("pricePerUnit");

                dtm.addRow(row);
            }

        } catch (SQLException sqlException) {
            System.out.print("in exception " + sqlException.getMessage());
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setText("View Medicine");

        table.setBackground(new java.awt.Color(224, 242, 241));
        table.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Medicine Id", "Medicine Name", "genre", "company", "manufacturingDate", "expiryDate", "quantity", "price"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewMedicines - Copy.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(222, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        if(empId > -1)
        {
            PharmacistDashboard pharmacistDashboard = new PharmacistDashboard(userModel);
            pharmacistDashboard.setVisible(true);
        }
        /*
        else if(empId > 0){
            PharmacistDashboard pharmacistDashboard = new PharmacistDashboard(userModel);
            pharmacistDashboard.setVisible(true);
            
        }*/
        else{
            AdminPanel adminPanel = new AdminPanel();
            adminPanel.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int returnValue = JOptionPane.showConfirmDialog(rootPane, "Press Yes for UPDATE or No for DELETE");
        DefaultTableModel dfm = (DefaultTableModel)table.getModel();
        int selectedRow = table.getSelectedRow();
        String id = dfm.getValueAt(selectedRow, 0).toString();
        System.out.println("returnValue  "+returnValue );
       if( returnValue == 0){
            UpdateMedicine updatemedi = new UpdateMedicine(id, empId);
            updatemedi.setVisible(true);
            this.dispose();
       } else if(returnValue == 1){
            String deleteStatement = "DELETE FROM addMedicine where id = ?";
        try{
            PreparedStatement ps = singletonClass.connection.prepareStatement(deleteStatement);
            ps.setInt(1, Integer.parseInt(id));
            if(ps.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted Successful");
                   getMedicine();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Sorry! cannot delete");

                }
            
        }catch(SQLException sqlException){
        }
       }
      
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(ViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMedicine(userModel).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
