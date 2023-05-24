package stack.nextgreaterelement;

public class NextGreaterElement {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            int []res = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {

                boolean search = false;
                int searchElement = nums1[i];
                int nextGreater = -1;
                for(int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        search = true;
                    } else if (search && searchElement < nums2[j]) {
                        nextGreater = nums2[j];
                        break;
                    }
                }
                res[i] = nextGreater;
            }
            return res;
        }



}
