import java.util.*;
import java.io.*;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("===============================================================");
        System.out.println("          WELCOME TO THE FIFA WORLD CUP SIMULATOR 2026         ");
        System.out.println("===============================================================");
        System.out.println("      _  _ \n     ( )( )\n      \\  /  Tournament Mode: Round-Robin \n       )(  \n      (__)");

        String[] weatherTypes = {"Sunny", "Rainy", "Snowy"};
        String currentWeather = weatherTypes[rand.nextInt(3)];
        System.out.println("ENVIRONMENTAL REPORT: Weather is " + currentWeather);

        String[] teamNames = {"Brazil", "Germany", "France", "Argentina"};
        String[][] playerNames = {
            {"Neymar", "Vinicius", "Casemiro", "Alisson"},
            {"Muller", "Musiala", "Kimmich", "Neuer"},
            {"Mbappe", "Griezmann", "Kante", "Lloris"},
            {"Messi", "Di Maria", "De Paul", "Martinez"}
        };
        
        Player[][] rosters = new Player[4][4];
        int[] teamGoals = new int[4];
        int[] teamPoints = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("\nEnter Nationality Reputation (1-5) for " + teamNames[i] + ": ");
            int nat = sc.nextInt();
            double hiddenWeight = 0.5 + (rand.nextDouble() * 1.5); 
            
            for (int j = 0; j < 4; j++) {
                rosters[i][j] = new Player(playerNames[i][j], rand.nextInt(5)+1, rand.nextInt(5)+1, rand.nextInt(5)+1, rand.nextInt(5)+1);
                rosters[i][j].calculatePerformance(nat, hiddenWeight, "speed");
            }
        }

        System.out.println("\n" + "=".repeat(75));
        System.out.printf("%-15s | %-5s | %-5s | %-5s | %-10s | %-10s\n", "NAME", "SPD", "PWR", "TWK", "PERF", "STATUS");
        System.out.println("-".repeat(75));
        for (int i = 0; i < 4; i++) {
            System.out.println("TEAM: " + teamNames[i]);
            for (Player p : rosters[i]) p.displayInfo();
            System.out.println("-".repeat(75));
        }

        System.out.println("\n--- STAGE 1: ROUND ROBIN ---");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                simulateMatch(teamNames[i], teamNames[j], rosters[i], rosters[j], teamGoals, teamPoints, i, j, sc, currentWeather);
            }
        }

        sortLeaderboard(teamNames, teamGoals, teamPoints);

        System.out.println("\n--- GRAND FINAL ---");
        simulateMatch(teamNames[0], teamNames[1], rosters[0], rosters[1], teamGoals, teamPoints, 0, 1, sc, currentWeather);

        displayFinalResults(teamNames, teamGoals, teamPoints, rosters, teamNames);
        saveToFile(teamNames, teamGoals, teamPoints);
    }

    public static void simulateMatch(String t1, String t2, Player[] p1, Player[] p2, int[] goals, int[] pts, int id1, int id2, Scanner sc, String weather) throws InterruptedException {
        System.out.println("\n>>> MATCH: " + t1 + " vs " + t2);
        System.out.print("Press 's' to start: "); sc.next();

        int s1 = 0, s2 = 0;
        Referee ref = new Referee("Howard Webb");

        for(int min=1; min<=10; min++) {
            System.out.print("Minute " + (min*9) + "': ");
            String foulResult = ref.checkViolation();
            
            if (foulResult.equals("RED CARD")) {
                System.out.println("RED CARD! A player from " + t1 + " is ejected!");
                p1[0].eject(); 
            } else {
                double chance = Math.random();
                if (chance > 0.85) {
                    System.out.println("GOAL for " + t1 + "!!!"); 
                    s1++; 
                } else if (chance < 0.15) {
                    System.out.println("GOAL for " + t2 + "!!!"); 
                    s2++;
                } else {
                    System.out.println("Ball is moving in the " + weather + " conditions...");
                }
            }
            Thread.sleep(50);
        }
        System.out.println("FINAL: " + t1 + " (" + s1 + ") - " + t2 + " (" + s2 + ")");
        
        goals[id1] += s1; 
        goals[id2] += s2;
        if(s1 > s2) pts[id1] += 3; 
        else if(s2 > s1) pts[id2] += 3; 
        else { pts[id1] += 1; pts[id2] += 1; }
    }

    public static void sortLeaderboard(String[] n, int[] g, int[] p) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (p[j] < p[j+1] || (p[j] == p[j+1] && g[j] < g[j+1])) {
                    int tp = p[j]; p[j] = p[j+1]; p[j+1] = tp;
                    int tg = g[j]; g[j] = g[j+1]; g[j+1] = tg;
                    String tn = n[j]; n[j] = n[j+1]; n[j+1] = tn;
                }
            }
        }
    }

    public static void displayFinalResults(String[] n, int[] g, int[] p, Player[][] rosters, String[] teamNames) {
        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%-5s | %-15s | %-10s | %-10s\n", "RANK", "TEAM NAME", "GOALS", "POINTS");
        System.out.println("-".repeat(60));
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-5d | %-15s | %-10d | %-10d\n", (i+1), n[i], g[i], p[i]);
        }

        Player tournamentMVP = rosters[0][0];
        String mvpTeamName = teamNames[0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (rosters[i][j].getPerf() > tournamentMVP.getPerf()) {
                    tournamentMVP = rosters[i][j];
                    mvpTeamName = teamNames[i];
                }
            }
        }
        
        System.out.println("\n" + "*".repeat(60));
        System.out.println("TOURNAMENT MVP: " + tournamentMVP.name + " (" + mvpTeamName + ")");
        System.out.println("Highest Performance Score: " + String.format("%.2f", tournamentMVP.getPerf()));
        System.out.println("*".repeat(60));
    }
    public static void saveToFile(String[] n, int[] g, int[] p) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("scoreSummary_Khan.txt"))) {
            pw.println("FIFA WORLD CUP 2026 - TOURNAMENT SUMMARY");
            pw.println("-".repeat(40));
            for(int i = 0; i < 4; i++) {
                pw.printf("Team: %-12s | Goals: %-3d | Points: %-3d\n", n[i], g[i], p[i]);
            }
            pw.println("-".repeat(40));
            pw.println("Generated on: " + new java.util.Date());
            System.out.println("\n[System] Tournament summary successfully saved to scoreSummary_Khan.txt");
        } catch (IOException e) {
            System.out.println("[Error] Could not save the file.");
            e.printStackTrace();
        }
    }
}