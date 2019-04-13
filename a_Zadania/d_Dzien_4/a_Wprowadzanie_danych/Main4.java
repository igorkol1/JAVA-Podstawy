package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Arrays;

import static a_Zadania.c_Dzien_3.b_Wyjatki.Main2.divide;
import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main2.getInt;

public class Main4 {

    public static void main(String[] args) {
        rowsColumns();
    }

    private static void rowsColumns() {
        int row, column, sum = 0;
        int[][] tempArray;
        System.out.print("Podaj liczbe wierszy: ");
        row = getInt();
        System.out.print("Podaj liczbe kolumn: ");
        column = getInt();
        tempArray = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum++;
                tempArray[i][j] = sum;
            }
            System.out.println(Arrays.toString(tempArray[i]));
        }
        System.out.println("Suma elementów: " + sum);
        System.out.println("Srednia z elementów: " + divide(sum, row + column));
    }

}
