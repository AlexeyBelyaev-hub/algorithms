package map.topKFrequentlElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKFrequentElementTest {

    @Test
    void topKFrequent1() {
        int[] ints = {1, 1, 1, 2, 2, 3};
        HeapApproach heapApproach = new HeapApproach();
        int[] res = heapApproach.topKFrequent(ints, 2);
        Assertions.assertTrue(res[0]==1&&res[1]==2 || res[0]==2&&res[1]==1);
    }

    @Test
    void topKFrequent2() {
        int[] ints = {1,2};
        HeapApproach heapApproach = new HeapApproach();
        int[] res = heapApproach.topKFrequent(ints, 2);
        Assertions.assertTrue(res[0]==1&&res[1]==2 || res[0]==2&&res[1]==1);
    }

    @Test
    void topKFrequentQuickSelect() {
        int[] ints = {1, 1, 1, 2, 2, 3};
        QuickSelectApproach quickSelectApproach = new QuickSelectApproach();
        int[] res = quickSelectApproach.topKFrequent(ints, 2);
        Assertions.assertTrue(res[0]==1&&res[1]==2 || res[0]==2&&res[1]==1);
    }

    @Test
    void topKFrequentQuickSelect2() {
        int[] ints = {4,1,-1,2,-1,2,3};
        QuickSelectApproach quickSelectApproach = new QuickSelectApproach();
        int[] res = quickSelectApproach.topKFrequent(ints, 2);
        Assertions.assertTrue(res[0]==-1&&res[1]==-1);
    }

}