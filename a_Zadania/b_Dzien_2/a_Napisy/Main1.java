package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {
        int sum = 0;
        String str = "CodersLab jak dobrze zacząć programować";
        str.toLowerCase();
        char specialChar = str.charAt(str.length() - 2);
        System.out.println(specialChar);
        for (char element : str.toCharArray()) {
            if (specialChar == element) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
