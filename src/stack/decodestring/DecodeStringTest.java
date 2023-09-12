package stack.decodestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecodeStringTest {

    @Test
    void decodeString1() {
        String s = "3[a]2[bc]";
        String expected = "aaabcbc";

        DecodeString decodeString = new DecodeString();
        Assertions.assertEquals(expected, decodeString.decodeString(s));
    }

    @Test
    void decodeString2() {
        String s = "3[a2[c]]";
        String expected = "accaccacc";

        DecodeString decodeString = new DecodeString();
        Assertions.assertEquals(expected, decodeString.decodeString(s));
    }

    @Test
    void decodeString3() {
        String s = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";

        DecodeString decodeString = new DecodeString();
        Assertions.assertEquals(expected, decodeString.decodeString(s));
    }
}