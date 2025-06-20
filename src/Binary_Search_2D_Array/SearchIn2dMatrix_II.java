package Binary_Search_2D_Array;

// Search in a row and column wise sorted matrix
// 240. Search a 2D Matrix II
// https://leetcode.com/problems/search-a-2d-matrix-ii/description/

public class SearchIn2dMatrix_II {

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        if(searchMatrix(matrix,target)){
            System.out.println("target found");
        } else  {
            System.out.println("target not found");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m-1;
        while( row<n && col>=0){
            if(matrix[row][col] > target)
                col--;
            else if(matrix[row][col] < target)
                row++;
            else
                return true;
        }
        return false;
    }
}
