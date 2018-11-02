package com.company;

import java.util.Scanner;

public class PA05_POT {
    public void potęga() {
        System.out.println("Podaj liczby a i b");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Double wynik = Math.pow(a, b);
        Integer wynik2 = wynik.intValue();
        String wynikWPostaciStringa = wynik2.toString();

        Integer dlugosc = wynikWPostaciStringa.length();
        char ostatniaCyfra = wynikWPostaciStringa.charAt(dlugosc-1);
        System.out.println(ostatniaCyfra);

    }

}
