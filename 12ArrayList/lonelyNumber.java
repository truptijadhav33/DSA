import java.util.*;

public class lonelyNumber {

        public static List<Integer> findLonely(int[] nums) {
        HashMap<Integer , Integer> frq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(frq.containsKey(nums[i]))
            {
                frq.put(nums[i],frq.get(nums[i])+1);
            }
            else{
                frq.put(nums[i],1);
            }
        }
        for(int i = 0 ;i<nums.length;i++)
        {
            if(frq.get(nums[i])==1 && frq.get(nums[i]-1)==null && frq.get(nums[i]+1)==null)
            {
                res.add(nums[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,6,5,8};
        System.out.println(findLonely(arr));
    }
}