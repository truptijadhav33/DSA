import java.util.Arrays;

public class anagrams {
    public static boolean Anagrams_check(String str1 , String str2)
    {
        char[] s1=str1.toCharArray(); // converting to array of characters
        char[] s2=str2.toCharArray();

        Arrays.sort(s1); // sorting array
        Arrays.sort(s2);
        return Arrays.equals(s1, s2); //checking equality
    }
    public static void main(String[] args) {
        String s1="eat";
        String s2="tea";
        System.out.println(Anagrams_check(s1, s2)); // true
    }
}
