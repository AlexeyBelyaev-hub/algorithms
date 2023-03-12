package mergetwosortedarrays;

import java.util.stream.Stream;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid=m-1;
        for (int i=nums1.length-1; i>=mid; i--) {
            //Сравниваем последние элементы
            if(nums1[m-1]>nums2[n-1]) {
                nums1[i] = nums1[m-1];
                m--;
            } else {
                nums1[i] = nums2[n-1];
                n--;
            }
        }

        int [][] twoDim = new int[2][];

    }
}
