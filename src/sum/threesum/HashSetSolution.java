package sum.threesum;

import java.util.*;

public class HashSetSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Input: nums = [-1,0,1,2,-1,-4]
        Arrays.sort(nums);
        //After sort nums = [-4,-1,-1,0,1,2]
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i<nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i]!=nums[i-1]) twoSum2(nums, i, res);
        }
        return res;
    }

    private void twoSum2(int[] nums, int i, List<List<Integer>> res) {

        Set<Integer> set = new HashSet<>();
        int j = i+1;
        while ( j<nums.length ) {
            int compliment = - nums[i] - nums[j];
            if (set.contains(compliment)) {
                res.add(List.of(nums[i], nums[j++], compliment));
                while (j<nums.length && nums[j]==nums[j-1]) j++; //control duplicated elements - !Require NO-DECREASE order
            } else {
                set.add(nums[j++]);
            }
        }
    }
}
