package org.example;

public class SelectionSort {

    public static int[] selectionSort(int[] nums){
        for (int i=0;i<nums.length;i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            // swap i, minIndex
            int temp= nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums={5,3,1,2,4};
        selectionSort(nums);

    }
}
