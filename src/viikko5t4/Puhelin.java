package viikko5t4;

public class Puhelin {
    private ITelephoneMic Mikrofoni;
    private ITelephoneSpeaker Kaiutin;

    public ITelephoneMic getMikrofoni() {
        return Mikrofoni;
    }

    public void setMikrofoni(ITelephoneMic mikrofoni) {
        Mikrofoni = mikrofoni;
    }

    public ITelephoneSpeaker getKaiutin() {
        return Kaiutin;
    }

    public void setKaiutin(ITelephoneSpeaker kaiutin) {
        Kaiutin = kaiutin;
    }
}
