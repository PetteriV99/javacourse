package viikko5t3;

public class Kaiutin implements ITelephoneSpeaker{

    private int volume;

    @Override
    public boolean mute() {
        return false;
    }

    @Override
    public boolean unMute() {
        return false;
    }

    @Override
    public void setVolume(int volumeNew) {
        this.volume = volumeNew;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
