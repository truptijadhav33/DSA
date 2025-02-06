import java.util.Stack;

public class QueueUsingStacks {

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty()
        {
            return s1.isEmpty();
        }
        //add O(N)
        public void add(int data)
        {
            while(!isEmpty())
            {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        //remove O(1)
        public int remove()
        {

            if(isEmpty())
            {
                return -1;
            }

            return s1.pop();
        }
        //peek O(1)
        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
