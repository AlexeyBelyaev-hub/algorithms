package queue.perfectsquares;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquaresBrute {
    List<Integer> perfSquares = new ArrayList<>();

    public int numSquares(int n) {

        //1. Get all perfect squares
        for (int i = 1; i <= n; i++) {
            if (isPerfectSquare(i)) {
                perfSquares.add(i);
            }
        }

        //2. Brute force of all combination
        return minNumSquares(n);
    }


    int minNumSquares(int k) {
        if (perfSquares.contains(k)) return 1;

        int min_num = Integer.MAX_VALUE;
        for (int sqr : perfSquares) {
            if (k < sqr) {
                break;
            }
            int new_num = minNumSquares(k-sqr)+1;
            min_num = Math.min(min_num, new_num);
        }
        return min_num;
    }

    public boolean isPerfectSquare(int n){
        double sqrt = Math.sqrt(n);
        return (sqrt - (int)sqrt) == 0;
    }
}
