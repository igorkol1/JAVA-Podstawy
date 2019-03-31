package b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    private static final double YOUNG_DOG_RATIO = 10.5;
    private static final double OLD_DOG_RATIO = 4;

    public static void main(String[] args) {
        System.out.println(dogAge(10));

    }

    private static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            return dogAge * YOUNG_DOG_RATIO;
        } else {
            return 2 * YOUNG_DOG_RATIO + (dogAge - 2) * OLD_DOG_RATIO;
        }
    }

}
