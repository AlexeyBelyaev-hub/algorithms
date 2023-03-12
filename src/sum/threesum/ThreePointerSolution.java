package sum.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 */
public class ThreePointerSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Input: nums = [-1,0,1,2,-1,-4]
        Arrays.sort(nums); // O(n log n)
        //After sort nums = [-4,-1,-1,0,1,2]
        List<List<Integer>> res = new ArrayList<>();
        for (int i =0; i < nums.length-1 ; i++) {
            if (i==0 || nums[i]!=nums[i-1]) twoSum(nums, i, res);
        }
        return res;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> res) {
        int lo = i+1;
        int hi = nums.length-1;

        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum > 0) {
                hi--;
            } else if (sum < 0) {
                lo ++;
            }else {
                res.add(List.of(nums[i], nums[lo++], nums[hi--]));
                while (nums[lo] == nums[lo-1] && lo<hi) lo++; // control that values isn't repeatable
            }
        }
    }
}

/**
 * Time Complexity: O(n2)\mathcal{O}(n^2)O(n
 * 2
 *  ). twoSumII is O(n)\mathcal{O}(n)O(n), and we call it nnn times.
 *
 * Sorting the array takes O(nlog⁡n)\mathcal{O}(n\log{n})O(nlogn), so overall complexity is O(nlog⁡n+n2)\mathcal{O}(n\log{n} + n^2)O(nlogn+n
 * 2
 *  ). This is asymptotically equivalent to O(n2)\mathcal{O}(n^2)O(n
 * 2
 *  ).
 *
 * Space Complexity: from O(log⁡n)\mathcal{O}(\log{n})O(logn) to O(n)\mathcal{O}(n)O(n), depending on the implementation of the sorting algorithm. For the purpose of complexity analysis, we ignore the memory required for the output.
 */
