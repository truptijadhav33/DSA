

class bubbleSort{
    public static void BubbleSortFun(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={5,3,1,4,2};
        printArray(arr);
        BubbleSortFun(arr);
        printArray(arr);
    }
}