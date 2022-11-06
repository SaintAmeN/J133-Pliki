package pl.sda.j133.pliki.pawel.zadania;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project J133-Pliki
 * @created 06.11.2022
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("output_4.txt", true));

            System.out.println("Podaj imie:");
            String imie = scanner.next();

            System.out.println("Podaj nazwisko:");
            String nazwisko = scanner.next();

            System.out.println("Podaj wiek:");
            int wiek = scanner.nextInt();

            drukarkaTekstu.println(imie + ";" + nazwisko + ";" + wiek);
            drukarkaTekstu.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
