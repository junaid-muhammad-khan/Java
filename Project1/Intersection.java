import java.util.Random;

public class Intersection {
    public boolean isRedLight() {
        // Algorithm: 30% Random Trigger
        return new Random().nextInt(100) < 30;
    }
}