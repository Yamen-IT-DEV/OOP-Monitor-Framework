package centerSystem;

public abstract class MedicalDevice implements Monitorable {
    private int serialNum;
    private String nameDevice;

    public MedicalDevice(String nameDevice, int serialNum) {
        this.nameDevice = nameDevice;
        this.serialNum = serialNum;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }
}
