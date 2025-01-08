public class countOccuranceOfKey {
    public static int countOccurance(int[] arr , int i , int key , int count)
    {
        if(i>arr.length-1)
        {
            return count;
        }
        if(arr[i]==key)
        {
            count++;
        }
        return countOccurance(arr, i+1, key, count);
    }
    public static void main(String[] args) {
        int[] arr ={7,2,4,2,5,6,2,7};
        System.out.println(countOccurance(arr,0,7,0));//  o/p==> 3
    }
}
