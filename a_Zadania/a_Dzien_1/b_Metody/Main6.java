package a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    private static final int MATURITY_AGE = 18;

    public static void main(String[] args) {
        boolean isAdult = checkMaturity(8);
        System.out.println("Dorosły: " + isAdult);

    }

    private static boolean checkMaturity(int age) {
        return age >= MATURITY_AGE;
    }
}
