package stack.nextgreaterelement2;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElementsStack {
    public int[] nextGreaterElements(int[] nums) {

        Deque<Integer> stack = new ArrayDeque<>();
        int res[] = new int [nums.length];
        for (int i = nums.length * 2-1; i>=0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }

            res[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return res;
    }
}
