package centerSystem;

public class DeviceCriticalException extends Exception {
    private String nameDevice;
    private int levelOfRisk;
    private String nowTime;

    public DeviceCriticalException(String nameDevice, int levelOfRisk, String message, String nowTime) {
        super(message);
        this.nameDevice = nameDevice;
        this.levelOfRisk = levelOfRisk;
        this.nowTime = nowTime;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public int getLevelOfRisk() {
        return levelOfRisk;
    }

    public String getNowTime() {
        return nowTime;
    }
}
