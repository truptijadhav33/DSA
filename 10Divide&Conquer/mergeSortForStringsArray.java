public class mergeSortForStringsArray {
    public static void mergeSort(String[] arr , int i , int j)
    {
        if(i<j)
        {
            int mid = (i+j)/2;
            mergeSort(arr, i, mid);
            mergeSort(arr , mid+1 , j);
            merge(arr , i , j , mid);
        }
    }
    public static void merge(String[] arr , int si , int ei , int mid)
    {
        String[] temp = new String[ei-si+1];
        int i= si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei) {
            if(arr[i].compareTo(arr[j])<0)
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        String[] arr = {"sbc","dsw","yue","abc"};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
