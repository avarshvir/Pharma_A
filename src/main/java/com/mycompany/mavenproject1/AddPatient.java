/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.pharmacist.PharmacistDashboard;
import static java.lang.String.format;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.text.MessageFormat.format;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Arshvir
 */
public class AddPatient extends javax.swing.JFrame {
 private SingletonClass singletonClass = SingletonClass.getInstance();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
int empId = -1;
/**
     * Creates new form AddPharmacist
     */
    public AddPatient() {
        initComponents();
    }
    
    public AddPatient(int empId) {
        this.empId = empId;
        initComponents();
    }
                                     

        
    /**        // TODO add your handling code here:
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patientAdd = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        disease = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        bloodGroup = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(224, 241, 242));

        jLabel2.setText("Name");

        jLabel3.setText("D.O.B");

        jLabel4.setText("Address");

        jLabel5.setText("Phone Number");

        jLabel6.setText("Disease");

        jLabel7.setText("Blood Group");

        jLabel8.setText("Email");

        patientAdd.setText("Save");
        patientAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientAddMouseClicked(evt);
            }
        });
        patientAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAddActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel9.setText("Gender");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender" }));

        jButton4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Add Patient");

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        bloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bloodGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name)
                            .addComponent(address)
                            .addComponent(phoneNumber)
                            .addComponent(disease)
                            .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientAdd)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addComponent(patientAdd)
                .addGap(4, 4, 4)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void patientAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientAddMouseClicked
        // TODO add your handling code here:
        /*if(name.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter Patient name");
        }
        else if (!isValidName(name.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Enter valid Name");
        }
        else if(email.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter Patient email");
        }
        else if (!isValidEmail(email.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Enter a valid Email");
        }
        //check if the email already exists
        if (isEmailRegistered(email.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Email is already registered. Please use a different email.");
            return;
        }
        else if(address.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter Patient address");
        }
        else if(phoneNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter Patient phoneNumber");
        }
        else if (!isValidPhoneNumber(phoneNumber.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Enter a valid Phone Number");
        }
        if (isPhoneNumberRegistered(phoneNumber.getText())) {
             JOptionPane.showMessageDialog(rootPane, "Phone number is already registered. Please use a different phone number.");
             return;
        }
        
        else if(gender.toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Select Patient gender");
        }*/
        if(name.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter your Name");
        }
        else if (!isValidName(name.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Enter valid Name");
        }
        else if(email.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter your Email");
        }
        else if (!isValidEmail(email.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Enter a valid Email");
        }
        //check if the email already exists
        if (isEmailRegistered(email.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Email is already registered. Please use a different email.");
            return;
        }
        else if(phoneNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter your Phone Number");
        }
        // Check if the email, username, or phone number already exists
        else if (!isValidPhoneNumber(phoneNumber.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Enter a valid Phone Number");
        }
        if (isPhoneNumberRegistered(phoneNumber.getText())) {
             JOptionPane.showMessageDialog(rootPane, "Phone number is already registered. Please use a different phone number.");
             return;
        }  
        else if(address.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter your address");
        }
        else if(disease.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter Patient disease");
        }
            else{
            
            String insertInDB = "INSERT INTO addPatient(name, dob, email, phoneNumber, address, gender, disease, bloodgroup, empId) VALUES(?,?,?,?,?,?,?,?,?)";
            try{
                String  selectedgender = gender.getSelectedItem().toString();
                PreparedStatement prepareStatement = singletonClass.connection.prepareCall(insertInDB);
              
                prepareStatement.setString(1, name.getText().toString());
               String format=sdf.format(dob.getCalendar().getTime());
               prepareStatement.setString(2,format.toString());
                prepareStatement.setString(3, email.getText().toString());
                prepareStatement.setString(4, phoneNumber.getText().toString());
                 prepareStatement.setString(5, address.getText().toString());
                prepareStatement.setString(6, selectedgender);
                prepareStatement.setString(7, disease.getText().toString()); 
                String  selectedBloodgroup = bloodGroup.getSelectedItem().toString();
               prepareStatement.setString(8, selectedBloodgroup);
                prepareStatement.setInt(9, empId);
               prepareStatement.execute();
                
                JOptionPane.showMessageDialog(rootPane, "Saved Successfully");
                 ViewPatient viewpatient = new ViewPatient();
                    viewpatient.setVisible(true);
                    this.dispose();
                }catch(SQLException sqlException){
                         JOptionPane.showMessageDialog(rootPane, "enter your gender");
       
                System.out.println("in exception "+sqlException.getMessage());   
            }        
            //next screen    
        }
                                              

    }//GEN-LAST:event_patientAddMouseClicked
    
    private boolean isValidName(String name) {
    // Email validation regex pattern
    String namePattern = "^[a-zA-Z\\s_-]+$";
    return name.matches(namePattern);
    }
    
    private boolean isValidEmail(String email) {
    // Email validation regex pattern
    String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    return email.matches(emailPattern);
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
    // Phone number validation regex pattern
    String phonePattern = "\\d{10}"; // Assuming 10-digit phone number format
    return phoneNumber.matches(phonePattern);
    }
    
    private boolean isEmailRegistered(String email) {
        String query = "SELECT COUNT(*) FROM addPatient WHERE email = ?";
        try (PreparedStatement preparedStatement = singletonClass.connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt(1) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    private boolean isPhoneNumberRegistered(String phoneNumber) {
        String query = "SELECT COUNT(*) FROM addPatient WHERE phoneNumber = ?";
        try (PreparedStatement preparedStatement = singletonClass.connection.prepareStatement(query)) {
            preparedStatement.setString(1, phoneNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt(1) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

       if(empId>-1)
        {
            PharmacistDashboard pharmacistDashboard = new PharmacistDashboard();
            pharmacistDashboard.setVisible(true);
        } else{
            AdminPanel adminPanel = new AdminPanel();
            adminPanel.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked
    
    
    
    private void bloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_bloodGroupActionPerformed

    private void patientAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
       

    }         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> bloodGroup;
    private javax.swing.JTextField disease;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JButton patientAdd;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables
}
