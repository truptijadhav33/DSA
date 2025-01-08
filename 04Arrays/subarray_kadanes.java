


public class subarray_kadanes{

    public static void kadanes(int arr[])
    {
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            //calculate current sum
            curr=curr+arr[i];
            
            //calculate max sum
            maxSum=Math.max(curr,maxSum);

            //if current sum is negative then set to 0
            if(curr<0)
            {
                curr=0;
            }

            // maxSum=Math.max(curr,maxSum);
        }
        System.out.println("Max sum is: "+maxSum);
    }

    public static void main(String args[])
    {
        int arr[]={-2,3,-1,-4};
        kadanes(arr);
    }
}