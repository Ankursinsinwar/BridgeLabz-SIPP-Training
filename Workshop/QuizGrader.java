package Workshop;

public class QuizGrader {

    // Method to calculate score and print feedback
    public static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }

    // Main method to run the program
    public static void main(String[] args) {
        String[] correctAnswers = {
                "A", "C", "B", "D", "B", "A", "C", "D", "A", "B"
        };

        String[] studentAnswers = {
                "a", "c", "b", "C", "b", "A", "d", "d", "a", "c"
        };

        System.out.println("=== Quiz Feedback ===");
        int score = calculateScore(correctAnswers, studentAnswers);
        System.out.println("\nFinal Score: " + score + " out of " + correctAnswers.length);
    }
}
