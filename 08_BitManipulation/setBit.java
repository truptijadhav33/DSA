public class setBit {
    public static int SetIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

        /*
         * bitmask=010
         * 110
         * 001  |
         * -----
         * 111
         */

    }

    public static void main(String[] args) {
        int num = 6;// 110
        System.out.println(SetIthBit(num, 0));  //111
    }
}
