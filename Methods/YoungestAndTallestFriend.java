package Methods;

import java.util.Scanner;

public class YoungestAndTallestFriend {

public static int findYoungest(int[] ages) {
    int youngestIndex = 0;
    for (int i = 1; i < ages.length; i++) {
        if (ages[i] < ages[youngestIndex]) {
            youngestIndex = i;
        }
    }
    return youngestIndex;
}

    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[friends.length];
        double[] heights = new double[friends.length];

        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.println("The youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
        sc.close();
    }
}