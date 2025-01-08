public class countSetBits {
    public static int countSetBitsFun(int num)
    {
        int count = 0;
        while(num>0)
        {
            if((num&1)!=0)
            {
                count++;
            }
           num = num>>1;

        }
        return count;

        /*
        1 iteration n=0110 count = 0
         * 110
         * 001  &
         *------
           000
           count = 0

        2 iteration n=011 count = 0
         * 011
         * 001  &
         *------
           001
           count = 1

        3 iteration n=001
         * 001
         * 001  &
         *------
           001
           count = 2

        1 iteration n=000
         * while loop break
         */
    }
    public static void main(String[] args) {
        int num = 6;//110
        System.out.println("Count of set bits are : "+countSetBitsFun(num));

    }
}
