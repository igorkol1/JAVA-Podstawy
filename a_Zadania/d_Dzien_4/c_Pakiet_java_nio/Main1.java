package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) {
        createDirectory("Test");
    }

    private static void createDirectory(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("If directory exist: " + Files.exists(path));
    }

}
