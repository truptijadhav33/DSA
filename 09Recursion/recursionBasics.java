public class recursionBasics {
    public static void printDec(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);

    }
    public static void printInc(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int num = 10;
        // printDec(num);
        printInc(num);
    }
}
