package Encapsulation_Polymorphism_Interface_Abstract.BankingSystem;

class SavingsAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.04; // 4% annual

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings account loan request: ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;  // Can take loan up to 2x balance
    }
}
