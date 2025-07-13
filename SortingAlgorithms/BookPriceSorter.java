package SortingAlgorithms;

import java.util.Scanner;

public class BookPriceSorter {

    static class Book {
        private String title;
        private double price;

        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getTitle() {
            return title;
        }
    }

    public void mergeSort(Book[] books, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(books, left, mid);
            mergeSort(books, mid + 1, right);
            merge(books, left, mid, right);
        }
    }

    private void merge(Book[] books, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Book[] leftArr = new Book[n1];
        Book[] rightArr = new Book[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = books[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = books[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].getPrice() <= rightArr[j].getPrice()) {
                books[k++] = leftArr[i++];
            } else {
                books[k++] = rightArr[j++];
            }
        }

        while (i < n1) books[k++] = leftArr[i++];
        while (j < n2) books[k++] = rightArr[j++];
    }

    public void display(Book[] books) {
        System.out.println("\nBooks sorted by price:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - Rs. " + book.getPrice());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookPriceSorter sorter = new BookPriceSorter();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = sc.nextLine();

            System.out.print("Enter price of \"" + title + "\": ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(title, price);
        }

        sorter.mergeSort(books, 0, n - 1);
        sorter.display(books);
        sc.close();
    }
}
