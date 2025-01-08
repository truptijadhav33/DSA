public class searchInSortedMatrix {

    public static void search(int m[][],int target)
    {
        int row=0;
        int col=m[0].length-1;
        while (row<=m.length-1 && col>=0) {
            if(target==m[row][col])
            {
                System.out.println("Target found at ("+row+","+col+")");
                return;
            }
            else if(target<m[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Target not found!");
    }
    public static void main(String[] args) {
        int[][] mat={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        search(mat,33);
    }
}
