package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] reverse = new int[10];
        for (int i = 0;i<10;i++){
            reverse[9-i]=numbers[i];
        }
        Arrays.stream(reverse).forEach(element->System.out.println(element));
    }
}
