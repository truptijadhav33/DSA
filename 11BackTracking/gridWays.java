public class gridWays {
    public static int ways(int i , int j , int n , int m )
    {
        //Time complexity O(2^m+n)
        //base case
        if(i==n-1 && j==m-1) // condition for last cell
        {
            return 1;
        } else if(i==n || j==n){ //boundary condition
            return 0;
        }
   //recursion
        int w1 = ways(i+1, j, n, m);
        int w2 = ways(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("No of ways are : " + ways(0, 0, n, m));
    }
}
