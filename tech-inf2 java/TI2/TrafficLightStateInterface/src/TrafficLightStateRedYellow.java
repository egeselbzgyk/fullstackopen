public class TrafficLightStateRedYellow implements TrafficLightStateInterface{

    public void onEntry(final TrafficLight trafficLight) {
        turnOnRedLight();
        turnOnYellowLight();
    }
    public void onExit(final TrafficLight trafficLight) {
        turnOffRedLight();
        turnOffYellowLight();
    }
    @Override
    public void always(final TrafficLight trafficLight) {}

    @Override
    public void changePhase(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightStateGreen());
    }

    private void turnOnRedLight() {
        System.out.println("Red Light is on!");
    }
    private void turnOffRedLight() {
        System.out.println("Red Light is off!");
    }
    private void turnOnYellowLight() {
        System.out.println("Yellow Light is on!");
    }
    private void turnOffYellowLight() {
        System.out.println("Yellow Light is off!");
    }
}
