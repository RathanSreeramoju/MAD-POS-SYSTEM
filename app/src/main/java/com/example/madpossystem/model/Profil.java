package com.example.madpossystem.model;

public class Profil {



    private double uprice;
    private double quantity;
    private double taxes;
    private double total;
    private int num1;
    private int num2;
    private int sum;
    private int div;
    private int sub;
    private int mul;



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


    public Profil(double uprice, double quantity, double taxes, double total,int num1, int num2, int sum, int div, int sub, int mul) {
        this.uprice = uprice;
        this.quantity = quantity;
        this.taxes = taxes;
        this.total = total;
        this.calculate();
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
        this.div = div;
        this.sub = sub;
        this.mul =mul;
    }

    public int getNum1() {
        return num1;
    }
    /*
     * method to get the value of num2
     */
    public int getNum2() {
        return num2;
    }
    /*
     * method to get the value of sum
     */
    public int getSum() {
        return sum;
    }
    /*
     * method to get the value of div
     */
    public int getDiv() {
        return div;
    }
    /*
     * method to get the value of sub
     */
    public int getSub() {
        return sub;
    }
    /*
     * method to get the value of mul
     */
    public int getMul() {
        return mul;
    }
    /*
     * allows to calaculates the values
     */

    private void calculator() {
        sum = num1 + num2;
        mul = num1 * num2;
        div = num1 % num2;
        sub = num1 - num2;
    }
    private void calculate() {
        this.taxes = (float)(0.15 * (uprice * quantity));
        this.total = (float)(1.15*(uprice * quantity));
    }
}
