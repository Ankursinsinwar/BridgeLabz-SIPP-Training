package Methods;

import java.util.Random;

public class FootballTeamHeights {

    public static int[] generateHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) heights[i] = 150 + random.nextInt(101);
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);


        System.out.println("Sum of heights: " + sum(heights));
        System.out.println("Mean height: " + mean(heights));

        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));

    }
}
