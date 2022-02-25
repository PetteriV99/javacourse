package viikko5t3;

public class Mikrofoni implements ITelephoneMic{
    @Override
    public boolean micOn() {
        return false;
    }

    @Override
    public boolean micOff() {
        return false;
    }

    @Override
    public void setVolume(int volumeNew) {

    }

    @Override
    public int getVolume() {
        return 0;
    }
}
