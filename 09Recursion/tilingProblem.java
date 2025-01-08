public class tilingProblem {
    public static int tilingWays(int n) //floor Size
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical
        int vChoice = tilingWays(n-1);
        //horizontal
        int hChoice = tilingWays(n-2);
        return vChoice+hChoice;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(tilingWays(n));
    }
}
