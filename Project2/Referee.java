public class Referee extends Person {
    public Referee(String name) 
    { 
    	super(name); 
    	}
    @Override
    public void displayInfo() { 
    	System.out.println("Match Referee: " + name); 
    	}
    
    public String checkViolation() {
        double r = Math.random();
        if (r > 0.96) return "RED CARD"; 
        if (r > 0.85) return "YELLOW CARD";
        if (r > 0.75) return "FOUL";
        return "CLEAN";
    }
}