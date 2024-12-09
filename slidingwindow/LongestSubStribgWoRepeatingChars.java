package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class LenOfLargestSubStringWoRepeatChars {

    @Test
    public void test(){
        String s="abcabcbb";
        Assertions.assertEquals(3, longestSubStringWoRepeatCharsAscii(s));
    }

    @Test
    public void test1(){
        String s="pwwkew";
        Assertions.assertEquals(3, longestSubStringWoRepeatChars(s));
    }

    public int longestSubStringWoRepeatChars(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, right=0, maxLen=Integer.MIN_VALUE;
        while (right<s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            while (map.get(s.charAt(right))>1){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }

    public int longestSubStringWoRepeatCharsAscii(String s){
        int[] ascii=new int[128];
        int left=0, right=0, maxLen=Integer.MIN_VALUE;
        while (right<s.length()){
            ascii[s.charAt(right)]++;
            while (ascii[s.charAt(right)]>1){
                ascii[s.charAt(left++)]--;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}
