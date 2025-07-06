package Encapsulation_Polymorphism_Interface_Abstract.BankingSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SB001", "Ankur", 50000);
        BankAccount acc2 = new CurrentAccount("CA001", "David", 100000);

        accounts.add(acc1);
        accounts.add(acc2);

        // Demonstrate functionality
        for (BankAccount account : accounts) {
            account.deposit(5000);
            account.withdraw(2000);
            account.printAccountSummary();
        }

        // Apply for loan (polymorphic call to Loanable)
        if (acc1 instanceof Loanable) {
            Loanable loanAcc = (Loanable) acc1;
            loanAcc.applyForLoan(40000);
        }
    }
}
