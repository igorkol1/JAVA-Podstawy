package b_Zadania_Domowe.a_Dzien_3;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        try {
            System.out.println(elementExists(new int[]{0, 1}, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static int elementExists(int[] elements, int value) throws Exception {
        int index = Arrays.asList(elements).indexOf(value);
        if (index != -1) {
            return index;
        } else {
            throw new Exception("Nie ma takiego elementu!");
        }
    }

}
