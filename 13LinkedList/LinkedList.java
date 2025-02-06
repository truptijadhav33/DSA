public class LinkedList {
    // node creation
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    // add operations----1)addFirst------2)addLast
    /*
     * ---addFirst---
     * 1.create new node
     * 2.add before head
     * 3.change head
     * 
     * ---addLast---
     * 1.create new node
     * 2.add after tail
     * 3.change tail
     */
    // addFirst
    public void addFirst(int data) {
        // time complexity O(1)
        // step1--create new node
        Node newNode = new Node(data);
        size++;
        // edge case--if list empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // set next of new node to head
        newNode.next = head;
        // move head to new node
        head = newNode;
    }

    public void addLast(int data) {
        // time complexity O(1)
        // step1--create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // set next of tail to new node
        tail.next = newNode;
        // move tail to new node
        tail = newNode;
    }

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int pos = 0;
        while (pos < index - 1 && temp.next != null) {
            temp = temp.next;
            pos++;
        }
        if (pos == index - 1 && temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Invalid position");
        }
    }

    // removeFirst
    //Time Complexity O(1)
    public int deleteFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //remove addLast
    //Time ComplexityO(N)
    public int deleteLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    //linear search Time Complexity --> O(N)
    public int search(int key)
    {
        if(size==0)
        {
            System.out.println("List is empty");
            return -1;
        }
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if(temp.data == key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    // Time Complexity -> O(N) & Space Complexity -> O(N)
    public int helper(Node head , int key)
    {
        //base case
        if(head==null)
        {
            return -1;
        }
        if(head.data==key) //3->6->8->4->7->5
        {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key)
    {
        return helper(head , key);
    }
    public void reverseLL()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

     // Time complexity(N)
    public void print()
    {
        // if list empty
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(3);
        // ll.addFirst(6);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(4);
        ll.addLast(7);
        ll.addLast(5);

        // ll.print();
        // ll.addMiddle(0, 9);
        ll.print();
        // System.out.println("Deleted: " + ll.deleteFirst());
        // System.out.println("Deleted: " + ll.deleteLast());
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println("Key found at index "+ll.search(4));
        // System.out.println(ll.recursiveSearch(4));
        ll.reverseLL();
        ll.print();

    }
}
