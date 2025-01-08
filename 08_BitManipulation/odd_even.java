public class odd_even {
    public static void oddEvenCheck(int num)
    {
        /*
         101
         001  &
        -----
         001  // odd


         100
         001  &
        -----
         000  // even
         */

         if((num & 1) == 0)
         {
            System.out.println("Even");
         }
         else{
            System.out.println("Odd");
         }

    }
    public static void main(String[] args) {
        int n=4;
        oddEvenCheck(n);
    }
}
