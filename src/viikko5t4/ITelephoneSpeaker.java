package viikko5t4;

public interface ITelephoneSpeaker {
    boolean mute();
    boolean unMute();
    void setVolume(int volumeNew);
    int getVolume();
}
