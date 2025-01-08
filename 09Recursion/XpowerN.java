public class XpowerN {
    public static int pow(int x , int n)
    {
        if(n==1)
        {
            return x;
        }
        int half = pow(x,n/2);
        int halfSqr = half*half;
        if(n%2!=0)
        {
            return x*halfSqr;
        }
        return halfSqr;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}
