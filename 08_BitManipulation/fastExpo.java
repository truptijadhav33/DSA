public class fastExpo {
    public static int fastExponential(int num, int p) {
        int ans = 1;
        while (p > 0) {
            if ((p & 1) != 0) {
                ans = ans * num;
            }
            num = num * num;
            p = p >> 1;

        }
        return ans;  //125
    }
//Time complexity O( log N )
    public static void main(String[] args) {
        int num = 5;
        int pow = 3;
        System.out.println(fastExponential(num, pow)); // 125
    }
}
