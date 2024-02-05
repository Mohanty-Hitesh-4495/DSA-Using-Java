package Matrix;

import java.util.ArrayList;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {

    }

    public static void approach1(int[][] matrix){
         ArrayList<Integer> rowlist = new ArrayList<>();
         ArrayList<Integer> collist = new ArrayList<>();

         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[i].length;j++){
                 if(matrix[i][j]==0){
                     rowlist.add(i);
                     collist.add(j);
                 }
             }
         }

         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[i].length;j++){
                 if(rowlist.contains(i) || collist.contains(j))
                     matrix[i][j]=0;
             }
         }
    }
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        int[][] copy = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                copy[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    for(int x=0;x<col;x++){
                        copy[i][x]=0;
                    }
                    for(int y=0;y<row;y++){
                        copy[y][j]=0;
                    }
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = copy[i][j];
            }
        }
    }

}
