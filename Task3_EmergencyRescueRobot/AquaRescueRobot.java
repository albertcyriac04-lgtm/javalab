/**
 * A submersible rescue robot used for underwater search operations.
 */
public class AquaRescueRobot extends RescueRobot implements Swimmable {

    public AquaRescueRobot(String robotId, String robotName, int batteryPercentage) {
        super(robotId, robotName, batteryPercentage);
    }

    @Override
    public void swim(int depthMeters) {
        System.out.println(robotName + ": Diving to " + depthMeters + "m to search underwater.");
    }

    @Override
    public void performMission() {
        System.out.println(robotName + ": Mission -> Underwater search near collapsed bridge.");
        swim(15);
    }
}
