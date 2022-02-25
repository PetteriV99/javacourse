package koe_kysymys_5;

import java.util.ArrayList;

public class HaminalahdenMetsastysseura implements Rajapinta{
    @Override
    public ArrayList<Jasen> getJasenTiedot() {
        ArrayList <Jasen> jasenLista = new ArrayList<Jasen>();

        Jasen jasen1 = new Jasen("Kalle", "Suuttela", "kalle.suuttela@gmail.com");
        jasen1.vakuutusnro = 301;
        jasen1.jasenseura = "Haminalahden metsästysseura";
        Jasen jasen2 = new Jasen("Albert", "Puusti", "albert.puusti@gmail.com");
        jasen2.vakuutusnro = 302;
        jasen2.jasenseura = "Haminalahden metsästysseura";
        Jasen jasen3 = new Jasen("Pasi", "Koskela", "pasi.koskela@gmail.com");
        jasen3.vakuutusnro = 303;
        jasen3.jasenseura = "Haminalahden metsästysseura";

        jasenLista.add(jasen1);
        jasenLista.add(jasen2);
        jasenLista.add(jasen3);

        return jasenLista;
    }
}
