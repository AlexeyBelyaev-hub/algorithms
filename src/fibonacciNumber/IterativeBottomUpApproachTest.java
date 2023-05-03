package fibonacciNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeBottomUpApproachTest {


    FibonacciNumber underTest = new IterativeBottomUpApproach();
    /**
     * Example 1:
     *
     * Input: n = 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     */
    @Test
    void fib1() {
        int fib = underTest.fib(2);
        Assertions.assertEquals(1,fib);

    }

    /**
     * Example 2:
     *
     * Input: n = 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     */
    @Test
    void fib2() {
        int fib = underTest.fib(3);
        Assertions.assertEquals(2,fib);

    }

    /**
     * Example 3:
     *
     * Input: n = 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     */
    @Test
    void fib3() {
        int fib = underTest.fib(4);
        Assertions.assertEquals(3,fib);

    }
}