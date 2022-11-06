package pl.sda.j133.pliki.pawel.zadania;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String liniaTekstu = scanner.nextLine(); // usunięte
        try {

            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("output_1.txt", true));

            // do
            // wczytanie: liniaTekstu
            drukarkaTekstu.println(liniaTekstu);

            // while

            drukarkaTekstu.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}
