public class largestStringLexicographic {

    public static void largestStr(String fruits[])
    {
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(largest.compareTo(fruits[i]) < 0)// if 0 then equal..if > 0 then large..if < 0 then small
            {
                largest=fruits[i];
            }
        }
        System.out.println("Largest String is "+largest);
    }
    // Time complexity O(x * n)  here x is large string and n is length of array
    public static void main(String[] args) {
        String fruits[]={"Apple","Banana","Papaya","Jackfruit","Kiwi","Orange"}; // 'a' 'A' are different
        largestStr(fruits);
    }
}