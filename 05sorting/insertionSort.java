public class insertionSort {

    public static void InsertionSortFun(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int prev=i-1;//0,1
            int curr=i;//1,2
            while(prev>=0 && arr[curr] > arr[prev])  //2<5
            {
                arr[prev+1]=arr[prev];// 2 5 3 1 4
                prev--;
            }
            arr[prev+1]=arr[curr];
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

    public static void main(String[] args) {
        int arr[]={5,2,3,1,4};
        InsertionSortFun(arr);
        printArray(arr);
    }
}
