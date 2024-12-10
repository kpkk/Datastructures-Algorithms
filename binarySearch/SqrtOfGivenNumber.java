package binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRoot {

    @Test
    public void test(){
        int x=8;
        Assertions.assertEquals(2, mySqrt(x));
    }

    public int mySqrt(int x){
        int low=1, high=x, ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid<=x/mid) {
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}
