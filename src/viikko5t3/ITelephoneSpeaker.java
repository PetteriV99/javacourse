package viikko5t3;

public interface ITelephoneSpeaker {
    boolean mute();
    boolean unMute();
    void setVolume(int volumeNew);
    int getVolume();
}
