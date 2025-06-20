package Methods;

import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker3 {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }


    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }


    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }


    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int testNumber = sc.nextInt();
        System.out.println("Number: " + testNumber);
        System.out.println("Digit count: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(testNumber)));
        System.out.println("Reversed digits: " + Arrays.toString(reverseArray(getDigitsArray(testNumber))));
        System.out.println("Is palindrome: " + isPalindrome(testNumber));
        System.out.println("Is duck number: " + isDuckNumber(testNumber));
        sc.close();
    }
}