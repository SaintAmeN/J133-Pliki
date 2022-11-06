package pl.sda.j133.pliki.pawel.przyklad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class OdczytZPliku {
    public static void main(String[] args) {

        try {
            BufferedReader czytacz = new BufferedReader(new FileReader("output_1.txt"));

            String liniaTekstuZPliku = czytacz.readLine();
            System.out.println(liniaTekstuZPliku);

            czytacz.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
