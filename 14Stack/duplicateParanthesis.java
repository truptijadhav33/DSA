import java.util.*;
public class duplicateParanthesis {
    public static boolean checkDuplicates(String str)
    {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if(ch==')')
            {
                int count = 0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if(count<1)
                {
                    return true;//duplicate
                }
                else{
                    s.pop();//pop opening
                }
            }
            else{
                //opening , operator
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b)+(c+d))";
        String str2 = "(((a+b)+(c+d)))";
        System.out.println(checkDuplicates(str1));//false
        System.out.println(checkDuplicates(str2));//true

    }
}
