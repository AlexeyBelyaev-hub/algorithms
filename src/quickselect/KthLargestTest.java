package quickselect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void findKthLargest() {
        int [] ints = new int[]{3,2,1,5,6,4};
        KthLargest kthLargest = new KthLargest();
        int kthLargest1 = kthLargest.findKthLargest(ints, 2);
        Assertions.assertEquals(5,kthLargest1);
    }

    @Test
    void findKthLargest2() {
        int [] ints = new int[]{3,2,3,1,2,4,5,5,6};
        KthLargest kthLargest = new KthLargest();
        int kthLargest1 = kthLargest.findKthLargest(ints, 4);
        Assertions.assertEquals(4,kthLargest1);
    }

    @Test
    void findKthLargest3() {
        int [] ints = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        KthLargest kthLargest = new KthLargest();
        int kthLargest1 = kthLargest.findKthLargest(ints, 20);
        Assertions.assertEquals(2,kthLargest1);
    }
}