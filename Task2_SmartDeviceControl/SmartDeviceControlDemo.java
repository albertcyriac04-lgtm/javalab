/**
 * Driver class for the Smart Device Control System.
 * Demonstrates every supported feature on each device, and shows
 * multiple interface inheritance in action.
 */
public class SmartDeviceControlDemo {

    public static void main(String[] args) {

        System.out.println("=== SmartSpeaker ===");
        SmartSpeaker speaker = new SmartSpeaker("Living Room Speaker");
        speaker.connectToWiFi("HomeNet_5G");
        speaker.processVoiceCommand("play some jazz");
        speaker.playMusic("Take Five");

        System.out.println("\n=== SmartTV ===");
        SmartTV tv = new SmartTV("Bedroom TV");
        tv.connectToWiFi("HomeNet_5G");
        tv.processVoiceCommand("open Netflix");
        tv.streamVideo("Stranger Things S5");

        System.out.println("\n=== SmartThermostat ===");
        SmartThermostat thermostat = new SmartThermostat("Hallway Thermostat", 24.5);
        thermostat.connectToWiFi("HomeNet_5G");
        thermostat.reportTemperature();

        System.out.println("\n=== SmartHub ===");
        SmartHub hub = new SmartHub("Kitchen Hub", 22.0);
        hub.connectToWiFi("HomeNet_5G");
        hub.processVoiceCommand("set a 10 minute timer");
        hub.playMusic("Morning Playlist");
        hub.reportTemperature();

        // ---- Demonstrating extensibility ----
        // SmartCar was added AFTER this program was written, and none
        // of WiFiEnabled / VoiceControlled / MusicPlayer / VideoStreaming
        // were modified to support it.
        System.out.println("\n=== SmartCar (added without modifying any interface) ===");
        SmartCar car = new SmartCar("Family SUV");
        car.connectToWiFi("MobileHotspot_Car");
        car.processVoiceCommand("navigate home");
        car.playMusic("Road Trip Mix");
        car.streamVideo("Cartoon Show for Kids");
    }
}
