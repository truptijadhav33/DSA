public class removeCycleLL{
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

    public static void removeCycle()
    {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if (slow==fast) {
                cycle=true;
                break;
            }

        }
        if (cycle==false) {
            return;
        }

        //finding meeting position
        slow=head;
        Node prev = null;
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;//+1
            fast=fast.next;//+2
        }
        prev.next=null; //remove cycle
    }
    public static void main(String[] args) {
        removeCycleLL ll = new removeCycleLL();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head.next;
        //1->2->3->2
        System.out.println(isCycle());//true
        // ll.print();//Infinite
        removeCycle();
        ll.print();//1->2->3->null
        System.out.println(isCycle());//false

    }
}
