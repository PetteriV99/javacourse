package viikko3t3;

    public class Opiskelija {

        private String etunimi;
        private String sukunimi;
        private int opiskelijanumero;
        private String osoite;

        public Opiskelija(String etunimi, String sukunimi, int opiskelijanumero, String osoite) {
            this.etunimi = etunimi;
            this.sukunimi = sukunimi;
            this.opiskelijanumero = opiskelijanumero;
            this.osoite = osoite;
        }

        public Opiskelija() {

        }

        public String getEtunimi() {
            return etunimi;
        }

        public void setEtunimi(String etunimi) {
            this.etunimi = etunimi;
        }

        public String getSukunimi() {
            return sukunimi;
        }

        public void setSukunimi(String sukunimi) {
            this.sukunimi = sukunimi;
        }

        public int getOpiskelijanumero() {
            return opiskelijanumero;
        }

        public void setOpiskelijanumero(int opiskelijanumero) {
            this.opiskelijanumero = opiskelijanumero;
        }

        public String getOsoite() {
            return osoite;
        }

        public void setOsoite(String osoite) {
            this.osoite = osoite;
        }

        @Override
        public String toString() {
            return "Opiskelijan tiedot {" +
                    "etunimi = '" + etunimi + '\'' +
                    ", sukunimi = '" + sukunimi + '\'' +
                    ", opiskelijanumero = " + opiskelijanumero +
                    ", osoite = '" + osoite + '\'' +
                    '}';
        }
    }
