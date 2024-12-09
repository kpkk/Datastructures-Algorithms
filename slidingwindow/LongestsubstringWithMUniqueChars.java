package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKuniqueChars {

    @Test
    public void test(){
        String s="aabbcc";
        int k=1;
        Assertions.assertEquals(2, lengthOfLongestSUbString(s, k));
    }

    @Test
    public void test1(){
        String s="aabbcc";
        int k=3;
        Assertions.assertEquals(6, lengthOfLongestSUbString(s, k));
    }
    @Test
    public void test2(){
        String s="aaabbb";
        int k=3;
        Assertions.assertEquals(0, lengthOfLongestSUbString(s, k));
    }

    public int lengthOfLongestSUbString(String s , int k){

        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, right=0, maxLen=0;
        while (right<s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while (map.size()>k){
                if(map.get(s.charAt(left))>1){
                    map.put(s.charAt(left), map.getOrDefault(s.charAt(left),0)-1);
                }else {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if(map.size()==k)
                maxLen= Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}
