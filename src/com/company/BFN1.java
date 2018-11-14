package com.company;

import java.util.Scanner;

public class BFN1 {
    Scanner skanowanie = new Scanner(System.in);
    public void kalkulatorPalindromow(){
        int iloscLiczb = wybieranieLiczby(0,"Podaj ilość Liczb: ");
        Integer[][] tablicaWynikow = new Integer[iloscLiczb][2];

        for (int numerLiczby = 0; numerLiczby < iloscLiczb; numerLiczby++) {
            int liczba = wybieranieLiczby(1,"Podaj liczbę: ");
            int cyfraOdwrocona;
            int podejscie = 0;
            do {
                cyfraOdwrocona = odwracanieLiczby(liczba);
                if (liczba == cyfraOdwrocona) {
                    break;
                }
                podejscie++;
                liczba += cyfraOdwrocona;
            }while (true) ;
                tablicaWynikow[numerLiczby][0] = liczba;
                tablicaWynikow[numerLiczby][1] = podejscie;
                liczba = 0;
                podejscie = 0;
        }

        for (int liczbaPorzadkowa = 0; liczbaPorzadkowa < tablicaWynikow.length; liczbaPorzadkowa++){
            System.out.println(tablicaWynikow[liczbaPorzadkowa][0] + " " + tablicaWynikow[liczbaPorzadkowa][1]);
        }
    }

    public int wybieranieLiczby(int t, String komunikat) {
        int wybranaLiczba;
        int x;
        do {
            System.out.println(komunikat);
            x = skanowanie.nextInt();
            if (x > 80 || x < t ){
            System.out.println("Podałeś złą liczbe");
            }
        }while(x > 80 || x < t);
        wybranaLiczba = x;
        return wybranaLiczba;
    }

    public int odwracanieLiczby(int liczba){
        String liczbaJakoTekst = String.valueOf(liczba);
        StringBuffer odwracacz = new StringBuffer(liczbaJakoTekst);
        int liczba2 = 0;
        liczba2 = Integer.parseInt(odwracacz.reverse().toString());
        return liczba2;
        }

}
