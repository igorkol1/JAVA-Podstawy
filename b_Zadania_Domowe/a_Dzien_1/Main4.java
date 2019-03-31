package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 6}, {59, -9, 0, 3}, {-1, -6, -9}};
        System.out.println(Arrays.toString(lessMore(arr)));
    }

    private static int[] lessMore(int[][] arr) {
        int[] lessMore = new int[2];
        float avg = findAvg(arr);
        lessMore[0] = findNumberLessThanAvg(avg, arr);
        lessMore[1] = findNumberMoreThanAvg(avg, arr);
        return lessMore;
    }

    private static float findAvg(int[][] arr) {
        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                index++;
            }
        }
        return (float) sum / index;
    }

    private static int findNumberLessThanAvg(float avg, int[][] arr) {
        int less = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < avg) {
                    less++;
                }
            }
        }
        return less;
    }

    private static int findNumberMoreThanAvg(float avg, int[][] arr) {
        int more = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    more++;
                }
            }
        }
        return more;
    }

}
