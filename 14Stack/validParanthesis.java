import java.util.Stack;

public class validParanthesis {

    //Time Complexity O(N)
    public static boolean checkParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                //opening
                s.push(str.charAt(i));
            } else {
                //closing
                if (s.isEmpty()) {
                    return false;
                }
                if((ch==')' && s.peek()=='(') || (ch=='}' && s.peek()=='{') || (ch==']' && s.peek()=='['))
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!s.isEmpty())
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "({[]})";// true
        String str2 = "({[}])))";// false
        System.out.println(checkParanthesis(str1));
        System.out.println(checkParanthesis(str2));

    }
}
