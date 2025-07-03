package Inheritance.Multilevel_Inheritance;

// Base class
class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order: " + orderId + " placed on: " + orderDate;
    }
}

// First-level subclass
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + "\nOrder shipped. Tracking Number: " + trackingNumber;
    }
}

// Second-level subclass
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + "\nOrder delivered on " + deliveryDate;
    }
}

// Demo class
public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("ORD101", "02-07-2025");
        ShippedOrder o2 = new ShippedOrder("ORD102", "30-06-2025", "TRK999888");
        DeliveredOrder o3 = new DeliveredOrder("ORD103", "28-06-2025", "TRK123456", "02-07-2025");

        System.out.println(o1.getOrderStatus() + "\n---------------");
        System.out.println(o2.getOrderStatus() + "\n---------------");
        System.out.println(o3.getOrderStatus() + "\n---------------");
    }
}
