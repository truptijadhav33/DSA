import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class reverseFirstKEle {

    // Recursive approach TC=>O(N) , SC=>O(K)-->(if consider recursive stack)

    public static void helper(Queue<Integer> q, int k) {
        if (k == 0) {
            return;
        }
        int ele = q.peek();
        q.remove();
        helper(q, k - 1);
        q.add(ele);
    }

    public static void reverseKRecursive(Queue<Integer> q, int k) {
        if (q.isEmpty() || q.size() < k) {
            return;
        }
        helper(q, k);
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
    }

    public static void reverseK(Queue<Integer> q, int k) // Brute force approach TC=>O(N) SC=>O(K)
    {
        if (q.isEmpty() || q.size() < k) {
            return;
        }
        Stack<Integer> s = new Stack<>();

        // push in stack
        for (int i = 0; i < k; i++) {
            s.push(q.peek());
            q.remove();
        }

        // add in Queue
        while (!s.isEmpty()) {
            q.add(s.peek());
            s.pop();
        }

        // move n-k to end of Queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.peek());
            q.remove();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        // reverseK(q, 3);
        reverseKRecursive(q, 3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());// 3 2 1 4 5 6
            q.remove();
        }
    }
}
