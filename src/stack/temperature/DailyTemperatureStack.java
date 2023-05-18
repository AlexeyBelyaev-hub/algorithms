package stack.temperature;

import java.util.Stack;

public class DailyTemperatureStack {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int l = temperatures.length;
        int[]res = new int[l];
        int count = 0;
        stack.push(new int[]{temperatures[l-1], count});
        for (int i = l - 2; i>=1; i--) {
            if (temperatures[i-1] < temperatures[i]) {
                count = 1;
            } else {
                count++;
            }
            stack.push(new int[]{temperatures[i], count});

        }

        for (int i = 0; i < l; i++) {
            res[i] = stack.pop()[1];
        }
        return res;
    }
}
