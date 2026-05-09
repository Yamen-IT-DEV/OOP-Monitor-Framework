package centerSystem;

public class EmergencyUnit {
    public static void handleEmergency(DeviceCriticalException e) {
        System.out.println("Caution from device: " + e.getNameDevice());
        System.out.println("Level of risk: " + e.getLevelOfRisk());
        System.out.println("Time stamp: " + e.getNowTime());
        System.out.println("Message: " + e.getMessage());
    }
}
