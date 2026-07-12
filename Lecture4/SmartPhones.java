
public class SmartPhones {
    private String name; 
    private double price;
    private boolean phoneCase = false;
    
    public SmartPhones( String model, double cost, boolean caseIncluded ) {
        name = model;
        price = cost;
        phoneCase = caseIncluded;        
    }
    
    public String getName(){
    	return name;
    }
    
    public double getPrice(){
    	return price;
    }
    
    public boolean getPhoneCase(){
    	return phoneCase;
    }
}

