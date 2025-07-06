package Encapsulation_Polymorphism_Interface_Abstract.BankingSystem;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters (Encapsulation)
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    public void printAccountSummary() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Interest: Rs. " + calculateInterest());
        if (this instanceof Loanable) {
            Loanable loanable = (Loanable) this;
            System.out.println("Loan Eligibility: Rs. " + loanable.calculateLoanEligibility());
        }
        System.out.println("--------------------------------------");
    }
}
