/*
Viikko 2 Viikkotehtävä 2
*/

package com.company;

public class Auto {

    private String rekisterinumero;
    private String merkki;
    private int vuosimalli;
    private String malli;

    public Auto(String rekisterinumero, String merkki, int vuosimalli, String malli) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
        this.malli = malli;
    }

    public Auto() {

    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        if (rekisterinumero.length() <= 7) {
            this.rekisterinumero = rekisterinumero;
        }
        this.rekisterinumero = "unknown";
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        if (vuosimalli >= 1900) {
            this.vuosimalli = vuosimalli;
        }
        this.vuosimalli = 1900;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public String kysyTiedot() {

        return null;
    }

    @Override
    public String toString() {
        return "Auton tiedot: " +
                "Rekisterinumero = '" + rekisterinumero + '\'' +
                ", erkki = '" + merkki + '\'' +
                ", vuosimalli = " + vuosimalli +
                ", malli = '" + malli + '\'' +
                '}';
    }

    public static void main (String[] args)  {

        Auto auto = new Auto();
        auto.setRekisterinumero("313");
        auto.setMerkki("BMW");
        auto.setVuosimalli(1944);
        auto.setMalli("AAA");
        System.out.println(auto.toString());
    }
}
