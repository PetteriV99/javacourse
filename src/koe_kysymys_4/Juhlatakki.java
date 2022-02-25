package koe_kysymys_4;

public class Juhlatakki extends Takki {
    private String materiaali;
    private String kuvio;

    public Juhlatakki() {
        this.materiaali = materiaali;
        this.kuvio = kuvio;
    }

    public String getMateriaali() {
        return materiaali;
    }

    public void setMateriaali(String materiaali) {
        this.materiaali = materiaali;
    }

    public String getKuvio() {
        return kuvio;
    }

    public void setKuvio(String kuvio) {
        this.kuvio = kuvio;
    }

    @Override
    public String toString() {
        return "Takki koko=" + koko + ", vari=" + vari + "\n" + "Juhlatakki " +
                "materiaali='" + materiaali + '\'' +
                ", kuvio='" + kuvio + '\'' +
                '.';
    }
}
