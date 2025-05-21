




public class KidsMonitoringApp {
    public static void main(String[] args) {
        
        Guardian guardian = new Guardian("Mother");
        Admin admin = new Admin("System Admin");

        
        IoTSensor sensor = new IoTSensor("Room A");

    
        sensor.registerObserver(guardian);
        sensor.registerObserver(admin);

        sensor.detectActivity("crying");
        sensor.detectActivity("laughing"); // won't notify
        sensor.detectActivity("fighting");
    }
}
