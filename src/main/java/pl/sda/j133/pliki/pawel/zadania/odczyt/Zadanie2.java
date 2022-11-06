package pl.sda.j133.pliki.pawel.zadania.odczyt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Zadanie2 {
    public static void main(String[] args) {
        try {
            BufferedReader czytacz = new BufferedReader(
                    new FileReader("output_2.txt"));

            String liniaTekstu;
            do {
                liniaTekstu = czytacz.readLine();
                if (liniaTekstu != null) {
                    // TODO: do zrobienia zliczanie
                }

            } while (liniaTekstu != null);
            String liniaTekstuZPliku = czytacz.readLine();
            System.out.println(liniaTekstuZPliku.toUpperCase());
            System.out.println(liniaTekstuZPliku.toLowerCase());
            System.out.println(liniaTekstuZPliku.trim());

            String[] słowaWLinii = liniaTekstuZPliku.split(" ");

            czytacz.close();
        } catch (FileNotFoundException e) {
            System.err.println("O nie! Pliku nie ma!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
