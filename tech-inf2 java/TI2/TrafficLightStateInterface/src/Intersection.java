import java.util.ArrayList;

public class Intersection {

    protected TrafficLight horizontalLight;
    protected TrafficLight verticalLight;


    public Intersection(TrafficLight horizontalLight, TrafficLight verticalLight) {
        this.horizontalLight = horizontalLight;
        this.verticalLight = verticalLight;
    }

    public boolean manageTraffic() {
        if (horizontalLight.isRed() && verticalLight.isRed()) {
            System.out.println("Intersection is free. Both directions are red.");
            return true;
        } else {
            System.out.println("Intersection is occupied. At least one direction is not red.");
            return false;
        }
    }

    public void requestGreenIntersection() {
        if (horizontalLight.isRed() && verticalLight.isRed()) {
            if (horizontalLight.requestGreen && verticalLight.requestGreen) {
                horizontalLight.requestGreen();
            } else if (horizontalLight.requestGreen) {
                horizontalLight.changeState();
            } else if (verticalLight.requestGreen) {
                verticalLight.changeState();
            }
        }
    }
}
