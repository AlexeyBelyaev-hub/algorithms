package stack.temperature;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[]res = new int[l];

        // O(n^2)
        for (int i = 0; i < l; i++) {
            int cur = temperatures[i];
            int j = i;
            int count = 0;
            do {
                count++;
                j++;
            } while (j < l && temperatures[j]<=cur);

            res[i] = j == l ? 0 : count;
        }
        return res;
    }
}
