package Java_Exceptions.Bank_Transaction_System;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            // account.withdraw(-500);
            // account.withdraw(1500);
            account.withdraw(500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch ( InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
