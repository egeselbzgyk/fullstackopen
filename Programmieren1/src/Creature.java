import java.util.ArrayList;
import java.util.Random;

public class Creature {
    private int vitality;
    private boolean lovely;
    private String name;
    private Creature[] parentOf = new Creature[5];
    int counter = 0;


    static Random rand = new Random();

    Creature(String name) {
        this.name = name;
        this.vitality = rand.nextInt(101);
        this.lovely = rand.nextBoolean();
    }

    Creature(String name, int vitality, boolean lovely) {
        this.name = name;
        this.vitality = vitality;
        this.lovely = lovely;
    }

    boolean canJoin(Creature other) {
        if (this != other && this.vitality >= 50 && other.vitality >= 50 && this.counter < 5)
            return true;
        return false;
    }

    void reduceVitality(int amount) {
        assert amount > 0;
        this.vitality -= amount;
        if (this.vitality < 0) {
            this.vitality = 0;
        }
    }

    Creature join(Creature other) {
        assert canJoin(other): "Unable to join " + other;

        boolean loveliness = (this.lovely == other.lovely ? this.lovely : rand.nextBoolean());
        Creature child = new Creature(this.name+other.name, (this.vitality + other.vitality)/2, loveliness);
        this.parentOf[counter++] = child;
        reduceVitality(33);
        return child;
    }

    @Override
    public String toString() {
        return this.name + "(" + (this.lovely ? "lovely": "unlovely") + ", " + this.vitality + ")";
    }
}
