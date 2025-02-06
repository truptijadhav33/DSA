public class RemoveFromEnd {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static int size = 0;

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

    public void removeFromLast(int n)//remove nth node
    {
        System.out.println(size);
        if(n==size)
        {
            head=head.next;
            return;
        }//1 2 3 4 5
        int i = 1;//track currant
        int itoFind = size-n; // position of prev
        Node prev = head; // for reaching at previous
        while (i<itoFind) {
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;//making new link
    }

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
    public static void main(String[] args) {
        RemoveFromEnd ll = new RemoveFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.removeFromLast(1);
        ll.print();
    }
}
