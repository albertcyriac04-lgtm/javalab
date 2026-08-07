/**
 * A legged rescue robot used for scaling rubble and steep mountain terrain.
 */
public class MountainRescueRobot extends RescueRobot implements Climbable {

    public MountainRescueRobot(String robotId, String robotName, int batteryPercentage) {
        super(robotId, robotName, batteryPercentage);
    }

    @Override
    public void climb(String terrainType) {
        System.out.println(robotName + ": Climbing over " + terrainType + " terrain.");
    }

    @Override
    public void performMission() {
        System.out.println(robotName + ": Mission -> Reach trapped hikers on a rocky ridge.");
        climb("rocky/rubble");
    }
}
