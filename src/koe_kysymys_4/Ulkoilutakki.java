package koe_kysymys_4;

public class Ulkoilutakki extends Takki {
    private int vedenpitavyys;
    private int hengittavyys;

    public Ulkoilutakki() {
        this.vedenpitavyys = vedenpitavyys;
        this.hengittavyys = hengittavyys;
    }

    public int getVedenpitavyys() {
        return vedenpitavyys;
    }

    public void setVedenpitavyys(int vedenpitavyys) {
        if ((vedenpitavyys == 1000) || (vedenpitavyys == 3000) || (vedenpitavyys == 5000) || (vedenpitavyys == 10000)) {
            this.vedenpitavyys = vedenpitavyys;
        }
        else
        {
            this.vedenpitavyys = 1000;
        }
    }

    public int getHengittavyys() {
        return hengittavyys;
    }

    public void setHengittavyys(int hengittavyys) {
        if ((hengittavyys >= 0) && (hengittavyys <= 5000)) {
            this.hengittavyys = hengittavyys;
        }
        else
        {
            this.hengittavyys = 0;
        }
    }

    @Override
    public String toString() {
        return "Takki koko=" + koko + ", vari=" + vari + "\n" + "Ulkoilutakki " +
                "vedenpitavyys=" + vedenpitavyys +
                ", hengittavyys=" + hengittavyys +
                '.';
    }
}
