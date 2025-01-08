public class spiralMatrix {
    public static void spiral(int m[][])
    {
        int startRow=0;
        int endRow=m.length-1;
        int startCol=0;
        int endCol=m[0].length-1;

        while (startRow<=endRow && startCol<=endRow) {

            //top row from startCol to endCol
            for(int i=startCol;i<=endCol;i++)
            {
                System.out.print(m[startRow][i]+" ");
            }
            startRow++;

            //Right column i.e end column from startRow to endRow
            for(int i=startRow;i<=endRow;i++)
            {
                System.out.print(m[i][endCol]+" ");
            }
            endCol--;

            //Bootom row from endCol to startCol
            for(int i=endCol;i>=startCol;i--)
            {
                System.out.print(m[endRow][i]+" ");
            }
            endRow--;

            //left column i.e start column from endRow to startRow
            for(int i=endRow;i>=startRow;i--)
            {
                System.out.print(m[i][startCol]+" ");
            }
            startCol++;

        }

    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16} };
        spiral(mat);
    }
}
