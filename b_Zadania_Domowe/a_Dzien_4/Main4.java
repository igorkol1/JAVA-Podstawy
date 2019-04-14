package b_Zadania_Domowe.a_Dzien_4;


import java.util.Arrays;
import java.util.Random;

import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main2.getInt;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedArray()));
    }

    private static int[] sortedArray() {
        System.out.print("Podaj ile liczb należy wylosować: ");
        int n = getInt();
        int[] randArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randArray[i] = random.nextInt(100);
        }
        Arrays.sort(randArray);
        return randArray;
    }
}
