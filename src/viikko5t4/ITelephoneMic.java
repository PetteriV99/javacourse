package viikko5t4;

public interface ITelephoneMic {

    boolean micOn();
    boolean micOff();
    void setVolume(int volumeNew);
    int getVolume();

}
