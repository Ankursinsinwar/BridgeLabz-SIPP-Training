package This_Static_Final_InstanceofOperator;

// class Definition
public class BankAccount {
    private final String accountNumber;
    private String accountHolderName;

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("\nTotal accounts created: " + totalAccounts);
    }

    // Instance method using instanceof
    public void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("\nAcc. Holder: " + acc.accountHolderName);
            System.out.println("Acc. Number: " + acc.accountNumber);
            System.out.println("Bank: " + bankName);
        } else {
            System.out.println("Invalid object!");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of BankAccount
        BankAccount a1 = new BankAccount("ACC1001", "Ankur");
        BankAccount a2 = new BankAccount("ACC1002", "David");

        a1.displayDetails(a1);
        a2.displayDetails(a2);

        // Display total number of accounts
        getTotalAccounts();
    }
}
