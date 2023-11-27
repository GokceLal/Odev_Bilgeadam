package org.example;

import org.example.DataBase.Corbalar;
import org.example.DataBase.Icecekler;
import org.example.DataBase.Yemekler;
import org.example.DataBase.Tatlilar;

public class Menu {
    private Corbalar corba;
    private Icecekler icecek;
    private Yemekler yemek;
    private Tatlilar tatli;

    public Menu(Corbalar corba, Icecekler icecek, Yemekler yemek, Tatlilar tatli) {
        this.corba = corba;
        this.icecek = icecek;
        this.yemek = yemek;
        this.tatli = tatli;
    }

    @Override
    public String toString() {
        return "Günün Menüsü: " +
                "\nÇorba: " + corba +
                "\nİçecek: " + icecek +
                "\nYemek: " + yemek +
                "\nTatlı: " + tatli;
    }
}


