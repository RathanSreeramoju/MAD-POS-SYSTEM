package com.example.madpossystem.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfilTest {

    private Profil profil = new Profil(10000,2,3000,23000);
    private float taxes = 3000;
    private float total = 23000;
    @Test
    public void getTaxes() throws Exception{

        assertEquals(taxes, profil.getTaxes());
    }

    @Test
    public void getTotal() throws Exception{

        assertEquals(total,profil.getTotal());
    }
}