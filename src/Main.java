import map.IsomorphicStrings;
import map.hashdesign.ShiftSolution;
import map.validsudoku.BitwiseValidSudoku;
import map.validsudoku.ValidSudoku;
import mergetwosortedarrays.Solution;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[]a=new int[]{1,2,3,0,0,0};
        int m=3;
        int[]b=new int[]{2,5,6};
        int n=3;

        Solution.merge(a,m,b,n);
        System.out.println(Arrays.toString(a));

        IntStream intStream = IntStream.of(5, 3, 4, 1);
        int[] ints = intStream.sorted().toArray();
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println();
        for(int i=0; i<10; ++i)
        System.out.println(i);

        final int []c =new int[]{1,2,3,4,5};
        int s=0;
        int[] ints1 = IntStream.range(0, c.length).filter(i -> i % 2 == 0).map(i -> c[i]).toArray();
        System.out.println(Arrays.toString(ints1));

        System.out.println(5%2);

        System.out.println(10%7);

        System.out.println(Integer.valueOf('a'));

        System.out.println("----Isomorphic----");
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("badc","baba"));
        System.out.println(isomorphicStrings.isIsomorphic("abad","ctcx"));

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("abc", 1);
        stringIntegerHashMap.put("edf", 2);
       // Set<Integer> values = (Set<Integer>)stringIntegerHashMap.values();
       // Integer min = Collections.min(values);
       // Set<String> collect = stringIntegerHashMap.entrySet().stream().filter(e -> e.getValue() == min)
       //         .map(e -> e.getKey()).collect(Collectors.toSet());
//        String[] strings = new String[collect.size()];
//        String[] result = collect.toArray(strings);
//        System.out.println(Arrays.toString(result));
//        Collections.min(stringIntegerHashMap.values());
//        stringIntegerHashMap.entrySet();

        String[] groupShiftedStrings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

        ShiftSolution shiftSolution = new ShiftSolution();
        shiftSolution.groupStrings(groupShiftedStrings);

        System.out.println(1%3);

        char [][] sudoku = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(sudoku));

        BitwiseValidSudoku bitwiseValidSudoku = new BitwiseValidSudoku();
        System.out.println(bitwiseValidSudoku.isValidSudoku(sudoku));

    }
}