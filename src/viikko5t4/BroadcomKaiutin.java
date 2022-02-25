package viikko5t4;

public class BroadcomKaiutin implements ITelephoneSpeaker{

    private int volume;

    @Override
    public boolean mute() {
        return false;
    }

    @Override
    public boolean unMute() {
        if (volume > 100) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public void setVolume(int volumeNew) {
        this.volume = volumeNew;
    }

    @Override
    public int getVolume() {
        return 0;
    }
}
