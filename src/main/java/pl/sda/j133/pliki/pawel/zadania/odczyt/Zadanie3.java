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
public class Zadanie3 {
    public static void main(String[] args) {
        try {
            BufferedReader czytacz = new BufferedReader(
                    new FileReader("output_3.txt"));

//            Do zliczania słów:
//
            int ilośćLinii = 0;
            String liniaTekstu;
            do {
                liniaTekstu = czytacz.readLine();
                if (liniaTekstu != null) {
                    ilośćLinii++;
                    String[] słowaWLinii = liniaTekstu.split(" ");
                    int ilośćSłów = słowaWLinii.length;

                    System.out.println("Ilość słów: " + ilośćSłów);
                }

            } while (liniaTekstu != null);

            System.out.println("Ilość linii: " + ilośćLinii);

            czytacz.close();
        } catch (FileNotFoundException e) {
            System.err.println("O nie! Pliku nie ma!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
