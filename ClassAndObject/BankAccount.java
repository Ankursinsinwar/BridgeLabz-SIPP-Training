package ClassAndObject;

// Class Definition
public class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Rs. " + amount + " deposited successfully.");
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rs. " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Main method
    public static void main(String[] args) {

        // create account object
        BankAccount account = new BankAccount("Ankur", "SBIN123456", 10000);

        System.out.println("\n=== ATM Operations ===");
        account.displayBalance();
        account.deposit(5000);
        account.withdraw(4000);
        account.withdraw(20000); // test insufficient case
        account.displayBalance();
    }
}
