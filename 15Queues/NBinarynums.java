import java.util.LinkedList;
import java.util.Queue;

public class NBinarynums {

    public static String[] Binarynums(int n)
    {
        Queue<String> q = new LinkedList<>();
        String[] res = new String[n];
        q.add("1");
        for (int i = 0; i < n; i++) {
            res[i]=q.peek();
            q.remove();
            String n1 = res[i]+"0";
            String n2 = res[i]+"1";
            q.add(n1);
            q.add(n2);
        }
        return res;
    }
    public static void main(String[] args) {
       String[] res = Binarynums(10);
       for (int i = 0; i < res.length; i++) {
        System.out.println(res[i]);
       }
    }
}
