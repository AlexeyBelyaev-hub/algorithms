package sum.threesumsmaller;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i<nums.length; i++) {
            res = res + twoSum(nums, i, target);
        }
        return res;
    }

    private int twoSum(int[] nums, int i, int target) {
        int res = 0;
        int j = i+1;

        while (j<nums.length-1) {
            int k = j+1;
            while(k<nums.length) {
                int sum = nums[i] + nums[j]+nums[k++];
                if (sum < target) res++;
            }
            j++;
        }
        return res;
    }
}
