package AccessModifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public void displayInfo() {
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "SB12345";
        sa.accountHolder = "Priya";
        sa.setBalance(20000.0);

        sa.displayInfo();
        System.out.println("Balance (private via getter): ₹" + sa.getBalance());
    }
}
