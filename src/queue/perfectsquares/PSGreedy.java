package queue.perfectsquares;

import java.util.HashSet;
import java.util.Set;

public class PSGreedy implements PerfectSquares {

    Set<Integer> squares = new HashSet<>();

    public int numSquares(int n) {
        for (int i = 1; i*i <= n ; i++) {
            squares.add(i*i);
        }
        int count = 1;
        for (; n > count; ++count) {
            if (is_Divided_by(n, count)) return count;
        }
        return count;
    }

    private boolean is_Divided_by(int n, int count) {
        if (count == 1) {
            return squares.contains(n);
        }

        for (int square: squares) {
            if (is_Divided_by(n - square, count - 1)) {
                return true;
            }
        }
        return false;
    }
}
