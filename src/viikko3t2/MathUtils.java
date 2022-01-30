package viikko3t2;

import java.util.ArrayList;

public class MathUtils {

    public static double LaskeYhteen (ArrayList<Double> desimaaliLista) {
        double sum = 0;
        for (double desimaali: desimaaliLista) {
            sum += desimaali;
        }
        return sum;
    }

    public static double SuurinLuku (ArrayList<Double> desimaaliLista) {
        double suurinLuku = 0;
        for (double desimaali: desimaaliLista) {
            if (desimaali > suurinLuku) {
                suurinLuku = desimaali;
            }
        }
        return suurinLuku;
    }

    public static double LaskeKeskiArvo (ArrayList<Double> desimaaliLista) {
        double sum = 0;
        for (double desimaali: desimaaliLista) {
            sum += desimaali;
        }
        return (sum / desimaaliLista.size());
    }
}
