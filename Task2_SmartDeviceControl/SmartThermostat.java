/**
 * A smart thermostat: connects to Wi-Fi and monitors room temperature.
 * No music, video, or voice capability.
 */
public class SmartThermostat implements WiFiEnabled, TemperatureMonitor {

    private String deviceName;
    private double currentTempCelsius;

    public SmartThermostat(String deviceName, double currentTempCelsius) {
        this.deviceName = deviceName;
        this.currentTempCelsius = currentTempCelsius;
    }

    @Override
    public void connectToWiFi(String networkName) {
        System.out.println(deviceName + ": Connected to Wi-Fi network '" + networkName + "'.");
    }

    @Override
    public void reportTemperature() {
        System.out.println(deviceName + ": Current room temperature is " + currentTempCelsius + " C.");
    }
}
