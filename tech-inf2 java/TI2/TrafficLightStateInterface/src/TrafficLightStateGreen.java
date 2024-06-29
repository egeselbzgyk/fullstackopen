public class TrafficLightStateGreen implements TrafficLightStateInterface {

    @Override
    public void onEntry(TrafficLight trafficLight) {
        turnOnGreenLight();
    }

    @Override
    public void always(TrafficLight trafficLight) {
    }

    @Override
    public void onExit(TrafficLight trafficLight) {
        turnOffGreenLight();
    }

    @Override
    public void changePhase(TrafficLight trafficLight) {
        trafficLight.setState(new TrafficLightStateYellow());
    }

    private void turnOnGreenLight() {
        System.out.println("Green light turned on.");
    }

    private void turnOffGreenLight() {
        System.out.println("Green light turned off.");
    }
}
