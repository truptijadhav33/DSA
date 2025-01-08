public class clearBit {
    public static int clearIthBit(int num , int i)
    {

        int bitMask = ~(1<<i);
        return num & bitMask;
        /*
         * 110
         * 011  &
         *-----
           010
         */
    }
    public static void main(String[] args) {
        int n=6;//110
        System.out.println(clearIthBit(n, 2)); //010
    }
}
