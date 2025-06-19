package Binary_Search_2D_Array;

// https://takeuforward.org/plus/dsa/problems/find-row-with-maximum-1's
// Find row with maximum 1's

public class FindRowWithMaxOnes {
    public static void main(String[] args) {
        int[][] mat = { {1, 1, 1}, {0, 0, 1}, {0, 0, 0} };
        int maxOnesRowIndex = rowWithMax1s(mat);
        System.out.println(maxOnesRowIndex);
    }
    public static int rowWithMax1s(int[][] mat) {
        int rowInd = -1;
        int maxCount = 0;

        int n = mat.length;
        int m = mat[0].length;

        for (int i=0; i<n; i++){
            int countOne = m- countOnes(mat[i], m);
            if (countOne > maxCount){
                maxCount = countOne;
                rowInd = i;
            }
        }
        return rowInd;
    }

    public static int countOnes(int[] mat, int m){
        int low = 0, high = m-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if (mat[mid] == 1){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}
