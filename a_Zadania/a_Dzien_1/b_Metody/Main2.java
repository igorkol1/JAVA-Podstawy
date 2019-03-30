package a_Zadania.a_Dzien_1.b_Metody;


public class Main2 {

    public static void main(String[] args) {
        int result = square(6);
        System.out.println("Wynik " + result);
    }

    private static int square(int num) {
        return Main1.multiply(num, num);
    }
}
