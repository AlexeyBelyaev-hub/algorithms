package stack.recursion;

public class TargetSumMemoriz {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        calculate(nums, 0, 0, target);
        return count;
    }

    private void calculate(int [] nums, int i, int sum, int S) {
        System.out.println("sum=" + sum);
        System.out.println("i=" + i);
        if (nums.length == i) {
            if (S == sum) {
                count++;
            }
            return;
        }

        calculate (nums, i + 1, sum + nums[i], S);
        calculate (nums, i + 1, sum - nums[i], S);
    }

}
