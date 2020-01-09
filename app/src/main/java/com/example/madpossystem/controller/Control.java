package com.example.madpossystem.controller;

import com.example.madpossystem.model.Profil;

public final class Control {
    private static Control instance = null;
    private Profil profil;
    private Control(){
        super();
    }
    public static final Control getInstance() {
        if (Control.instance == null) {
            Control.instance = new Control();
        }
        return Control.instance;

    }
}
