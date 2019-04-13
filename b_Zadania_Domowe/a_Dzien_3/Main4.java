package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {
        System.out.println(toInt(null));

    }

    private static int toInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException exception) {
            System.out.println("Wrong number format");
            return -1;
        }
    }


}
