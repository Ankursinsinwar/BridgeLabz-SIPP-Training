package Java_Collections;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingSystem {

    private HashMap<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();

    // Cast a vote
    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteMap.get(candidate));
    }

    // Display votes in insertion order
    public void displayInInsertionOrder() {
        System.out.println("\nVotes in insertion order : ");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display votes in sorted order
    public void displayInSortedOrder() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);
        System.out.println("\nVotes in sorted order : ");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display winner
    public void displayWinner() {
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("\nWinner : " + winner + " with " + maxVotes + " votes.");
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of votes : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate name for vote " + (i + 1) + " : ");
            String name = sc.nextLine();
            system.vote(name);
        }

        system.displayInInsertionOrder();
        system.displayInSortedOrder();
        system.displayWinner();
        sc.close();
    }
}