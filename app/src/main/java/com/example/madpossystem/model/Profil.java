package com.example.madpossystem.model;

public class Profil {

    private static final Integer minCar = 25000;
    private static final Integer minBike = 10000;
    private static final Integer minPlane = 950000;
    private static final Integer minBoat = 145500;

    private double uprice;
    private double quantity;
    private double taxes;
    private double total;
    //private float img;
   // private String message;

    public double getUprice() {
        return uprice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getTotal() {
        return total;
    }

    /*public String getMessage() {
        return message;
    }*/

    public Profil(double uprice, double quantity, double taxes, double total) {
        this.uprice = uprice;
        this.quantity = quantity;
        this.taxes = taxes;
        this.total = total;
       // this.message = message;
    }

    private void calculate() {
        this.taxes = (float)(0.15 * (uprice * quantity));
        this.total = (float)(1.15*(uprice * quantity));
    }
}
