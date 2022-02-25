package viikko5t2;

public class SuperSaastoTili extends Tili {

    @Override
    public double laskeVuosiKorkkotuotto(double vuosikorko, double saldoEuroa) {
        double tuotto;
        if (saldoEuroa < 10001) {
            tuotto = vuosikorko * 0.01 * saldoEuroa;
        }
        else {
            tuotto = (10001 * vuosikorko * 0.01) + ((saldoEuroa - 10001) * 0.01 * (vuosikorko + 3.0));
        }
        return tuotto;
    }

    @Override
    public void tulostaTilinTiedot() {
        System.out.print("\n" + getOmistaja() + ": supersaastotilin saldo on " + getSaldoEuroa()  + " €");
        System.out.print(", korkoprosentilla " + getVuosikorko() + " vuosikorko on " + laskeVuosiKorkkotuotto(getVuosikorko(), getSaldoEuroa()) + " €");
    }
}
