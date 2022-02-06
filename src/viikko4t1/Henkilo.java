package viikko4t1;

public class Henkilo {

    private String nimi;
    private String osoite;
    private String syntymaaika;

    protected String getHenkilonTiedot () {
        return nimi + ", " + osoite + ", " + syntymaaika;
    }
}
