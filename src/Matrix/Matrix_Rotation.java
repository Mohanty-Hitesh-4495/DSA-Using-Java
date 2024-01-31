package Matrix;
//  1886. Determine Whether Matrix Can Be Obtained By Rotation
//  https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
/*  Example 3:
    Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 */
public class Matrix_Rotation {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        boolean canRotate =findRotation(mat,target);
        System.out.println(canRotate);
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(check(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }
    public static boolean check(int[][] mat, int[][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    //to rotate the matrix
    public static void rotate(int[][] mat){
        transpose(mat);
        for(int i=0;i<mat.length;i++){
            int left=0,right=mat.length-1;
            while(left<right){
                int temp = mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                right--;
                left++;
            }
        }
    }
    //to return transpose of the matrix
    public static void transpose(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=i; j<mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
