package com.company;

import java.util.Scanner;

public class studnia {


    public void kalkulator() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę zadań: ");
        int ileZadan = skaner.nextInt();

        for (int x = 0; x < ileZadan; ++x) {
            int sumaPP = 0, sumaZW = 0;
            System.out.println("Podaj liczbę wierszy: ");
            int ileWierszy = skaner.nextInt();

            for (int y = 0; y < ileWierszy; ++y) {
                System.out.println("Podaj kierunek: ");
                int kierunek = skaner.nextInt();
                System.out.println("Podaj liczbę wierszy: ");
                int ileKrokow = skaner.nextInt();

                switch (kierunek) {
                    case 0:
                        sumaPP += ileKrokow;
                        break;
                    case 1:
                        sumaPP -= ileKrokow;
                        break;
                    case 3:
                        sumaZW += ileKrokow;
                        break;
                    case 2:
                        sumaZW -= ileKrokow;
                        break;
                }
            }

            if ((sumaPP != 0) || (sumaZW != 0)) {

                if (sumaPP != 0) {
                    if (sumaPP > 0)
                        System.out.println(0 + " " + sumaPP);
                    else {
                        sumaPP = sumaPP * -1;
                        System.out.println(1 + " " + sumaPP);
                    }
                }

                if (sumaZW != 0) {
                    if (sumaZW > 0)
                        System.out.println(3 + " " + sumaZW);
                    else {
                        sumaZW = sumaZW * -1;
                        System.out.println(2 + " " + sumaZW);
                    }
                }
            } else
                System.out.println("Studnia");
        }


    }
}
