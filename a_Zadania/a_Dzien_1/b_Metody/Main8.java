package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    public static void main(String[] args) {
        int max = maxOfThree(2, 10, 2);
        System.out.println("Max " + max);
    }

    private static int maxOfThree(int numberA, int numberB, int numberC) {
        if (numberA > numberB) {
            if (numberA > numberC) {
                return numberA;
            } else {
                return numberC;
            }
        } else if (numberB > numberC) {
            return numberB;
        } else {
            return numberC;
        }
    }
}
