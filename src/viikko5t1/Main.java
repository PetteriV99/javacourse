package viikko5t1;

public class Main {

    public static void main(String[] args) {
        Saastotili tili1 = new Saastotili();
        tili1.setOmistaja("Maiju Matikainen");
        tili1.setTilinumero("53434324");
        tili1.setSaldoEuroa(50000.00);
        tili1.setVuosikorko(4.5);
        tili1.tulostaTilinTiedot();

        SuperSaastoTili tili2 = new SuperSaastoTili();
        tili2.setOmistaja("Kalle Hakkarainen");
        tili2.setTilinumero("534343434324");
        tili2.setSaldoEuroa(50000.00);
        tili2.setVuosikorko(4.5);
        tili2.tulostaTilinTiedot();
    }
}
