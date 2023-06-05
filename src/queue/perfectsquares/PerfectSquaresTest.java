package queue.perfectsquares;

import org.junit.jupiter.api.Assertions;

/**
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 *
 * A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 * For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 */
class PerfectSquaresTest {

    /**
     * Input: n = 12
     * Output: 3
     * Explanation: 12 = 4 + 4 + 4.
     */
    @org.junit.jupiter.api.Test
    void numSquares1() {
        PerfectSquaresBrute perfectSquaresBrute = new PerfectSquaresBrute();
        int res = perfectSquaresBrute.numSquares(12);
        Assertions.assertEquals(3, res);
    }


    /**
     * Input: n = 13
     * Output: 2
     * Explanation: 13 = 4 + 9.
     */
    @org.junit.jupiter.api.Test
    void numSquares2() {
        PerfectSquaresBrute perfectSquaresBrute = new PerfectSquaresBrute();
        int res = perfectSquaresBrute.numSquares(13);
        Assertions.assertEquals(2, res);
    }

}