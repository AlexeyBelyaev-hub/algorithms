package sum.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapSolutionTest {

    /*
    Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
     */
    @Test
    void twoSum() {
        HashMapSolution hashMapSolution = new HashMapSolution();
        int[] ints1 = {2, 7, 11, 15};
        int[] res1 = hashMapSolution.twoSum(ints1, 9);
        Assertions.assertTrue( (res1[0] == 0 && res1[1] == 1) || (res1[0] == 1 && res1[1] == 0) );

    }

}