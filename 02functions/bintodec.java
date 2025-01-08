

public class bintodec{
    public static void btod(int b)
    {
        int dec=0;
        int pow=0;
        int bin=b;
        while(b>0)
        {
            int lastdigit=b%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            b=b/10;
        }
        System.out.println("Decimal number of "+bin+" is "+dec);
    }
    public static void main(String args[])
    {
    btod(101);
    }
}