public class mergeSortProg {
    public static void mergeSort(int[] arr, int i, int j) {
        if(i < j) {
            int mid = (i + j) / 2;   //middle index to divide
            mergeSort(arr, i, mid);  //recursively divide left part
            mergeSort(arr, mid + 1, j);  //recursively divide right part
            merge(arr, i, j,mid);  //merge divided array in sorted order
        }
    }

    public static void merge(int[] arr, int si, int ei, int mid) {
        int[] temp = new int[ei - si + 1];
        int i = si; // index of 1st sorted array
        int j = mid+1;//index of 2nd sorted array
        int k = 0;//index for temp array

        while (i <=mid && j<=ei) {

            //if 1st array ele is smaller
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{   //if 2nd array ele is smaller
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //remaining from 1st array
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        //remaining from 2nd array
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        //copy from temp array to original
        for(k=0, i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 1, 8, -3 };
        mergeSort(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
