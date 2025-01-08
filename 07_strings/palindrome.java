public class palindrome {
    @SuppressWarnings("unused")
    public static boolean palindrome_fun(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(palindrome_fun(str));
    }
}
