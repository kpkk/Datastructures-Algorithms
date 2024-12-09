package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class FruitsIntoBasket {

    @Test
    public void test(){
        int[] fruits={3,3,3,1,2,1,1,2,3,3,4};
        Assertions.assertEquals(5, totalFruit(fruits));
    }

    public int totalFruit(int[] fruits) {
        int left=0, right=0, maxFruits=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right<fruits.length){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
            if(map.size()>2){
                if(map.get(fruits[left])>1)
                    map.put(fruits[left], map.getOrDefault(fruits[left],0)-1);
                else
                    map.remove(fruits[left]);
                left++;
            }
            maxFruits= Math.max(maxFruits, right-left+1);
            right++;
        }
        return maxFruits;
    }
}
