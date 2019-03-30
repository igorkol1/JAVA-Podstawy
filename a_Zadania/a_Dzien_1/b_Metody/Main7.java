package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {
        String parity = checkEvenOdd(14);
        System.out.println(parity);
    }

    private static String checkEvenOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
