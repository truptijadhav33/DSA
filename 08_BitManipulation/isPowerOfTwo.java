public class isPowerOfTwo {
    public static boolean isPower(int num)
    {
        /*
           10000     (n  -->  16)
           01111  &  (n-1---> 15)
          --------
           00000   ---> true

=====================================================================
=====================================================================

           00011     (n  -->  3)
           00010  &  (n-1---> 2)
         ---------
           00010   ---> false
         */

        if((num & (num-1)) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPower(num));
    }
}
