package binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchIn2DMatrix {

    @Test
    public void test(){
        int[][] matrtix ={{1,2,3},{4,5,6},{9,11,12}};
        Assertions.assertTrue(searchAlternate(matrtix, 5));
    }

    public boolean search(int[][] matrix, int target){
        int r=0, c=matrix[0].length-1;
        while (r<matrix.length && c>=0){
            if(matrix[r][c]== target) return true;
            else if(matrix[r][c]>target) c--;
            else r++;
        }
        return false;
    }

    public boolean searchAlternate(int[][] matrix, int target){
        int m= matrix.length;
        int n=matrix[0].length;
        int low=0, high= m*n-1;
        while (low<=high){
            int mid= (low+high)/2;
            int row= mid/n;
            int col= mid%n;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
