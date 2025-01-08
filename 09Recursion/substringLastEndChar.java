public class substringLastEndChar {
    public static int substringCheck(int i , int j , String str)
    {
        if(i>j)
        {
            return 0;
        }
        int firstCharRemove = substringCheck(i+1, j, str );
        int lastCharRemove = substringCheck(i, j-1, str );
        int firstlastCharRemove = substringCheck(i+1, j-1, str );
        int ans = firstCharRemove+lastCharRemove - firstlastCharRemove;
        if(str.charAt(i)==str.charAt(j))
        {
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abcab";
      System.out.println(substringCheck(0, str.length()-1, str));
    }
}
