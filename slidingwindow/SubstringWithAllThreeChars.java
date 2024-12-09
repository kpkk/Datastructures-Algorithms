package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberOfSubSttingsWithAllChars {

    @Test
    public void test(){
        String s="abcabc";
        Assertions.assertEquals(10, numberOfSubstrings(s));
    }

    public int numberOfSubstrings(String s) {
        int[] freq= new int[3];
        int count=0;
        Arrays.fill(freq, -1);
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']=i;
            if(freq[0]!=-1 && freq[1]!=-1 &&  freq[2]!=-1){
                count += 1+ Math.min(Math.min(freq[0], freq[1]), freq[2]);
            }
        }
        return count;
    }


}
