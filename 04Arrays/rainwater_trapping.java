

public class rainwater_trapping{
    public static void trappedWater(int height[])
    {
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        int waterlevel=0;
        int n=height.length;

        //leftmax array
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        //rightmax array
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        //calculate waterlevel
        for(int i=0;i<n;i++)
        {
            waterlevel+=Math.min(leftMax[i],rightMax[i])-height[i];
        }

        System.out.println("Trapped water is: "+ waterlevel);
    }

    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        trappedWater(height);
    }
}