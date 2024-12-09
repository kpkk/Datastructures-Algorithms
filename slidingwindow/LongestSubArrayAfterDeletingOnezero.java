package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubArrayAfterDeletingOneZero {

    @Test
    public void test(){
        int[] nums={1,1,0,1};
        Assertions.assertEquals(3, longestSubarray(nums));
    }

    public int longestSubarray(int[] nums){
        int left=0, right=0, toDel=1, maxLen=0;
        while (right<nums.length){
            if(nums[right]==0) toDel--;
            if(toDel<0){
                if(nums[left++]==0) toDel++;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen-1;
    }
}
