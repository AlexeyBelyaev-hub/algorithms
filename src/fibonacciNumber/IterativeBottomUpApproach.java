package fibonacciNumber;

public class IterativeBottomUpApproach implements FibonacciNumber {
    @Override
    public int fib(int n) {
        if (n <= 1) return 0;
        int current = 1;
        int prev = 0;
        for (int i = 2; i <= n; i++) {
            int tmp = current;
            current = current + prev;
            prev = tmp;
        }
        return current;
    }
}
