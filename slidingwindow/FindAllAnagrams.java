package slidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInAString {

    @Test
    public void test(){
        String s="cbaebabacd";
        String p="abc";
        Assertions.assertEquals(Arrays.asList(0,6),findAnagrams(s, p));
    }

    public List<Integer> findAnagrams(String s, String p){
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        if(sMap.equals(pMap)) list.add(0);
        for (int i=p.length();i<s.length();i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
            char ch = s.charAt(i - p.length());
            if (sMap.containsKey(ch)){
                if(sMap.get(ch)>1)
                    sMap.put(ch, sMap.getOrDefault(ch,0)-1);
                else
                    sMap.remove(ch);
            }
            if(sMap.equals(pMap))
                list.add(i-p.length()+1);

        }
        return list;
    }
}
