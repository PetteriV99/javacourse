package viikko5t3;

public interface ITelephoneMic {

    boolean micOn();
    boolean micOff();
    void setVolume(int volumeNew);
    int getVolume();

}
