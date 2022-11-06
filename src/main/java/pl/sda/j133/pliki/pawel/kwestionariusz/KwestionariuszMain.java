package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class KwestionariuszMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Pytanie<String> pytaniePlec = new PytanieTekstowe(
                "Podaj płeć (kobieta/mężczyzna)?",
                Arrays.asList("kobieta", "mezczyzna"));

        Pytanie<Integer> pytanieWiek = new PytanieLiczbowe(
                "Podaj wiek?", 0, 100);

        Pytanie<Integer> pytanieZadowolenieOgolne = new PytanieLiczbowe(
                "Podaj ogólne zadowolenie z kursu (1-10)?", 0, 11);

        Pytanie<String> pytanieCzyPolecisz = new PytanieTekstowe(
                "Czy polecicz kurs znajomemu (tak/nie)?",
                Arrays.asList("tak", "nie", "tylko wrogowi"));

        Pytanie<Integer> pytanieOcenaTrenera = new PytanieLiczbowe(
                "Podaj ogólne zadowolenie z trenera (1-10)?", 0, 11);

        List<Pytanie> pytania = new ArrayList<>();
        pytania.add(pytaniePlec);
        pytania.add(pytanieWiek);
        pytania.add(pytanieZadowolenieOgolne);
        pytania.add(pytanieCzyPolecisz);
        pytania.add(pytanieOcenaTrenera);
        Kwestionariusz kwestionariusz = new Kwestionariusz(pytania);

        kwestionariusz.wykonaj();

//        TODO: stworzyć nowy rodzaj pytania który nie posiada żadnej weryfikacji.
//        System.out.println("6. Podziel się swoją opinią:");
//        String opinia = scanner.nextLine();
//        opinia = opinia.replaceAll(";", "|");
    }
}
