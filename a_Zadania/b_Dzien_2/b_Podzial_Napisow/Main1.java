package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        String[] splitedString = str.split(" ");
        Arrays.stream(splitedString).forEach(element -> System.out.println(element));
    }
}
