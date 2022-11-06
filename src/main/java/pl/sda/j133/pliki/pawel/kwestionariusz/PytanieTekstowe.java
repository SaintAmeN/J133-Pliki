package pl.sda.j133.pliki.pawel.kwestionariusz;

import lombok.Data;

import java.util.List;

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
    public String getTresc() {
        return tresc;
    }

    /**
     * Metoda weryfikuje odpowiedz i zwraca true jeśli jest poprawna.
     */
    @Override
    public boolean odpowiedzPoprawna() {
        // jeśli lista dostępnych odpowiedzi zawiera naszą odpowiedź
        return dostepneOdpowiedzi.contains(odpowiedz);
    }

}
