// Creating different types of arrays and their Initialization

public class TestPhones {
    public static void main( String[] args ) {
        SmartPhones[] phoneList = new SmartPhones[ 3 ];
        String[] phoneNames = {"iPhone 6s", "Galaxy Note 5", "Lumia 950"};
        double [] prices = {1000.01, 999.95, 777.99};
        boolean [] caseFree = {false, true, true};
       
        System.out.print( "Models"+ "\t\tPrice" +  "\t\tCase included:" + "\n\n");
        for ( int i=0; i<phoneList.length; i++ )
        {
        	phoneList[ i ] = new SmartPhones(phoneNames[i], prices[i], caseFree[i] );
            System.out.print( phoneList[ i ].getName() + ", \t$" + phoneList[ i ].getPrice() + ",\t" + phoneList[ i ].getPhoneCase() + "\n"); 
        }
    }
}

