import java.util.Comparator;

public class TestCarComparator {
    public static void main(String[] args) {
        // Car(topSpeed, numSeats, horsePower)
        Car s1 = new Car(155, 5, 300); // Sports Sedan
        Car s2 = new Car(205, 2, 700); // Supercar
        Car s3 = new Car(130, 7, 275); // SUV

        CarComparator carComp = new CarComparator();

        Car mostPowerful = max(s1, s2, carComp);

        System.out.println("--- Comparing Car s1 and Car s2 ---");
        System.out.println("Car s1 Horsepower: " + s1.getHorsePower() + " HP");
        System.out.println("Car s2 Horsepower: " + s2.getHorsePower() + " HP");
        System.out.println("\nThe more powerful car is: " + mostPowerful);
    }

    public static Car max(Car c1, Car c2, Comparator<Car> comp) {
        if (comp.compare(c1, c2) > 0) {
            return c1;
        } else {
            return c2;
        }
    }
}