package queue.numberofislands;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslandsBFS {
    private static final char LAND = '1';
    private static final char VISITED = '3';


        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int count = 0;
            int nr = grid.length;
            int nc = grid[0].length;

            for(int i = 0; i < nr; i++) {
                for(int j = 0; j < nc; j++) {
                    if(grid[i][j] == LAND) {
                        ++count;
                        grid[i][j] = VISITED;
                        Queue<Integer> q = new LinkedList<>();
                        // Чтобы прихранить уникальную позицию в 2д массиве
                        // row * row_length + col
                        // пример: 2 * 4 + 1 = 8+1 =9
                        // пример: 1 * 4 + 2 = 6
                        q.add(i * nc + j);
                        while (!q.isEmpty()) {
                            int poll = q.poll();
                            int row = poll / nc;
                            int col = poll % nc;
                            // этот код закоментирован тк по таймауту падает
                            // видимо из за того что
                            // for (int[] d : DIRECTIONS) {
                            //     int r = row + d[0];
                            //     int c = col + d[1];
                            //     if (r >= grid.length || r < 0 || c >= grid[0].length || c < 0 || grid[r][c] != LAND ) continue;
                            //     q.add(r * nc + c);
                            // }
                            if (row - 1 >= 0 && grid[row-1][col] == '1') {
                                q.add((row-1) * nc + col);
                                grid[row-1][col] = '0';
                            }
                            if (row + 1 < nr && grid[row+1][col] == '1') {
                                q.add((row+1) * nc + col);
                                grid[row+1][col] = '0';
                            }
                            if (col - 1 >= 0 && grid[row][col-1] == '1') {
                                q.add(row * nc + col-1);
                                grid[row][col-1] = '0';
                            }
                            if (col + 1 < nc && grid[row][col+1] == '1') {
                                q.add(row * nc + col+1);
                                grid[row][col+1] = '0';
                            }


                            grid[row][col] = VISITED;
                        }
                    }
                }
            }

            return count;
    }

}
