package centerSystem;

import java.util.Random;

public class OxygenSensor extends MedicalDevice {

    public OxygenSensor(String nameDevice, int serialNum) {
        super(nameDevice, serialNum);
    }

    Random rand = new Random();

    @Override
    public void checkStatus() throws DeviceCriticalException {
        int battery = rand.nextInt(101);

        System.out.println("Device name: " + getNameDevice() + " | Battery: " + battery + "%");

        if (battery < 10) {
            // الترتيب: اسم الجهاز، مستوى الخطورة، الرسالة، الوقت
            throw new DeviceCriticalException(getNameDevice(), 9, "Caution: battery low!", "17:00");
        }
    }

    @Override
    public void readData() throws DeviceCriticalException {
        double heat = rand.nextDouble() * 41;

        System.out.println("Device name: " + getNameDevice());
        System.out.println("Device temperature: " + heat);

        if (heat > 30) {
            // تصحيح Caution وترتيب المعاملات
            throw new DeviceCriticalException(getNameDevice(), 10, "Caution: device temperature high!", "17:00");
        }
    }
}
