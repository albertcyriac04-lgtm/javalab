# Task 3 — Class Diagram (Emergency Rescue Robot)

```mermaid
classDiagram
    class RescueRobot {
        <<abstract>>
        #String robotId
        #String robotName
        #int batteryPercentage
        +RescueRobot(id, name, battery)
        +checkBatteryStatus() void
        +announce() void
        +performMission()* void
    }

    class Flyable {
        <<interface>>
        +fly(altitudeMeters) void
    }
    class Swimmable {
        <<interface>>
        +swim(depthMeters) void
    }
    class Climbable {
        <<interface>>
        +climb(terrainType) void
    }

    class AerialRescueRobot {
        +fly(altitudeMeters) void
        +performMission() void
    }
    class AquaRescueRobot {
        +swim(depthMeters) void
        +performMission() void
    }
    class MountainRescueRobot {
        +climb(terrainType) void
        +performMission() void
    }
    class AmphibiousRescueRobot {
        +swim(depthMeters) void
        +climb(terrainType) void
        +performMission() void
    }

    RescueRobot <|-- AerialRescueRobot
    RescueRobot <|-- AquaRescueRobot
    RescueRobot <|-- MountainRescueRobot
    RescueRobot <|-- AmphibiousRescueRobot

    Flyable <|.. AerialRescueRobot
    Swimmable <|.. AquaRescueRobot
    Climbable <|.. MountainRescueRobot
    Swimmable <|.. AmphibiousRescueRobot
    Climbable <|.. AmphibiousRescueRobot
```

**Notes for the hand-drawn diagram in your submission:**
- Draw `RescueRobot` at the top labeled `<<abstract>>`, with **solid** hollow-triangle arrows down to all four robot classes (inheritance).
- Draw `Flyable`, `Swimmable`, `Climbable` as separate interface ovals to the side, with **dashed** hollow-triangle arrows from the robot classes that implement them.
- `AmphibiousRescueRobot` should show two dashed arrows (to `Swimmable` and `Climbable`) — this is the multiple-inheritance case.
