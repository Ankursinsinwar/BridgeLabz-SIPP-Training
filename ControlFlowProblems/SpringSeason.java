package ControlFlowProblems;

public class SpringSeason {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = (month == 3 && day >= 20) ||
                           (month > 3 && month < 6) ||
                           (month == 6 && day <= 20);

        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }
}