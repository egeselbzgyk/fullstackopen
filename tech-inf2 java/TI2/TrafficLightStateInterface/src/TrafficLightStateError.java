public class TrafficLightStateError implements TrafficLightStateInterface {

    public void changePhase(final TrafficLight trafficLight){}
    public void onEntry(final TrafficLight trafficLight){}
    public void onExit(final TrafficLight trafficLight){}

    public void always(final TrafficLight trafficLight) {
        toggleRedLight();
        toggleYellowLight();
        toggleGreenLight();
    }
    private void toggleRedLight() {

    }
    private void toggleYellowLight() {

    }
    private void toggleGreenLight() {

    }
}
