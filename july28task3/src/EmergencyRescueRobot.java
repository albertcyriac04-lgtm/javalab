// Abstract Class
abstract class RescueRobot {
    int robotId;
    String robotName;

    RescueRobot(int robotId, String robotName) {
        this.robotId = robotId;
        this.robotName = robotName;
    }

    void displayRobotDetails() {
        System.out.println("Robot ID   : " + robotId);
        System.out.println("Robot Name : " + robotName);
    }

    void startRobot() {
        System.out.println(robotName + " is ready for rescue.");
    }

    abstract void performMission();
}

// Interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climbable {
    void climb();
}

// Drone Robot
class DroneRobot extends RescueRobot implements Flyable {
    DroneRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying to search the accident area.");
    }

    void performMission() {
        System.out.println("Mission: Aerial surveillance.");
    }
}

// Water Rescue Robot
class WaterRescueRobot extends RescueRobot implements Swimmable {
    WaterRescueRobot(int id, String name) {
        super(id, name);
    }

    public void swim() {
        System.out.println("Swimming to rescue victims.");
    }

    void performMission() {
        System.out.println("Mission: Water rescue.");
    }
}

// Mountain Rescue Robot
class MountainRescueRobot extends RescueRobot implements Climbable {
    MountainRescueRobot(int id, String name) {
        super(id, name);
    }

    public void climb() {
        System.out.println("Climbing mountains and rocks.");
    }

    void performMission() {
        System.out.println("Mission: Mountain rescue.");
    }
}

// Multi Purpose Robot
class MultiPurposeRobot extends RescueRobot implements Flyable, Swimmable, Climbable {
    MultiPurposeRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying to rescue location.");
    }

    public void swim() {
        System.out.println("Swimming across flooded areas.");
    }

    public void climb() {
        System.out.println("Climbing damaged buildings.");
    }

    void performMission() {
        System.out.println("Mission: Multi-purpose emergency rescue.");
    }
}

// Main Class
public class EmergencyRescueRobot {
    public static void main(String[] args) {
        // Abstract class references
        RescueRobot[] robots = {
                new DroneRobot(101, "Drone-X"),
                new WaterRescueRobot(102, "AquaBot"),
                new MountainRescueRobot(103, "HillBot"),
                new MultiPurposeRobot(104, "RescueMax")
        };

        System.out.println("===== RESCUE ROBOTS =====");
        for (RescueRobot robot : robots) {
            System.out.println("-----------------------------");
            robot.displayRobotDetails();
            robot.startRobot();
            robot.performMission();

            if (robot instanceof Flyable) {
                Flyable f = (Flyable) robot;
                f.fly();
            }
            if (robot instanceof Swimmable) {
                Swimmable s = (Swimmable) robot;
                s.swim();
            }
            if (robot instanceof Climbable) {
                Climbable c = (Climbable) robot;
                c.climb();
            }
            System.out.println();
        }
    }
}