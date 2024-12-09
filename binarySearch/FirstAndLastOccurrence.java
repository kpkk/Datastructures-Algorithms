package binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastOccurrence {

    @Test
    public void test(){
        int[] nums= {1,2,3,5,6,8,8,8,9,10};
        Assertions.assertEquals(Arrays.asList(5,6), findFirstAndLastOccurrence(nums, 8));
    }

    public List<Integer> findFirstAndLastOccurrence(int[] nums, int k){
        int first = binarySearch(nums, k, true);
        int last= binarySearch(nums, k, false);
        return Arrays.asList(first, last);
    }

    public int binarySearch(int[] nums, int k, boolean findFirst){
        int low=0, high= nums.length-1;
        int ans=0;
        while (low<=high){
            int mid= (low+high)/2;
            if(nums[mid]==k) {
                ans=mid;
                if(findFirst) high=mid-1;
                else low=mid+1;
            }
            else if (nums[mid]>k){
                high=mid-1;
            }else low=mid+1;

        }
        return ans;
    }
}
