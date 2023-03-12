package arrays.twodim;

public class Travers {
    public int[] findDiagonalOrder(int[][] mat) {
        // d<m -> r=d=0; c=0; r>=0; d=1, d<m -> r=0, c=d=1
        // d = 2, r=d=2, c=0,
        // 1 2 3
        // 4 5 6
        // 7 8 9

        int n = mat.length;
        int m = mat[0].length;
        System.out.println(n);
        System.out.println(m);
        int k =0;

        int [] newArray = new int[n*m];

        //ограничиваемся количеством диагоналей
        for (int d = 0; d<m+n-1 ; d++) {
            //row, column
            int r,c;
            //определяем поозцию с которой стартуем
            //когда четная тогда в обратном порядке идем
            if (d%2==0) {
                r = d < m ? d : n - 1;
                c = d < m ? 0 : d - m + 1;

                while(r>-1 && c<m) {
                    System.out.println(r);
                    System.out.println(c);
                    System.out.println("mat["+"r"+"]["+"c"+"]="+mat[r][c]);
                    newArray[k++] = mat[r--][c++];
                }
            } else { // когда нечетная то в обычном порядке - справа налево
                r = d < m ? 0 : d - m + 1;
                c = d < m ? d : m - 1;
                while(c>-1 && r<n) {
                    System.out.println(r);
                    System.out.println(c);
                    System.out.println("mat["+"r"+"]["+"c"+"]="+mat[r][c]);
                    newArray[k++] = mat[r++][c--];
                }
            }
        }
        return newArray;
    }
}
