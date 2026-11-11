package Recursion;
public class StingPlaindrome {
    public static boolean isPalindrome(String str, int s){
        if(s >= str.length()/2){
            return true;
        }
        if(str.charAt(s) != str.charAt(str.length() - s -1)){
            return false;
        }
        return isPalindrome(str, s + 1);

    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str,0));
    }
}