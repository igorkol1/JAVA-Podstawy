package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] randNumbers = new int[20];

        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = r.nextInt();
        }

        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
    }
}
