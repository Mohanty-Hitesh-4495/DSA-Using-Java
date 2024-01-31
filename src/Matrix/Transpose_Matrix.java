package Matrix;
import java.util.Arrays;
//  867. Transpose Matrix
//  URL=https://leetcode.com/problems/transpose-matrix/
/*  Example:
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
        };
        System.out.println("BEFORE =");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
//        int[][] transpose= transpose1(arr);
        transpose2(arr);
        System.out.println("AFTER =");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

//  Return transpose of matrix using another 2d matrix
    public static int[][] transpose1(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int[][] transpose=new int [columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }

//  return transpose of matrix without using 2d matrix
    public static void transpose2(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=i; j<mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
