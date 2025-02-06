import java.util.Arrays;

public class minAbsPairs {
    /*
     * Given two arrays A & B of equal length n , pair each element of array A to an element  in array B , such that sum s of absolute differences of all the pairs is minimum
     */
    public static void main(String[] args) {
        int[] A ={1,2,3};
        int[] B = {2,1,3};
        //sort both arrays so we can pair min to min
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff+= Math.abs(A[i]-B[i]);
        }
        System.out.println(minDiff);
    }
}
