public class Vehicle {
    public String name, fuelGrade;
    public double weight, idleRate, tirePressure;
    public boolean windowsOpen;
    
    public int passengers; 

    public Vehicle(String name, double mpg, double weight, double idleRate, String fuelGrade) {
        this.name = name;
        this.weight = weight;
        this.idleRate = idleRate;
        this.fuelGrade = fuelGrade;
        this.tirePressure = 32.0;
        this.passengers = 1; 
    }

    public void setPassengers(int p) {
        this.passengers = p;
    }

    public double calculateDrivingBurn(int speed, double roadMultiplier) {
        double totalMass = this.weight + (this.passengers * 75); 
        return (totalMass / 1000) * (speed * 0.05) * roadMultiplier;
    }

    public double getIdleBurn(int seconds, String signal) {
        if (this.name.contains("Tesla")) return 0.01;
        if (signal.equals("Yellow")) return (seconds * idleRate) * 0.5; 
        return seconds * idleRate; 
    }
}