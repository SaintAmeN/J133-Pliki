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
public class Zadanie4 {
    public static void main(String[] args) {
        try {
            BufferedReader czytacz = new BufferedReader(
                    new FileReader("output_4.txt"));

            int ilośćOsób = 0;
            double sumaWieku = 0;
            String liniaTekstu;
            do {
                liniaTekstu = czytacz.readLine();

                if (liniaTekstu != null) {
                    ilośćOsób++;
                    String[] slowa = liniaTekstu.split(";");
                    System.out.println("" + slowa[0] + " -> " + slowa[1]);

                    sumaWieku += Integer.parseInt(slowa[2]);
                }

            } while (liniaTekstu != null);
            System.out.println("Ilość osób: " + ilośćOsób);

            double srednia = sumaWieku/ilośćOsób;
            System.out.println("Średnia wieku: " + srednia);

            czytacz.close();
        } catch (FileNotFoundException e) {
            System.err.println("O nie! Pliku nie ma!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
