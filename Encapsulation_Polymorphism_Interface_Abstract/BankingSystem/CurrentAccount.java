package Encapsulation_Polymorphism_Interface_Abstract.BankingSystem;

class CurrentAccount extends BankAccount {
    private final double interestRate = 0.01; // 1% annual

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
