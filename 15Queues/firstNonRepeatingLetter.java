import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingLetter {

    // Time Complexity O(N);
    public static void PrintNonRepeating(String str) {
        int[] frq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // current char
            q.add(ch); // adding to queue
            frq[ch - 'a']++; // increase freq og curr char
            // if freq > 1 i.e repeated then remove
            while (!q.isEmpty() && frq[q.peek() - 'a'] > 1) {
                q.remove();
            }
             //not found non repeating char
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {  //found
                System.out.print(q.peek() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintNonRepeating("aabccxb");//a -1 b b b b x
    }
}
