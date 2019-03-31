package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] arr = {1, 6, 6, 4, 8, 9, 3, 1, 3, 0};
        int[] copyOfArr = Arrays.copyOf(arr, 2 * arr.length);
        int j = arr.length - 1;
        for (int i = arr.length; i < copyOfArr.length; i++) {
            copyOfArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(copyOfArr));
    }

}
