package org.example.HW6;

public class Product {
    private String name;
    private String vendorCode;
    private double price;
    private String description;
    private boolean availability;

    //сonstructor:
    public Product(String name, String vendorCode, double price, String description, boolean availability) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    //getters:
    public String getName() {
        return name;
    }

    public String getArticle() {
        return vendorCode;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailable() {
        return availability;
    }

    //setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setArticle(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}