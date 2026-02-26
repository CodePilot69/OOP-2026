package activity7;
public class Main {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Living Room Light");
        livingRoomLight.togglepower();
        livingRoomLight.displayStatus();

        livingRoomLight.setBrightness(50);
        livingRoomLight.displayStatus();

        SmartThermostat homeThermostat = new SmartThermostat("Home Thermostat");
        homeThermostat.togglepower();
        homeThermostat.setTemperature(32.0);
        homeThermostat.displayStatus();
    }
}
