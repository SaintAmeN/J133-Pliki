package pl.sda.j133.pliki.pawel.przyklad;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class PlikiZapisMainPrzyklad {
    public static void main(String[] args) {
        try {
//            1. otwórz i nadpisz
//            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("plik_zapisany.txt", false));

//            2. otwórz i dopisz
            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("plik_zapisany.txt", true));

            drukarkaTekstu.println("Hello world! - 999");

            drukarkaTekstu.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) { // Input Output Exception
            throw new RuntimeException(e);
        }
    }
}
