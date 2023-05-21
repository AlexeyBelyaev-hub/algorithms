package stack.temperature;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DailyTemperatureStack {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int l = temperatures.length;
        int[] res = new int[l];
        stack.push(new int[]{temperatures[0], 0});
        // Iterate over the array
        for (int i = 1; i < l; i++) {
            // Iterate over the stack - there are left only those elements which have non increase temperature
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                int prevPos = stack.pop()[1];
                res[prevPos] = i - prevPos;
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
