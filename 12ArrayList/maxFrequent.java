import java.util.HashMap;

public class maxFrequent {
    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer , Integer> frq = new HashMap<>();
        int count=0;
        int ans=0;
        for(int i=0;i<=nums.length-2;i++)
        {
            if(nums[i]==key)
            {
                if(frq.containsKey(nums[i+1])==false)
                {
                    frq.put(nums[i+1],1);
                }
                else{
                    frq.put(nums[i+1],frq.get(nums[i+1])+1);
                }
                if(count<frq.get(nums[i+1]))
                {
                    count = frq.get(nums[i+1]);
                    ans=nums[i+1];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,100,200,1,100};
        System.out.println(mostFrequent(arr, 1));
    }
}
