public class clearRangeOfBits {

    public static int clearRangeOfBitsFun(int num , int i , int j)
    {
        int a = 1<<j+1;          //100000
        int b = 1<<i-1;         //000001
        int bitmask = a|b;     //100001
        return num & bitmask; //100000

        /*
          000001
          100000  |
        ----------
          100001


          101100
          100001  &
        -----------
          100000 ----> 32
        */



    }
    public static void main(String[] args) {
        int num = 44;//101100
        System.out.println(clearRangeOfBitsFun(num, 1, 4));//--->100000-->32
    }
}
