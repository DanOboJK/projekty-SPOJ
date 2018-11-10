package com.company;
import java.util.Scanner;

public class RNO_DOD {
    Scanner skanowanie = new Scanner(System.in);

    public void prosteDodawanie(){
        System.out.println("Podaj liczbe testów: ");
        int liczbaTestów = skanowanie.nextInt();
        int [] wyniki = new int[liczbaTestów];

        for(int numerTestu = 0; numerTestu < liczbaTestów; numerTestu++){
            System.out.println("Podaj ilość liczb: ");
            int iloscLiczb = skanowanie.nextInt();
            int suma = 0;

            for(int numerLiczby = 0; numerLiczby < iloscLiczb; numerLiczby++){
                System.out.println("Podaj liczbe: ");
                int liczba = skanowanie.nextInt();
                suma = suma + liczba;
                }
            wyniki[numerTestu] = suma;
        }
        System.out.println("Wyniki testów: ");
        for (int indexTabeli = 0; indexTabeli < wyniki.length; indexTabeli++){
            System.out.println(wyniki[indexTabeli]);
        }
    }

}
