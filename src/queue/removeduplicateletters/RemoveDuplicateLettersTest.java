package queue.removeduplicateletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicateLettersTest {

//    Example 1:
//    Input: s = "bcabc"
//    Output: "abc"

//    Example 2:
//    Input: s = "cbacdcbc"
//    Output: "acdb"

    @Test
    void removeDuplicateLetters1() {
        String s = "bcabc";
        RemoveDuplicateLettersStack removeDuplicateLettersStack = new RemoveDuplicateLettersStack();
        String res = removeDuplicateLettersStack.removeDuplicateLetters(s);
        Assertions.assertEquals("abc", res);

    }

    @Test
    void removeDuplicateLetters2() {
        String s = "cbacdcbc";
        RemoveDuplicateLettersStack removeDuplicateLettersStack = new RemoveDuplicateLettersStack();
        String res = removeDuplicateLettersStack.removeDuplicateLetters(s);
        Assertions.assertEquals("acdb", res);

    }
//    Input s = "ecbacba"
//    Expected ="eacb"
@Test
    void removeDuplicateLetters3() {
        String s = "ecbacba";
        RemoveDuplicateLettersStack removeDuplicateLettersStack = new RemoveDuplicateLettersStack();
        String res = removeDuplicateLettersStack.removeDuplicateLetters(s);
        Assertions.assertEquals("eacb", res);

    }
}