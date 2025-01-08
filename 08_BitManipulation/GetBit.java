public class GetBit {
    public static int GetIthBit(int n,int i)
    {
        int bitMask = 1<<i;
        return n&bitMask;

        /*
        bitmask=010
         110
         010  &
        -----
         010
         */

    }
    public static void main(String[] args) {
        int num =6;//110
        System.out.println(GetIthBit(num,2));
    }
}
