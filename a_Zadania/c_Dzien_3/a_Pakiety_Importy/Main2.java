package a_Zadania.c_Dzien_3.a_Pakiety_Importy;

import java.sql.Date;

public class Main2 {

    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date);

        //Extra: SQL date stores years, months and days while hour, minute, second and millisecond are ignored
        System.out.println(new Date(1234));

    }

}
