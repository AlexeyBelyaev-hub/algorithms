package sum.threesum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreePointerSolutionTest {
    /**
     * Input: nums = [-1,0,1,2,-1,-4]
     *  * Output: [[-1,-1,2],[-1,0,1]]
     *  * Explanation:
     *  * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     *  * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     *  * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     *  * The distinct triplets are [-1,0,1] and [-1,-1,2].
     *  * Notice that the order of the output and the order of the triplets does not matter.
     */
    @Test
    void threeSum() {
        ThreePointerSolution threePointerSolution = new ThreePointerSolution();
        int[] ints1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threePointerSolution.threeSum(ints1);
        Assertions.assertEquals(2, lists.size());
        Assertions.assertTrue(lists.get(0).containsAll(List.of(-1,2)) && lists.get(1).containsAll(List.of(-1,0,1))
        || lists.get(0).containsAll(List.of(-1,0,1)) &&  lists.get(1).containsAll(List.of(-1,2)));

        int[] ints2 = {0,0,0,0};
        List<List<Integer>> lists2 = threePointerSolution.threeSum(ints2);
        Assertions.assertEquals(1, lists2.size());
        Assertions.assertTrue(lists2.get(0).containsAll(List.of(0)));

        int[] ints3 = {-2,0,1,1,2};
        List<List<Integer>> lists3 = threePointerSolution.threeSum(ints3);
        Assertions.assertEquals(2, lists3.size());
        Assertions.assertTrue(lists3.get(0).containsAll(List.of(-2,0,2)) && lists3.get(1).containsAll(List.of(-2,1,1))
                || lists3.get(0).containsAll(List.of(-2,1,1)) &&  lists3.get(1).containsAll(List.of(-2,0,2)));
    }

    @Test
    void threeSumHashSet() {
        HashSetSolution hashSetSolution = new HashSetSolution();
        int[] ints1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = hashSetSolution.threeSum(ints1);
        Assertions.assertEquals(2, lists.size());
        Assertions.assertTrue(lists.get(0).containsAll(List.of(-1,2)) && lists.get(1).containsAll(List.of(-1,0,1))
                || lists.get(0).containsAll(List.of(-1,0,1)) &&  lists.get(1).containsAll(List.of(-1,2)));

        int[] ints2 = {0,0,0,0};
        List<List<Integer>> lists2 = hashSetSolution.threeSum(ints2);
        Assertions.assertEquals(1, lists2.size());
        Assertions.assertTrue(lists2.get(0).containsAll(List.of(0)));

        int[] ints3 = {-2,0,1,1,2};
        List<List<Integer>> lists3 = hashSetSolution.threeSum(ints3);
        Assertions.assertEquals(2, lists3.size());
        Assertions.assertTrue(lists3.get(0).containsAll(List.of(-2,0,2)) && lists3.get(1).containsAll(List.of(-2,1,1))
                || lists3.get(0).containsAll(List.of(-2,1,1)) &&  lists3.get(1).containsAll(List.of(-2,0,2)));
    }
}