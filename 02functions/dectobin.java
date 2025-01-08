

public class dectobin{
    public static void dtob(int n)
    {
        int num=n;
        int rem=0;
        int b=0,pow=0;
        while(n>0)
        {
            rem=n%2;
            b=b+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary number of "+num+" is "+b);
    }
    public static void main(String args[])
    {
        dtob(12);
    }
}