public class app {

    public static void main(String[] args) {

        TrafficLight trafficLight1 = new TrafficLight(new TrafficLightStateRed());




        TrafficLight horizontalLight = new TrafficLight(new TrafficLightStateRed());
        TrafficLight verticalLight = new TrafficLight(new TrafficLightStateRed());
        Intersection intersection = new Intersection(horizontalLight, verticalLight);

        intersection.requestGreenIntersection();
    }
}
