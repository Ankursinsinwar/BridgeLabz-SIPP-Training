package Lambda_Expressions.Invoice_Object_Creation;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }


    public String toString() {
        return "Invoice for Txn: " + transactionId;
    }
}