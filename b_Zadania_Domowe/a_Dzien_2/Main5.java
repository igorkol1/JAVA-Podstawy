package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {
        String str = "TestABCt";
        System.out.println(replaceChar(str, 't', 'x'));
    }

    private static String replaceChar(String str, char forReplace, char replacement) {
        return str.replace(forReplace, replacement);
    }

}
