public class palindromeLL {
    public class Node{
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
    //what we learn??
    //slow fast concept
    //reversing half ll

    //time complexity-->O(N) & space complexity-->O(1)
    //1> find middle
    //2> reverse 2nd half
    //3>check if 1st half==2nd half

    //finding middle using slow fast approach
    public Node Findmid(Node head) //helper
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkPalindrome()
    {
        //corner case
        if(head==null || head.next == null)
        {
            return true;
        }

        //step 1 find mid

        Node midNode = Findmid(head);

        //step 2 reverse 2nd half

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        Node right=prev;//right half head
        Node left = head;//left half head

        //step 3 check left and right half

        while (right !=null) {
            if(left.data != right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        palindromeLL ll = new palindromeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());//true


    }
}
