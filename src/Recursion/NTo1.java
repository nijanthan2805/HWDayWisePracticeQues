package Recursion;

public class NTo1 {
    public static void f(int n){
        if(n < 1){
            return;
        }
        System.out.print (n + " ");
        f(n - 1);

    }
    public static void main(String[] args) {
        f(5);
    }
}
