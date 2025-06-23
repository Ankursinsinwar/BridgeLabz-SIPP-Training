package StringHandling;

import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char rem = sc.nextLine().charAt(0);
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != rem)
                result += c;
        }
        System.out.println(result);
        sc.close();
    }
}
