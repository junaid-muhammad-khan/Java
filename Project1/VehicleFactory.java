public class VehicleFactory {
    public static Vehicle getVehicle(int choice) {
        switch (choice) {
            case 1: 
                return new Vehicle("2024 Toyota Prius", 57.0, 3100.0, 0.02, "Regular");
            case 2: 
                return new Vehicle("2024 Ford F-150", 20.0, 5000.0, 0.05, "Regular");
            case 3: 
                return new Vehicle("2024 Tesla Model 3", 132.0, 4000.0, 0.01, "Electric");
            default: 
                return new Vehicle("Standard Sedan", 30.0, 3000.0, 0.03, "Regular");
        }
    }
}