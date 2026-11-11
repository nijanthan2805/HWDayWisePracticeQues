package Recursion;

public class NLinear {
    public static void f(int x, int n){
        if(x > n) return;
        System.out.print(x + " ");
        f(x+1, n);
    }
    public static void main(String[] args) {
        f(1,5);
    }
}
