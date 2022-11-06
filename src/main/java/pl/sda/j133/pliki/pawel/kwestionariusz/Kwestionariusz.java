package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Kwestionariusz {
    private static final String ANKIETA_SDA_TXT = "ankieta_sda.txt";
    private static final String SEPARATOR = ";";

    private List<Pytanie> pytania;

    // Które ze słów oznaczamy stałą (z nie zmienną wartością) ? (zmienna której nie możemy zmienić)
    // a. static
    // b. final

    public Kwestionariusz(List<Pytanie> pytania) {
        this.pytania = pytania;
    }

    public void wykonaj() {
        for (Pytanie pytanie : pytania) {
            pytanie.zadajPytnie();
        }
        zapiszOdpowiedziDoPliku();
    }

    private void zapiszOdpowiedziDoPliku() {
        try {
            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter(ANKIETA_SDA_TXT, true));

            String liniaTekstuDoZapisu = "";
            for (Pytanie pytanie : pytania) {
                liniaTekstuDoZapisu += pytanie.getOdpowiedz() + SEPARATOR;
            }
            drukarkaTekstu.println(liniaTekstuDoZapisu);

            drukarkaTekstu.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
