import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        if (c1.getHorsePower() > c2.getHorsePower()) {
            return 1;
        } else if (c1.getHorsePower() < c2.getHorsePower()) {
            return -1;
        }
        return 0;
    }
}