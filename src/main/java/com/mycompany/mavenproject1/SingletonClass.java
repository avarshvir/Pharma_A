/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author arshvir
 */
public class SingletonClass {
    public Connection connection = null;
    private static SingletonClass singletoneg = null;
   
    private SingletonClass(){
        try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmaTech","root","");
        if(connection != null){
            String createUser = "CREATE TABLE IF NOT EXISTS user(id INT AUTO_INCREMENT, firstName VARCHAR(255), lastname VARCHAR(255), email VARCHAR(255), password VARCHAR(255), phoneNo VARCHAR(255), address VARCHAR(255), gender VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps = connection.prepareStatement(createUser);
            ps.execute();
            
//            String updateMedicine = "CREATE TABLE IF NOT EXISTS updateMedicine(id INT AUTO_INCREMENT, medicineId VARCHAR(255) , medicineName VARCHAR(255), company VARCHAR(255), genre VARCHAR(255), quantity VARCHAR(255), addQuantity VARCHAR(255), price VARCHAR(255), manufacturingDate VARCHAR(255),expiryDate VARCHAR(255) , PRIMARY KEY(id))";
//            PreparedStatement ps1 = connection.prepareStatement(updateMedicine);
//            ps1.execute();
            
            String viewBill = "CREATE TABLE IF NOT EXISTS viewBill(id INT AUTO_INCREMENT, medicineName VARCHAR(255), medicineId VARCHAR(255), companyName VARCHAR(255), date VARCHAR(255), totalPaid VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps2 = connection.prepareStatement(viewBill);
            ps2.execute();
            
            String viewMedicine = "CREATE TABLE IF NOT EXISTS viewMedicine(id INT AUTO_INCREMENT, medicineId VARCHAR(255), medicineName VARCHAR(255), companyName VARCHAR(255), genre VARCHAR(255), quantity VARCHAR(255), addQuantity VARCHAR(255), manufacturingDate VARCHAR(255),expiryDate VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps3 = connection.prepareStatement(viewMedicine);
            ps3.execute();
            
            String addAdmin = "CREATE TABLE IF NOT EXISTS addAdmin(id INT AUTO_INCREMENT, name VARCHAR(255), dob VARCHAR(255), email VARCHAR(255), phoneNumber VARCHAR(255), address VARCHAR(255), gender VARCHAR(255), password VARCHAR(255), confirmPassword VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps4 = connection.prepareStatement(addAdmin);
            ps4.execute();
            
            String addPatient = "CREATE TABLE IF NOT EXISTS addpatient(id INT AUTO_INCREMENT, name VARCHAR(255), dob VARCHAR(255), email VARCHAR(255), phoneNumber VARCHAR(255), address VARCHAR(255), gender VARCHAR(255), disease VARCHAR(255), bloodGroup VARCHAR(255),empId INT, PRIMARY KEY(id))";
            PreparedStatement ps5 = connection.prepareStatement(addPatient);
            ps5.execute();
            
            String addPharmacist = "CREATE TABLE IF NOT EXISTS addPharmacist(id INT AUTO_INCREMENT, name VARCHAR(255), dob VARCHAR(255), email VARCHAR(255), phoneNumber VARCHAR(255), address VARCHAR(255), gender VARCHAR(255), userName VARCHAR(255), password VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps6 = connection.prepareStatement(addPharmacist);
            ps6.execute();
            
            String createOrder = "CREATE TABLE IF NOT EXISTS orderTable(id INT AUTO_INCREMENT, customerName VARCHAR(255), customerPhone VARCHAR(255), total VARCHAR(255),empId INT  DEFAULT 0 , patientId INT DEFAULT 0,  PRIMARY KEY(id))";
            PreparedStatement psCreateOrder = connection.prepareStatement(createOrder);
            psCreateOrder.execute();  
            
            String sellMedicine = "CREATE TABLE IF NOT EXISTS sellMedicine(id INT AUTO_INCREMENT, medicineId VARCHAR(255) , medicineName VARCHAR(255), company VARCHAR(255), genre VARCHAR(255), units VARCHAR(255), pricePerUnit VARCHAR(255), totalprice VARCHAR(255),orderId INT, PRIMARY KEY(id), FOREIGN KEY (orderId) REFERENCES orderTable(id))";
            PreparedStatement ps7 = connection.prepareStatement(sellMedicine);
            ps7.execute();
            
           
            String patientRegister = "CREATE TABLE IF NOT EXISTS patientRegister(id INT AUTO_INCREMENT, name VARCHAR(255), dob VARCHAR(255), email VARCHAR(255), phoneNumber VARCHAR(255), address VARCHAR(255), gender VARCHAR(255), username VARCHAR(255), confirmPassword VARCHAR(255), empId INT, PRIMARY KEY(id))";
            PreparedStatement ps8 = connection.prepareStatement(patientRegister);
            ps8.execute();
            
            String patientOrder = "CREATE TABLE IF NOT EXISTS patientOrder(id INT AUTO_INCREMENT, medicineId VARCHAR(255), medicineName VARCHAR(255), genre VARCHAR(255), dateOfOrder VARCHAR(255), price VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps9 = connection.prepareStatement(patientOrder);
            ps9.execute();
            
            String addMedicine = "CREATE TABLE IF NOT EXISTS addMedicine(id INT AUTO_INCREMENT, medicineId VARCHAR(255), medicineName VARCHAR(255), genre VARCHAR(255), company VARCHAR(255), mfgDate VARCHAR(255), expiryDate VARCHAR(255), quantity VARCHAR(255), pricePerUnit VARCHAR(255), empId INT, PRIMARY KEY(id))";
            PreparedStatement ps10 = connection.prepareStatement(addMedicine);
            ps10.execute();
            
            String patientCart = "CREATE TABLE IF NOT EXISTS patientCart(id INT AUTO_INCREMENT, medicineId VARCHAR(255), medicineName VARCHAR(255), genre VARCHAR(255), price VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps11 = connection.prepareStatement(patientCart);
            ps11.execute();
            
            String buyMedicine = "CREATE TABLE IF NOT EXISTS buyMedicine(id INT AUTO_INCREMENT, medicineId VARCHAR(255), medicineName VARCHAR(255), company VARCHAR(255) , genre VARCHAR(255),noOfUnits VARCHAR(255) ,  pricePerUnit VARCHAR(255), totalPrice VARCHAR(255) , PRIMARY KEY(id))";
            PreparedStatement ps12 = connection.prepareStatement(buyMedicine);
            ps12.execute();
            
            String adminOneTimeRegister = "CREATE TABLE IF NOT EXISTS adminOneTimeRegister(id INT AUTO_INCREMENT, username VARCHAR(255), password VARCHAR(255), PRIMARY KEY(id))";
            PreparedStatement ps13 = connection.prepareStatement(adminOneTimeRegister);
            ps13.execute();  
            
                 
        }
    }
        catch(SQLException sqlException){
            System.out.println("in exception singleton "+sqlException.getMessage());
        }
        }
    public static SingletonClass getInstance(){
        if(singletoneg == null){
            singletoneg = new SingletonClass();

        }
    
        return singletoneg;
    }
       
}
    

