package quickselect;

import java.util.Arrays;

public class KthLargest {

    private int count = 0;
    int [] nums;
    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        int i = quickselect( 0, nums.length-1, nums.length - k);
        return nums[i];
    }

    private int quickselect( int left, int right, int k) {
        if (left == right) // If the list contains only one element,
            return left;  // return that element

        int split = partition(left, right);
        if (split==k) return split;
        if (split < k) {
            System.out.println("Move right -->");
            split = quickselect(split + 1, right, k);
        } else {
            System.out.println("Move left <--");
            split = quickselect(left, split - 1, k);
        }

        return split;
    }

    private int partition(int left, int right) {
        System.out.println("Partition "+count++);
        System.out.println("Right: "+right);
        int pivot = nums[right];
        int i = left;
        while (left < right) {
            if(nums[left] < pivot) {
                swap(nums, left, i);
                i++;
            }
            left++;
        }
        swap(nums, i, right);
        System.out.println(Arrays.toString(nums));
        System.out.println("i = " + i);
        return i;
    }

    private void swap(int[]nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
