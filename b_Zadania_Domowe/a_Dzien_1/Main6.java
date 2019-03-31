package b_Zadania_Domowe.a_Dzien_1;


public class Main6 {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(oddSum(arr));
    }

    //Zadanie zgodne z przykadem (nie koniecznie z opisem)
    private static int oddSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) { //i%2!=0 && j%2!=0 - taka modyfikacja była by zgodna z opisem
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
