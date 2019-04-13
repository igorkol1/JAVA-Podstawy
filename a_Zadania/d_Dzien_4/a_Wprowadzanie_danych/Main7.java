package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main2.getInt;

public class Main7 {

    private static final double TAX = 0.23;

    public static void main(String[] args) {
        nettoBrutto();
    }

    private static void nettoBrutto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj typ konwersji: ");
        String type = scanner.next();
        while (!(type.equals("bn") | type.equals("nb"))) {
            System.out.print("Podany typ konwersji nie istnieje. Spróbuj jeszcze raz: ");
            type = scanner.next();
        }
        System.out.print("Podaj wartość do zmiany: ");
        int value = getInt();
        if (type.equals("bn")) {
            System.out.println("Wartość netto: " + value / (1 + TAX));
        } else {
            System.out.println("Wartość brutto: " + value * (1 + TAX));
        }
    }

}
