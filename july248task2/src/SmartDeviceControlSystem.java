// Interface for WiFi
interface WiFiEnabled {
    void connectWiFi();
}

// Interface for Voice Control
interface VoiceControlled {
    void voiceCommand();
}

// Interface for Music
interface MusicPlayer {
    void playMusic();
}

// Interface for Video Streaming
interface VideoStreaming {
    void streamVideo();
}

// Interface for Temperature Monitoring
interface TemperatureMonitor {
    void showTemperature();
}

// Smart Speaker
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    public void connectWiFi() {
        System.out.println("Smart Speaker connected to WiFi.");
    }
    public void voiceCommand() {
        System.out.println("Voice command activated.");
    }
    public void playMusic() {
        System.out.println("Playing music through Smart Speaker.");
    }
}

// Smart TV
class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {
    public void connectWiFi() {
        System.out.println("Smart TV connected to WiFi.");
    }
    public void playMusic() {
        System.out.println("Playing music on Smart TV.");
    }
    public void streamVideo() {
        System.out.println("Streaming video on Smart TV.");
    }
}

// Smart AC
class SmartAC implements WiFiEnabled, VoiceControlled, TemperatureMonitor {
    public void connectWiFi() {
        System.out.println("Smart AC connected to WiFi.");
    }
    public void voiceCommand() {
        System.out.println("Voice command received by Smart AC.");
    }
    public void showTemperature() {
        System.out.println("Current Room Temperature : 24°C");
    }
}

// Smart Watch
class SmartWatch implements WiFiEnabled, TemperatureMonitor {
    public void connectWiFi() {
        System.out.println("Smart Watch connected to WiFi.");
    }
    public void showTemperature() {
        System.out.println("Body Temperature : 36.8°C");
    }
}

// New Device (Added without modifying interfaces)
class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    public void connectWiFi() {
        System.out.println("Smart Car connected to WiFi.");
    }
    public void voiceCommand() {
        System.out.println("Voice Navigation Activated.");
    }
    public void playMusic() {
        System.out.println("Playing music in Smart Car.");
    }
    public void streamVideo() {
        System.out.println("Streaming videos on rear seat display.");
    }
}

// Main Class
public class SmartDeviceControlSystem {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker();
        SmartTV tv = new SmartTV();
        SmartAC ac = new SmartAC();
        SmartWatch watch = new SmartWatch();
        SmartCar car = new SmartCar();

        System.out.println("------ Smart Speaker ------");
        speaker.connectWiFi();
        speaker.voiceCommand();
        speaker.playMusic();

        System.out.println("\n------ Smart TV ------");
        tv.connectWiFi();
        tv.playMusic();
        tv.streamVideo();

        System.out.println("\n------ Smart AC ------");
        ac.connectWiFi();
        ac.voiceCommand();
        ac.showTemperature();

        System.out.println("\n------ Smart Watch ------");
        watch.connectWiFi();
        watch.showTemperature();

        System.out.println("\n------ Smart Car ------");
        car.connectWiFi();
        car.voiceCommand();
        car.playMusic();
        car.streamVideo();
    }
}