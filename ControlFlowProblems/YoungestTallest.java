package ControlFlowProblems;
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages and heights
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        // Find youngest
        String youngest = "Amar";
        int youngestAge = ageAmar;
        if (ageAkbar < youngestAge) {
            youngest = "Akbar";
            youngestAge = ageAkbar;
        }
        if (ageAnthony < youngestAge) {
            youngest = "Anthony";
            youngestAge = ageAnthony;
        }

        // Find tallest
        String tallest = "Amar";
        int tallestHeight = heightAmar;
        if (heightAkbar > tallestHeight) {
            tallest = "Akbar";
            tallestHeight = heightAkbar;
        }
        if (heightAnthony > tallestHeight) {
            tallest = "Anthony";
            tallestHeight = heightAnthony;
        }

        // Output results
        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
        sc.close();
    }
}
