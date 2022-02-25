package koe_kysymys_5;

import java.util.ArrayList;

public class TurmiolanEra implements Rajapinta{

    @Override
    public ArrayList<Jasen> getJasenTiedot() {

        ArrayList <Jasen> jasenLista = new ArrayList<Jasen>();

        Jasen jasen1 = new Jasen("Mikko", "Suuttela", "mikko.suuttela@gmail.com");
        jasen1.vakuutusnro = 101;
        jasen1.jasenseura = "Turmiolan Erä";
        Jasen jasen2 = new Jasen("Albert", "Puusti", "albert.puusti@gmail.com");
        jasen2.vakuutusnro = 102;
        jasen2.jasenseura = "Turmiolan Erä";
        Jasen jasen3 = new Jasen("Tarja", "Koskela", "tarja.koskela@gmail.com");
        jasen3.vakuutusnro = 103;
        jasen3.jasenseura = "Turmiolan Erä";

        jasenLista.add(jasen1);
        jasenLista.add(jasen2);
        jasenLista.add(jasen3);

        return jasenLista;
    }
}
