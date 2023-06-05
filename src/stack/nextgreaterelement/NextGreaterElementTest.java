package stack.nextgreaterelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    void nextGreaterElement() {
        int[] nums1 = new int[] {4,1,2}, nums2 = new int[]{1,3,4,2};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] res = nextGreaterElement.nextGreaterElement(nums1, nums2);
        Assertions.assertEquals(-1, res[0]);
        Assertions.assertEquals(3, res[1]);
        Assertions.assertEquals(-1, res[2]);

    }

    @Test
    void nextGreaterElementStackAndMap() {
        int[] nums1 = new int[] {4,1,2}, nums2 = new int[]{1,3,4,2};
        NextGreaterElementStackAndMap nextGreaterElement = new NextGreaterElementStackAndMap();
        int[] res = nextGreaterElement.nextGreaterElement(nums1, nums2);
        Assertions.assertEquals(-1, res[0]);
        Assertions.assertEquals(3, res[1]);
        Assertions.assertEquals(-1, res[2]);

    }
}