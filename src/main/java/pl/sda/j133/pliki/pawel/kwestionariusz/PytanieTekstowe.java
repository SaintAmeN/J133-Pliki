package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.util.List;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class PytanieTekstowe implements Pytanie<String>{
    private String tresc;
    private String odpowiedz;
    private List<String> dostepneOdpowiedzi;

    public PytanieTekstowe(String tresc, List<String> dostepneOdpowiedzi) {
        this.tresc = tresc;
        this.dostepneOdpowiedzi = dostepneOdpowiedzi;
    }

    @Override
    public String getOdpowiedz() {
        return odpowiedz;
    }

    @Override
    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    @Override
    public String getTresc() {
        return tresc;
    }

    @Override
    public boolean odpowiedzPoprawna() {
        // jeśli lista dostępnych odpowiedzi zawiera naszą odpowiedź
        return dostepneOdpowiedzi.contains(odpowiedz);
    }

    @Override
    public void zadajPytnie() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(getTresc());
            odpowiedz = scanner.nextLine();
        } while (!odpowiedzPoprawna());
//        scanner.close();
    }
}
