package queue.movingavarage;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    Queue<Integer> q;
    int window;
    double sum;

    public MovingAverage(int size) {
        this.q = new LinkedList<>();
        this.window = size;
    }

    public double next(int val) {

        if (q.size() == window)
            sum -= q.poll();

        sum += val;
        q.offer(val);
        return sum/q.size();
    }
}
