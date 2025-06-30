package ObjectModeling.Bank_And_AccountHolders;

class Bank {
     String name;

    Bank(String name) {
        this.name = name;
    }

    
    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " at " + name);
    }
}
