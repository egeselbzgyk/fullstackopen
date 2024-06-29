public class TrafficLight {

    protected TrafficLightStateInterface state;
    protected boolean requestGreen = false; //um einen Grünanfrage zu verwalten

    public TrafficLight(TrafficLightStateInterface initialState) {
        this.state = initialState;
    }

    public void changeState() {
        if (isRed()) {
            if (requestGreen) {
                requestGreen();
            }
            else System.out.println("request green");
        }
    }

    public void setState(final TrafficLightStateInterface state) {
        this.state = state;
    }

    public boolean requestGreen() {
        return this.requestGreen = true;
    }

    public boolean isRed() {
        return !(this.state instanceof TrafficLightStateGreen);
    }
}
