package Day3;

public class ReverseHalf{
    public static void main(String[] args){

        int[] a = {1,2,3, 4, 5, 6,7, 8, 9};
        int i = 0;
        int j;
        if (a.length % 2 == 0) {
            j = a.length / 2;
        } else {
            j = (a.length / 2) + 1;
        }
        for(; i<j; i++,j--)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
