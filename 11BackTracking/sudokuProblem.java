public class sudokuProblem {
    public static boolean sudokuSolver(int[][] sudoku, int i, int j) {
        // base case
        if (i > 8) {
            return true;
        }
        // recursion

        //row col calculation
        int nextRow = i;
        int nextCol = j + 1;
        if(j+1 == 9)
        {
            nextRow = i+1;
            nextCol=0;
        }
        //if digit exist already
        if(sudoku[i][j]!=0)
        {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        //for placing new digit
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, i, j, digit)) {
                sudoku[i][j] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)) //Solution exist
                {
                    return true;
                }
                sudoku[i][j]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int sudoku[][] , int row , int col , int digit)
    {
        // column
        for(int i = 0 ; i<=8 ; i++)
        {
            if(sudoku[i][col]==digit)
            {
                return false;
            }
        }

        //row
        for (int i = 0; i <=8; i++) {
            if(sudoku[row][i]==digit)
            {
                return false;
            }
        }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i<sr+3 ; i++)
        {
            for(int j = sc ; j<sc+3 ; j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int[][] arr)
    {
        System.out.println("Solution: ");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println("\n____________________________________\n");
        }
    }

    public static void main(String[] args) {
        int sudoku[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSolver(sudoku, 0, 0))
        {
            System.out.println("Solution exist..");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution not exist!");
        }
    }
}
