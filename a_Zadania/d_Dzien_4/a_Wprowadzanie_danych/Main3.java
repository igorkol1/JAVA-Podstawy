package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main2.getInt;

public class Main3 {

    public static void main(String[] args) {
        getData();
    }

    private static void getData() {
        int sum = 0;
        System.out.print("Podaj pierwszą liczbe: ");
        int nextInt = getInt();
        while (nextInt != 0) {
            sum += nextInt;
            System.out.print("Podaj kolejną liczbe: ");
            nextInt = getInt();
        }
        System.out.println("Suma liczb: " + sum);
    }
}
