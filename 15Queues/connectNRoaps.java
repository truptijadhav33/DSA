import java.util.PriorityQueue;

public class connectNRoaps {

    public static int connectRope(int[] arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int res=0;
        while (pq.size()>1) {
            int f = pq.poll();
            int s = pq.poll();
            res += f+s;
            pq.add(f+s);
        }

        return res;
    }
    public static void main(String[] args) {
        //connect n ropes with minimum cost
        int[] arr = {2,5,4,8,6,9};
        System.out.println(connectRope(arr)); //85
    }
}
