import java.util.Random;
import java.io.*;

public class SimulationEngine {
    private Vehicle v;
    private String route;
    private int weather, road, totalKm;
    private double tireFactor, windowFactor;
    private int redLights = 0, yellowLights = 0, stopSigns = 0;

    public SimulationEngine(Vehicle v, String route, int weather, int road, double tire, double win, int totalKm) {
        this.v = v;
        this.route = route;
        this.weather = weather;
        this.road = road;
        this.tireFactor = tire;
        this.windowFactor = win;
        this.totalKm = totalKm;
    }

    public TripResult runFullTrip() {
        double totalFuel = 0;
        Random rand = new Random();
        
        double envMultiplier = 1.0;
        if (weather == 2) envMultiplier += 0.1; 
        else if (weather == 3) envMultiplier += 0.4; 
        
        if (road == 2) envMultiplier += 0.1; 
        else if (road == 3) envMultiplier += 0.3; 

        System.out.println("\n--- KM-BY-KM SIMULATION PROGRESS ---");
        
        for (int km = 1; km <= this.totalKm; km++) {
            double currentBurn = v.calculateDrivingBurn(60, envMultiplier);
            double kmTotal = (currentBurn * tireFactor * windowFactor);

            int event = rand.nextInt(100); 
            String status = "Green light, pass.";
            double extraBurn = 0;

            if (event < 15) { 
                status = "Red light, stop. 0.05 extra gas consumption.";
                extraBurn = 0.05;
                redLights++;
            } else if (event < 30) { 
                status = "Yellow light, hold. 0.02 extra gas consumption.";
                extraBurn = 0.02;
                yellowLights++;
            } else if (event < 40) { 
                status = "Stop sign, stop. 0.03 extra gas consumption.";
                extraBurn = 0.03;
                stopSigns++;
            }

            totalFuel += (kmTotal + extraBurn);

            System.out.println(status);
            System.out.printf("Distance traveled(km): %-3d  Fuel used(units): %.3f\n", km, totalFuel);
            System.out.println("--------------------------------------------------");
        }
        
        TripResult result = new TripResult(v.name, route, totalFuel, v.passengers, redLights, yellowLights, stopSigns);
        
        saveToExternalFile(result);
        
        return result;
    }

    //  handles the file creation and appending
    private void saveToExternalFile(TripResult res) {
        String fileName = "ConsumptionReport_KhanJ.txt";
        
       
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("==========================================");
            writer.println("   OFFICIAL DRIVING SIMULATION REPORT    ");
            writer.println("==========================================");
            writer.println("Vehicle:    " + res.name);
            writer.println("Route:      " + res.city);
            writer.println("Distance:   " + this.totalKm + " km");
            writer.println("Passengers: " + res.passengers);
            writer.println("Red Lights: " + res.redLights);
            writer.println("Stop Signs: " + res.stopSigns);
            writer.println("TOTAL FUEL: " + String.format("%.2f", res.fuel));
            writer.println("==========================================\n");
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}