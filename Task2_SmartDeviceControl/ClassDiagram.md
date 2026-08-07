# Task 2 — Class Diagram (Smart Device Control System)

```mermaid
classDiagram
    class WiFiEnabled {
        <<interface>>
        +connectToWiFi(networkName) void
    }
    class VoiceControlled {
        <<interface>>
        +processVoiceCommand(command) void
    }
    class MusicPlayer {
        <<interface>>
        +playMusic(songName) void
    }
    class VideoStreaming {
        <<interface>>
        +streamVideo(showName) void
    }
    class TemperatureMonitor {
        <<interface>>
        +reportTemperature() void
    }

    class SmartSpeaker {
        -String deviceName
    }
    class SmartTV {
        -String deviceName
    }
    class SmartThermostat {
        -String deviceName
        -double currentTempCelsius
    }
    class SmartHub {
        -String deviceName
        -double currentTempCelsius
    }
    class SmartCar {
        -String deviceName
    }

    WiFiEnabled <|.. SmartSpeaker
    VoiceControlled <|.. SmartSpeaker
    MusicPlayer <|.. SmartSpeaker

    WiFiEnabled <|.. SmartTV
    VoiceControlled <|.. SmartTV
    VideoStreaming <|.. SmartTV

    WiFiEnabled <|.. SmartThermostat
    TemperatureMonitor <|.. SmartThermostat

    WiFiEnabled <|.. SmartHub
    VoiceControlled <|.. SmartHub
    MusicPlayer <|.. SmartHub
    TemperatureMonitor <|.. SmartHub

    WiFiEnabled <|.. SmartCar
    VoiceControlled <|.. SmartCar
    MusicPlayer <|.. SmartCar
    VideoStreaming <|.. SmartCar
```

**Notes for the hand-drawn diagram in your submission:**
- Draw the 5 interfaces as ovals along the top labeled `<<interface>>`.
- Draw the 5 device classes as boxes below, with **dashed** arrows and hollow triangle heads pointing up to each interface they implement (dashed = "implements", solid = "extends").
- `SmartHub` and `SmartCar` should each show 3–4 dashed arrows, visually demonstrating multiple interface inheritance.
- Label `SmartCar` "added later — no interface modified".
