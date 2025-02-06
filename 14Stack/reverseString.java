import java.util.*;

public class reverseString {

    public static String reverseStringFun(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        StringBuilder sb = new StringBuilder("");
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseStringFun("abc"));
    }
}
