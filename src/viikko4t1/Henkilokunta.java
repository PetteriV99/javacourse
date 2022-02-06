package viikko4t1;

public class Henkilokunta extends Henkilo{

    private String tyontekijanumero;
    private String toimipaikka;
    private String titteli;

    public void tulostaHenkilokuta() {
        System.out.println(tyontekijanumero);
        System.out.println(toimipaikka);
        System.out.println(titteli);
        System.out.println(getHenkilonTiedot());
    }
}
