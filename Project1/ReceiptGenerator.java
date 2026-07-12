import java.util.ArrayList;

public class ReceiptGenerator {
    public static void printComparison(ArrayList<TripResult> results) {
        if (results.isEmpty()) {
            System.out.println("No simulation data found.");
            return;
        }

        System.out.println("\n==========================================================================");
        System.out.println("                   OFFICIAL SIMULATION RECEIPT (FINAL)                    ");
        System.out.println("==========================================================================");
        System.out.printf("%-18s | %-18s | %-4s | %-3s | %-4s | %-6s\n", 
                          "VEHICLE", "ROUTE", "PASS", "RED", "STOP", "FUEL");
        System.out.println("--------------------------------------------------------------------------");

        for (TripResult tr : results) {
            System.out.printf("%-18s | %-18s | %-4d | %-3d | %-4d | %-6.2f\n", 
                              tr.name, tr.city, tr.passengers, tr.redLights, tr.stopSigns, tr.fuel);
        }
        System.out.println("==========================================================================");

        System.out.println("\n--- GAS STATION PRICE COMPARISON (2-Station / 2-Grade) ---");
        System.out.printf("%-15s | %-12s | %-12s\n", "STATION", "REGULAR", "PREMIUM");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-15s | $1.45/L      | $1.65/L      (BEST PRICE)\n", "Costco");
        System.out.printf("%-15s | $1.58/L      | $1.78/L\n", "Shell");
        System.out.println("-------------------------------------------------------");

        System.out.println("\n--- VISUAL ENERGY CONSUMPTION CHART (Scaled 1:2) ---");
        for (TripResult tr : results) {
            System.out.printf("%-18s: ", tr.name);
            int barCount = (int) tr.fuel / 2; 
            String barSymbol = (tr.fuel < 100) ? "■" : (tr.fuel < 150) ? "▰" : "█";
            
            for (int i = 0; i < barCount; i++) {
                System.out.print(barSymbol);
            }
            System.out.printf(" (%.2f units)\n", tr.fuel);
        }
        System.out.println("==========================================================================\n");
    }
}