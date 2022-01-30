package viikko3t3;

public class OpiskelijaUtils {
    public static Opiskelija TarkistaTiedot(Opiskelija opiskelija) {

        String nimi = opiskelija.getEtunimi();
        String sukunimi = opiskelija.getSukunimi();
        String osoite = opiskelija.getOsoite();
        int opiskelijaNumero = opiskelija.getOpiskelijanumero();

        if (nimi == null) {
            return null;
        }
        else if (sukunimi == null) {
            return null;
        }
        else if (osoite == null) {
            return null;
        }
        else if (opiskelijaNumero == 0) {
            return null;
        }
        else {
            return opiskelija;
        }

    }
}
