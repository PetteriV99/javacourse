package koe_kysymys_4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Takki> takkiLista = new ArrayList<Takki>();

        Ulkoilutakki takki1 = new Ulkoilutakki();
        takki1.vari = "Punainen";
        takki1.koko = "M";
        takki1.setHengittavyys(800);
        takki1.setVedenpitavyys(1000);
        takkiLista.add(takki1);

        Ulkoilutakki takki2 = new Ulkoilutakki();
        takki2.vari = "Punainen";
        takki2.koko = "XL";
        takki2.setHengittavyys(1500);
        takki2.setVedenpitavyys(3000);
        takkiLista.add(takki2);

        Juhlatakki takki3 = new Juhlatakki();
        takki3.vari = "Vihreä";
        takki3.koko = "L";
        takki3.setMateriaali("Villa");
        takki3.setKuvio("Kuvioton");
        takkiLista.add(takki3);

        Juhlatakki takki4 = new Juhlatakki();
        takki4.vari = "Sininen";
        takki4.koko = "SM";
        takki4.setMateriaali("Puuvilla");
        takki4.setKuvio("Liituraita");
        takkiLista.add(takki4);

        takkiLista.forEach(System.out::println);
    }
}

