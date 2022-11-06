package pl.sda.j133.pliki.pawel.kwestionariusz;

import lombok.Data;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class PytanieLiczbowe implements Pytanie<Integer>{
    private String tresc;
    private Integer odpowiedz;
    private int min, max;

    public PytanieLiczbowe(String tresc, int min, int max) {
        this.tresc = tresc;
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer getOdpowiedz() {
        return odpowiedz;
    }

    @Override
    public String getTresc() {
        return tresc;
    }

    @Override
    public boolean odpowiedzPoprawna() {
        return odpowiedz > min && odpowiedz < max;
    }
}
