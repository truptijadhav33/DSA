public class ImplementUsingLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack {
        public Node head = null;//top

        public void push(int data)
        {
            Node newNode = new Node(data);
            if (head==null) {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public int pop()
        {
            int top = head.data;
            head=head.next;
            return top;
        }

        public int peek()
        {
            return head.data;
        }

        public void print()
        {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.print();
        s.push(5);
        s.print();

    }
}
