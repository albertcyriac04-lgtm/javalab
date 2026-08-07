/**
 * Abstract class representing common properties and behaviour shared
 * by every rescue robot in the fleet, regardless of its terrain
 * capabilities (flying, swimming, climbing, or combinations of these,
 * which are supplied separately via interfaces).
 */
public abstract class RescueRobot {

    protected String robotId;
    protected String robotName;
    protected int batteryPercentage;

    public RescueRobot(String robotId, String robotName, int batteryPercentage) {
        this.robotId = robotId;
        this.robotName = robotName;
        this.batteryPercentage = batteryPercentage;
    }

    /** Concrete method: identical status check for every robot. */
    public void checkBatteryStatus() {
        String status = (batteryPercentage >= 20) ? "OK" : "LOW - return to base soon";
        System.out.println(robotName + " [" + robotId + "] Battery: " + batteryPercentage + "% (" + status + ")");
    }

    /** Concrete method: every robot announces itself the same way. */
    public void announce() {
        System.out.println(robotName + " [" + robotId + "] reporting for duty.");
    }

    /**
     * Abstract method: every robot type has a fundamentally different
     * mission profile depending on the terrain interfaces it implements.
     */
    public abstract void performMission();
}
