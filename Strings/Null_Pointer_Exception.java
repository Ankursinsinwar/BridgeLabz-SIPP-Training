package Strings;

public class Null_Pointer_Exception {

    public static void generateException() {
        String text = null;
        int len = text.length();
        System.out.println("Length of text: " + len);
    }

    public static void handleException() {
        String text = null;

        try {
            int len = text.length();
            System.out.println("Length of text: " + len);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(" Generating Exception: ");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Handling Exception: ");
        handleException();
    
    }
}
