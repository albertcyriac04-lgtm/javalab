/**
 * A smart hub: the most capable single-purpose device in the house.
 * Connects to Wi-Fi, takes voice commands, plays music, and monitors
 * the room temperature via its built-in sensor.
 */
public class SmartHub implements WiFiEnabled, VoiceControlled, MusicPlayer, TemperatureMonitor {

    private String deviceName;
    private double currentTempCelsius;

    public SmartHub(String deviceName, double currentTempCelsius) {
        this.deviceName = deviceName;
        this.currentTempCelsius = currentTempCelsius;
    }

    @Override
    public void connectToWiFi(String networkName) {
        System.out.println(deviceName + ": Connected to Wi-Fi network '" + networkName + "'.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println(deviceName + ": Hub processing command -> \"" + command + "\"");
    }

    @Override
    public void playMusic(String songName) {
        System.out.println(deviceName + ": Playing \"" + songName + "\" through hub speaker.");
    }

    @Override
    public void reportTemperature() {
        System.out.println(deviceName + ": Sensor reads " + currentTempCelsius + " C.");
    }
}
