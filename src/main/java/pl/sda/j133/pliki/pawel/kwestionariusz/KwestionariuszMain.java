package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class KwestionariuszMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String plec;
        do {
            System.out.println("1. Podaj płeć (kobieta/mężczyzna)?");
            plec = scanner.nextLine();

            // odpowiedź nie jest kobieta i nie jest mężczyzna -> powtórz
        } while (!plec.equalsIgnoreCase("kobieta") && !plec.equalsIgnoreCase("mezczyzna"));

        int wiek;
        do {
            System.out.println("2. Podaj wiek?");
            wiek = Integer.parseInt(scanner.nextLine());

            // jeśli wiek jest mniejszy od zera lub większy od 100
        } while (wiek <= 0 || wiek >= 100);

        int zadowolenieOgolne;
        do {
            System.out.println("3. Podaj ogólne zadowolenie z kursu (1-10)?");
            zadowolenieOgolne = Integer.parseInt(scanner.nextLine());

        } while (zadowolenieOgolne <= 0 || zadowolenieOgolne > 10);

        String czyPolecisz;
        do {
            System.out.println("4. Czy poleciłbyś kurs znajomemu (tak/nie)?");
            czyPolecisz = scanner.nextLine();

            // jeśli czy polecisz nie jest równe "tak" i czy polecisz nie jest równe "nie"
        } while (!czyPolecisz.equals("tak") && !czyPolecisz.equals("nie"));

        int ocenaTrenera;
        do {
            System.out.println("5. Podaj ogólne zadowolenie z trenera (1-10)?");
            ocenaTrenera = Integer.parseInt(scanner.nextLine());
        } while (ocenaTrenera <= 0 || ocenaTrenera > 10);

        System.out.println("6. Podziel się swoją opinią:");
        String opinia = scanner.nextLine();

        opinia = opinia.replaceAll(";", "|");

        try {
            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("ankieta_sda.txt", true));

            drukarkaTekstu.println(
                    plec + ";" +
                            wiek + ";" +
                            zadowolenieOgolne + ";" +
                            czyPolecisz + ";" +
                            ocenaTrenera + ";" +
                            opinia);

            drukarkaTekstu.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
