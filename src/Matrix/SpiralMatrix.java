package Matrix;
import java.util.*;

/*
54. Spiral Matrix
Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
 */

public class SpiralMatrix {

    public static void main(String[] args) {
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        List<Integer> ans = spiralOrder(mat);
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n-1;
        int right = m-1, left = 0;

        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right){
            // Traverse from left to right across the top row
            for(int i=left; i<=right; i++)
                list.add(matrix[top][i]);
            top++;
            // Traverse from top to bottom down the right column
            for(int i=top; i<=bottom; i++)
                list.add(matrix[i][right]);
            right--;
            // Traverse from right to left across the bottom row (if still in bounds)
            if(top <= bottom){
                for(int i=right; i>=left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }
            // Traverse from bottom to top up the left column (if still in bounds)
            if(left <= right){
                for(int i=bottom; i>=top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}
