import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class WordMemoryGame {

    // ANSI Escape Codes for Colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoints = 0;

        System.out.println(CYAN + "Welcome to the Word Memory Game!" + RESET);
        System.out.println("Please enter some words now. Hit ENTER after each word. Hit ENTER twice to finish.");

        // ==========================================
        // PART 1: Store the words in an ArrayList
        // ==========================================
        ArrayList<String> wordsList = new ArrayList<>();
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            wordsList.add(input);
        }

        System.out.println("You have entered " + wordsList.size() + " words.");
        if (wordsList.isEmpty()) {
            System.out.println(RED + "No words entered. Game over!" + RESET);
        }

        // ==========================================
        // PART 2: Round I (Iterator)
        // ==========================================
        System.out.println("\n" + CYAN + "ROUND I" + RESET);
        System.out.println("Now please enter the same words in the same order to win the first round. (tracing the words with an Iterator)");
        
        Iterator<String> iterator = wordsList.iterator();
        boolean round1Success = true;

        while (iterator.hasNext()) {
            String expectedWord = iterator.next();
            System.out.print(YELLOW + "> " + RESET);
            String userWord = scanner.nextLine().trim();

            if (userWord.equals(expectedWord)) {
                totalPoints += userWord.length();
                System.out.println(GREEN + "Correct! You have " + totalPoints + " points." + RESET);
            } else {
                System.out.println(RED + "No, the correct word in sequence is " + expectedWord + ". Game over!" + RESET);
                round1Success = false;
                break;
            }
        }

        if (!round1Success) return;
        System.out.println(GREEN + "You remembered all words correctly! CONGRATULATIONS!" + RESET);


        // ==========================================
        // PART 3: Round II (Queue)
        // ==========================================
        System.out.println("\n" + CYAN + "ROUND II" + RESET);
        System.out.println("Now please enter the same words again to win the second round. (now tracing with a Queue)");

        Queue<String> wordQueue = new LinkedList<>(wordsList);
        boolean round2Success = true;

        while (!wordQueue.isEmpty()) {
            String expectedWord = wordQueue.poll();
            System.out.print(YELLOW + "> " + RESET);
            String userWord = scanner.nextLine().trim();

            if (userWord.equals(expectedWord)) {
                totalPoints += userWord.length();
                System.out.println(GREEN + "Correct! You have " + totalPoints + " points." + RESET);
            } else {
                System.out.println(RED + "No, the correct word in sequence is " + expectedWord + ". Game over!" + RESET);
                round2Success = false;
                break;
            }
        }

        if (!round2Success) return;
        System.out.println(GREEN + "You remembered all words correctly! CONGRATULATIONS!" + RESET);


        // ==========================================
        // PART 4: Round III (Stack - Double Points)
        // ==========================================
        System.out.println("\n" + CYAN + "ROUND III" + RESET);
        System.out.println("Please enter the same words in reverse order. Third round will give double points for each word. (now tracing with a Stack)");

        Stack<String> wordStack = new Stack<>();
        for (String word : wordsList) {
            wordStack.push(word);
        }
        
        boolean round3Success = true;

        while (!wordStack.isEmpty()) {
            String expectedWord = wordStack.pop();
            System.out.print(YELLOW + "> " + RESET);
            String userWord = scanner.nextLine().trim();

            if (userWord.equals(expectedWord)) {
                totalPoints += (userWord.length() * 2); // Double points
                System.out.println(GREEN + "Correct! You have " + totalPoints + " points." + RESET);
            } else {
                System.out.println(RED + "No, the correct word in sequence is " + expectedWord + ". Game over!" + RESET);
                round3Success = false;
                break;
            }
        }

        if (!round3Success) return;
        System.out.println(GREEN + "You remembered all words correctly! CONGRATULATIONS!" + RESET);
        
        scanner.close();
    }
}