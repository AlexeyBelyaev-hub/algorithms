package queue.numberofislands;

import org.junit.jupiter.api.Assertions;

import java.util.AbstractMap;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */

class NumberOfIslandsTest2 {

    /**
     * Case contains expected result and grid
     */
    AbstractMap.SimpleEntry<Integer, char[][]> case1 = new AbstractMap.SimpleEntry<>(1, new char[][]{
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    });

    AbstractMap.SimpleEntry<Integer, char[][]> case2 = new AbstractMap.SimpleEntry<>(3, new char[][]{
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    });
    
    AbstractMap.SimpleEntry<Integer, char[][]> case3 = new AbstractMap.SimpleEntry<>(1, new char[][]{
            {'1','1','1'},
            {'0','1','0'},
            {'1','1','1'}
    });



    //Example 2:
    @org.junit.jupiter.api.Test
    void printUniqueHashOfIndexes() {
//        Input:
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '3', '1'}
        };

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(r*grid[0].length + c);
                System.out.print(' ');
            }
            System.out.println();
        }
        //get element:
        //получить строку: хеш%длина_строки
        Assertions.assertEquals('3', grid[18/5][18%5]);
    }


    //Example 1:
    @org.junit.jupiter.api.Test
    void numIslandsDSFCase1() {
        char[][] grid1 = case1.getValue();
        NumberOfIslandsDFS2 numberOfIslands = new NumberOfIslandsDFS2();
        Assertions.assertEquals(case1.getKey(), numberOfIslands.numIslands(grid1));
    }


    //Example 2:
    @org.junit.jupiter.api.Test
    void numIslandsDSFCase2() {
        char[][] grid2 = case2.getValue();
        NumberOfIslandsDFS2 numberOfIslands = new NumberOfIslandsDFS2();
        Assertions.assertEquals(case2.getKey(), numberOfIslands.numIslands(grid2));
    }

    //Example 3:
    @org.junit.jupiter.api.Test
    void numIslandsDSFCase3() {
        char[][] grid3 = case3.getValue();
        NumberOfIslandsDFS2 numberOfIslands = new NumberOfIslandsDFS2();
        Assertions.assertEquals(case3.getKey(), numberOfIslands.numIslands(grid3));
    }

}