package map.validsudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> columns = new HashMap<>();
        Map<Integer, Set<Integer>> boxes = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            columns.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());

        }

        for (int i = 0; i < 9; i++) {
            Set<Integer> row = rows.get(i);
            for(int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                Set<Integer> column = columns.get(j);
                Set<Integer> box = boxes.get(getHash(i,j));
                int checkNum = board[i][j];
                if (row.contains(checkNum) || column.contains(checkNum)
                        || box.contains(checkNum)) return false;
                row.add(checkNum);
                column.add(checkNum);
                box.add(checkNum);
            }
        }
        return true;
    }

    private int getHash(int i, int j) {
        return (i/3)*3 + (j/3);
    }
}
