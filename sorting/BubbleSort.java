package org.example;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums){
        boolean swapped=false;
        for(int i=0;i<nums.length;i++){
            swapped=false;
            for(int j=0;j<nums.length-1;j++){
                // if the left ele is greater than right ele
                if(nums[j]>nums[j+1]){
                    // swap
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums={5,3,1,4,2};
        int[] output= bubbleSort(nums);
    }
}
