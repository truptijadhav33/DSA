

public class reverse{

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
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
        reverse_array(arr);
    }
}