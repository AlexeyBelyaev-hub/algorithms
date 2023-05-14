package queue.openthelock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OpenTheLockTest {

    /**
     * Example 1:
     *
     * Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
     * Output: 6
     * Explanation:
     * A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
     * Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
     * because the wheels of the lock become stuck after the display becomes the dead end "0102".
     */
    @Test
    void openLock() {
        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        String target = "0202";
        int expected = 6
                ;
        OpenTheLock openTheLock = new OpenTheLock();
        Assertions.assertEquals(expected, openTheLock.openLock(deadends, target));
    }
}