public class DiagonalSum {

    // public static int DiagonalSumFun(int m[][]) {

    //     //Brute force solution
    //     int sum = 0;
    //     for (int i = 0; i < m.length; i++) {
    //         for (int j = 0; j < m[0].length; j++) {
    //             if (i == j) {
    //                 sum += m[i][j];
    //             } else if ((i + j) == m.length - 1) {
    //                 sum += m[i][j]; // col ---> i+j = m.length-1 => j = m.length-1-i
    //             }
    //         }
    //     }
    //     return sum;
    // }

    
    // optimized code...
    public static int DiagonalSumFunOpti(int m[][]) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            // primary diagonal
            sum += m[i][i];

            // secondary diagonal
            if (i != m.length - 1 - i) {
                sum += m[i][m.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(DiagonalSumFunOpti(mat));
        // System.out.println(DiagonalSumFun(mat));

    }
}
