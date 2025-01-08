public class Basics{
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void large_small_num(int arr[])
    {
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(large<arr[i])
            {
                large=arr[i];
            }
            if(small>arr[i])
            {
                small=arr[i];
            }
        }

        System.out.println("Largest number is "+large+" Smallest number is "+small);
    }

    public static void reverse_array(int arr[])
    {
        int start=0,end=arr.length-1;
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            System.out.println("Reversed array: ");
            printArr(arr);
    }

    public static void pairs(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void subarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of elements: ");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter Elements: ");
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        int arr[]={2,6,4,8,10};
        System.out.println("Array elements: ");
        printArr(arr);
        // large_small_num(arr);
        // reverse_array(arr);
        // pairs(arr);
        subarray(arr);
    }
}