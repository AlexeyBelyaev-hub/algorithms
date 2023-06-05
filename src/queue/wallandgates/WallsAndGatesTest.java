package queue.wallandgates;

import org.junit.jupiter.api.Assertions;

class WallsAndGatesTest {

    private static int MAX = 2147483647;
    /**
     * Input: rooms = [[2147483647,-1,0,2147483647],[2147483647,2147483647,2147483647,-1],[2147483647,-1,2147483647,-1],[0,-1,2147483647,2147483647]]
     * Output: [[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]
     */
    @org.junit.jupiter.api.Test
    void wallsAndGates() {
        WallsAndGates wallsAndGates = new WallsAndGates();
        int[][] ints = {{MAX, -1, 0, MAX},{MAX,MAX,MAX,-1},{MAX,-1,MAX,-1},{0,-1,MAX,MAX}};
        wallsAndGates.wallsAndGates(ints);
        Assertions.assertEquals(3, ints[0][0]);
    }

    /**
     * Input: rooms = [[-1]]
     * Output: [[-1]]
     */
}