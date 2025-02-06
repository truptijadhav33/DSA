

public class assignment_Q2{

    public static int search(int arr[],int target)
    {

         //find shift
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(arr[mid]>arr[right])
            {
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        int shift = left;

        //find target
        left=0;
        right=n-1;

        while(left<=right)
        {
           int mid=(left+right)/2;
            int realmid=(mid+shift)%n;
            if(arr[realmid]==target)
            {
                return realmid;
            }
            else if(arr[realmid]<target)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,7,0,1};
        System.out.println(search(arr,5));
    }
}