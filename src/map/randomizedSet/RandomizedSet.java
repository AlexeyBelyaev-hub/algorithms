package map.randomizedSet;

import java.util.*;

public class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random random;

    public RandomizedSet() {
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(map.containsKey(val)){
            int valIndex = map.get(val);
            int lastIndex = list.size()-1;
            int lastVal = list.get(lastIndex);

            swap(valIndex, lastIndex);
            map.put(lastVal, valIndex);
            list.remove(lastIndex);
            map.remove(val);
            return true;
        }
        return false;
    }

    private void swap(int i, int j) {
        int tmp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, tmp);
    }

    public int getRandom() {

        return list.get(random.nextInt(list.size()));
    }
}