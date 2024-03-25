package com.example.saigunasbirbalas.model;

public class PriceCalculation {

    private double priceWithoutVat;
    private double vatAmount;
    private double totalPriceWithoutVat;
    private double totalVatAmount;
    private double totalPriceWithVat;
    private int quantity;

    // Constructor, getters and setters
    public PriceCalculation(double priceWithoutVat, double vatAmount, double totalPriceWithoutVat,
                            double totalVatAmount, double totalPriceWithVat, int quantity) {
        this.priceWithoutVat = priceWithoutVat;
        this.vatAmount = vatAmount;
        this.totalPriceWithoutVat = totalPriceWithoutVat;
        this.totalVatAmount = totalVatAmount;
        this.totalPriceWithVat = totalPriceWithVat;
        this.quantity = quantity;
    }

    public double getPriceWithoutVat() {
        return priceWithoutVat;
    }

    public void setPriceWithoutVat(double priceWithoutVat) {
        this.priceWithoutVat = priceWithoutVat;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public double getTotalPriceWithoutVat() {
        return totalPriceWithoutVat;
    }

    public void setTotalPriceWithoutVat(double totalPriceWithoutVat) {
        this.totalPriceWithoutVat = totalPriceWithoutVat;
    }

    public double getTotalVatAmount() {
        return totalVatAmount;
    }

    public void setTotalVatAmount(double totalVatAmount) {
        this.totalVatAmount = totalVatAmount;
    }

    public double getTotalPriceWithVat() {
        return totalPriceWithVat;
    }

    public void setTotalPriceWithVat(double totalPriceWithVat) {
        this.totalPriceWithVat = totalPriceWithVat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}