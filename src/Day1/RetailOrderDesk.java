package Day1;

import java.util.*;

public class RetailOrderDesk {

    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== RETAIL ORDER DESK =====");
            System.out.println("1. Add Order");
            System.out.println("2. Display Orders");
            System.out.println("3. Remove Order");
            System.out.println("4. Update Order");
            System.out.println("5. Sort by Order ID");
            System.out.println("6. Sort by Customer Name");
            System.out.println("7. Sort by Product Name");
            System.out.println("8. Sort by Price");
            System.out.println("9. Binary Search");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addOrder();
                    break;

                case 2:
                    displayOrders();
                    break;

                case 3:
                    removeOrder();
                    break;

                case 4:
                    updateOrder();
                    break;

                case 5:
                    sortById();
                    break;

                case 6:
                    sortByCustomer();
                    break;

                case 7:
                    sortByProduct();
                    break;

                case 8:
                    sortByPrice();
                    break;

                case 9:
                    binarySearch();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 10);
    }
    static void addOrder() {

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        orders.add(new Order(id, customer, product, quantity, price));
        System.out.println("Order Added!");
    }

    // Display Orders
    static void displayOrders() {
        for (int i = 0;i <orders.size();i++) {
            System.out.println(orders.get(i));
        }
    }

    // Remove Order
    static void removeOrder() {
        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        for (int i = 0; i< orders.size();i++) {
            if (orders.get(i).orderId == id) {
                orders.remove(i);
                System.out.println("Order Removed!");
                return;
            }
        }

        System.out.println("Order Not Found!");
    }

    // Update Order
    static void updateOrder() {

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < orders.size(); i++) {

            if (orders.get(i).orderId == id) {

                System.out.print("Enter Customer Name: ");
                orders.get(i).customerName = sc.nextLine();

                System.out.print("Enter Product Name: ");
                orders.get(i).productName = sc.nextLine();

                System.out.print("Enter Quantity: ");
                orders.get(i).quantity = sc.nextInt();

                System.out.print("Enter Price: ");
                orders.get(i).price = sc.nextDouble();

                System.out.println("Order Updated!");
                return;
            }
        }

        System.out.println("Order Not Found!");
    }

    // Sort by Order ID
    static void sortById() {

        for (int i = 0; i <orders.size();i++) {
            for (int j = 0; j < (orders.size() - 1); j++) {
                if (orders.get(j).orderId >orders.get(j + 1).orderId) {
                    Order temp =orders.get(j);
                    orders.set(j,orders.get(j + 1));
                    orders.set(j + 1,temp);
                }
            }
        }

        displayOrders();
    }

    // Sort by Customer Name
    static void sortByCustomer() {
        for (int i = 0; i< orders.size();i++) {
            for (int j =0; j< orders.size() - 1; j++) {
                if (orders.get(j).customerName.compareTo(orders.get(j + 1).customerName) > 0) {
                    Order temp =orders.get(j);
                    orders.set(j,orders.get(j +1));
                    orders.set(j +1,temp);
                }
            }
        }
        displayOrders();
    }

    // Sort by Product Name
    static void sortByProduct() {
        for (int i =0; i <orders.size(); i++) {
            for (int j = i + 1; j< orders.size(); j++) {
                if (orders.get(i).productName.compareTo(orders.get(j).productName) > 0) {
                    Order temp = orders.get(i);
                    orders.set(i, orders.get(j));
                    orders.set(j, temp);
                }
            }
        }
        displayOrders();
    }
    static void sortByPrice() {
        for (int i = 0; i < orders.size();i++) {
            for (int j = i + 1; j <orders.size();j++) {
                if (orders.get(i).price > orders.get(j).price) {
                    Order temp =orders.get(i);
                    orders.set(i, orders.get(j));
                    orders.set(j, temp);
                }
            }
        }
        displayOrders();
    }
    // Binary Search
    static void binarySearch() {
        sortById();
        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        int low = 0;
        int high = orders.size() - 1;
        while (low <= high) {
            int mid = (low + high)/ 2;
            if (orders.get(mid).orderId== id) {
                System.out.println("Order Found: " + orders.get(mid));
                return;
            }
            else if (orders.get(mid).orderId <id) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        System.out.println("Order Not Found!");
    }
}