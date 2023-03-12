package map.slidingwindow;

import java.util.*;

public class LengthOfLongestSubstring {

    // Time complexity 2N
    // Space complexity k - non repeatable chars - maximum s.length()
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;

        int count=0;
        // N - полный обход по внешнему циклу,
        for (; right<s.length(); right++) {
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            // В ходшем случае пройти столько же N, в итоге 2N
            while (map.get(c)>1) {
                char l = s.charAt(left);
                map.put(l, map.get(c)-1);
                left++;
            }
            count = Math.max(count, right - left +1);

        }

        return count;


    }
}
