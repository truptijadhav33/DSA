public class reverseList {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void removeLast()
    {
        if(head==null)
        {
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    public void print()
    {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void reverse()
    {
        Node pre=null;
        Node curr=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head =  pre;
    }
    public static void main(String[] args) {
        reverseList ll = new reverseList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.reverse();
        ll.print();
    }

}
