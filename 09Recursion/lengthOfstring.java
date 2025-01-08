public class lengthOfstring {
    public static int findLen(String str)
    {
        //string empty
        if(str.equals(""))
        {
            return 0;
        }
        /* 
        --> there are n characters in string as small problem 1 is length of first char now n-1 is   
            length of remaining characters.
        --> for count n-1 chars call findlen by removing first char because it counted as 1
        --> to remove 0th character str.substring(1) here 1 is beginning index , as 0th character counted then 0th char is eliminated and recursively count for substring from 1st index char to end */

        return 1 + findLen(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "Trupti";//length = 6
        System.out.println(findLen(str));
    }
}
