package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SubArraysWithKDiffIntegers {

    @Test
    public void test(){
        int[] nums={1,2,1,2,3};
        int k=2;
        Assertions.assertEquals(7, subarraysWithKDistinct(nums, k));
    }

    public int subarraysWithKDistinct(int[] nums, int k){
        return subArraysWithAtleastKIntegers(nums, k)-subArraysWithAtleastKIntegers(nums, k-1);
    }
    public int subArraysWithAtleastKIntegers(int[] nums, int k){
        int left=0, right=0, count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right<nums.length){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while (map.size()>k){
                if(map.get(nums[left])>1)
                    map.put(nums[left], map.getOrDefault(nums[left],0)-1);
                else map.remove(nums[left]);
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}
