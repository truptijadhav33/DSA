public class sumNnaturalNums {
    public static int printNsum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n + printNsum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printNsum(n));

    }
}
