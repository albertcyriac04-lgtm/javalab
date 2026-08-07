/**
 * A drone-style rescue robot used for aerial search and survivor spotting.
 */
public class AerialRescueRobot extends RescueRobot implements Flyable {

    public AerialRescueRobot(String robotId, String robotName, int batteryPercentage) {
        super(robotId, robotName, batteryPercentage);
    }

    @Override
    public void fly(int altitudeMeters) {
        System.out.println(robotName + ": Ascending to " + altitudeMeters + "m for aerial scan.");
    }

    @Override
    public void performMission() {
        System.out.println(robotName + ": Mission -> Aerial search for survivors over flood zone.");
        fly(80);
    }
}
