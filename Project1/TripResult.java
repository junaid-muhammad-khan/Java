public class TripResult {
    public String name;
    public String city;
    public double fuel;
    public int passengers;
    public int redLights;
    public int yellowLights;
    public int stopSigns;

    public TripResult(String name, String city, double fuel, int passengers, int red, int yellow, int stop) {
        this.name = name;
        this.city = city;
        this.fuel = fuel;
        this.passengers = passengers;
        this.redLights = red;
        this.yellowLights = yellow;
        this.stopSigns = stop;
    }
}