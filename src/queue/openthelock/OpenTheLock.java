package queue.openthelock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {

    public int openLock(String[] deadends, String target) {

        Queue<String> queue = new LinkedList();
        Set<String> deads = new HashSet<>();
        Set<String> visited = new HashSet<>();

        deads.addAll(Arrays.asList(deadends));

        String curr = "0000";
        int count = 0;

        queue.add(curr);
        queue.offer(null);
        while (!queue.isEmpty()) {
            curr = queue.poll();
            if (curr == null) {
                ++count;
                if (queue.peek() != null) {
                    queue.offer(null);
                }
            } else if (curr.equals(target)) {
                return count;
            }
            else if (!deads.contains(curr)) {
                    for (int i = 0; i < 4; i ++) {
                        for (int j = -1; j<=1; j+=2) {

                            int y = ((curr.charAt(i) - '0') + j + 10) % 10;
                            String s = curr.substring(0, i) + ("" + y) + curr.substring(i+1);

                            if (!visited.contains(s)) {
                                queue.offer(s);
                                visited.add(s);
                            }

                        }
                    }
                }
        }

        return -1;

    }
}
