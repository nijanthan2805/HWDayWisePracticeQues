package Recursion;

public class OneNBackTrack {
    public static void f(int n){
        if(n < 1) return;
        f(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        f(5);
    }
}
