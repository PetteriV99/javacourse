package viikko3t1;

public class Osake {

    private String nimi;
    private float ostohinta;

    public Osake() {
        nimi = "";
        ostohinta = 0;
    }

    public Osake(String nimi, float ostohinta) {
        this.nimi = nimi;
        this.ostohinta = ostohinta;
    }

    private float LaskeTuottoYhdelleVuodelle(float kasvuprosentti, int aikajakso) {
        float arvo = ostohinta;
        int i = aikajakso;
        while (i > 0) {
            arvo += (float) (ostohinta * 0.01 * kasvuprosentti);
            i--;
        }
        return arvo;
    }

    public void TulostaArvo(float kasvuprosentti, int aikajakso) {
        System.out.println("Osakkeen arvo on:" + LaskeTuottoYhdelleVuodelle(kasvuprosentti, aikajakso));
    }

    @Override
    public String toString() {
        return "Osaketiedot {" +
                "nimi='" + nimi + '\'' +
                ", ostohinta=" + ostohinta +
                '}';
    }
}
