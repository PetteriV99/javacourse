package koe_kysymys_5;

public class Main {
    public static void main(String[] args) {
        TurmiolanEra turmiola = new TurmiolanEra();
        HaminalahdenMetsastysseura hamina = new HaminalahdenMetsastysseura();
        turmiola.getJasenTiedot().forEach(n -> n.tulostaJasenTiedot());
        hamina.getJasenTiedot().forEach(n -> n.tulostaJasenTiedot());
    }
}
