package viikko3t2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> decimals = new ArrayList<>();
        Random rand = new Random();

        int jokinLuku = 10;
        int max = 10;

        for (int n = 0; n < jokinLuku; n++) {
            decimals.add(rand.nextDouble(max));
        }

        System.out.println("Laskettuna yhteen: " + MathUtils.LaskeYhteen(decimals));
        System.out.println("Suurin luku: " + MathUtils.SuurinLuku(decimals));
        System.out.println("Keskiarvo: " + MathUtils.LaskeKeskiArvo(decimals));
    }
}