package queue.numberofislands;

public class NumberOfIslandsDFS2 {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i<grid.length; i++) {
            for (int j = 0; j< grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, new int[]{i,j});
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int [] cur ) {

        //идем во все стороны где остров
        int i = cur[0];
        int j = cur[1];
        grid[i][j] = '2'; //visited
        if (i-1 >= 0 && grid[i-1][j] == '1') {
            dfs(grid, new int[]{i-1, j});
        }
        if (i+1 < grid.length && grid[i+1][j] == '1') {
            dfs(grid, new int[]{i+1, j});
        }
        if (j+1 < grid[0].length && grid[i][j+1] == '1' ) {
            dfs(grid, new int[]{i, j+1});
        }
        if (j-1 >= 0 && grid[i][j-1] == '1') {
            dfs(grid, new int[]{i, j-1});
        }


    }
}
