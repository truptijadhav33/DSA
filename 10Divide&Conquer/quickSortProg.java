public class quickSortProg {
    public static void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int pivotIdx = partition(arr, i, j);
            quickSort(arr, i, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, j);

        }
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = 0; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //after placing all smaller ele to front of arr place pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 1, 8, -3 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
