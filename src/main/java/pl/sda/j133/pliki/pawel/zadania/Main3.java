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
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String liniaTekstu = scanner.nextLine(); // usunięte
        try {

            PrintWriter drukarkaTekstu = new PrintWriter(new FileWriter("output_3.txt", false));

            String liniaTekstu;
            do {
                liniaTekstu = scanner.nextLine();
                if (!liniaTekstu.equals("quit")) {
                    drukarkaTekstu.println(liniaTekstu);
                }

            } while (!liniaTekstu.equals("quit"));

            drukarkaTekstu.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}
