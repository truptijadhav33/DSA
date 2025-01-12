import java.util.*;
public class pairSumProblem2 {
    public static boolean pairSum2(ArrayList<Integer> arr , int target)
    {
        int breakPt = -1;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>arr.get(i+1))
            {
                breakPt=i;
                break;
            }
        }
        int lp = breakPt+1; // smallest value
        int rp = breakPt;  //greatest value
        while (lp!=rp) {
            //case 1
            if(arr.get(lp)+arr.get(rp)==target)
            {
                return true;
            }
            else if(arr.get(lp)+arr.get(rp)<target)
            {
                lp=(lp+1)%arr.size();
            }
            else{
                rp=(rp-1)%arr.size();
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); //[5,6,8,1,2,3]
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(pairSum2(arr, 10)); // true
        System.out.println(pairSum2(arr, 17)); //false

    }
}
