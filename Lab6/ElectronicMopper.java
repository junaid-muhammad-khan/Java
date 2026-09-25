//********************************************************************
//  ElectronicMopper.java
//  Extends HomeAppliance to represent a robotic floor cleaner.
//********************************************************************

public class ElectronicMopper extends HomeAppliance
{
   protected double waterTankCapacity;
   protected boolean isScrubbing;
   protected String floorType;

   public ElectronicMopper (String eManufacturer, double ePrice, double eWeight,
                            double waterLevel, String floor)
   {
      super (eManufacturer, ePrice, eWeight);
      waterTankCapacity = waterLevel;
      floorType = floor;
      isScrubbing = false;
   }

   // Required implementation of abstract method from HomeAppliance
   public String room()
   {
      return "Kitchen and Hallway";
   }

   // Unique Method 1
   public void startMopping()
   {
      isScrubbing = true;
      System.out.println("Water dispensed. Beginning " + floorType + " cleaning cycle.");
   }

   // Unique Method 2
   public void refillTank()
   {
      waterTankCapacity = 1.5; // Reset to max capacity
      System.out.println("Water tank has been refilled.");
   }

   public String toString()
   {
      String result = super.toString();
      result += "\nWater Tank: " + waterTankCapacity + " Liters\n";
      result += "Floor Type: " + floorType + "\n";
      result += "Currently Scrubbing: " + isScrubbing + "\n";
      result += "In Room: " + room();
      return result;
   }
}