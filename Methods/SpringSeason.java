package Methods;

import java.util.Scanner;
public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean result = isSpringSeason(month, day);

        if (result) System.out.println("It's a Spring Season");
        else System.out.println("Not a Spring Season");
        
        sc.close();
    }
}