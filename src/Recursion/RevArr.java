package Recursion;

import java.util.Arrays;

public class RevArr {
    public static void f(int i, int[] arr){
        if(i >= arr.length / 2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        f(i + 1, arr);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = arr.length;
        f(0, arr);
        System.out.println((Arrays.toString(arr)));
    }
}
//public class RevArr {
//    public static void f(int[] arr, int l, int r){
//        if(l >= r){
//            return;
//        }
//        int temp = arr[l];
//        arr[l] = arr[r];
//        arr[r] = temp;
//        f(arr, l+1, r-1);
//    }
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int n = arr.length;
//        f(arr, 0, n-1);
//    }
//}
