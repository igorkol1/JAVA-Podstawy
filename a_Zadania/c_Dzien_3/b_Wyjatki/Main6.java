package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {

        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException excpetion) {
            System.out.println("String cannot be null");
        }

    }

}
