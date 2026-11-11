package Day1;

public class Order {

    int orderId;

    String customerName;

    String productName;

    int quantity;

    double price;

    Order(int orderId, String customerName,

          String productName, int quantity, double price) {

        this.orderId = orderId;

        this.customerName = customerName;

        this.productName = productName;

        this.quantity = quantity;

        this.price = price;

    }

    public String toString() {

        return orderId + " " + customerName + " "

                + productName + " " + quantity + " " + price;
    }
}

