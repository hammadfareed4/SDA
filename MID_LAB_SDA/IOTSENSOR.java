import java.util.ArrayList;
import java.util.List;

class IoTSensor {
    private String location;
    private List<Observer> observers;

    public IoTSensor(String location) {
        this.location = location;
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void detectActivity(String activity) {
        System.out.println("[Sensor at " + location + "] Detected: " + activity);
        if (activity.equalsIgnoreCase("crying") ||
            activity.equalsIgnoreCase("fighting") ||
            activity.equalsIgnoreCase("loud noise") ||
            activity.equalsIgnoreCase("suspicious motion")) {
            notifyObservers(activity);
        }
    }

    private void notifyObservers(String activity) {
        String message = activity.toUpperCase() + " detected in " + location;
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }
}