public class Car {
    private int topSpeed;
    private int numSeats;
    private int horsePower;

    // Constructor
    public Car(int topSpeed, int numSeats, int horsePower) {
        this.topSpeed = topSpeed;
        this.numSeats = numSeats;
        this.horsePower = horsePower;
    }

    // Getters
    public int getTopSpeed() {
        return topSpeed;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                " mph, seats=" + numSeats +
                ", horsePower=" + horsePower +
                " HP}";
    }
}