package SortingAlgorithms;

import java.util.Scanner;

public class EmployeeIDSorter {

    static class Employee {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public void insertionSort(Employee[] employees) {
        int n = employees.length;

        for (int i = 1; i < n; i++) {
            Employee key = employees[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && employees[j].getId() > key.getId()) {
                employees[j + 1] = employees[j];
                j--;
            }

            employees[j + 1] = key;
        }
    }

    public void display(Employee[] employees) {
        System.out.println("\nEmployees sorted by ID (ascending):");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - ID: " + emp.getId());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeIDSorter sorter = new EmployeeIDSorter();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter ID of " + name + ": ");
            int id = sc.nextInt();
            sc.nextLine();

            employees[i] = new Employee(name, id);
        }

        sorter.insertionSort(employees);
        sorter.display(employees);
        sc.close();
    }
}
