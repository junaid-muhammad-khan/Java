//********************************************************************
//  PortableElectronics.java       Java Foundations
//
//  Solution to Programming Project 8.7
//********************************************************************

abstract public class PortableElectronics extends Electronics
{
   //----------------------------------------------------------------
   //  Sets up a portable device with the specified information.
   //----------------------------------------------------------------
   public PortableElectronics (String eManufacturer, double ePrice, double eWeight)
   {
      super (eManufacturer, ePrice, eWeight);
   }

   //----------------------------------------------------------------
   //  Derived classes must define the batteryType method for each
   //  type of device.
   //----------------------------------------------------------------
   public abstract String batteryType();
}