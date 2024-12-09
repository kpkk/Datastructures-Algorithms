package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@Test
    public void test(){
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        Assertions.assertEquals(6, maxConsecutiveOnes(nums, k));
    }

    public int consecutiveOnes(int[] nums, int k){
        int left=0, right=0, maxLen=0, zeroCount=0;
        while (right< nums.length){
            if(nums[right]==0) zeroCount++;
            while (zeroCount>k){
               if(nums[left++]==0) zeroCount--;
            }
            if(zeroCount<=k)
                maxLen=Math.max(maxLen, right-left+1);
            right++;
        }

        return maxLen;
    }

    public int maxConsecutiveOnes(int[] nums, int k){
        int left=0, right=0, maxLen=0;
        while (right<nums.length){
            if(nums[right]==0) k--;
            while (k<0){
                if(nums[left++]==0) k++;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
