package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main1 {

    public static void main(String[] args) {

        int[] tab = {5, 1, 6, 7, 8};

        try {
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array has lenght " + tab.length + " but you tried to reach further");
        }


    }
}
