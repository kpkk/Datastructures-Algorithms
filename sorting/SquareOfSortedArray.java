package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;
import java.util.Map;

public class SqauresOfSortedArray {

    @Test
    public void test(){
        int[] nums={-4,-1,0,3,10};
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, sortedSquares(nums));
    }

    public int[] sortedSquares(int[] nums){
        int[] output=new int[nums.length];
        int left=0, right=nums.length-1;
        for (int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                output[i]=nums[left]*nums[left];
                left++;
            }else {
                output[i]=nums[right]*nums[right];
                right--;
            }

        }
        return output;
    }
}
