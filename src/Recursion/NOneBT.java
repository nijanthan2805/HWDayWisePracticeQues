package Recursion;

public class NOneBT {
    public static void f(int x, int n){
        if(x > n){
            return;
        }
        f(x + 1, n);
        System.out.print(x + " ");
    }
    public static void main(String[] args) {
        f(1,5);
    }
}
