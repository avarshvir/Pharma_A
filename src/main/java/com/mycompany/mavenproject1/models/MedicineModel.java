/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.models;

/**
 *
 * @author arshvir
 */
public class MedicineModel {
    
    int id, sellingUnit, quantity;
    double pricePerUnit;
    String medicineName, medicineId, genre,company, mfdDate,availableUnit, expiryDate ;

    public MedicineModel() {
    }

    public MedicineModel(int id, String medicineName, String medicineId, String genre, String company, String mfdDate,String availableUnit, String expiryDate, int quantity, double pricePerUnit, int sellingUnit) {
        this.id = id;
        this.medicineName = medicineName;
        this.medicineId = medicineId;
        this.genre = genre;
        this.company = company;
        this.mfdDate = mfdDate;
        this.availableUnit=availableUnit;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.sellingUnit = sellingUnit;
    }

    public MedicineModel(String medicineName,
            String medicineId, 
            String genre, 
            String company, 
            String mfdDate, 
            String availableUnit,
            int quantity,
            double pricePerUnit, 
            int sellingUnit) {
        this.medicineName = medicineName;
        this.medicineId = medicineId;
        this.genre = genre;
        this.company = company;
        this.mfdDate = mfdDate;
        this.availableUnit=availableUnit;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.sellingUnit = sellingUnit;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMfdDate() {
        return mfdDate;
    }

    public void setMfdDate(String mfdDate) {
        this.mfdDate = mfdDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
    public int getSellingUnit() {
        return sellingUnit;
    }

    public void setSellingUnit(int sellingUnit) {
        this.sellingUnit = sellingUnit;
    }
    
    
    
}
