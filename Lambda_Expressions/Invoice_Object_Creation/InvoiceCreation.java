package Lambda_Expressions.Invoice_Object_Creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> txnIds = Arrays.asList("TX1001", "TX1002", "TX1003");

        // Constructor reference to create Invoice objects
        List<Invoice> invoices = txnIds.stream().map(Invoice::new).collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}