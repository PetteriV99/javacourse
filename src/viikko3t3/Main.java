package viikko3t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä nimi");
        String nimi = scanner.next();
        System.out.println("Syötä sukunimi");
        String sukunimi = scanner.next();
        System.out.println("Syötä osoite");
        String osoite = scanner.next();
        System.out.println("Syötä opiskelijanumero");
        int numero = scanner.nextInt();

        Opiskelija opiskelija1 = new Opiskelija(nimi, sukunimi, numero, osoite);
        opiskelija1.toString();
    }
}
