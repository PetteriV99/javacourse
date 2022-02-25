package viikko5t2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OmatJaYhteisetTilit superTili1 = new OmatJaYhteisetTilit();

        System.out.println("Syötä ensimmäisen tilin nimi");
        String nimi = scanner.next();
        superTili1.omaTili.setOmistaja(nimi);

        System.out.println("Syötä toisen tilin nimi");
        nimi = scanner.next();
        superTili1.yhteinenTili.setOmistaja(nimi);

        System.out.println("Syötä tilinnumero");
        String tiliNumero = scanner.next();
        superTili1.omaTili.setTilinumero(tiliNumero);

        System.out.println("Syötä toinen tilinnumero");
        tiliNumero = scanner.next();
        superTili1.yhteinenTili.setTilinumero(tiliNumero);

        System.out.println("Syötä tilin saldo");
        double tiliSaldo = scanner.nextDouble();
        superTili1.omaTili.setSaldoEuroa(tiliSaldo);

        System.out.println("Syötä toisen tilin saldo");
        tiliSaldo = scanner.nextDouble();
        superTili1.yhteinenTili.setSaldoEuroa(tiliSaldo);

        System.out.println("Syötä vuosikorko");

        boolean oikeaArvo = false;
        while (!oikeaArvo) {
            try {
                double vuosiKorko = scanner.nextDouble();
                superTili1.omaTili.setVuosikorko(vuosiKorko);
                oikeaArvo = true;
            } catch (ArithmeticException e) {
                System.out.println("Koron on oltava positiivinen luku!");
                continue;
            }
        }

        System.out.println("Syötä toinen vuosikorko");

        oikeaArvo = false;
        while (!oikeaArvo) {
            try {
                double vuosiKorko = scanner.nextDouble();
                superTili1.yhteinenTili.setVuosikorko(vuosiKorko);
                oikeaArvo = true;
            } catch (ArithmeticException e) {
                System.out.println("Koron on oltava positiivinen luku!");
                continue;
            }
        }

        superTili1.omaTili.tulostaTilinTiedot();
        superTili1.yhteinenTili.tulostaTilinTiedot();
    }

}
