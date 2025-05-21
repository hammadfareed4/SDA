interface Observer {
    void notify(String message);
}

// Guardian class (Observer)
class Guardian implements Observer {
    private String name;

    public Guardian(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("[Guardian: " + name + "] Alert: " + message);
    }
}
class Admin implements Observer {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("[Admin: " + name + "] Notification: " + message);
    }
}