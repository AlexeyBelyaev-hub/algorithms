package sum.twosum2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointerSolutionTest {

    /**
     * Input: numbers = [2,7,11,15], target = 9
     *  * Output: [1,2]
     *  * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     *  * Example 2:
     *  *
     *  * Input: numbers = [2,3,4], target = 6
     *  * Output: [1,3]
     *  * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
     *  * Example 3:
     *  *
     *  * Input: numbers = [-1,0], target = -1
     *  * Output: [1,2]
     *  * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
     */
    @Test
    void twoSum() {
        TwoPointerSolution twoPointerSolution = new TwoPointerSolution();
        int[] ints1 = {2, 7, 11, 15};
        int[] res1 = twoPointerSolution.twoSum(ints1, 9);
        Assertions.assertTrue(res1[0]==1 && res1[1]==2);

        int[] ints2 = {2,3,4};
        int[] res2 = twoPointerSolution.twoSum(ints2, 6);
        Assertions.assertTrue(res2[0]==1 && res2[1]==3);

        int[] ints3 = {2,3,4,10,20,22};
        int[] res3 = twoPointerSolution.twoSum(ints3, 13);
        Assertions.assertTrue(res3[0]==2 && res3[1]==4);

    }
}