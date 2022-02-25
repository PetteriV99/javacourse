package viikko5t4;

public class SamsungMikrofoni implements ITelephoneMic{
    private int volume;

    @Override
    public boolean micOn() {
        if (volume > 60) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean micOff() {
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
