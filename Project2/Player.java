public class Player extends Person {
    private int speed, power, teamwork, starPlayer, injury;
    private double performance;
    private boolean isEjected = false;

    public Player(String name, int s, int p, int t, int star) {
        super(name);
        this.speed = s;
        this.power = p;
        this.teamwork = t;
        this.starPlayer = star;
        this.injury = (int)(Math.random() * 3);
    }

    public void calculatePerformance(int nat, double weight, String targetStat) {
        double wSpeed = speed;
        if (targetStat.equals("speed")) wSpeed *= weight; 
        this.performance = (2 * nat) + (wSpeed * power) + teamwork + starPlayer - injury;
    }

    public double getPerf() { return isEjected ? 0 : performance; }
    public void eject() { 
    	this.isEjected = true; 
    	} 
    @Override
    public void displayInfo() {
        String status = isEjected ? "[RED CARD]" : "Active";
        System.out.printf("%-15s | %-5d | %-5d | %-5d | %-10.2f | %-10s\n", 
                          name, speed, power, teamwork, performance, status);
    }
}