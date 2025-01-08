public class lastOcuurance {
        public static int lastOccurrenceCheckBruteForce(int arr[],int i , int key)
        {
            if(i==0)
            {
                return -1;
            }
            if(arr[i]==key)
            {
                return i;
            }
            return lastOccurrenceCheckBruteForce(arr, i-1, key);
    
        }
        public static int lastOccurrenceCheck(int arr[],int i,int key)
        {
            if(i==arr.length)
            {
                return -1;
            }
            int isFound = lastOccurrenceCheck(arr, i+1, key);
            if(isFound==-1 && arr[i]==key)
            {
                return i;
            }
            return isFound;
        }
        public static void main(String[] args) {
            int arr[] ={1,6,8,2,3,8,5};
            // System.out.println(lastOccurrenceCheckBruteForce(arr, arr.length-1, 8));
            System.out.println(lastOccurrenceCheck(arr, 0, 8));
        }
    }
