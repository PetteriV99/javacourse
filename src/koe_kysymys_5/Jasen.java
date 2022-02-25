package koe_kysymys_5;

public class Jasen extends JasenBase{

    private String etunimi;
    private String sukunimi;
    private String email;

    public Jasen(String etunimi, String sukunimi, String email) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
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

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void tulostaJasenTiedot() {
        System.out.println("Etunimi: " + this.etunimi + ", sukunumi: " + this.sukunimi
        + ", sähköposti: " + this.email + ", jäsenseura: " + this.jasenseura
        + ", vakuusnumero: " + this.vakuutusnro);
    }
}
