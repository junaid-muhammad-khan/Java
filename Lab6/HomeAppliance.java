//********************************************************************
//  HomeAppliance.java       Java Foundations
//
//  Solution to Programming Project 8.7
//********************************************************************

abstract public class HomeAppliance extends Electronics
{
   //----------------------------------------------------------------
   //  Sets up a home appliance with the specified information.
   //----------------------------------------------------------------
   public HomeAppliance (String eManufacturer, double ePrice, double eWeight)
   {
      super (eManufacturer, ePrice, eWeight);
   }

   //----------------------------------------------------------------
   //  Derived classes must define the room method for each
   //  type of appliance.
   //----------------------------------------------------------------
   public abstract String room();
}