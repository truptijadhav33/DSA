import java.util.Deque;
import java.util.LinkedList;

public class maximumOfAllSubarray {

    //TC=>O(N) SC=>O(K)
    public static void findMaxDeque(int[] arr, int k) {
        if (arr.length == 0 || arr.length < k) {
            return;
        }

        Deque<Integer> dq = new LinkedList<>(); // store index
        for (int i = 0; i < k; ++i) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) //
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (int i=k; i < arr.length; ++i) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) //
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()] + " ");

    }

    public static void findMax(int[] arr, int k) // Brute Force approach O(N^2)
    {
        if (arr.length == 0 || arr.length < k) {
            return;
        }
        for (int i = 0; i <= arr.length - k; i++) {
            int max = 0;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };// 3,4,5,6
        // findMax(arr , 3);
        findMaxDeque(arr, 3);
    }
}
