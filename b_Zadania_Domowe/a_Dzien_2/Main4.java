package b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {
        String str = "bbbTestsaaa";

        System.out.println(tripple(str));
    }

    private static int tripple(String str) {
        int tripleOccurre = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                tripleOccurre++;
            }
        }
        return tripleOccurre;
    }

    private static int charCount(String str, char chr) {
        return (int) str.chars().filter(ch -> ch == chr).count();
    }

}
