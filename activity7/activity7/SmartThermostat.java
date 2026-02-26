package activity7;
public class SmartThermostat extends SmartDevice {
    SmartThermostat(String deviceName) {
        super(deviceName);
        
    }

    double Temperature;


    public void displayStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println(deviceName + " is currently " + status + " with temperature " + Temperature);
    }
 
    public double setTemperature(double newTemperature) {
        this.Temperature = newTemperature;
        if(Temperature > 30) {
            System.out.println("Warning: " + deviceName + " temperature is set to a high value!");
        }
        System.out.println(deviceName + " temperature set to " + Temperature);
        return Temperature;
    }
    
}
