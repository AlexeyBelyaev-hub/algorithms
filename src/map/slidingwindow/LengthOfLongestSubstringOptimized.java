package map.slidingwindow;

import java.util.HashMap;

public class LengthOfLongestSubstringOptimized {

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
            if (map.containsKey(c))
                left = Math.max(map.get(c), left);
            count = Math.max(count, right - left +1);
            map.put(c,right+1);

            count = Math.max(count, right - left +1);

        }

        return count;


    }
}
