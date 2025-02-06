public class detectLoop {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void print()
    {
        if(head==null)
        {
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head=tail=newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        tail=newNode;
    }
    // floyd's cycle finding algo.
    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        //1->2->3->1
        System.out.println(isCycle());//true
    }
}
