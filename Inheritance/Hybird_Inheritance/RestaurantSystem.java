package Inheritance.Hybird_Inheritance;

// Superclass: Person
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayPerson() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef inherits Person and implements Worker
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking meals.");
    }
}

// Subclass: Waiter inherits Person and implements Worker
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

// Demo Class
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101);
        Waiter waiter = new Waiter("Aman", 202);

        chef.displayPerson();
        chef.performDuties();

        System.out.println("---");

        waiter.displayPerson();
        waiter.performDuties();
    }
}
