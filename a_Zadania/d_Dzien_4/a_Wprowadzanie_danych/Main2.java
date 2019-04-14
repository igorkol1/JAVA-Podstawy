package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

import static a_Zadania.c_Dzien_3.b_Wyjatki.Main2.divide;


public class Main2 {

    public static void main(String[] args) {
        operations();
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz: ");
        }
        return scan.nextInt();
    }

    private static void operations() {
        int a, b;
        System.out.print("Podaj pierwszą liczbe ");
        a = getInt();
        System.out.print("Podaj drugą liczbe ");
        b = getInt();
        System.out.println("Wynik dodawania " + (a + b));
        System.out.println("Wynik odejmowania " + (a + b));
        System.out.println("Wynik mnożenia " + (a + b));
        System.out.println("Wynik dzielenia " + divide(a, b));
    }


}
