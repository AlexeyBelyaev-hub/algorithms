package map.topKFrequentlElement;

import java.util.*;

public class QuickSelectApproach {
    int[] unique;
    Map<Integer, Integer> map1;
    public int[] topKFrequent(int[] nums, int k) {
        map1 = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map1.put(nums[i], map1.getOrDefault(nums[i], 0)+1);
        }

        //1,2,3
        //| | |
        //3 2 1

        unique = new int[map1.size()];
        int i=0;
        for (int key : map1.keySet()) {
            unique[i++] = key;
        }

        quickSelect(0, unique.length-1, k);

        return Arrays.copyOfRange(unique, unique.length - k, unique.length);

    }

    private void quickSelect(int left, int right, int k) {

        if(k>=unique.length) return;
        int split = partition(0, unique.length-1);
        while(split+1 != unique.length-k) {
            if (split< unique.length-k) {
                split = partition(split, unique.length-1);
            } else {
                split = partition(0, split-1);
            }
        }

    }

    private int partition(int left, int right) {


        int i = left-1;
        int pivot = unique[right];
        int pivotFreq = map1.get(pivot);
        while(left<right) {
            int LE = unique[left];
            int LFR = map1.get(LE);
            if(LFR <= pivotFreq) {
                swap(i+1, left);
                left++;
                i++;
            } else {
                left++;
            }
        }
        swap(i+1, right);
        return i+1;
    }

    private void swap (int i, int j) {
        int tmp = unique[i];
        unique[i] = unique[j];
        unique[j] = tmp;
    }


}
