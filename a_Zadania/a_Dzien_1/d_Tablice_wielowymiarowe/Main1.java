package a_Zadania.a_Dzien_1.d_Tablice_wielowymiarowe;

public class Main1 {

    public static void main(String[] args) {

        int[][] task1Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};

//		Zadanie 1
//		W pliku Main1.java znajduje się tablica o nazwie task1Array.
//
//				Wypisz element znajdujący się w 3 kolumnie i 2 wierszu,
//				wypisz długość tablicy znajdującej się w drugim rzędzie,
//				wypisz element znajdujący się w 4 kolumnie i 3 wierszu.

        System.out.println(task1Array[1][2]);

        for (int i = 0; i < 4; i++) {
            System.out.print(task1Array[1][i] + " ");
        }
        System.out.println();
        System.out.println(task1Array[2][3]);
    }

}
