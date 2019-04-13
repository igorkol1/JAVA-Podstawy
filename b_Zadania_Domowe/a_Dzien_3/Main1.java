package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {
        average("asd", "0");
    }

    static void average(String a, String b) {
        int aAsInt;
        int bAsInt;
        try {
            aAsInt = Integer.parseInt(a);
            bAsInt = Integer.parseInt(b);
            System.out.println(aAsInt / bAsInt);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Fail to parse string to int");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Fail to perform divide operation");
        }
    }

}
