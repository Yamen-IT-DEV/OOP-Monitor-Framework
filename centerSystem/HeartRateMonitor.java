package centerSystem;

import java.util.Random;

public class HeartRateMonitor extends MedicalDevice {

    public HeartRateMonitor(String nameDevice, int serialNum) {
        super(nameDevice, serialNum);
    }

    @Override
    public void checkStatus() throws DeviceCriticalException {
        Random rand = new Random();
        int battery = rand.nextInt(101);

        System.out.println("Device: " + getNameDevice() + " | Battery: " + battery + "%");

        if (battery < 10) {
            // ترتيب المعاملات: اسم الجهاز، مستوى الخطورة، الرسالة، الوقت
            throw new DeviceCriticalException(getNameDevice(), 8, "Caution: Device low battery", "17:00");
        }
    }

    @Override
    public void readData() throws DeviceCriticalException {
        Random rand = new Random();
        int pulse = rand.nextInt(151) + 50; // توليد نبض بين 50 و 200

        System.out.println("Current reading of pulse: " + pulse);

        if (pulse > 150) {
            throw new DeviceCriticalException(getNameDevice(), 10, "High Heart Rate Detected!", "17:00");
        }
    }
}
