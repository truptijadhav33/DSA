public class friendsPairing {
    public static int pair(int n) { // n is no. of friends
        if (n == 1 || n == 2) {
            return n;
        }
        // If one person stands alone, there are pair(n-1) ways for the remaining n-1
        // friends
        int singleP = pair(n - 1);
        int paired = (n - 1) * pair(n - 2); // for standing paired
        return singleP + paired; // total ways
        /*
         * First Choice: Who to Pair With
         * --The first person can pair with any of 𝑛−1 other people.
         * --Example for 𝑛=4
         * --If 𝐴 chooses to pair, they can pair with 𝐵,𝐶,or 𝐷That’s 𝑛−1=3 options.
         * 
         * Second Choice: Arranging Remaining Friends
         * --After the pair is formed, the 𝑛−2 remaining friends can be arranged in
         * 𝑝𝑎𝑖𝑟(𝑛−2) ways.
         * --So, the total number of ways is:
         * --Total Ways =(Ways to Pair One Friend)⋅(Ways to Arrange Remaining Friends)=>
         * (𝑛−1)⋅𝑝𝑎𝑖𝑟(𝑛−2)=(n−1)pair(n−2)
         */
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(pair(n));
    }
}
