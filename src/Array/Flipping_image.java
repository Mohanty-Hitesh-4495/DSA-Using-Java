package Array;
import java.util.Arrays;
//  832. Flipping an Image
//  URL=https://leetcode.com/problems/flipping-an-image/
/*  Example:
    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class Flipping_image {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println("INPUT");
        for (int i=0;i<image.length;i++){
            System.out.println(Arrays.toString(image[i]));
        }
        int[][] ans = flipAndInvertImage(image);
        System.out.println("OUTPUT");
        for (int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int len=image.length;
        for(int i=0;i<len;i++){
            int start=0,end=len-1;
            while(start<=end){
                int temp=(image[i][start]+1)%2;
                image[i][start]=(image[i][end]+1)%2;
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        return image;
    }
}
