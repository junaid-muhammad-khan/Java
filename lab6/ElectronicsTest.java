public class ElectronicsTest
{
   public static void main (String[] args)
   {
      Drone myDrone = new Drone("DJI", 799.99, 2.4, 400.0, 4, true);
      ElectronicMopper myMop = new ElectronicMopper("iRobot", 449.50, 5.2, 0.8, "Hardwood");

      System.out.println("--- Drone Details ---\n");
      System.out.println(myDrone.toString());
      myDrone.takeOff();
      System.out.println(myDrone.getFlightStatus() + "\n");

      System.out.println("--- Electronic Mopper Details ---\n");
      System.out.println(myMop.toString());
      myMop.startMopping();
      myMop.refillTank();
   }
}