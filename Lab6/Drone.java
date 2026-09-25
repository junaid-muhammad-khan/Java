//********************************************************************
//  Drone.java
//  Extends PortableElectronics to represent a flying device.
//********************************************************************

public class Drone extends PortableElectronics
{
   protected double maxAltitude;
   protected int numberOfRotors;
   protected boolean hasGPS;

   public Drone (String eManufacturer, double ePrice, double eWeight,
                 double altitude, int rotors, boolean gps)
   {
      super (eManufacturer, ePrice, eWeight);
      maxAltitude = altitude;
      numberOfRotors = rotors;
      hasGPS = gps;
   }

   // Required implementation of abstract method from PortableElectronics
   public String batteryType()
   {
      return "Lithium-Polymer (LiPo)";
   }

   // Unique Method 1
   public void takeOff()
   {
      System.out.println("Initiating rotor spin-up... Drone is now airborne.");
   }

   // Unique Method 2
   public String getFlightStatus()
   {
      return hasGPS ? "GPS Signal Acquired. Ready for waypoint navigation." : "Manual flight mode only.";
   }

   public String toString()
   {
      String result = super.toString();
      result += "\nMax Altitude: " + maxAltitude + " feet\n";
      result += "Rotors: " + numberOfRotors + "\n";
      result += "GPS Enabled: " + hasGPS + "\n";
      result += "Battery Type: " + batteryType();
      return result;
   }
}