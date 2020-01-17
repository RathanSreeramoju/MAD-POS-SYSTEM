package com.example.madpossystem.controller;

import com.example.madpossystem.model.Profil;

public final class Control {
    private static Control instance = null;
    private static Profil profil;
    private Control(){
        super();
    }
    public static final void getInstance() {
        if (Control.instance == null) {
            Control.instance = new Control();
        }

       /* public void createProfil(Integer weight, Integer size, Integer age, Integer      sexe)     {
            profil = new Profil();
        }
        public float getTaxes(){
            return profil.getTaxes();
        }
        public String getTotal(){
            return profil.getTotal();*/

    }
}
