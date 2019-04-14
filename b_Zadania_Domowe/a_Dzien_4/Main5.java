package b_Zadania_Domowe.a_Dzien_4;


import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main2.getInt;

public class Main5 {

    public static void main(String[] args) {
        printTriangle();
    }

    private static void printTriangle() {
        System.out.print("Podaj ile liczb należy wylosować: ");
        int n = getInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
