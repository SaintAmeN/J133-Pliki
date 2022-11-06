package pl.sda.j133.pliki.pawel.zadania;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("output_1.txt", true));
            drukarkaTekstu.println("Hello world!");
            drukarkaTekstu.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
