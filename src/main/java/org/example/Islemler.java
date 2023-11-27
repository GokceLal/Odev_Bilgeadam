package org.example;

import java.util.Random;

public class Islemler {
    private Menu[] haftalikMenu = new Menu[7];
    private Icecekler[] haftalikIcecekler = new Icecekler[7];

    public void menuBelirle() {
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            Corbalar corba = Corbalar.values()[random.nextInt(Corbalar.values().length)];
            Yemekler yemek = Yemekler.values()[random.nextInt(Yemekler.values().length)];
            Tatlilar tatli = Tatlilar.values()[random.nextInt(Tatlilar.values().length)];

            Icecekler icecek;
            do {
                icecek = Icecekler.values()[random.nextInt(Icecekler.values().length)];
            } while (haftalikIcecekler[i] != null && haftalikIcecekler[i] == icecek);

            haftalikIcecekler[i] = icecek;
            haftalikMenu[i] = new Menu(corba, icecek, yemek, tatli);
        }
    }

    public void haftalikMenuYazdir() {
        for (int i = 0; i < 7; i++) {
            System.out.println(Gunler.values()[i] + " " + haftalikMenu[i] + "\n");
        }
    }
}
