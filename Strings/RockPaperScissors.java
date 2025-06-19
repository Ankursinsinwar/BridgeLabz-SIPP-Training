package Strings;
import java.util.Scanner;
public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return (choice == 0) ? "rock" : (choice == 1) ? "paper" : "scissors";
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "player";
        }
        return "computer";
    }

    public static String[][] getStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "Player";
        stats[1][0] = "Computer";
        stats[0][1] = String.valueOf((playerWins * 100) / totalGames) + "%";
        stats[1][1] = String.valueOf((computerWins * 100) / totalGames) + "%";
        return stats;
    }

    public static void displayResults(String[][] gameLog, String[][] stats, int totalGames) {
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 0; i < totalGames; i++) {
            System.out.println((i + 1) + "\t" + gameLog[i][0] + "\t" + gameLog[i][1] + "\t\t" + gameLog[i][2]);
        }

        System.out.println("\nStats:");
        System.out.println("Player\tWin %");
        System.out.println(stats[0][0] + "\t" + stats[0][1]);
        System.out.println(stats[1][0] + "\t" + stats[1][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] gameLog = new String[n][3];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter rock/paper/scissors: ");
            String player = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(player, computer);
            if (winner.equals("player")) playerWins++;
            else if (winner.equals("computer")) computerWins++;

            gameLog[i][0] = player;
            gameLog[i][1] = computer;
            gameLog[i][2] = winner;
        }

        String[][] stats = getStats(playerWins, computerWins, n);
        displayResults(gameLog, stats, n);

        sc.close();
    }
}