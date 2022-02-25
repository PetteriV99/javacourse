package koe_kysymys_3_vaihe_1;

import java.util.ArrayList;

public class Asunto {

    private ArrayList <Asukas> asukasLista;

    public Asunto(ArrayList<Asukas> asukasLista) {
        this.asukasLista = asukasLista;
    }

    public ArrayList<Asukas> getAsukasLista() {
        return asukasLista;
    }

    public void setAsukasLista(ArrayList<Asukas> asukasLista) {
        this.asukasLista = asukasLista;
    }

    @Override
    public String toString() {
        return "Asunto{" +
                "asukasLista=" + asukasLista +
                '}';
    }
}
