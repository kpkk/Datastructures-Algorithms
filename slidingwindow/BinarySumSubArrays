package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BinarySubArrayswithSum {

    @Test
    public void test(){
        int[] nums={1,0,1,0,1};
        Assertions.assertEquals(4, numSubarraysWithSum(nums, 2));
    }
    @Test
    public void test1(){
        int[] nums={1,0,1,0,1};
        Assertions.assertEquals(4, subArraysWithSum(nums, 2));
    }

    @Test
    public void test2(){
        int[] nums={0,0,0,0,0};
        Assertions.assertEquals(15, subArraysWithSum(nums, 0));
    }

    public int subArraysWithSum(int[] nums, int goal){
        if(goal==0)  return findSubArraysOfSumLessThanK(nums, goal);
        return findSubArraysOfSumLessThanK(nums, goal)- findSubArraysOfSumLessThanK(nums, goal-1);
    }

    public int findSubArraysOfSumLessThanK(int[] nums, int k){
        int sum=0, left=0, right=0, count=0;
        while (right<nums.length){
            sum+=nums[right];
            while (sum>k){
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }

  // prefix sum approach
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0, count=0;;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
