package Day2;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("bmw", 5000000);
        cars.put("audi", 4000000);
        cars.put("benz", 6000000);
        cars.put("tesla", 7000000);
        for (String car : cars.keySet()) {
            System.out.println(car + "=" + cars.get(car));
        }
    }

    public static class Order {

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

    public static class ReverseSubstring {
        public static void main(String[] args) {
            String str = "my name is asha";
            String[] arr = str.split(" ");
            for(int i =0;i<arr.length;i++) {
                Stack<Character> st = new Stack<>();
                for(int j =0; j< arr[i].length();j++) {
                    st.push(arr[i].charAt(j));
                }
                while(!st.isEmpty()) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
    }
}