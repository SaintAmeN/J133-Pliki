package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Kwestionariusz {
    private List<Pytanie> pytania;

    public Kwestionariusz(List<Pytanie> pytania) {
        this.pytania = pytania;
    }

    public void wykonaj() {
        for (Pytanie pytanie : pytania) {
            pytanie.zadajPytnie();
        }
    }
}
