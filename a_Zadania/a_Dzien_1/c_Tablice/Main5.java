package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] numbers = {1,5,6,9,7,6,3,4,5,2};
        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(number -> System.out.println(number));
    }
}
