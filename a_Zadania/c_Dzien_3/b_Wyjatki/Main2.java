package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("You cannot divide by 0");
        }
        return -1;
    }
}
