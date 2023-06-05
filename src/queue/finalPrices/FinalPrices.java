package queue.finalPrices;

import java.util.ArrayDeque;
import java.util.Deque;

public class FinalPrices {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[prices.length];
        for(int i = prices.length-1; i>=0; i--) {
            while(!stack.isEmpty() && (prices[stack.peekFirst()] > prices[i])) {
                stack.removeFirst();
            }
            res[i] = stack.isEmpty() ? prices[i] : prices[i] - prices[stack.peekFirst()];
            stack.addFirst(i);

        }
        return res;
    }
}
