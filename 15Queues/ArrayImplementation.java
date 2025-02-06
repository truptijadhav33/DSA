public class ArrayImplementation{

    public static class Queue {
        int[] arr;
        int size;
        int rear;

        Queue(int s) {
            arr = new int[s];
            size = s;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();// 2 3 4 5
        q.remove();// 3 4 5
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
