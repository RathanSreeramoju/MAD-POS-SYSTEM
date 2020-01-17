package com.example.madpossystem.controller;
import com.example.madpossystem.model.Profil;

public final class Control {
    private static Control instance = null;
    private static Profil profil;
    private Control()
    {
        super();
    }
    public static final Control getInstance() {
        if (Control.instance == null) {
            Control.instance = new Control();
        }
        return Control.instance;

       /*public void createProfil(double uprice, double quantity, double taxes, double total)     {
            profil = new Profil(uprice,quantity,taxes,total);
        }*/


    }
}
