package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * You are given an m x n grid rooms initialized with these three possible values.
 *
 * -1 A wall or an obstacle.
 * 0 A gate.
 * INF Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
 * Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
 */
public class WallsAndGates {
    private static final int INF = 2147483647;
    private static final int GATE = 0;
    private static final List<int[]> DIRECTIONS =
            List.of(new int[]{0,1},
                    new int[]{1,0},
                    new int[]{-1,0},
                    new int[]{0, -1});

    public void wallsAndGates(int[][] rooms) {

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++){
                if (rooms[i][j] == GATE) {
                    q.add(new int[]{i,j});
                }
            }
        }
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int row = poll[0];
            int col = poll[1];
            for (int[] direction : DIRECTIONS) {
                int r = row + direction[0];
                int c = col + direction[1];
                if (r < 0 || r >= rooms.length || c < 0 || c >= rooms[0].length || rooms[r][c] != INF)
                    continue;
                rooms[r][c] = rooms[row][col]+1;
                q.add(new int[]{r,c});
            }
        }
    }
}
