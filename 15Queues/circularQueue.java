public class circularQueue {
    public static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int s)
        {
            arr = new int[s];
            size=s;
            rear=-1;
            front=-1;
        }

        public boolean isEmpty()
        {
            //both are at -1
            return rear==-1 && front==-1;
        }

        public boolean isFull()
        {
            //rear behind the front
            return (rear+1)%size == front;
        }

        public void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue full");
                return ;
            }
            //add first element
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public void remove()
        {
            if(isEmpty())
            {
                return;
            }
            //last element
            if(rear==front)
            {
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
        }

        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.remove();// 2 3 4 5
        // q.remove();// 3 4 5
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");// 1 2 3 4 5
            q.remove();
        }
    }
}
