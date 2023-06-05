package fibonacciNumber;

/**
 * Time complexity: O(2^N)
 */
public class RecursiveApproach implements FibonacciNumber {
    int n;
    @Override
    public int fib(int n) {
        if ( n<=1 ) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


}
