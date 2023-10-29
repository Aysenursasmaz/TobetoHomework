package org.example.entities;

public class Product {
    private int year;
    private String name;
    private double km;
    private String model;
    private double unitPrice;

    public Product(int year, String name, double km, String model, double unitPrice) {
        this.year = year;
        this.name = name;
        this.km = km;
        this.model = model;
        this.unitPrice = unitPrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


}
