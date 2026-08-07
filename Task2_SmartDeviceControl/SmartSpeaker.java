/**
 * A smart speaker: connects to Wi-Fi, listens for voice commands,
 * and plays music. It has no screen, so it does not stream video.
 */
public class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    private String deviceName;

    public SmartSpeaker(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectToWiFi(String networkName) {
        System.out.println(deviceName + ": Connected to Wi-Fi network '" + networkName + "'.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println(deviceName + ": Heard voice command -> \"" + command + "\"");
    }

    @Override
    public void playMusic(String songName) {
        System.out.println(deviceName + ": Now playing \"" + songName + "\".");
    }
}
