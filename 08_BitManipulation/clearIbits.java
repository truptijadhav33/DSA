public class clearIbits {
    public static int clearIBitsFun(int num , int i)
    {
        int bitmask = (~0)<<i;
        return num & bitmask;

        /*
         * 110
         * 100 &
         *-------
           100
         */
    }
    public static void main(String[] args) {
        int num =6;//110
        System.out.println(clearIBitsFun(num, 2));//4-->100
    }
}
