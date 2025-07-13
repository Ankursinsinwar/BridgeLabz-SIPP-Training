package SortingAlgorithms;

import java.util.Scanner;

public class JobApplicantSorter {
    static class JobApplicant {
        private String name;
        private int expectedSalary;

        public JobApplicant(String name, int expectedSalary) {
            this.name = name;
            this.expectedSalary = expectedSalary;
        }

        public int getExpectedSalary() {
            return expectedSalary;
        }

        public String getName() {
            return name;
        }
    }

    public void heapSort(JobApplicant[] applicants) {
        int n = applicants.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(applicants, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            JobApplicant temp = applicants[0];
            applicants[0] = applicants[i];
            applicants[i] = temp;

            heapify(applicants, i, 0);
        }
    }

    private void heapify(JobApplicant[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].getExpectedSalary() > arr[largest].getExpectedSalary()) {
            largest = left;
        }

        if (right < n && arr[right].getExpectedSalary() > arr[largest].getExpectedSalary()) {
            largest = right;
        }

        if (largest != i) {
            JobApplicant swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public void display(JobApplicant[] applicants) {
        System.out.println("\nApplicants sorted by expected salary (ascending):");
        for (JobApplicant applicant : applicants) {
            System.out.println(applicant.getName() + " - Rs. " + applicant.getExpectedSalary());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobApplicantSorter sorter = new JobApplicantSorter();

        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();
        sc.nextLine();

        JobApplicant[] applicants = new JobApplicant[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of applicant " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter expected salary of " + name + ": ");
            int salary = sc.nextInt();
            sc.nextLine();

            applicants[i] = new JobApplicant(name, salary);
        }

        sorter.heapSort(applicants);
        sorter.display(applicants);
        sc.close();
    }
}
