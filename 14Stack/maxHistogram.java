import java.util.Stack;

public class maxHistogram {
    public static void CalMaxArea(int[] arr) {
        int maxArea=0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // next smaller of right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller of left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // calculate max Area
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i]-nsl[i]-1;
            int height = arr[i];
            int currArea = height * width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("Maximum area is : " + maxArea);
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 5, 6, 2, 3 };//10
        int[] arr2 = { 2, 4 };//4
        CalMaxArea(arr1);
        CalMaxArea(arr2);
    }
}
