public class TrafficLightStateRed implements TrafficLightStateInterface{

    public void onEntry(final TrafficLight trafficLight) {
        turnOnRedLight();
    }
    public void onExit(final TrafficLight trafficLight) {
        turnOffRedLight();
    }
    public void always(final TrafficLight trafficLight) {}

    @Override
    public void changePhase(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightStateRedYellow());
    }

    private void turnOnRedLight() {
        System.out.println("Red Light is on!");
    }
    private void turnOffRedLight() {
        System.out.println("Red Light is off!");
    }
}
