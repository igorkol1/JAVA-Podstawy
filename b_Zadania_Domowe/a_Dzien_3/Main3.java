package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {
        System.out.println(getLength(null));
    }


    private static int getLength(String str) {
        try {
            return str.length();
        } catch (NullPointerException exception) {
            return 0;
        }
    }
}
