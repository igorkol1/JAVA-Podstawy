package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        getInfo();
    }

    private static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        String name, age;
        System.out.println("Podaj imie");
        name = scanner.nextLine();
        System.out.println("Podaj wiek");
        age = scanner.nextLine();
        System.out.println(name + " ma " + age + " lat");
    }
}
