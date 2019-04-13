package a_Zadania.d_Dzien_4.b_Pliki;


import java.util.Arrays;

import static a_Zadania.d_Dzien_4.b_Pliki.Main2.readFromFile;

public class Main5 {

    public static void main(String[] args) {
        String[] languages = readFromFile("a_Zadania/d_Dzien_4/b_Pliki/text2.txt").split(",");
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(languages));
        //TODO Implement custom comparer
        Arrays.sort(languages);
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(languages));
    }

}
