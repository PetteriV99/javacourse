package koe_kysymys_3_vaihe_1;

public class Asukas {

    private String etunimi;
    private String sukunimi;
    private int ika;
    private String asuntoNumero;

    public Asukas(String etunimi, String sukunimi, int ika, String asuntoNumero) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
        this.asuntoNumero = asuntoNumero;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi)
    {
        this.sukunimi = sukunimi;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public int getIka() {
        return ika;
    }

    public void setAsuntoNumero(String asuntoNumero) {
        this.asuntoNumero = asuntoNumero;
    }

    public String getAsuntoNumero() {
        return asuntoNumero;
    }

    @Override
    public String toString() {
        return
                etunimi + ' ' + sukunimi  +
                ", Asunto: " + asuntoNumero +
                ", Ikä: " + ika;
    }
}
