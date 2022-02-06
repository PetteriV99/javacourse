package viikko4t1;

public class Opiskelija extends Henkilo {

    private String aloituspaiva;
    private int opiskelijanumero;

    public void tulostaOpiskelija() {
        System.out.println(aloituspaiva);
        System.out.println(opiskelijanumero);
        System.out.println(getHenkilonTiedot());
    }

}
