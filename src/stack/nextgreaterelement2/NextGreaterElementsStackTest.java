package stack.nextgreaterelement2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextGreaterElementsStackTest {

//    Input: nums = [1,2,1]
//    Output: [2,-1,2]
    @Test
    void nextGreaterElements() {
        int[] ints = {1, 2, 1};
        NextGreaterElementsStack nextGreaterElementsStack = new NextGreaterElementsStack();
        int[] res = nextGreaterElementsStack.nextGreaterElements(ints);
        Assertions.assertEquals(2, res[0]);
        Assertions.assertEquals(-1, res[1]);
        Assertions.assertEquals(2, res[2]);
    }
}