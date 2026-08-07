/**
 * Driver class for the Emergency Rescue Robot fleet.
 * Uses RescueRobot references wherever behaviour is common,
 * and interface references wherever a specific terrain capability
 * is invoked directly.
 */
public class EmergencyRescueRobotDemo {

    public static void main(String[] args) {

        // Abstract class reference array - polymorphism across all robot types
        RescueRobot[] fleet = new RescueRobot[4];
        fleet[0] = new AerialRescueRobot("AR-01", "SkyHawk", 90);
        fleet[1] = new AquaRescueRobot("AQ-01", "DeepDiver", 75);
        fleet[2] = new MountainRescueRobot("MT-01", "RockClimber", 60);
        fleet[3] = new AmphibiousRescueRobot("AM-01", "FloodRunner", 85);

        System.out.println("===== Fleet Roll Call =====");
        for (RescueRobot robot : fleet) {
            robot.announce();          // concrete method from abstract class
            robot.checkBatteryStatus(); // concrete method from abstract class
        }

        System.out.println("\n===== Mission Deployment =====");
        for (RescueRobot robot : fleet) {
            robot.performMission();    // abstract method, overridden differently by each
            System.out.println();
        }

        // Interface references used where a specific capability is needed directly,
        // e.g. dispatching only the robots that can swim for a flood-response drill.
        System.out.println("===== Flood Drill: Swim-Capable Units Only =====");
        Swimmable[] swimmers = { (AquaRescueRobot) fleet[1], (AmphibiousRescueRobot) fleet[3] };
        for (Swimmable s : swimmers) {
            s.swim(5);
        }
    }
}
