package Recursion;
public class SumNFunctional {
    public static int f(int n){
        if(n < 1) {
            return 0;
        }
        return n + f(n-1);
    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
//package Recursion;
//public class SumNFunctional {
//    static int sum = 0;
//    public static int f(int n){
//        if(n < 1){
//            return sum;
//        }
//        sum += n;
//        f(n - 1);
//        return sum;
//    }
//    public static void main(String[] args) {
//        System.out.println(f(5));
//    }
//}
