import java.util.*;
public class reverseStack {

    public static void pushAtBottom(Stack<Integer> s,int data)
    {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStackFun(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverseStackFun(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverseStackFun(s);
        System.out.println(s);

    }
}
