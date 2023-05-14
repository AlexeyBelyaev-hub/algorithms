package queue.numberofislands;

public class NumberOfIslandsDFS {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        int nr = grid.length;
        int nc = grid[0].length;

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    ++count;
                    dfs(grid, i, j);
                }
            }
        }
        return count;


    }

    private void dfs(char[][] grid, int row, int coll) {

        int nr = grid.length;
        int nc = grid[0].length;

        if (row >= nr || coll >= nc || row < 0 || coll < 0 || grid[row][coll] == '0')
        return;

        grid[row][coll] = '0';
        dfs(grid, row , coll + 1);
        dfs(grid, row, coll -1);
        dfs(grid, row - 1, coll);
        dfs(grid, row + 1, coll);


    }
}
