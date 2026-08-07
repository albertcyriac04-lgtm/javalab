/**
 * A smart TV: connects to Wi-Fi, responds to voice remote commands,
 * and streams video. Does not play standalone music.
 */
public class SmartTV implements WiFiEnabled, VoiceControlled, VideoStreaming {

    private String deviceName;

    public SmartTV(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectToWiFi(String networkName) {
        System.out.println(deviceName + ": Connected to Wi-Fi network '" + networkName + "'.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println(deviceName + ": Voice remote command -> \"" + command + "\"");
    }

    @Override
    public void streamVideo(String showName) {
        System.out.println(deviceName + ": Streaming \"" + showName + "\" in HD.");
    }
}
