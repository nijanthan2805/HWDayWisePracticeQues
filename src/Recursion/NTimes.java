package Recursion;

public class NTimes {
    public static void f(int x, int n){
        if(x > n){
            return;
        }
        System.out.println("Varun");
        f(x+1, n);

    }

    public static void main(String[] args) {
        int n = 5;
        f(1, n);
    }
}
