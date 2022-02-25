package koe_kysymys_3_vaihe_2;
import java.util.ArrayList;

public class AsuntoUtils {

    public static ArrayList<Asukas> palautaAsujat(String asuntoNimi, ArrayList<Asukas> asikasLista) {
        ArrayList<Asukas> asuvatAsunnossa = new ArrayList<Asukas>();
        asikasLista.forEach((n) -> {
            if(n.getAsuntoNumero().equals(asuntoNimi)) {
                asuvatAsunnossa.add(n);
            }
        });
        return asuvatAsunnossa;
    }
    public static double keskiIka(ArrayList<Asukas> asukasLista) {
        double keskiIka = asukasLista.stream().mapToDouble(Asukas::getIka).sum();
        return keskiIka / asukasLista.size();
    }
}
