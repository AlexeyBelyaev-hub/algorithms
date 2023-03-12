package map.topKFrequentlElement;

import java.util.*;

public class HeapApproach {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map1.put(nums[i], map1.getOrDefault(nums[i], 0)+1);
        }

        Map<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            treeMap.put(entry.getValue(), entry.getKey());
        }

        //We could use external object in comparator!!
        Queue<Integer> priorityQueue = new PriorityQueue((n1,n2) -> map1.get(n1) - map1.get(n2) );
        for (Integer key : map1.keySet()) {
            priorityQueue.add(key);
            if (priorityQueue.size()>k) priorityQueue.poll();
        }

        int[]res = new int[k];
        for (int i = 0; i<k;i++) {
            res[i] = priorityQueue.poll();
        }
        return res;

    }

}
