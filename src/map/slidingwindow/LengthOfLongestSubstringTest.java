package map.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

class LengthOfLongestSubstringTest {

    LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();

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