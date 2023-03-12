package map.intersection;

import java.util.LinkedList;
import java.util.List;

// Time complexity n*m, space complexity 1
public class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length>nums2.length) return intersect(nums2, nums1);

        List<Integer> result = new LinkedList<>();
        for(int i = 0; i < nums1.length; i++) {
            int n1 = nums1[i];
            for(int j = 0; j < nums2.length; j++) {
                int n2 = nums2[j];
                if (n1 == n2) {
                    result.add(n1);
                    nums1[i] = -1;
                    nums2[j] = -1;
                    break;
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
