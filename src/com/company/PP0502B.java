package com.company;
import java.util.Scanner;

public class PP0502B {
    Scanner skanowanie = new Scanner(System.in);

    public void odwracanieTablicy() {
        System.out.println("Podaj liczbę testow: ");
        int liczbaTestow = skanowanie.nextInt();
        if (liczbaTestow <= 100 && liczbaTestow > 0) {
            for (int numerTestu = 0; numerTestu < liczbaTestow; numerTestu++) {
                System.out.println("Podaj ilość liczb: ");
                int iloscLiczb = skanowanie.nextInt();
                if(iloscLiczb <= 100 && iloscLiczb > 0) {
                    int[] tablicaLiczb = new int[iloscLiczb];
                    for (int numerLiczby = 0; numerLiczby < iloscLiczb; numerLiczby++) {
                        System.out.println("Podaj liczbe: ");
                        int liczba = skanowanie.nextInt();
                        tablicaLiczb[numerLiczby] = liczba;
                    }
                    String odwroconeCyfry = metodaOdwracajaca(tablicaLiczb);
                    System.out.println(odwroconeCyfry);
                }else System.out.println("Podałeś nieprawidłową ilość liczb");
                break;
            }
        }else System.out.println("Podałeś złą liczbe testów");
        }

    public String metodaOdwracajaca (int tablicaLiczb[]) {
        String odwroconeCyfry = "";
        for (int numerCyfry = tablicaLiczb.length - 1; numerCyfry > -1; numerCyfry--) {

            odwroconeCyfry = odwroconeCyfry + " " + tablicaLiczb[numerCyfry];
        }
        return odwroconeCyfry;
    }
}

