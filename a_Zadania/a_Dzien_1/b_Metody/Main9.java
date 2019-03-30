package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {

    public static void main(String[] args) {
        int factorial = factorial(10);
        System.out.println(factorial);
    }

    private static int factorial(int n) {
        if(n==0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
