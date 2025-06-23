package ClassAndObject;

// Class Definition
public class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is palindrome
    public boolean isPalindrome() {
        String str = text.toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }

    // Main method
    public static void main(String[] args) {

        // creat checker objets
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Sir");
        
        System.out.println("\n=== Palindrome Check 1 ===");
        checker1.displayResult();
        System.out.println("\n=== Palindrome Check 2 ===");
        checker2.displayResult();
    }
}
