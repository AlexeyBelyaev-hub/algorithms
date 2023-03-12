package map.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLongestSubstringOptimizedTest {

    LengthOfLongestSubstringOptimized lengthOfLongestSubstring = new LengthOfLongestSubstringOptimized();

    @Test
    void lengthOfLongestSubstring1() {
        int pwwkew = lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, pwwkew);
    }

    @Test
    void lengthOfLongestSubstring2() {
        int i = lengthOfLongestSubstring.lengthOfLongestSubstring(" ");
        Assertions.assertEquals(1, i);
    }

    @Test
    void lengthOfLongestSubstring3() {
        int dvdf = lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf");
        Assertions.assertEquals(3, dvdf);
    }

}