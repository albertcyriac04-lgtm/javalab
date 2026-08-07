/**
 * A combination robot that can both swim and climb, useful for
 * missions that cross water and land in the same operation.
 * Demonstrates multiple inheritance via two interfaces at once.
 */
public class AmphibiousRescueRobot extends RescueRobot implements Swimmable, Climbable {

    public AmphibiousRescueRobot(String robotId, String robotName, int batteryPercentage) {
        super(robotId, robotName, batteryPercentage);
    }

    @Override
    public void swim(int depthMeters) {
        System.out.println(robotName + ": Wading/swimming through " + depthMeters + "m of floodwater.");
    }

    @Override
    public void climb(String terrainType) {
        System.out.println(robotName + ": Climbing onto " + terrainType + " after leaving the water.");
    }

    @Override
    public void performMission() {
        System.out.println(robotName + ": Mission -> Cross flooded street then climb debris to reach survivors.");
        swim(3);
        climb("collapsed debris");
    }
}
