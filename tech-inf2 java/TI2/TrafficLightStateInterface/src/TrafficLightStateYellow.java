public class TrafficLightStateYellow implements TrafficLightStateInterface{

    public void onEntry(final TrafficLight trafficLight) {
        turnOnYellowLight();
    }
    public void onExit(final TrafficLight trafficLight) {
        turnOffYellowLight();
    }
    public void always(final TrafficLight trafficLight) {}

    @Override
    public void changePhase(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightStateRed());
    }

    private void turnOnYellowLight() {
        System.out.println("Yellow Light is on!");
    }
    private void turnOffYellowLight() {
        System.out.println("Yellow Light is off!");
    }
}
