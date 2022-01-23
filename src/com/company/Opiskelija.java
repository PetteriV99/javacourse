/*
Viikko 2 Viikkotehtävä 1
*/

package com.company;

public class Opiskelija {

    private String etunimi;
    private String sukunimi;
    private int opiskelijanumero;
    private String osoite;

    public Opiskelija(String etunimi, String sukunimi, int opiskelijanumero, String osoite) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanumero = opiskelijanumero;
        this.osoite = osoite;
    }

    public Opiskelija() {

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

    public int getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return "Opiskelija {" +
                "etunimi = '" + etunimi + '\'' +
                ", sukunimi = '" + sukunimi + '\'' +
                ", opiskelijanumero = " + opiskelijanumero +
                ", osoite = '" + osoite + '\'' +
                '}';
    }

    public static void main (String[] args)  {

        Opiskelija opiskelija = new Opiskelija();
        opiskelija.setEtunimi("Juuso");
        opiskelija.setSukunimi("Marttila");
        opiskelija.setOpiskelijanumero(34324324);
        opiskelija.setOsoite("Yo-kylä 329 A 3232 3100");
        System.out.println(opiskelija.toString());
    }
}
