//********************************************************************
//  Electronics.java       Java Foundations
//
//  Solution to Programming Project 8.7
//********************************************************************

abstract public class Electronics
{
   protected String manufacturer;
   protected double price;
   protected double weight;

   //----------------------------------------------------------------
   //  Sets up a device with the specified information.
   //----------------------------------------------------------------
   public Electronics (String eManufacturer, double ePrice, double eWeight)
   {
      manufacturer = eManufacturer;
      price = ePrice;
      weight = eWeight;
   }

   //----------------------------------------------------------------
   //  Returns a string including the basic device information.
   //----------------------------------------------------------------
   public String toString()
   {
      String result = "Manufacturer: " + manufacturer + "\n";
      result += "Price: $" + price + "\n";
      result += "Weight: " + weight + " pounds";
      return result;
   }
}