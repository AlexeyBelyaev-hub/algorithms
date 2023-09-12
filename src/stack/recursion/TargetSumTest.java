package stack.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {

    @Test
    void findTargetSumWays() {
         int [] nums = new int[]{1,1,1,1,1};
         int target = 3;
        TargetSum targetSum = new TargetSum();
        int targetSumWays = targetSum.findTargetSumWays(nums, target);
        Assertions.assertEquals(5, targetSumWays);

    }

    @Test
    void findTargetSumWaysMemorize() {
        int [] nums = new int[]{1,1,1,1,1};
        int target = 3;
        TargetSumMemoriz targetSum = new TargetSumMemoriz();
        int targetSumWays = targetSum.findTargetSumWays(nums, target);
        Assertions.assertEquals(5, targetSumWays);

    }
}