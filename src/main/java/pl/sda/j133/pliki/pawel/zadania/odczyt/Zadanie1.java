package pl.sda.j133.pliki.pawel.zadania.odczyt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Zadanie1 {
    public static void main(String[] args) {
        try {
            BufferedReader czytacz = new BufferedReader(
                    new FileReader("output_w.txt"));

            String liniaTekstuZPliku = czytacz.readLine();

            if (!liniaTekstuZPliku.equals("Hello World!")) {
                System.out.println("W pliku jest inna treść.");

            } else {
                System.out.println(liniaTekstuZPliku);
            }

            czytacz.close();
        } catch (FileNotFoundException e) {
            System.err.println("O nie! Pliku nie ma!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
