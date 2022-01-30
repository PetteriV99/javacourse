package viikko3t1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arvioi sijoituksiesi arvoa.");

        ArrayList<Osake> osakeSalkku = new ArrayList<Osake>();

        boolean isFilled;
        String osakeNimi;
        float osakeHinta;
        do {
            System.out.println("Lisätäänkö uusi osake (k/e)");
            String fill = scanner.next();
            if (fill.equals("k")) {
                isFilled = true;
                System.out.println("Syötä osakkeen nimi:");
                osakeNimi = scanner.next();
                System.out.println("Syötä osakkeen ostohinta:");
                osakeHinta = scanner.nextFloat();
                Osake osake = new Osake(osakeNimi, osakeHinta);
                osakeSalkku.add(osake);
            }
            else {
                isFilled = false;
            }
        } while(isFilled);

        System.out.println("Syötä vuosittainen kasvuprosentti:");
        float kasvuProsentti = scanner.nextFloat();
        System.out.println("Syötä ajanjakso vuosina:");
        int ajanJakso = scanner.nextInt();

        for (Osake osake:osakeSalkku) {
            osake.TulostaArvo(kasvuProsentti, ajanJakso);
        }
    }
}
