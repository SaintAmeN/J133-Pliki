package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.util.List;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class PytanieTekstoweOtwarte implements Pytanie<String> {
    private String tresc;
    private String odpowiedz;

    public PytanieTekstoweOtwarte(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public String getOdpowiedz() {
        return odpowiedz;
    }

    @Override
    public String getTresc() {
        return tresc;
    }

    @Override
    public boolean odpowiedzPoprawna() {
        return true;
    }

    @Override
    public void zadajPytnie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getTresc());
        odpowiedz = scanner.nextLine();
        odpowiedz = odpowiedz.replaceAll(";", "|%21|");
    }

    @Override
    public String odczytajOdpowiedz(String odp) {
        return odp.replaceAll("\\|%21\\|", ";");
    }
}
