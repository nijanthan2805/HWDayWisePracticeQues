package Day3;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,3, 4,0,23};
        int j = 0;
        for(int i = 0  ; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(
                Arrays.toString(nums)
        );
    }
}
