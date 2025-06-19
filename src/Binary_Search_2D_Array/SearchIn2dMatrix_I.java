package Binary_Search_2D_Array;

/*
74. Search a 2D Matrix
https://leetcode.com/problems/search-a-2d-matrix/description/
You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */

public class SearchIn2dMatrix_I {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        if(searchMatrix(matrix,target)){
            System.out.println("Target Found");
        } else {
            System.out.println("Not found");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n*m-1;

        while (low <= high){
            int mid = low + (high-low)/2;
            int row = mid/m, col = mid%m;
            if (matrix[row][col] > target)
                high = mid-1;
            else if (matrix[row][col] < target)
                low = mid+1;
            else
                return true;
        }
        return false;
    }
}
