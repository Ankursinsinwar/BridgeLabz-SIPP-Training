package ObjectModeling.Bank_And_AccountHolders;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        Customer customer = new Customer("Ankur", 5000.0);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}
