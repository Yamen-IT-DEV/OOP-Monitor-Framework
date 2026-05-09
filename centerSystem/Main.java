package centerSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Monitorable monit[] = new Monitorable[2];

        monit[0] = new HeartRateMonitor("12-Lead ECG", 24);
        monit[1] = new OxygenSensor("Yuwell", 41);

        for (int i = 0; i < 2; i++) {
            try {
                monit[i].checkStatus();
                monit[i].readData();
            } catch (DeviceCriticalException e) {
                EmergencyUnit.handleEmergency(e);
            }
        }
    }
}
