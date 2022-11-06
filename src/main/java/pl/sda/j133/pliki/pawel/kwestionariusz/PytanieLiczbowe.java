package pl.sda.j133.pliki.pawel.kwestionariusz;

import java.util.Scanner;

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
    public void setOdpowiedz(Integer odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    @Override
    public String getTresc() {
        return tresc;
    }

    @Override
    public boolean odpowiedzPoprawna() {
        return odpowiedz > min && odpowiedz < max;
    }

    @Override
    public void zadajPytnie() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(getTresc());
            odpowiedz = scanner.nextInt();
        } while (!odpowiedzPoprawna());
        scanner.close();
    }
}
