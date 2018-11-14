package com.company;

import java.util.Scanner;

public class PP0501A {
    Scanner skanowanie = new Scanner(System.in);

    public void znajdzNwd(){
        System.out.println("Podaj liczbe testów: ");
        int liczbaTestow = skanowanie.nextInt();
        int[] tablicaWynikow = new int[liczbaTestow];
        for (int numerTestu = 0; numerTestu < liczbaTestow; numerTestu++){
            System.out.print("Podaj liczby: ");
            System.out.println("a");
            int pierwszaLiczba = skanowanie.nextInt();
            System.out.println("b");
            int drugaLiczba = skanowanie.nextInt();
            int wynik = NWD(pierwszaLiczba, drugaLiczba);
            tablicaWynikow[numerTestu] = wynik;
        }
        System.out.println("Wyniki");
        wyswietlWyniki(tablicaWynikow);
    }

    public int NWD(int pierwszaLiczba, int drugaLiczba)
    {
        while (pierwszaLiczba != drugaLiczba) {
            if (pierwszaLiczba > drugaLiczba)
            { pierwszaLiczba = pierwszaLiczba - drugaLiczba; }
            else
            { drugaLiczba = drugaLiczba - pierwszaLiczba; }
        }
        return pierwszaLiczba;
    }

    public void wyswietlWyniki(int tablicaWynikow[]){
        for(int index = 0; index < tablicaWynikow.length; index++){
            System.out.println(tablicaWynikow[index]);
        }
    }
}
