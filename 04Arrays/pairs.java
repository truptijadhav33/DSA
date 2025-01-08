

public class pairs{

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void pairs_of_array(int arr[])
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
        pairs_of_array(arr);
    }
}