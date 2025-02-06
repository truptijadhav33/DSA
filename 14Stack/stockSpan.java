import java.util.*;
public class stockSpan {

    //Time Complexity O(N)
    public static void stockSpanFun(int stocks[] , int span[])
    {
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++)
        {
           int currP = stocks[i];
           while (!s.isEmpty() && currP >= stocks[s.peek()])
           {
            s.pop();
           }
           if(s.isEmpty())
           {
            span[i]=i+1;
           }
           else{
            int preHigh = s.peek();
            span[i]=i-preHigh;
           }
           s.push(i);
        }


    }
    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,85,100};
        int[] span = new int[stocks.length];
        stockSpanFun(stocks , span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}