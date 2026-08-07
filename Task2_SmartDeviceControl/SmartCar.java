/**
 * NEW device added later to demonstrate that none of the existing
 * interfaces needed to change to support it. A SmartCar supports
 * Wi-Fi, Voice Control, Music, and Video Streaming (for rear-seat
 * entertainment) — a combination of interfaces no earlier device used
 * together, which is only possible because interfaces support
 * multiple inheritance in Java.
 */
public class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {

    private String deviceName;

    public SmartCar(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectToWiFi(String networkName) {
        System.out.println(deviceName + ": In-car system connected to Wi-Fi hotspot '" + networkName + "'.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println(deviceName + ": Driver assistant heard -> \"" + command + "\"");
    }

    @Override
    public void playMusic(String songName) {
        System.out.println(deviceName + ": Playing \"" + songName + "\" over the car speakers.");
    }

    @Override
    public void streamVideo(String showName) {
        System.out.println(deviceName + ": Streaming \"" + showName + "\" on rear-seat displays.");
    }
}
