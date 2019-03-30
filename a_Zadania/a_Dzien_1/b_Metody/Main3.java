package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    private static final double USD_TO_PLN = 4.04;

    public static void main(String[] args) {
        double amountInUSD = convertToUsd(100);
        System.out.format("%.2f%n", amountInUSD);
    }

    private static double convertToUsd(int amountInPLN) {
        return amountInPLN / USD_TO_PLN;
    }
}
