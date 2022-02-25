package koe_kysymys_3_vaihe_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print");

        String etunimi;
        String sukunimi;
        int ika;
        String asunnonNumero = "";

        ArrayList<Asukas> asukasTaulukko = new ArrayList<Asukas>(1);

        do {

            System.out.println("Anna asunnon numero (0 = Lopettaa syötön): ");
            asunnonNumero = scanner.next();
            if (asunnonNumero.equals("0")) {
                break;
            }
            System.out.println("Anna asujan etunimi: ");
            etunimi = scanner.next();
            System.out.println("Anna asujan sukunimi: ");
            sukunimi = scanner.next();
            System.out.println("Anna asujan ikä kuluvana vuonna: ");
            ika = scanner.nextInt();

            Asukas asukas = new Asukas(etunimi, sukunimi, ika, asunnonNumero);
            asukasTaulukko.add(asukas);

        } while(true);

        System.out.println("Asujat:\n");
        asukasTaulukko.forEach(System.out::println);
    }
}
