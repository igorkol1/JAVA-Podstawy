package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {
        double gross = calculateNetto(122, 0.22);
        System.out.println(gross);
    }

    private static double calculateNetto(double gross, double vat) {
        return gross / (1+vat);
    }
}
