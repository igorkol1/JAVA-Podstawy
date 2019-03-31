package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {
        String str = "TesttABCtt";
        System.out.println(replaceStr(str, "tt", "x"));
    }

    private static String replaceStr(String str, String forReplace, String replacement) {
        return str.replace(forReplace, replacement);
    }
}
