package pl.sda.j133.pliki.pawel.kwestionariusz;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public interface Pytanie<T> {
    public String getTresc();

    public boolean odpowiedzPoprawna();

    public T getOdpowiedz();
    public void setOdpowiedz(T odpowiedz);

    public void zadajPytnie();
}
