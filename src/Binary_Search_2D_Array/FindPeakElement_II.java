package Binary_Search_2D_Array;

import java.util.Arrays;

/*
    1901. Find a Peak Element II
    https://leetcode.com/problems/find-a-peak-element-ii/description/

    Input: mat = [[10,20,15],[21,30,14],[7,16,32]]
    Output: [1,1]
    Explanation: Both 30 and 32 are peak elements so [1,1] and [2,2] are both acceptable answers.
 */

public class FindPeakElement_II {
    public static void main(String[] args) {
        int [][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
        int[] peakRowCol = findPeakGrid(matrix);
        System.out.println("Peak Element Index : " + Arrays.toString(peakRowCol));
        System.out.println("Peak Element : " + matrix[peakRowCol[0]][peakRowCol[1]]);
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // moving column-wise
        // binary search on columns
        int low = 0, high = m-1;
        while(low <= high){
            int mid = low+(high-low)/2;        // middle column
            int row = maxRow(mat, n, mid);     // find row with max in mid column

            // get left and right neighbors
            int left = mid-1 >=0 ? mat[row][mid-1] : -1;
            int right = mid+1 < m ? mat[row][mid+1] : -1;

            // check if current is a peak
            if( mat[row][mid] > left && mat[row][mid] > right){
                return new int [] {row, mid};
            } else if (mat[row][mid] < left){
                high = mid-1; // move left
            } else {
                low = mid+1;  // move right
            }
        }
        return new int[] {-1, -1}; // no peak found (shouldn't occur)
    }

    // Find row with max element in given column
    public static int maxRow(int[][] mat, int n, int col){
        int maxrow = -1;
        int maxel = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if(mat[i][col] > maxel){
                maxel = mat[i][col];
                maxrow = i;
            }
        }
        return maxrow;
    }
}
