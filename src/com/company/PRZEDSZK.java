package com.company;

import java.util.Random;

public class PRZEDSZK {

    public void wyswietl() {
        Random losowanie = new Random();
        int pierwszaKlasa;
        int drugaKlasa;

        int liczbaZestawów = losowanie.nextInt(19) + 1;
        System.out.println(liczbaZestawów);

        for (int numerZestawu = 0; numerZestawu < liczbaZestawów; numerZestawu++) {
            pierwszaKlasa = losowanie.nextInt(20) + 10;
            drugaKlasa = losowanie.nextInt(20) + 10;
            int wynik = (pierwszaKlasa*drugaKlasa)/nwd(pierwszaKlasa,drugaKlasa);
            System.out.println(pierwszaKlasa + "," + drugaKlasa + ", " + wynik);
        }
    }

    public int nwd(int x, int y) {
        int wynikNWD;
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
}