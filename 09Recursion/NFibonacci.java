public class NFibonacci {
    public static int fibonacci(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void print_fibonacci_series(int count)
    {
        for(int i=0;i<count;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        print_fibonacci_series(n);
    }
}
