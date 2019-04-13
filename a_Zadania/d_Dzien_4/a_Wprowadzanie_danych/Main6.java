package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main2.getInt;

public class Main6 {

    public static void main(String[] args) {
        equation();
    }

    private static void equation() {
        int a, b, c;
        System.out.print("Podaj a: ");
        a = getInt();
        System.out.print("Podaj b: ");
        b = getInt();
        System.out.print("Podaj c: ");
        c = getInt();
        int delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta) / (2 * a));
            double root2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("Pierwiastki rownania kwadratowego to: " + root1 + " i " + root2);
        } else if (delta == 0) {
            System.out.println("Pierwiastkiem rownania kwadratowego jest: " + ((-b) / (2 * a)));
        } else {
            System.out.println("Rownanie nie ma rozwiazania w zbiorze liczb rzeczywistych");
        }

    }
}
