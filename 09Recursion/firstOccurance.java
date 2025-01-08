public class firstOccurance {
    public static int firstOccuranceCheck(int arr[],int i , int key)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccuranceCheck(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[] ={1,6,8,2,3,5};
        System.out.println(firstOccuranceCheck(arr, 0, 3));
    }
}
