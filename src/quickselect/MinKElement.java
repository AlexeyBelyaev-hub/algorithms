package quickselect;

public class MinKElement {

    public int getMinKElement(int[] nums, int k) {

        int split = partition(nums,0,nums.length-1);
        while ( (split+1)!= k) {
            if (split > k) {
                split = partition(nums, 0, split-1);
            }else {
                split = partition(nums, split, nums.length-1);
            }
        }
        return nums[split];
    }

    public int partition(int[] nums, int left, int right){
        int pivot = nums[right];
        int i = left;
        left = left-1;
        while (i<right) {
            if (nums[i]<=pivot) {
                swap(nums, left + 1, i);
                i++;
                left++;
            } else {
                i++;
            }
        }
        swap(nums, left+1, right);
        return left+1;
    }
    private void swap(int [] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
