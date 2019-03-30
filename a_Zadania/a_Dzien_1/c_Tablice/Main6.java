package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumners = {2, 4};
        int[] result = new int[numbers.length];
        for (int i  = 0 ;i<numbers.length;i++){
            result[i] = numbers[i]+secondNumners[i];
        }
        Arrays.stream(result).forEach(number -> System.out.println(number));
    }
}
