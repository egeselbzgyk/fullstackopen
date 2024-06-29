public interface TrafficLightStateInterface {

    public void changePhase(final TrafficLight trafficLight);

    public void onEntry(final TrafficLight trafficLight);

    public void always(final TrafficLight trafficLight);

    public void onExit(final TrafficLight trafficLight);


}
