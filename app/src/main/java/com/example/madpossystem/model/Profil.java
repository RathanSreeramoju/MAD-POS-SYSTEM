package com.example.madpossystem.model;

public class Profil {



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

    public double getTaxes()
    {
        return taxes;
    }

    public double getTotal()
    {
        return total;
    }


    public Profil(double uprice, double quantity, double taxes, double total) {
        this.uprice = uprice;
        this.quantity = quantity;
        this.taxes = taxes;
        this.total = total;
        this.calculate();
    }

    private void calculate() {
        this.taxes = (float)(0.15 * (uprice * quantity));
        this.total = (float)(1.15*(uprice * quantity));
    }
}
