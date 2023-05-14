package queue.perfectsquares;

import org.junit.jupiter.api.Assertions;

class PSGreedyTest {
    /**
     * Input: n = 12
     * Output: 3
     * Explanation: 12 = 4 + 4 + 4.
     */
    @org.junit.jupiter.api.Test
    void numSquares1() {
        PerfectSquares perfectSquares = new PSGreedy();
        int res = perfectSquares.numSquares(12);
        Assertions.assertEquals(3, res);
    }


    /**
     * Input: n = 13
     * Output: 2
     * Explanation: 13 = 4 + 9.
     */
    @org.junit.jupiter.api.Test
    void numSquares2() {
        PerfectSquares perfectSquares = new PSGreedy();
        int res = perfectSquares.numSquares(13);
        Assertions.assertEquals(2, res);
    }
}