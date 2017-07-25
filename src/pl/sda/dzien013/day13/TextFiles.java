package pl.sda.dzien013.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class TextFiles {
    public static void main(String[] args) {
//        writeTextFile("data.txt");
        readTextFile("data.txt");
    }

    private static void writeTextFile(String name) {
        File file = new File(name);                 //Podajemy ścieżkę do pliku/-ów
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(name);
            writer.println("Jeden");
            writer.println("Dwa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    private static void readTextFile(String name) {
        Path path = Paths.get(name);                    //Podajemy ścieżkę do pliku, który chcemy odczytać
        Scanner scanner = null;                 //Definiujemy poza try, żeby można było później łatwo zamknąć strumień
        try {
            scanner = new Scanner(path);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
