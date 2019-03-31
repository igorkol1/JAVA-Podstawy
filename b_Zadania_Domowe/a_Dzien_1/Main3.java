package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 6}, {59, -9, 0, 3}, {-1, -6, -9}};
        int[] min = minimum(arr);
        System.out.println(Arrays.toString(min));
    }

    private static int[] minimum(int[][] arr) {
        int[] minimum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            minimum[i] = findMinimum(arr[i]);
        }
        return minimum;
    }

    private static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

}
