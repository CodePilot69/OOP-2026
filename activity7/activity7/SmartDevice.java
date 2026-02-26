package activity7;
public class SmartDevice{
    String deviceName;
    boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false; 
    }

    public void togglepower() {
        isOn = !isOn;
        String status = isOn ? "ON" : "OFF";
        System.out.println(deviceName + " is now " + status);
    }

    public void displayStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println(deviceName + " is currently " + status);
    }


}