package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, d, e;
        do {
            System.out.println("Podaj cene towaru.");
            Scanner wej = new Scanner(System.in);
            a = wej.nextInt();
            System.out.println("Podaj ilosc rat. ");
            b = wej.nextInt();
            if (a < 100 || a > 10000 || b < 6 || b > 48) {
                System.out.println("Blad! Zla cena lub ilosc rat! Podaj poprawne wartosci.");
            }
        } while (a < 100 || a > 10000 || b < 6 || b > 48);

        if (b >= 6 || b <= 12 || a <= 999) {
            c = (a * 0.25 + a) / b;
            System.out.println("Dla podanej kwoty i ilosci rat wartosc jednej raty to " + c + ".");
        } else if (b >= 13 || b <= 24 || a >= 1000 || a <= 4999) {
            d = (a * 0.5 + a) / b;
            System.out.println("Dla podanej kwoty i ilosci rat wartosc jednej raty to " + d + ".");
        } else if (b >= 25 || b <= 48 || a >= 5000 || a <= 10000) {
            e = (a * 0.1 + a) / b;
            System.out.println("Dla podanej kwoty i ilosci rat wartosc jednej raty to " + e + ".");
        }
    }
}


