package viikko5t1;

public class Saastotili extends Tili {

    @Override
    public double laskeVuosiKorkkotuotto(double korko, double saldo) {
        return (korko * 0.01 * saldo);
    }

    @Override
    public void tulostaTilinTiedot() {
        System.out.print("\n" + getOmistaja() + ": saastotilin saldo on " + getSaldoEuroa()  + " €");
        System.out.print(", korkoprosentilla " + getVuosikorko() + " vuosikorko on " + laskeVuosiKorkkotuotto(getVuosikorko(), getSaldoEuroa()) + " €");
    }
}
