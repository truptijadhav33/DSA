import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static void main(String[] args) {

        // end time given in sorted

        // int[] start={10,12,20};
        // int[] end = {20,25,30};
        // ArrayList<Integer> activity = new ArrayList<>();//to store activities can be perform
        // int lastTime = end[0];
        // int count = 1;
        // activity.add(0);
        // for(int i =0 ;i<start.length;i++)
        // {
        //     if(start[i]>=lastTime)
        //     {
        //         count++;
        //            activity.add(i);
        //         lastTime=end[i];
        //     }
        // }
        // System.out.println("Can perform "+count+" Activities");
        // for (int i = 0; i < activity.size(); i++) {
        //     System.out.print("A"+activity.get(i)+" ");
        // }




        // Not given in sorted O(N)

        int[] start={1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int[][] startEnd = new int[start.length][3];
        // 0 -> index 1-> startT 2 -> endT
        for(int i = 0 ; i<start.length ;i++)
        {
            startEnd[i][0]=i;
            startEnd[i][1]=start[i];
            startEnd[i][2]=end[i];
        }
        // sort by end time
        Arrays.sort(startEnd,Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> activity = new ArrayList<>();//to store activities can be perform
        int lastTime=startEnd[0][2];
        activity.add(startEnd[0][0]);
        int count = 1;//no.ofActivities can be perform
        for(int i=0;i<startEnd.length;i++)
        {
            if(startEnd[i][1]>=lastTime)
            {
                count++;
                activity.add(startEnd[i][0]);
                lastTime=startEnd[i][2];
            }
        }
        System.out.println("Can perform "+count+" Activities");
        for (int i = 0; i < activity.size(); i++) {
            System.out.print("A"+activity.get(i)+" ");
        }

    }
}