package Recursion;

public class SumNParameter {
    public static void f(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        f(n -1, sum + n);
    }
    public static void main(String[] args) {
        f(5, 0);
    }
}
