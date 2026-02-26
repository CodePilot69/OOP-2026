package activity7;
public class SmartLight extends SmartDevice {
    int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
        this.brightness = 100; 
       
    }
    public void setBrightness(int level) {
        if(isOn) {
            if (level >= 0 && level <= 100) {
                brightness = level;
            } else {
                System.out.println("Invalid brightness level. Must be 0-100.");
            }
        } else {
            System.out.println("Cannot set brightness. Device is OFF.");
        }
    }

}
