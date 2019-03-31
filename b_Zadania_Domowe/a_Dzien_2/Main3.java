package b_Zadania_Domowe.a_Dzien_2;


public class Main3 {

    public static void main(String[] args) {
        String str = "abcabcabc";
        System.out.println(upperCase(str, 3));
    }

    private static String upperCase(String str, int index) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (i % index == 0) {
                strArr[i] = Character.toUpperCase(strArr[i]);
            }
        }
        return String.valueOf(strArr);
    }
}
