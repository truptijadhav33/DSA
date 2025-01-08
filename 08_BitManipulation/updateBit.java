public class updateBit {
    public static int clearIthBit(int n, int i)
    {
        int bitMask = ~(1 << i); //011
        // System.out.println(bitMask);
        return n & bitMask;

        /*
         * bitmask=010
         * 110
         * 011  &
         * -----
         * 010
         */

    }
    public static int updateIthBit(int num , int i, int nb)
    {
        num = clearIthBit(num,i); //010
        int bitMask=nb<<i;//000
        return num | bitMask;


        /*
         * 010
         * 000  |
         -------
          010
         */
    }
    public static void main(String[] args) {
        int n=6;//110
        System.out.println(updateIthBit(n, 2,0)); //010
    }
}
