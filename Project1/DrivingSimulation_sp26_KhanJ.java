import java.util.Scanner;
import java.util.ArrayList;

public class DrivingSimulation_sp26_KhanJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TripResult> finalReceipt = new ArrayList<>();
        boolean sessionActive = true;

        System.out.println("==========================================");
        System.out.println("   ADVANCED VEHICLE SIMULATION SYSTEM    ");
        System.out.println("       Project I - Junaid Khan           ");
        System.out.println("==========================================");

        while (sessionActive && finalReceipt.size() < 3) {
            // STEP 1: VEHICLE SELECTION
            System.out.println("\n--- STEP 1: VEHICLE SELECTION ---");
            System.out.println("1) 2024 Toyota Prius (Hybrid)");
            System.out.println("2) 2024 Ford F-150 (Turbo)");
            System.out.println("3) 2024 Tesla Model 3 (EV)");
            System.out.print("Select Car Option: ");
            Vehicle car = VehicleFactory.getVehicle(sc.nextInt());

            // STEP 2: ROUTE SELECTION
            System.out.println("\n--- STEP 2: ROUTE SELECTION ---");
            System.out.println("1) Vancouver -> Surrey");
            System.out.println("2) London -> Oxford");
            System.out.println("3) Dubai -> Abu Dhabi");
            System.out.print("Select Route: ");
            int routeChoice = sc.nextInt();
            String route = (routeChoice == 1) ? "Vancouver to Surrey" : 
                           (routeChoice == 2) ? "London to Oxford" : "Dubai to Abu Dhabi";
            
            // STEP 3: ENVIRONMENT
            System.out.println("\n--- STEP 3: ENVIRONMENT ---");
            System.out.println("Weather: 1) Sunny  2) Rainy  3) Snowy");
            System.out.print("Select Weather: ");
            int weather = sc.nextInt();
            
            System.out.println("Road: 1) Flat  2) Bumpy  3) Muddy");
            System.out.print("Select Road Condition: ");
            int road = sc.nextInt();

            System.out.println("\n--- STEP 4: PASSENGER LOAD ---");
            System.out.print("Enter number of passengers (1-5): ");
            int passengers = sc.nextInt();
            car.setPassengers(passengers);

            System.out.println("\n--- STEP 5: UNIQUE VEHICLE FACTORS ---");
            System.out.println("Tire Pressure: 1) Low  2) Optimal");
            int tireChoice = sc.nextInt();
            double tireFactor = (tireChoice == 1) ? 1.05 : 1.0;

            System.out.println("Windows: 1) Open  2) Closed");
            int windowChoice = sc.nextInt();
            double windowFactor = (windowChoice == 1) ? 1.03 : 1.0;
            
            System.out.println("\n--- STEP 6: DISTANCE ---");
            System.out.print("How many KM would you like to travel? ");
            int travelDistance = sc.nextInt();

            // Update the Engine call to include these
            SimulationEngine engine = new SimulationEngine(car, route, weather, road, tireFactor, windowFactor, travelDistance);
            TripResult currentResult = engine.runFullTrip();
            finalReceipt.add(currentResult);

            // LOOP CONTROL
            if (finalReceipt.size() < 3) {
                System.out.print("\nSimulate another car to compare? (y/n): ");
                if (sc.next().equalsIgnoreCase("n")) {
                    sessionActive = false;
                }
            } else {
                System.out.println("\nMaximum limit of 3 cars reached.");
                sessionActive = false;
            }
        }

        // FINAL OUTPUT: The Receipt Form and Chart
        ReceiptGenerator.printComparison(finalReceipt);
        
        System.out.println("\nSimulation complete. External report generated: ConsumptionReport_KhanJ.txt");
        sc.close();
    }
}