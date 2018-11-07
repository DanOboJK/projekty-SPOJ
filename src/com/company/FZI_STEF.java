package com.company;

import java.util.Random;

public class FZI_STEF {
        public static void main(String[] args)
        {
            Random losowanie = new Random();
            int liczbaKoncertów = losowanie.nextInt(100000);
            System.out.println(liczbaKoncertów);
            int[] tablicaKoncertów = new int[liczbaKoncertów];

            for(int numerKoncertu = 0; numerKoncertu < liczbaKoncertów; numerKoncertu++){
                tablicaKoncertów[numerKoncertu] = losowanie.nextInt(200000) - 100000;
            }

            for (int i = 0; i < liczbaKoncertów; i++){
                System.out.println(tablicaKoncertów[i]);
            }
            System.out.println("Suma: " + znajdzSume(tablicaKoncertów));
        }

        private static int znajdzSume(int[] tablicaZawierajacaKoncerty)
        {
            int aktualnaSuma = tablicaZawierajacaKoncerty[0];
            int największaSuma = 0;
            int wynik = 0;
            for (int i = 1; i < tablicaZawierajacaKoncerty.length; ++i)
            {
                if (aktualnaSuma + tablicaZawierajacaKoncerty[i] >= największaSuma)
                {
                    aktualnaSuma = aktualnaSuma + tablicaZawierajacaKoncerty[i];
                    największaSuma = aktualnaSuma;
                }
                else aktualnaSuma = 0;
            }

            if(aktualnaSuma > największaSuma) wynik = aktualnaSuma;
            else wynik = największaSuma;
            //return aktualnaSuma > największaSuma? aktualnaSuma:największaSuma;
            return wynik;
        }
    }

