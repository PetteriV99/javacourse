package viikko5t2;

public abstract class Tili {

    private String tilinumero;
    private String omistaja;
    private double saldoEuroa;
    private double vuosikorko;

    public void setTilinumero(String tilinumero) {
        this.tilinumero = tilinumero;
    }

    public String getTilinumero() {
        return tilinumero;
    }

    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void setSaldoEuroa(double saldoEuroa) {
        this.saldoEuroa = saldoEuroa;
    }

    public double getSaldoEuroa() {
        return saldoEuroa;
    }

    public void setVuosikorko(double vuosikorko) throws ArithmeticException {
        if (vuosikorko < 0) {
            throw new ArithmeticException("Vuosikoron on oltava positiivinen luku.");
        }
        this.vuosikorko = vuosikorko;
    }

    public double getVuosikorko() {
        return vuosikorko;
    }

    public abstract double laskeVuosiKorkkotuotto(double vuosikorko, double saldoEuroa);
    public abstract void tulostaTilinTiedot();
}
