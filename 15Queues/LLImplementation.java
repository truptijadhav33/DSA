public class LLImplementation {
    static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class  Queue {
        static Node head=null;
        static Node tail=null;

        public boolean isEmpty()
        {
            return head==null && tail==null;
        }

        public void add(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public void remove()
        {
            if(isEmpty())
            {
                return;
            }
            if(tail==head)
            {
                tail=head=null;
                return;
            }
            head=head.next;
        }

        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            int val = head.data;
            return val;
        }

        public void print()
        {
            if (isEmpty()) {
                System.out.println("null");
                return;
            }
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        q.print();
        q.remove();
        q.print();

    }
}
